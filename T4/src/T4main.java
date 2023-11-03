
import java.util.ArrayList;
import java.util.Scanner;

public class T4main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入金额，以空格分隔：");
        String input = scanner.nextLine();

        String[] inputArray = input.split(" ");
        ArrayList<Integer> money = new ArrayList<>();
        for (String str: inputArray) {
            money.add(Integer.parseInt(str));

        }
        System.out.println(T4.maxBenefit(money));

        scanner.close();
    }
}
