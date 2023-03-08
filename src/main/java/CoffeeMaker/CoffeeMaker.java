package CoffeeMaker;

public class CoffeeMaker {

    int stockCoffee= 100, cost = 10, costExtras= 0, deposit=0, orderQty=0;
    String type, size, extra, summation ="" ,quantityCoffee;

    public void checkQuantity(int units) {
        if (stockCoffee>10){
            quantityCoffee = "Coffeemaker Supplied";
        } else if (stockCoffee>1) {
            quantityCoffee = "Coffee Low Supply";
        } else if (stockCoffee == 0) {
            quantityCoffee = "Coffee Out Of Stock";
        }else{
            quantityCoffee = "Something went wrong";
        }
        stockCoffee -= units;
    }

    public void setQtyCoffee(int stockCoffeeIn) {
        stockCoffee = stockCoffeeIn;
    }

    public void setDeposit(int depositPay) {
        deposit = depositPay;
    }

    public void orderQuantity(int units) {
        orderQty = units;
        deposit -= units *cost;
    }

    public void setType(String kind) {
        if (kind.equals( "Coffee") || kind.equals("Tea") || kind.equals( "Cocoa")){
            type = kind;
        }else {
            System.out.println("Wrong input value.");
        }
    }

    public void setSize(String volume) {
        if (volume.equals( "Small") || volume.equals("Medium") || volume.equals( "Large")){
            size = volume;
        }else {
            System.out.println("Wrong input value.");
        }
    }

    public void setExtras(String option) {
        if (option.equals( "Milk") || option.equals("Cream") || option.equals( "Cinnamon")) {
            extra = option;
            deposit -= orderQty * costExtras;
        } else if (option.equals("None")) {
            extra = option;
        } else {
            System.out.println("Wrong input value.");
        }
    }

    public String getStock() { return quantityCoffee; }

    public String getOrder() { return summation;}

    public void summarizeOrder() {
        if (orderQty>0 && orderQty<10){
            summation += "a";
        } else if (orderQty>10 && orderQty<50) {
            summation += "b";
        }else {
            summation += "c";
        }
        if (type.equals("Coffee")){
            summation += "a";
        } else if (type.equals("Tea")) {
            summation += "b";
        } else if (type.equals("Cocoa")) {
            summation += "c";
        }else{
            System.out.println("Error");
        }
        if (size.equals("Small")){
            summation += "a";
        } else if (size.equals("Medium")) {
            summation += "b";
        } else if (size.equals("Large")) {
            summation += "c";
        }else {
            System.out.println("Error");
        }
        if (extra.equals("None")){
            summation += "a";
        } else if (extra.equals("Milk")) {
            summation += "b";
        } else if (extra.equals("Cream")) {
        summation += "c";
        } else if (extra.equals("Cinnamon")) {
        summation += "d";
        }else {
        System.out.println("Error");
        }
    }
}
