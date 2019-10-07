package Assignment4.Q3;

public class DessertShop {
    double  taxRate =0.065;
    String shopName = "M & M Dessert Shop";
    int maxSizeOfName =20;
    double widthToDisplay = 50;
    public  String cents2dollarsAndCentsmethod(int cents){
        double a =100;
        double c = cents/a;
        String s = String.valueOf(c);
        return s;

    }

}
