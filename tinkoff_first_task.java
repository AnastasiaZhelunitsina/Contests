import java.util.Arrays;
import java.util.Scanner;

public class tinkoff_first_task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] queue = new int[4];
        for (int i = 0; i < queue.length; i++) {
            queue[i] = sc.nextInt();
        }
        int[] copyQueue = Arrays.copyOf(queue, queue.length);
        Arrays.sort(copyQueue);


        int[] copyReverseQueue = new int[copyQueue.length];
        for (int i = 0; i < copyQueue.length; i++) {
            copyReverseQueue[i] = copyQueue[copyQueue.length - 1 - i];
        }

        if (Arrays.equals(queue, copyQueue) || Arrays.equals(queue, copyReverseQueue)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
