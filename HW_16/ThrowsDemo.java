import java.util.Scanner;

public class ThrowsDemo { // Тест 2
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        printDetails(key);
    }

    public void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            System.out.println("Найдено исключение в методе printDetails.");
        }
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Ключ установлен в пустую строку");
        }
        return "Данные для " + key;
    }
}
