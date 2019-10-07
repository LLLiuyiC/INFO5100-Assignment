package Assignment4.Q3;

public class Sundae extends IceCream {
    public  Sundae(String iceCreamName,int iceCreamCost,String toppingName,int toppingCost ){
        this.name = toppingName +" with " +super.name;
        this.cost = toppingCost +iceCreamCost;
    }

    @Override
    public int getCost() {

        return this.cost;
    }
    @Override
    public String extraInfo(){
        return  null;
    }

}


