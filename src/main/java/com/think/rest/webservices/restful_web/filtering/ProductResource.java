package com.think.rest.webservices.restful_web.filtering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductResource {


    @GetMapping("/product")
    public Product getProductInfo(){

        return new Product(1,"TV",25000,20000,"A10");

    }

    @GetMapping("/product/customer")
    public MappingJacksonValue getProductInfoFilter() {
        ProductDynamic product = new ProductDynamic(1, "TV", 25000, 20000, "A10");

        // Define the dynamic filter
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("id", "name", "price");
        SimpleFilterProvider filters = new SimpleFilterProvider().addFilter("SomeBean", filter);

        // Apply the filter to the product
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(product);
        mappingJacksonValue.setFilters(filters);

        return mappingJacksonValue;
    }

//    @GetMapping("/product/admin")
//    public ProductDynamic getProductAllInfoFilter() {
//
//            return new ProductDynamic(1,"TV",25000,20000,"A10");
//
//        }
}

