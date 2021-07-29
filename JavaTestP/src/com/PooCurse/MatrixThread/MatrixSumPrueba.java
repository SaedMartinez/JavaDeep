package com.PooCurse.MatrixSum;

//Casting from double to int

public class MatrixSumPrueba {
    public int Matrix1[][]= new int [3][3], Matrix2[][]= new int [3][3], FinalMatrix[][]= new int [3][3];

    public void fillMatrix(int instanceMatrix[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int number = (int) (Math.random() * 10);
                instanceMatrix[i][j] = number;
            }
        }
    }

    public void PrintMatrixLine(int instanceMatrix[][], int index) {
        for (int j = 0; j < 3; j++) {
            if (j == 2) {
                System.out.print("[ " + instanceMatrix[index][j] + " ] ");
            }else{
                System.out.print("[ " + instanceMatrix[index][j] + " ] ");
            }   
        }
    }


    public void MatrixSumM(int instanceMatrix1[][], int instanceMatrix2[][], int instanceMatrixR[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                instanceMatrixR[i][j]=instanceMatrix1[i][j]+instanceMatrix2[i][j];
            }
        }    
    }

    public void PrintMatrix(int instanceMatrix[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[ " + instanceMatrix[i][j] + " ] ");
            }
        }
        System.out.println("\n");
    }

    public void PrintSpace() {
        System.out.print("          ");
    }

    public void PrintOperator() {
        System.out.print("    +     ");
    }

    public void PrintEqual() {
        System.out.print("     =    ");
    }

    public static void main(String[] args) {
        MatrixSumPrueba matriz1 = new MatrixSumPrueba();
        matriz1.fillMatrix(matriz1.Matrix1);
        matriz1.fillMatrix(matriz1.Matrix2);
        matriz1.MatrixSumM(matriz1.Matrix1, matriz1.Matrix2, matriz1.FinalMatrix);
        matriz1.PrintMatrixLine(matriz1.Matrix1, 0);
        matriz1.PrintSpace();
        matriz1.PrintMatrixLine(matriz1.Matrix2, 0);
        matriz1.PrintSpace();
        matriz1.PrintMatrixLine(matriz1.FinalMatrix, 0);
        System.out.print("\n");
        matriz1.PrintMatrixLine(matriz1.Matrix1, 1);
        matriz1.PrintOperator();
        matriz1.PrintMatrixLine(matriz1.Matrix2, 1);
        matriz1.PrintEqual();
        matriz1.PrintMatrixLine(matriz1.FinalMatrix, 1);
        System.out.print("\n");
        matriz1.PrintMatrixLine(matriz1.Matrix1, 2);
        matriz1.PrintSpace();
        matriz1.PrintMatrixLine(matriz1.Matrix2, 2);
        matriz1.PrintSpace();
        matriz1.PrintMatrixLine(matriz1.FinalMatrix, 2);
    }
}
