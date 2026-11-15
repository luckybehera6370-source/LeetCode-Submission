class Solution {
    public int sumFourDivisors(int[] nums) {
        int total = 0;
        for(int num : nums){
            int curSum = 0;
            int divCount = 0;

            for(int i=1;i*i<=num;i++){
                if(num % i == 0){
                    curSum += i;
                    divCount++;

                    if(i != num/i){
                        curSum += num/i;
                        divCount++;
                    }
                }
                if(divCount > 4){
                    break;
                }
            }
            if(divCount == 4){
                total += curSum;
            }
        }

        return total;
    }
}