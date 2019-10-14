package Assignment5;

/*
result:6
1. initial an object called b of the class B;
2.initial a List containing 3 integers:1,2,3;
3.invoke the addAll function of B class---addCount =0+3(list.size)=3---call the addAll function of A class
4.while implement  the addAll function of A--invoke the add function of B---addCount = 3++=4----call add function of A--return true
5.iterator until the end of list:point to 2:account = 4+1=5;point to 3:account = 5+1=6;end of iteration.return value of  6.
6.call method getI of b,inherits the method getI of A as A is the parent class of class B,return value of 0.
7.b.getAddCount()+b.getI()=6+0=6.
 */