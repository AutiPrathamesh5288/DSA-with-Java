
class Solution {
    int findMaxDiff(int a[], int n) {
        
        int[] LS = new int[n];
        int[] RS = new int[n];
        
        Stack<Integer> stack = new Stack<>();
        
        // Finding nearest left smaller element using a stack
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && a[i] <= a[stack.peek()]) {
                stack.pop();
            }
            LS[i] = stack.isEmpty() ? 0 : a[stack.peek()];
            stack.push(i);
        }
        
        // Clear the stack for finding nearest right smaller element
        stack.clear();
        
        // Finding nearest right smaller element using a stack
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && a[i] <= a[stack.peek()]) {
                stack.pop();
            }
            RS[i] = stack.isEmpty() ? 0 : a[stack.peek()];
            stack.push(i);
        }
        
        // Finding maximum absolute difference
        int maxDiff = 0;
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(LS[i] - RS[i]);
            if (diff > maxDiff) {
                maxDiff = diff;
            }
        }
        
        return maxDiff;
    }
}


