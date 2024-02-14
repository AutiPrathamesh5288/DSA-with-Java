/* Brute Force (But come TLE)
 class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;i<nums.length-1;j++) {
                for(int k=j+1;k<nums.length;k++) {
                    List<Integer> ll = new ArrayList<>();

                    if(nums[i]+nums[j]+nums[k]==0) {
                        ll.add(nums[i]);
                        ll.add(nums[j]);
                        ll.add(nums[k]);
                        result.add(ll);
                    }

                }
            }
        }
        return result;
    }
}*/


class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    if (nums.length < 3)
      return new ArrayList<>();

    List<List<Integer>> ret = new ArrayList<>();

    Arrays.sort(nums);

    for (int i = 0; i + 2 < nums.length; ++i) {
      if (i > 0 && nums[i] == nums[i - 1]){
        continue;
      }

      int left = i + 1;
      int right = nums.length - 1;
      while (left < right) {
        final int sum = nums[i] + nums[left] + nums[right];
        if (sum == 0) {
          ret.add(Arrays.asList(nums[i], nums[left++], nums[right--]));
          while (left < right && nums[left] == nums[left - 1])
            left++;
          while (left < right && nums[right] == nums[right + 1])
            right--;
        } else if (sum < 0) {
          left++;
        } else {
          right--;
        }

      }
    }

    return ret;
  }
}
