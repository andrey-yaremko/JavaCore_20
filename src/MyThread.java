import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MyThread extends Thread {

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> array = new ArrayList();
        int n0 = 0;
        int n1 = 1;
        int n2;
        for (int i = 2; i <= n + 1; ++i) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            n2 = n0 + n1;
            n0 = n1;
            n1 = n2;
            array.add(n2);
            System.out.print(n2 + " ");

        }
    }
}
