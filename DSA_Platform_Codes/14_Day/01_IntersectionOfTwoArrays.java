class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        for(int x:nums1){
            hs1.add(x);
        }
        for(int x:nums2){
            hs2.add(x);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        // compare
        for(int x:hs1){
            for(int y:hs2){
                if(x==y)
                    arr.add(x);
            }
        }
        int n = arr.size();
        int result[] = new int[n];

        int index = 0;
        for(int ele:arr){
            result[index] = ele;
            index++;
        }
        return result;
    }
}
