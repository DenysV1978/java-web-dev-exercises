package org.launchcode.java.demos.technology;

public abstract class Computer {
    private String nameOwner;
    private String brandName;
    private double price;
    private boolean inWishList;

    public Computer(String nameOwner, String brandName, double price, boolean inWishList) {
        this.nameOwner = nameOwner;
        this.brandName = brandName;
        this.price = price;
        this.inWishList = inWishList;
    }

    public Computer() {
        this.nameOwner = "Denys";
        this.brandName = "Lenovo";
        this.price = 0.00;
        this.inWishList = false;
    }

    public abstract String sayGoodby();



    //setters and getters


    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInWishList() {
        return inWishList;
    }

    public void setInWishList(boolean inWishList) {
        this.inWishList = inWishList;
    }
}
