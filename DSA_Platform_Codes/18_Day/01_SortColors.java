class Solution
{
    public static void sort012(int a[], int n) {
        
        int zero = 0;
        int one = 0;
        int two = 0;
        int idx = 0;
        
       for(int i=0;i<a.length;i++) {
           if(0 == a[i]) {
               zero++;
           }
           if(1 == a[i]) {
               one++;
           }
           if(2 == a[i]) {
               two++;
           }
       }
       for(int i=0;i<zero;i++) {
           a[idx++]=0;
       }
       for(int i=0;i<one;i++) {
           a[idx++]=1;
       }
       for(int i=0;i<two;i++) {
           a[idx++]=2;
       }
       
    }
}
