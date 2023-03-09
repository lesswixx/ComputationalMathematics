public class Printer {

    public static void printMatrix(double[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.printf("%8.2f\t", matrix[row][col]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printInitialMatrix(double[][] initialMatrix){
        System.out.println("\nИсходная матрица: ");
        printMatrix(initialMatrix);
    }
    public static void printTriangleMatrix(double[][] triangleMatrix){
        System.out.println("Треугольная матрица: ");
        printMatrix(triangleMatrix);
    }

    public static void printDeterminant(double determinant){
        System.out.println("Определитель матрицы: ");
        System.out.printf("%8.2f\t\n\n", determinant);
    }

    public static void printSolutions(double[] solutions){
        System.out.println("Решения для СЛАУ: ");
        for (double v : solutions) System.out.printf("%8.2f\t", v);
        System.out.println("\n");
    }

    public static void printResidualVector(double[] rv){
        System.out.println("Остаточный вектор: ");
        for (double i : rv) System.out.printf("%8.2f\t", i);
        System.out.println();
    }
}
