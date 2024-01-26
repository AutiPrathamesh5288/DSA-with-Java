class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}
class Solution {

    public pair indexes(long v[], long x){

        long first = -1;
        long second = -1;
        for(int i = 0; i < v.length;i++){
            if(v[i] == x){
                first = i;
                break;
            }
        }

        for(int i = v.length-1;i >= 0;i--){
            if(v[i] == x){
                second = i;
                break;
            }
        }


       return new pair(first,second);


    }
}

