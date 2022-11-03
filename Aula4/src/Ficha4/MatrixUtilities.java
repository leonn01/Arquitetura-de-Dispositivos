package Ficha4;

public class MatrixUtilities {
    public static void show (int[][] matris){
        for(int linha = 0; linha < matris.length; linha++)
            for(int coluna = 0; coluna < matris[linha].length; coluna++) {
                System.out.print((matris[linha][coluna]));
            }
            System.out.println();
    }

    public static boolean isMatrix(int[][] matrix){
        final int numCol = matrix[0].length;
        for(int linha = 0; linha < matrix.length; linha++) {
            if (numCol != matrix[linha].length)
                return true;
        }
        return false;
    }

    public static boolean isIdentity(int[][] matrix){
        final int numCol = matrix[0].length;
        for(int linha = 0; linha < matrix.length; linha++){
            for(int coluna = 0; coluna < matrix[linha].length; coluna++){
                if (linha == coluna){
                    if ( matrix[linha][coluna] != 1)
                        return false;
                }
                else{
                    if (matrix[linha][coluna] != 0)
                        return true;

                }
            }

        }
        return true;
    }
    public static int[][] multiplyBy(int[][] matrix){
        for(int linha = 0; linha < matrix.length; linha++)
            for(int coluna = 0; coluna < matrix[linha].length; coluna++)
                matrix[linha][coluna] *= 5;
        return matrix;

    }

    public static boolean areCompatibleForSum(int[][] matrix1, int [][] matrix2){
        if (matrix1.length != matrix2.length)
            return false;
        else{
            for (int linha = 0; linha < matrix2.length; linha++){
                if (matrix1[linha].length != matrix2[linha].length)
                    return false;
            }
        }
        return true;
    }

    public static int[][] sumOf(int[][] matrix1, int [][] matrix2){
        if (areCompatibleForSum(matrix1, matrix2)){
            for (int linha = 0; linha < matrix1.length; linha++){
                for (int coluna = 0; coluna < matrix1[linha].length; coluna++)
                    matrix1[linha][coluna] += matrix2[linha][coluna];
            }
            return matrix1;
        }
        else
            return null;
    }
    
}
