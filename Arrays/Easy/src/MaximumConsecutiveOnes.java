public class MaximumConsecutiveOnes {
    static int countMaximumConsecutivesOnes(int[] arr){
        int maxi=0,cnt=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i] == 1) {
                cnt++;
            } else {
                cnt = 0;
            }

            maxi = Math.max(maxi, cnt);
        }

        return maxi;
    }
    public static void main(String[] args) {
        int[] prices = {1,1,1,1,0,1,1,1,0,1,1};
        int res = countMaximumConsecutivesOnes(prices);
        System.out.println(res);
    }
}
