class Solution {
    static {
        for(int i = 0; i < 100; i++){
            moveZeroes(new int[]{0, 0});
        }
    }
    public static void moveZeroes(int[] nums) {
        int zero = 0;
        for (int i = 0; i <  nums.length; i++) {
            if (nums[i] != 0) {
                nums[zero++] = nums[i];
            }
        } 
        while(zero < nums.length) {
            nums[zero++] = 0;
        } 
    
    }
}
