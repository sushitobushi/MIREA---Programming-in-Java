import javax.swing.*;
import java.awt.*;

public class AnimationDisplay {
    private static final int FRAME_WIDTH = 800; // Ширина окна
    private static final int FRAME_HEIGHT = 600; // Высота окна
    private static final int DELAY = 1000; // Задержка между кадрами (в миллисекундах)
    private static final String[] IMAGE_PATHS = {
            "C:\\\\Users\\\\shibu\\\\Downloads\\\\dead.jpeg",
            "C:\\\\Users\\\\shibu\\\\Downloads\\\\dead.jpeg",
            "C:\\\\Users\\\\shibu\\\\Downloads\\\\dead.jpeg"
    }; // Путь к изображениям кадров анимации

    private int currentFrameIndex = 0;
    private JLabel imageLabel;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                AnimationDisplay animationDisplay = new AnimationDisplay();
                animationDisplay.createAndShowGUI();
                animationDisplay.startAnimation();
            }
        });
    }

    private void createAndShowGUI() {
        // Создание окна
        JFrame frame = new JFrame("Анимация");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);

        // Создание метки для отображения изображения
        imageLabel = new JLabel();
        frame.getContentPane().add(imageLabel);

        // Отображение окна
        frame.setVisible(true);
    }

    private void startAnimation() {
        Timer timer = new Timer(DELAY, e -> {
            // Загрузка текущего кадра
            ImageIcon imageIcon = new ImageIcon(IMAGE_PATHS[currentFrameIndex]);
            Image image = imageIcon.getImage();

            // Масштабирование изображения для отображения на всю область метки
            Image scaledImage = image.getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_DEFAULT);
            imageLabel.setIcon(new ImageIcon(scaledImage));

            // Увеличение индекса текущего кадра
            currentFrameIndex = (currentFrameIndex + 1) % IMAGE_PATHS.length;
        });

        // Запуск таймера
        timer.start();
    }
}
