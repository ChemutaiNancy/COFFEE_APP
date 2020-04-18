package com.example.coffeeshopapp;

import androidx.annotation.NonNull;

public class Drinks {

    private String name;
    private String description;
    private int imageId;

    public Drinks(String name, String description, int imageId) {
        this.name = name;
        this.description = description;
        this.imageId = imageId;
    }

    public static final Drinks [] drinks = {
            new Drinks("Latte", "This is the decsription for latte", R.drawable.flower1),
            new Drinks("Cappuccino", "This is the decsription for latte", R.drawable.flower2),
            new Drinks("Filter", "This is the decsription for latte", R.drawable.flower3),
    };

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageId() {
        return imageId;
    }

//    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }
}
