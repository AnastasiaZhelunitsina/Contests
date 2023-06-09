import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class YandexCodeRun_155 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        Map<Integer, Integer> result = new HashMap<>();
        for (int num : array) {
            if (!result.containsKey(num)) {
                result.put(num, 1);
            } else {
                int value = result.get(num);
                result.put(num, value + 1);
            }
        }
        int counter = 0;
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            if (entry.getValue() == 1) {
                counter++;
            }
        }
        System.out.println(counter);

    }
}
