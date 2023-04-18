package top100;
/*给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。

        找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。

        返回容器可以储存的最大水量。

        说明：你不能倾斜容器。*/
public class LeetCode11 {

        public int maxArea(int[] height) {
            int i = 0;
            int j = height.length - 1;
            int max = Math.min(height[i], height[j]) * (j - i);
            while (i < j) {
                if (height[i] > height[j]) {
                    j--;
                    int heigh = Math.min(height[i], height[j]);
                    max = Math.max(max, heigh * (j - i));
                } else {
                    i++;
                    int heigh = Math.min(height[i], height[j]);
                    max = Math.max(max, heigh * (j - i));
                }
            }
            return max;
        }
}
