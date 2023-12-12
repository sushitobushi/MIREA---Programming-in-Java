public class Part_5 {
    public static void main(String[] args) {
        int number = 5; // Число, для которого будем вычислять факториал
        long factorial = calculateFactorial(number);
        System.out.println("Факториал числа " + number + " равен: " + factorial);
    }

    public static long calculateFactorial(int number) {
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }
}