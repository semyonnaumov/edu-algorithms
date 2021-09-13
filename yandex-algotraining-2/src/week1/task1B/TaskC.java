package week1.task1B;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        List<String> inputLines = readInputLines(1);
        int first, second, year;
        String[] split = inputLines.get(0).split(" ");
        first = Integer.parseInt(split[0]);
        second = Integer.parseInt(split[1]);
        year = Integer.parseInt(split[2]);

        System.out.println(solve(first, second, year));
    }

    private static int solve(int first, int second, int year) {
        if (first <= 12 && second <= 12 && first != second) return 0;
        return 1;
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
