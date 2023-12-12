import java.util.Scanner;

public class ThrowsDemo2 { // Тест 3
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = "";
        while (key.equals("")) {
            System.out.println("Введите ключ:");
            key = myScanner.nextLine();
            try {
                printDetails(key);
            } catch (Exception e) {
                System.out.println("Поймано исключение в методе printDetails.");
                key = "";  // Сброс ключа для предоставления пользователю еще одной попытки
            }
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Ключ установлен в пустую строку");
        }
        return "данные для " + key;
    }
}
