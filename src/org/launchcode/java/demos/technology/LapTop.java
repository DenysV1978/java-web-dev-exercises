package org.launchcode.java.demos.technology;

public class LapTop extends Computer {

    private String size;

    //@Override
    private String nameOwner; //lets see what will happen if I create the same name property... i tried to override this property - it did not allow me to do it


    public LapTop() {
        this.size = "normal"; // here I created default constructor and looks like when I call for it it adds this code to default constructor code written in parent(Computer)
    }
    public LapTop(String nameOwner, String brandName, double price, boolean inWishList, String size) { //so, here i created a constructor that takes all properties to fully fill object. The fun stuff is that I see that if I do not give even one
        //value, constructor does not want to create instance because it says "no suitable constructor"... So, if you suspect that you will try to use only part of properties, you have to create specific constructor
        // in those specific constructors you can even set up default values of some properties
        super(nameOwner, brandName, price, inWishList); // if comment out this code line and create instance of this class using Olga (see 13 line at Computer, it will not create object with Olga, it will create instance using default values
        this.size = size;

    }

    public LapTop(String nameOwner) {
        //super(nameOwner); // as you see this is not allowed by IDK to be created because no such constructor is available at Computer (having only nameOwner parameter)
        this.nameOwner = nameOwner; //run debugger and you will see that it creates new nameOwner property (together with Computer.nameOwner property)
    }


    public String message() {
        return "The size of laptop " + this.getNameOwner() + "is " + this.size;

    }

    @Override // this is sayGoodby() method forced by abstract Computer to be created
    public String sayGoodby() {
        return "Goodby " + this.nameOwner;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
