import java.util.Arrays;
import java.util.HashMap;

public class sum3WithMultiplicity {

    public int threeSumMulti(int[] arr, int target) {
        int n = arr.length;
        long count = 0;
        long mod = 1000000007;
        for(int i = 0; i < n; i++) {
            //similar to two sum problem solution
            int new_target = target - arr[i];
            int start = i + 1;
            int end = n;
            HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

            for(int j = start; j < end; j++) {
                if(hm.get(new_target - arr[j]) != null)
                    count += hm.get(new_target - arr[j]);
                if(hm.get(arr[j]) != null)
                    hm.put(arr[j], hm.get(arr[j])+1);
                else
                    hm.put(arr[j], 1);
            }
        }

        return (int)(count % mod);




    }

    public static void main(String args[]){
        sum3WithMultiplicity  sum3WithMultiplicity = new sum3WithMultiplicity();
       int t =  sum3WithMultiplicity.threeSumMulti(new int[]{1,1,2,2,3,3,4,4,5,5, 6}, 8);
       System.out.println(t);
    }

}
