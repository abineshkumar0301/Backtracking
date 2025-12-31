import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubsetsWithSumK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of an array");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Enter the element " + (i + 1));
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter k ");
        int k = scanner.nextInt();

        subsetSumEqualsK(arr, k, 0, 0, new ArrayList<>());
    }

    private static void subsetSumEqualsK(int[] arr, int k, int start, int sum, List<Integer> path){
        if(sum == k){
            System.out.println(path);
            return;
        }

        for(int i = start; i < arr.length; i++){
            if(sum + arr[i] > k) continue;

            path.add(arr[i]);
            subsetSumEqualsK(arr, k, i + 1, sum + arr[i], path);
            path.remove(path.size() - 1);
        }
    }
}
