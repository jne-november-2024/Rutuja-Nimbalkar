package com.think.rest.webservices.restful_web.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;

@JsonFilter("SomeBean")
public class ProductDynamic {
    private int id;
    private String name;
    private long price;
    private long suppilerPrice;
    private String suppilerQuntities;

    public ProductDynamic(int id, String name, long price, long suppilerPrice, String suppilerQuntities) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.suppilerPrice = suppilerPrice;
        this.suppilerQuntities = suppilerQuntities;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

    public long getSuppilerPrice() {
        return suppilerPrice;
    }

    public String getSuppilerQuntities() {
        return suppilerQuntities;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", suppilerPrice=" + suppilerPrice +
                ", suppilerQuntities='" + suppilerQuntities + '\'' +
                '}';
    }
}
