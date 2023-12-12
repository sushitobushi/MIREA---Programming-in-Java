import java.util.Scanner;

public class ExceptionDemo { // Тест 1
    public void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Введите целое число ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (ArithmeticException e) {
            System.out.println("Исключение: " + e.getMessage());
            System.out.println("На ноль делить нельзя!");
        } catch (NumberFormatException e) {
            System.out.println("Исключение: " + e.getMessage());
            System.out.println("Это не целое число!");
        } finally {
            System.out.println("Это блок finally, он всегда выполняется, даже если произошли исключения или нет");
        }
    }
}
