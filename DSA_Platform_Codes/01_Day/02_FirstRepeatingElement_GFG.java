class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) {
        int index = -1;
        HashSet<Integer> hs = new HashSet<>();
 
        for (int i = arr.length - 1; i >= 0; i--) {
            if (hs.contains(arr[i]))
                index = i;
            else
                hs.add(arr[i]);
        }
        
        if (index != -1)
            return index+1;
        return -1;    
    }
}
