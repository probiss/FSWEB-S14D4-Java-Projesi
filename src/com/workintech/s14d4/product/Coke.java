package com.workintech.s14d4.product;

public class Coke extends ProductForSale {
    private boolean hasSugar;
    public Coke(String type, double price, String description, boolean hasSugar) {
        super(type, price, description);
        this.hasSugar = hasSugar;
    }

    @Override
    public void showDetails() {
        String result = super.toString();
        StringBuilder builder = new StringBuilder();
        builder.append("Has Sugar: " + hasSugar + "\n");
        builder.append(("****************\n"));
        System.out.println(result + builder.toString());
    }
}
