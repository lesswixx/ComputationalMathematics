public class Initialization {
    public static double[][] init(){
        System.out.println("Метод Гаусса с выбором основного элемента по столбцам");
        System.out.println("Если вы хотите остановить выполнение программы, введите \\exit в консоли\n");
        while(true) {
            System.out.println("keyboard [k] or file [f]");
            String typeOfInput = Reader.readTypeOfInput();
            switch (typeOfInput) {
                case "k":
                case "keyboard": {
                    System.out.println("Введите размер матрицы: ");
                    int size = Reader.readSize();
                    System.out.println("Введите матрицу: ");
                    return Reader.loopReadMatrix(size);
                }
                case "f":
                case "file": {
                    double[][] matrix = Reader.readMatrixFromFile(Reader.readFileName());
                    if (matrix != null) return matrix;
                }
            }
        }
    }

}
