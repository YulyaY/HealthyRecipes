package com.example.android.healthyrecipes;

public class HealthyRecipeItem {

    private int imageResource;
    private String title;
    private String description;
    private String recipe;

    public HealthyRecipeItem(int imageResource, String title, String description, String recipe) {
        this.imageResource = imageResource;
        this.title = title;
        this.description = description;
        this.recipe = recipe;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getRecipe() {
        return recipe;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
