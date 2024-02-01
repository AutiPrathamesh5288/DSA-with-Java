class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        
        int max = Integer.MIN_VALUE;
        int index = 0;
        
        for(int i=0;i<mat.length;i++) {
            int count = 0;
            for(int j=0;j<mat[i].length;j++) {
                if(mat[i][j]==1){
                    count++;
                }
            }
            if(count>max){
                    max=count;
                    index=i;
            }
        }
        return new int[]{index,max};
    }
}
