import java.util.Arrays;
import java.util.Random;

public class Part_4 {
    public static void main(String[] args) {
        int[] array = generateRandomArray(10); // Генерируем массив из 10 случайных чисел
        System.out.println("Исходный массив: ");
        printArray(array); // Выводим исходный массив

        Arrays.sort(array); // Сортируем массив

        System.out.println("Отсортированный массив: ");
        printArray(array); // Выводим отсортированный массив
    }

    public static int[] generateRandomArray(int length) {
        int[] array = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(100); // Генерируем случайное число от 0 до 99
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}