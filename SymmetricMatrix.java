package rifa;


import java.util.*;

public class SymmetricMatrix {

    public static void main(String[] args) {
        int rows, cols, i, j;
        boolean symmetric = true;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of rows");
        rows = s.nextInt();
        System.out.println("Enter number of columns");
        cols = s.nextInt();
        int matrix[][] = new int[rows][cols];
        System.out.println("Enter the elements ");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                matrix[i][j] = s.nextInt();
        
            }}
        System.out.println("The given Mtrix");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        if(rows!=cols){
            System.err.println("This is not square matrix");
        }
        else{
            symmetric=true;
            for(i=0;i<rows;i++){
                for(j=0;j<cols;j++){
                    if(matrix[i][j] != matrix[j][i]){
                        symmetric=false;
                        break;
                    }
                }
            }
        }

        if(symmetric){
            System.out.println("The given matrix is symmetric");
        }
        else{
            System.out.println("The given matrix is not symmetric");
        }

    }
}
