public class Main {
    public static void main(String[] args) {
        double[][] matrix = Initialization.init();
        Printer.printInitialMatrix(matrix);

        double[][] triangleMatrix = GaussMethod.calculateTriangleMatrix(matrix);
        if(triangleMatrix != null) {
            Printer.printTriangleMatrix(triangleMatrix);

            double determinant = GaussMethod.calculateDeterminant(triangleMatrix);
            Printer.printDeterminant(determinant);

            if (determinant != 0) {
                double[] solutions = GaussMethod.calculateSolutions(triangleMatrix);
                Printer.printSolutions(solutions);

                double[] rv = GaussMethod.calculateResidualVector(matrix, solutions);
                Printer.printResidualVector(rv);
            }
            else
                System.out.println("Система имеет бесконечное количество решений!");
        }
        else System.out.println("Ошибка в вычислении матрицы или система не имеет решений!");

    }
}