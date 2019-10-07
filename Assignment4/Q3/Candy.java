package Assignment4.Q3;

public class Candy extends DessertItem {
    public  Candy(String name,double weight, double price){
        this.name = name;
        this.weight = weight;
        this.price = price;
    }
    double weight;
    double price;

    @Override
    public int getCost() {
        long c = Math.round(weight * price);
        int cost = Integer.parseInt(String.valueOf(c));
        return cost;
    }

    @Override
    public String extraInfo(){

        String str =  String.valueOf(weight) +" "+"lbs. @ " +String.valueOf(price/100)+" /lb";
        return  str;
    }




}
