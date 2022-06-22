package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * todo 力扣第一题，两数之和
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 * <p>
 * 示例 1：
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * <p>
 * 示例 2：
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 * <p>
 * 示例 3：
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 */

public class Leetcode0001 {
    /**
     * hash表求两数之和
     * @param nums
     * @param target
     * @return int[]
     * // key   1 3 4 5
     * // value 0 1 2 3
     * // 和为8
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // 将和减去当前值得到h，判断h这个是否已经在map中，如果在则返回下标
            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 5};
        int target = 8;
        int[] twoSum = twoSum(nums, target);
        System.out.println(twoSum[0] + "," + twoSum[1]);
    }
}
