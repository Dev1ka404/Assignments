package Assign3;

public class DiagonalSum{

    public static void main(String []args){
       int[][] matrix = { {1,2,3,4}, {10,20,30,40}, {5,6,7,8}, {50,60,70,80}};
       int firstDiagonalSum = 0;
       int secondDiagonalSum = 0;
       
       for (int i=0; i<4; i++){
         firstDiagonalSum +=matrix[i][i];
         secondDiagonalSum +=matrix[i][3-i];
       }
       int totalDiagonalSum = firstDiagonalSum + secondDiagonalSum;
       
       System.out.println("Sum of first Diagonal: " +firstDiagonalSum);
       System.out.println("Sum of seconal Diagonal: " +secondDiagonalSum);
       System.out.println("Total sum of both diagonals: " +totalDiagonalSum);
    }
}
