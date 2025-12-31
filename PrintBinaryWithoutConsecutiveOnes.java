import java.util.Scanner;

public class PrintBinaryWithoutConsecutiveOnes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of binary string");

        int n = scanner.nextInt();

        printBinaryOfLengthNWithoutConsecutiveOnes(n, new StringBuilder());
    }

    private static void printBinaryOfLengthNWithoutConsecutiveOnes(int n, StringBuilder s){
        if(s.length() == n){
            System.out.println(s.toString());
            return;
        }        

        printBinaryOfLengthNWithoutConsecutiveOnes(n, s.append(0));
        s.deleteCharAt(s.length()-1);

        if(s.length() == 0 || s.charAt(s.length() - 1) != '1'){
            printBinaryOfLengthNWithoutConsecutiveOnes(n, s.append(1));
            s.deleteCharAt(s.length() - 1);
        }
    }
}
