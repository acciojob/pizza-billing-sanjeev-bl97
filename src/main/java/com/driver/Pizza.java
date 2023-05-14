package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheese;
    private int toppings;
    private int paperbag;
    private int total;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(this.isVeg)
            this.price = 300;
        else
            this.price = 400;
        cheese = 0;
        toppings = 0;
        paperbag = 0;
        total = 0;

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        cheese = 80;
    }

    public void addExtraToppings(){
        if(this.isVeg == true)
            toppings = 70;
        else
            toppings = 120;

    }

    public void addTakeaway(){
        paperbag = 20;
    }

    public String getBill(){


        total = price + toppings + cheese + paperbag;


        bill = "Base Price Of The Pizza: " +this.price + "\n" +
                "Extra Cheese Added: " +this.cheese + "\n" +
                "Extra Toppings Added: " +this.toppings + "\n" +
                "Paperbag Added: "+this.paperbag + "\n" +
                "Total Price: "+this.total;

        return this.bill;
    }
}
