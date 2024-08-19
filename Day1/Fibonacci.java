package Assign1;

public class Fibonacci{

    public static void main(String []args){
        int num1=0, num2=1;
       System.out.print("Fibonacci series upto 1000:"+num1);
       
       for(int i=1;i<=1000;i=num1+num2){
               System.out.print(", "+num2);
               num1=num2;
               num2=i;
           }
    }
}