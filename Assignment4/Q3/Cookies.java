package Assignment4.Q3;

public class Cookies extends DessertItem {
    public      Cookies(String name,int number,double price){
        this.name=name;
        this.number = number;
        this.price = price;
    }

    int number;
    double price;

    @Override
    public int getCost() {
        double a = 12;
        int cost =Integer.parseInt(String.valueOf( Math.round(number*price/a)));
        return cost;
    }

    @Override
    public String extraInfo(){

        String str = String.valueOf(number) +" @ " +String.valueOf(price/100)+" /dz";
        return  str;
    }

   }
