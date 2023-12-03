/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start
import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // create set and add the elements as you visit them
        HashSet<Integer> visted = new HashSet<>();
        for (int i : nums) {
            if (visted.contains(i)){
                return true;
            } else {
                visted.add(i);
            }
        }
        return false;
    }
}
// @lc code=end

