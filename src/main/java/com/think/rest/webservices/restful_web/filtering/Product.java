package com.think.rest.webservices.restful_web.filtering;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties("suppilerPrice")
//@JsonIgnoreProperties({"suppilerPrice","suppilerQuntities"}) //need to change id field name change
public class Product {
    private int id;
    private String name;
    private long price;
    @JsonIgnore
    private long suppilerPrice;
    @JsonIgnore
    private String suppilerQuntities;

    public Product(int id, String name, long price, long suppilerPrice, String suppilerQuntities) {
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
