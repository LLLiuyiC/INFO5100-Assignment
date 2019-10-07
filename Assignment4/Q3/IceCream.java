package Assignment4.Q3;

public class IceCream extends DessertItem {
    public  IceCream(String name,int cost){
        this.name = name;
        this.cost = cost;
    }
    public  IceCream(){

    }
    int cost;

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String extraInfo(){

     return  null;
    }


}
