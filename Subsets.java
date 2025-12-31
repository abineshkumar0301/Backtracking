import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Subsets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of array");

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Enter the element " + (i + 1));
            arr[i] = scanner.nextInt();
        }

        System.out.println("Your array : " + Arrays.toString(arr));

        printSubsets(arr, 0, new ArrayList<>());

        scanner.close();

    }

    private static void printSubsets(int[] arr, int idx, List<Integer> subsets){
        if(idx == arr.length){
            System.out.println(subsets);
            return;
        }
        subsets.add(arr[idx]);
        printSubsets(arr, idx + 1, subsets);
        subsets.remove(subsets.size() - 1);
        printSubsets(arr, idx + 1, subsets);
    }
}
