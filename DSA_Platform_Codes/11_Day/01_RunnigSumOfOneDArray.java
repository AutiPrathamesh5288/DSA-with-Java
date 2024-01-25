class Solution {
   
    public static int[] sumOfArr(int nums[]){
        int result = 0;
        for(int i=0;i<nums.length;i++){
            result=result+nums[i];
            nums[i]=result;
        }
        return nums;
    }
    public static void main(String[] args) {
       
        int nums[] = new int[]{1,2,3,4};
        int ans[] = sumOfArr(nums);
        System.out.print("[");
        for(int x:ans){
            System.out.print(x+",");
        }
        System.out.println("]");
    }
}
