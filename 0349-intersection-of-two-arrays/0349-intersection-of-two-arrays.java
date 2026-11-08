import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();

        boolean[] seen = new boolean[1001];

        for (int num : nums1) {
            seen[num] = true;
        }

        for (int num : nums2) {
            if (seen[num]) {
                set.add(num);
            }
        }

        int ans[] = new int[set.size()];
        int i=0;
        for(int num : set){
            ans[i++] = num;
        }
        return ans;
    }
}