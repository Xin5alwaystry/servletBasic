package com.example;

import java.io.Serializable;

/**
 * @author xin5
 * @since 2024年02月18日 22:08:13
 */
public class Dog implements Serializable {
    private String breed;

    public Dog(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
