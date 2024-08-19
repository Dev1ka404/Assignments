package Assign2;

public class PetrolPrices{

    public static void main(String []args){
        
       double[] petprices = {102.5,101.2,103.8,99.5,100.9,104.3};
       
       double sum=0;
       for(int i=0;i<petprices.length;i++){
           sum= sum+petprices[i];
       }
        
       double average = sum/petprices.length;
       
       System.out.println("Average petrol price: Rs " + average);   
       
        
    }
}     
