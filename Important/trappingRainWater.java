
public class trappingRainWater {
    // two pointer approach
    public static void main(String[] args) {
        int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int l = 0;
        int r = height.length - 1;
        int left_max = 0;
        int right_max = 0;
        int count = 0;
        while (l < r) {
            if (height[l] < height[r]) {
                if (left_max < height[l]) {
                    left_max = height[l];
                } else {
                    count += left_max - height[l];
                }
                l++;
            } else {
                if (right_max < height[r]) {
                    right_max = height[r];
                } else {
                    count += right_max - height[r];
                }
                r--;
            }
        }
        System.out.println(count);
    }
}
