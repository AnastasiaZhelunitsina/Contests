import java.util.Scanner;

public class YandexCodeRun_204 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] array = new Integer[n];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            array[i] = a * b;
            sum += array[i];
        }
        scanner.close();
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%.12f\n", (double) array[i] / sum);
        }
    }
}
