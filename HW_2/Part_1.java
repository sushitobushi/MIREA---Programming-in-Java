public class Part_1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        int sumFor = calculateSumUsingFor(numbers);
        System.out.println("Сумма чисел, вычисленная с помощью цикла for: " + sumFor);

        int sumWhile = calculateSumUsingWhile(numbers);
        System.out.println("Сумма чисел, вычисленная с помощью цикла while: " + sumWhile);

        int sumDoWhile = calculateSumUsingDoWhile(numbers);
        System.out.println("Сумма чисел, вычисленная с помощью цикла do-while: " + sumDoWhile);
    }

    private static int calculateSumUsingFor(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    private static int calculateSumUsingWhile(int[] numbers) {
        int sum = 0;
        int i = 0;
        while (i < numbers.length) {
            sum += numbers[i];
            i++;
        }
        return sum;
    }

    private static int calculateSumUsingDoWhile(int[] numbers) {
        int sum = 0;
        int i = 0;
        do {
            sum += numbers[i];
            i++;
        } while (i < numbers.length);
        return sum;
    }
}