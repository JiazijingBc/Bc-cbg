public class LC31 {
public void nextPermutation(int[] nums) {
    if (nums == null || nums.length == 0) return;
    int firstIndex = -1;
    for (int i = nums.length - 2; i >= 0; i--) {
        if (nums[i] < nums[i + 1]) {
            firstIndex = i;
            break;
        }
    }
    if (firstIndex == -1) {
        reverse(nums, 0, nums.length - 1);
        return;
    }
    int secondIndex = -1;
    for (int i = nums.length - 1; i >= 0; i--) {
        if (nums[i] > nums[firstIndex]) {
            secondIndex = i;
            break;
        }
    }
    swap(nums, firstIndex, secondIndex);
    reverse(nums, firstIndex + 1, nums.length - 1);
    return;

}

private void reverse(int[] nums, int i, int j) {
    while (i < j) {
        swap(nums, i++, j--);
    }
}

private void swap(int[] nums, int i, int i1) {
    int tmp = nums[i];
    nums[i] = nums[i1];
    nums[i1] = tmp;
}

    public static void main(String[] args) {
        LC31 lc31 = new LC31();
        int[] ints = {5,2,4,3,1,0};

        lc31.nextPermutation(ints);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
