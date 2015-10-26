package se.bastagruppen.webshop.model;

import java.io.Serializable;

/**
 * Created by fredrik on 26/10/15.
 */
public abstract class Product implements Serializable {

    private final String id;
    private final String name;
    private final Double price;

    public Product(Double price, String name, String id) {
        this.price = price;
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (!getId().equals(product.getId())) return false;
        if (!getName().equals(product.getName())) return false;
        return getPrice().equals(product.getPrice());

    }

    @Override
    public int hashCode() {
        int result = getId().hashCode();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getPrice().hashCode();
        return result;
    }
}
