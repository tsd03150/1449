import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(); // 물이 새는 곳
        int L = kb.nextInt(); // 테이프 길이

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        Arrays.sort(arr);

        int answer = 0;
        double tmp = 0;

        for (int i = 0; i < n; i++) {

            if (tmp < arr[i] + 0.5) {
                answer++;
                tmp = arr[i] - 0.5 + L;
            }
        }
        System.out.println(answer);
    }

}
