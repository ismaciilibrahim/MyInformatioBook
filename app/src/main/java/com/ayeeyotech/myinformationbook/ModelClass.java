package com.ayeeyotech.myinformationbook;

public class ModelClass {

    //classkan waxan u adeegsnyna inaan userka datada kaga tusno shashada sida sawirka iyo category namek


    // waxan samyn string image field kasoo userka tusaya sawira isgo tixryacaya file path
    private String imageName;

    //waxan field userkka tusaya magaca
    private String categoryName;

    //methodkan waxay xogta kasoo qadaysa  image
    public String getImageName() {
        return imageName;
    }

    //methodkn waxay xogta kasoo qadaysa qoraalka
    public String getCategoryName() {
        return categoryName;
    }

    //consturctor waxan ku gudbnya values sida imageka iyo magaca kuqorma categoryga
    public ModelClass(String imageName, String categoryName) {
        this.imageName = imageName;
        this.categoryName = categoryName;
    }
}
