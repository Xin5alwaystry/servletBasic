package com.example.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xin5
 * @since 2023年12月02日 19:11:40
 */
public class BeerExpert {
    public List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        if ("amber".equals(color)) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }
}
