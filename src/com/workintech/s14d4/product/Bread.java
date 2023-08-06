package com.workintech.s14d4.product;

public class Bread extends ProductForSale {
    private String flourType;
    private String color;

    public Bread(String type, double price, String description, String flourType, String color) {
        super(type, price, description);
        this.color = color;
        this.flourType = flourType;
    }

    public String getFlourType() {
        return flourType;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void showDetails() {
        String result = super.toString();
        StringBuilder builder = new StringBuilder();
        builder.append("Flour Type: " + flourType + "\n");
        builder.append("Color: " + color + "\n");
        builder.append(("****************\n"));
        System.out.println(result + builder.toString());
    }
}
