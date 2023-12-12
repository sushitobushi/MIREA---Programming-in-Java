public class Part_3 {
    public static void main(String[] args) {
        System.out.println("Первые 10 чисел гармонического ряда: ");

        for (int i = 1; i <= 10; i++) {
            double harmonicNumber = calculateHarmonicNumber(i);
            System.out.println(harmonicNumber);
        }
    }

    public static double calculateHarmonicNumber(int n) {
        double harmonicNumber = 0.0;

        for (int i = 1; i <= n; i++) {
            harmonicNumber += 1.0 / i;
        }

        return harmonicNumber;
    }
}