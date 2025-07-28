class Solution {
    public int maxEvents(int[][] events) {
        int n=events.length;
        int max=events[0][0];
        for(int i=0;i<n;i++){
            for(int j=0;j<events[i].length;j++){
                if(max<events[i][j]){
                    max=events[i][j];
                }
            }
        }
        if(n==2){
             if(events[0][0])<events[0][1]){
                    return events[0][10]
                }
                else{
                    return events[0][1]);
                }

        }
        if (n>max||n==max){
            return max;
        }
        else{
            return max-1;
        }
    }
}
