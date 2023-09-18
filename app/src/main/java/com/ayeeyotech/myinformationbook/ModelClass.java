package com.ayeeyotech.myinformationbook;

public class ModelClass {

    private String imageName;
    private String categoryName;

    public String getImageName() {
        return imageName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public ModelClass(String imageName, String categoryName) {
        this.imageName = imageName;
        this.categoryName = categoryName;
    }
}
