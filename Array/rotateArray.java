import java.util.ArrayList;

public class rotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        ArrayList<Integer> ans = new ArrayList<>();
        int n = 7;
        //n-k to n
        for(int i = n-k;i<n;i++){
            ans.add(arr[i]);
        }

        for(int i =0;i<=k;i++){
            ans.add(arr[i]);
        }

        for(int i =0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }

    }
}
