import java.util.Scanner;

public class tinkoff_third_task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        sc.nextLine();
        char[] str = sc.nextLine().toCharArray();
        sc.close();

        int posA = -1;
        int posB = -1;
        int posC = -1;
        int posD = -1;
        int minDistance = Integer.MAX_VALUE;

        int maxPos = 0;
        int minPos = 0;

        for (int i = 0; i < str.length; i++) {
            if (str[i] == 'a') {
                posA = i;
            } else if (str[i] == 'b') {
                posB = i;
            } else if (str[i] == 'c') {
                posC = i;
            } else if (str[i] == 'd') {
                posD = i;
            }
            if (posA != -1 && posB != -1 && posC != -1 && posD != -1) {
                maxPos = Math.max(posA, Math.max(posB, Math.max(posC, posD)));
                minPos = Math.min(posA, Math.min(posB, Math.min(posC, posD)));
                int distance = maxPos - minPos;
                if (distance < minDistance) {
                    minDistance = distance;
                }
            }
        }

        if (minDistance == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(minDistance + 1);
        }
    }
}
