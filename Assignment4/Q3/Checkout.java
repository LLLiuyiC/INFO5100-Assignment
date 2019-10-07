package Assignment4.Q3;

import java.util.Vector;

public class Checkout {

    Vector<DessertItem> DessertItems;
    DessertShop dshop;
    public Checkout(){
        Vector<DessertItem> DessertItems  =new Vector<DessertItem>(20);
        DessertShop dshop = new DessertShop();
        this.DessertItems = DessertItems;
        this.dshop = dshop;

    }
    public  int numberOfItems(){

        return  DessertItems.size();
    }

    public  void  enterItem(DessertItem item){
        DessertItems.add(item);

    }

    public void  clear(){
        DessertItems.clear();
    }

    public int totslCost(){
        int sum = 0;
        return sum;
    }

    public  int totalCost(){
        int sum = 0;
        for(int i = 0;i<DessertItems.size();i++){
            sum +=DessertItems.get(i).getCost();
        }
        return  sum;
    }

    public  int totalTax(){

        int totalTax = Integer.parseInt(String.valueOf(Math.round(this.totalCost() * dshop.taxRate)));

        return  totalTax;
    }

    public String strFormat(String str){
        if(str.length()<=dshop.maxSizeOfName){return str;}
        else{
        String newStr = "";
              while(str.length() > dshop.maxSizeOfName){
            newStr =newStr + str.substring(0,dshop.maxSizeOfName) +"\n";

            str = str.substring(dshop.maxSizeOfName);
           }

            newStr = newStr +str;
            newStr = newStr + nSpace(dshop.maxSizeOfName - str.length());
        return  newStr;}
    }

    public  String alignRightFormat(String str,int n){
        int num =0;
        if(n<dshop.maxSizeOfName){num =n;}
        else {num = dshop.maxSizeOfName;}
        int spaceNumber = Integer.parseInt(String.valueOf(Math.round(dshop.widthToDisplay))) -num-str.length();
        str = nSpace(spaceNumber) +str;
        return str;
    }

    public  String alignRightFormat1(String str,int n){
        int num =0;
        int spaceNumber = Integer.parseInt(String.valueOf(Math.round(dshop.widthToDisplay))) -n-str.length();
        str = nSpace(spaceNumber) +str;
        return str;
    }

    public  String nSpace(int n){
        String str = "";
        for(int i = 0;i<n;i++){
            str += " ";
        }
        return str;
    }
    public  String nUnderline(int n){
        String str ="";
        for (int i=0;i<n;i++){
            str +="-";
        }
        return str;
    }

    public  String toString(){
        String str = "";
        int hdSpace = Integer.parseInt(String.valueOf( Math.round((dshop.widthToDisplay-dshop.shopName.length())/2)));
       // the headline
        str = nSpace(hdSpace) +dshop.shopName+ nSpace(hdSpace)+"\n";
        str = str +nSpace(hdSpace)+nUnderline(dshop.shopName.length())+nSpace(hdSpace)+"\n"+"\n";
        //the dessertItem

        for(int i =0;i<DessertItems.size();i++){
            DessertItem item = DessertItems.get(i);
            String cost = dshop.cents2dollarsAndCentsmethod(item.getCost());

          if (item.extraInfo() != null){
              str += item.extraInfo() +"\n";
          }
            str =str+  strFormat(item.getName());

            str = str+ alignRightFormat(cost,Math.min(dshop.maxSizeOfName,item.getName().length())) +"\n";
        }

        str += "\n" +"\n";
        str += "Tax" +alignRightFormat1(dshop.cents2dollarsAndCentsmethod(totalTax()),3) +"\n";
        str =str + "Total Cost" +alignRightFormat1(dshop.cents2dollarsAndCentsmethod(totalCost()+totalTax()),10);
        return str;
    }


}
