public class Average {

    public void main(String[] args){

        int k = 0;
        int[] list = {2,4,6,8,10};

        average(k,list);
    }
 
    
    public int average(int k, int[] list){

        int average = 0;

        int n = Math.min(k, list.length);

        if( n > 0) {
                    for(int i = 0 ; i < n; i++){
                                average += list[i];
                    }
                    average = average/n;
        }
        return average;
    }
}

