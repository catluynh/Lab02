package com.example.bttshirt;

public class Tshirt {
    private String name;
    private String price;
    private int imageShirt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImageShirt() {
        return imageShirt;
    }

    public void setImageShirt(int imageShirt) {
        this.imageShirt = imageShirt;
    }

    public Tshirt(String name, String price, int imageShirt) {
        this.name = name;
        this.price = price;
        this.imageShirt = imageShirt;
    }
}
