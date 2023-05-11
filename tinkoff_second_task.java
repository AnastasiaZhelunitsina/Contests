import java.util.Scanner;

public class tinkoff_second_task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int juniors = sc.nextInt();
        int seniors = sc.nextInt();
        int checks = sc.nextInt();
        sc.close();
        int time = (juniors * checks + seniors - 1) / seniors;
        System.out.println(time);

    }
}
