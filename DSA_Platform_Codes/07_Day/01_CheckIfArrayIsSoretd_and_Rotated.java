class Solution {
    public boolean check(int[] arr) {
        // copying original array
        int[] copy = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            copy[i] = arr[i];
        }

        Arrays.sort(copy);

        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            // rotating it one by one
            int temp = copy[arr.length-1];
            for(int j=arr.length-1;j>0;j--){
                copy[j] = copy[j-1];
            }
            copy[0] = temp;

            // check this with original one
            boolean f = true;
            for(int j=0;j<arr.length;j++){
                if(arr[j]!=copy[j])
                    f = false;
            }
            if(f){
                flag = true;
                break;
            }
        }
        return flag;
    }
}
