import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombinationSum {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Enter the element " + (i + 1));
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter K : ");
        int k = scanner.nextInt();

        combinationSum(arr, k, 0, 0, new ArrayList<>());
    }

    private static void combinationSum(int[] arr, int k, int start, int sum, List<Integer> list){
        if(sum == k){
            System.out.println(list);
            return;
        }

        for(int i = start; i < arr.length; i++){
            if(sum + arr[i] > k) continue;
            list.add(arr[i]);
            combinationSum(arr, k, i, sum + arr[i], list);
            list.remove(list.size() - 1);
        }
    }
}