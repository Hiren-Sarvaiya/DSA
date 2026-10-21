class Solution {
  public int[] productExceptSelf(int[] nums) {
    int[] res = new int[nums.length];

    // for (int i = 0; i < nums.length; i++)
    //   res[i] = 1;

    // for (int i = 1; i < nums.length; i++)
    //   res[0] *= nums[i];

    // for (int i = 1; i < nums.length; i++) {
    //   if (nums[i] != 0) {
    //     res[i] = res[i - 1] / nums[i];
    //     res[i] *= nums[i - 1];
    //   } else {
    //     for (int j = 0; j < nums.length; j++)
    //       if (j != i)
    //         res[i] *= nums[j];
    //   }
    // }

    int[] pre = new int[nums.length];
    int[] post = new int[nums.length];

    pre[0] = nums[0];
    for (int i = 1; i < nums.length; i++)
      pre[i] = pre[i - 1] * nums[i];

    post[nums.length - 1] = nums[nums.length - 1];
    for (int i = nums.length - 2; i >= 0; i--)
      post[i] = post[i + 1] * nums[i];

    res[0] = post[1];
    for (int i = 1; i < nums.length - 1; i++)
      res[i] = pre[i - 1] * post[i + 1];
    res[nums.length - 1] = pre[nums.length - 2];

    return res;
  }
}