class Solution{

    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k){

        ArrayList<Integer> al = new ArrayList<>();

        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= n - k; i++) {

            max = arr[i];

            for (int j = 1; j < k; j++) {
                if (arr[i + j] > max)
                    max = arr[i + j];
            }
            al.add(max);
        }

        return al;

    }
}

