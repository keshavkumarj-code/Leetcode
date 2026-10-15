
class Solution {
    public int[] sortArray(int[] nums) {
        mergesort(nums, 0, nums.length - 1);
        return nums;
    }

    void mergesort(int nums[], int l, int r) {
        if (l >= r) return;

        int mid = l + (r - l) / 2;
        mergesort(nums, l, mid);
        mergesort(nums, mid + 1, r);

        merge(nums, l, mid, r);
    }

    void merge(int nums[], int l, int mid, int r) {
        int arr[] = new int[r - l + 1];
        int i = l, j = mid + 1, k = 0;

        while (i <= mid && j <= r) {
            if (nums[i] < nums[j]) arr[k++] = nums[i++];
            else arr[k++] = nums[j++];
        }

        while (i <= mid) arr[k++] = nums[i++];
        while (j <= r) arr[k++] = nums[j++];

        for (i = 0; i < arr.length; i++) {
            nums[l++] = arr[i];
        }
    }
}
