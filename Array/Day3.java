import java.util.*;
public class Day3 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        int i =0;
        int j = 4;
        // ArrayList<Integer> ans = new ArrayList<>();
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for(int k =0;k<5;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
