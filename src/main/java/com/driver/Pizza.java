package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheese;
    private int toppings;
    private int paperbag;
    private int base;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(this.isVeg){
            base = 300;
            this.price = 300;
        }
        else
        {
            base = 400;
            this.price = 400;
        }
        cheese = 0;
        toppings = 0;
        paperbag = 0;


    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        cheese = 80;
        price += 80;
    }

    public void addExtraToppings(){
        if(this.isVeg == true) {
            toppings = 70;
            price += 70;
        }
        else {
            toppings = 120;
            price += 120;
        }

    }

    public void addTakeaway(){
        paperbag = 20;
        price += 20;
    }

    public String getBill(){





        bill = "Base Price Of The Pizza: " +this.base + "\n" +
                "Extra Cheese Added: " +this.cheese + "\n" +
                "Extra Toppings Added: " +this.toppings + "\n" +
                "Paperbag Added: "+this.paperbag + "\n" +
                "Total Price: "+this.price + "\n";

        return this.bill;
    }
}
