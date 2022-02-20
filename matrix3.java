package com.company;

public class matrix3 {
    public static void main(String[] args) {
        int rows, cols;

        //Initialize matrix a
        int a[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        rows=a.length;
        cols=a[0].length;
        int t[][]=new int[cols][rows];

        for(int i=0;i<cols;i++){
            for(int j=0;j<rows;j++){
                t[i][j]=a[j][i];
            }
        }

        System.out.println("transpose of the matrix is ");
        for(int i=0;i<cols;i++){
            for(int j=0;j<rows;j++){
                System.out.println(t[i][j]+" ");
            }
            System.out.println();
        }
    }
    }
