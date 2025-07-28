class Solution {
    public int removeElement(int[] nums, int val) 
    {
        int count=0;
        int p=0;
        for(int i=0;i<nums.length;i++){
                if(nums[i]==val){
                    count++;
                }
                else{
                    p++;
                }
            }
           int []a=new int[p];
            int j=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=val && j<p){
                    nums[j]=nums[i];
                    j++;
                }
                
            }
            return p;
    }
}
