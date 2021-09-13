import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> inputLines = readInputLines(3);
        int code, intV, checkV;
        code = Integer.parseInt(inputLines.get(0));
        intV = Integer.parseInt(inputLines.get(1));
        checkV = Integer.parseInt(inputLines.get(2));

        System.out.println(solve(code, intV, checkV));
    }

    private static int solve(int code, int intV, int checkV) {
        switch (intV) {
            case 0:
                return code != 0 ? 3 : checkV;
            case 1:
                return checkV;
            case 4:
                return code != 0 ? 3 : 4;
            case 6:
                return 0;
            case 7:
                return 1;
            default:
                return intV;
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
