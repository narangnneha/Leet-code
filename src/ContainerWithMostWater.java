public class ContainerWithMostWater {

    public int maxArea(int[] H) {
        int i = 0, j = H.length -1 , answer  = 0 , result = 0 ;

        while(i < j){
            if(H[i] < H[j]){
                result = H[i] * (j - i );
                i++ ;

            }  else {
                result  = H[j] * (j - i );
                j--;

            }
            if(result > answer){
                answer = result;
            }

        }
        return answer;
    }


    public static void main(String [] args){
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
       int ans =  containerWithMostWater.maxArea(new int[]{1,8,6,2,5,4,8,3,7});
       System.out.println(ans);

    }
}
