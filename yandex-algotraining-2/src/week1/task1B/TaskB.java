package week1.task1B;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        List<String> inputLines = readInputLines(1);
        int n, s1, s2;
        String[] split = inputLines.get(0).split(" ");
        n = Integer.parseInt(split[0]);
        s1 = Integer.parseInt(split[1]);
        s2 = Integer.parseInt(split[2]);

        System.out.println(solve(n, s1, s2));
    }

    private static int solve(int n, int s1, int s2) {
        if (s2 > s1) {
            int a = s2 - s1 - 1;
            int b = n - (s2 - s1 + 1);
            return Integer.min(a, b);
        } else {
            int a = s1 - s2 - 1;
            int b = n - (s1 - s2 + 1);
            return Integer.min(a, b);
        }
    }

    public static List<String> readInputLines(int n) {
        Scanner scanner = new Scanner(System.in);
        List<String> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(scanner.nextLine());
        }
        return result;
    }
}
