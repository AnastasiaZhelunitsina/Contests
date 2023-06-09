import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class YandexCodeRun_360 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] array = new Integer[n];
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

        int maxValue = 0;
        int maxKey = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            if (entry.getValue() >= maxValue) {
                maxValue = entry.getValue();
            }
        }

        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            if (entry.getValue() == maxValue) {
                if (entry.getKey() > maxKey) {
                    maxKey = entry.getKey();
                }
            }
        }
        System.out.println(maxKey);

    }
}
