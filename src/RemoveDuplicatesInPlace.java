import java.util.Arrays;

public class RemoveDuplicatesInPlace {


    public int[] removeDuplicates(int[] nums) {
        int count = 1; //index counter in nums
        int appear = 1; //  number of times an number have appeared  in the nums
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]){
                if(appear == 1){
                    nums[count] = nums[i];
                    count++;
                    appear++;
                }else if(appear == 2)   continue;
            }else{
                nums[count] = nums[i];
                count++;
                appear = 1;
            }
        }
        System.out.println("Count is " + count);
        return nums;
    }

    public static void main(String args[]){
        RemoveDuplicatesInPlace removeDuplicatesInPlace = new RemoveDuplicatesInPlace();
      int[] sortedArray =  removeDuplicatesInPlace.removeDuplicates(new int[]{1,1,1,2,2,2,2,2,2,2,2,3});
      System.out.println(Arrays.toString(sortedArray));
    }
}
