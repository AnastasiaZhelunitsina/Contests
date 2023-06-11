import java.util.Arrays;
import java.util.Scanner;

public class YandexCodeRun_361 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(array);
        System.out.println(array[1]);
    }
}
