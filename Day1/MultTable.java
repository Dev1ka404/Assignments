package Assign1;

public class MultTable{

    public static void main(String []args){
       for(int i=1;i<=10;i++){
           System.out.println("Multiplication Table for " +i);
           
           for(int j=1;j<=10;j++){
               System.out.println(i + "X" +j + "=" +(i*j));
           }
       }
    }    
}