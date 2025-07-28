class Solution {
    public int findDuplicate(int[] nums) {
        int p=0;
        int flag=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                p= nums[i];
                flag=1;
                break;
                }
            }
            if(flag==1)
        {
            break;
        } 
        }
        return p;
    
    }
}
