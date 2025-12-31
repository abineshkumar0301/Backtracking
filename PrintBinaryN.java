import java.util.Scanner;

public class PrintBinaryN{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of Binary :");

        int n = scanner.nextInt();

        printBinaryOfLengthN(n, new StringBuilder());

    }

    private static void printBinaryOfLengthN(int n, StringBuilder s){
        if(s.length() == n){
            System.out.println(s.toString());
            return;
        }

        printBinaryOfLengthN(n, s.append(0));
        s.deleteCharAt(s.length() - 1);

        printBinaryOfLengthN(n, s.append(1));
        s.deleteCharAt(s.length() - 1);
    }
}