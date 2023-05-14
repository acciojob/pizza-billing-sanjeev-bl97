package com.driver;

public class Pizza {

    private int price;
    private boolean isVeg;
    private String bill;
    private int cheese;
    private int toppings;
    private int paperbag;
    private int base;
    private boolean isCheese;
    private boolean isToppings;
    private boolean isPaperbag;



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
        if(!isCheese) {
            isCheese = true;
            cheese = 80;
            price += 80;
        }
    }

    public void addExtraToppings(){
       if(!isToppings) {
           isToppings = true;

           if (this.isVeg == true) {
               toppings = 70;
               price += 70;
           } else {
               toppings = 120;
               price += 120;
           }
       }
    }

    public void addTakeaway(){
        if(!isPaperbag) {
            isPaperbag = true;
            paperbag = 20;
            price += 20;
        }
    }

    public String getBill(){





        bill = "Base Price Of The Pizza: " +this.base + "\n";

               if(isCheese)
                   bill += "Extra Cheese Added: " +this.cheese + "\n";
               if(isToppings)
                   bill += "Extra Toppings Added: " +this.toppings + "\n" ;
               if(isPaperbag)
                   bill += "Paperbag Added: "+this.paperbag + "\n";

               bill += "Total Price: "+this.price + "\n";

        return this.bill;
    }
}
