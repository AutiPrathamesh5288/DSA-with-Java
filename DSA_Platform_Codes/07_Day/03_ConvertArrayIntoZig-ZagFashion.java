class Solution{
    public void zigZag(int arr[], int n){
        
        //boolean flag = false;
        for(int i = 0; i < n-1;i++){
            
            if((i % 2 == 0) && arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                //flag = true;
            }
            
            if((i % 2 != 0) && arr[i] < arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                //flag = true;
            }
        }
    }
}

