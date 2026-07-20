class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0) return new int[]{-1, -1};
        
        int s=0,l=nums.length-1,t=0;
        if(nums[l] < target || nums[s] > target) return new int[]{-1, -1};
        int a[]=new int[2];
        a[0]=-1;
        a[1]=-1;
        do{
            if(a[0] == -1) {
                if(nums[s] < target) s++;
                else if(nums[s] == target) {a[0]=s; t+=1;}
            }

            if(a[1] == -1) {
                if(nums[l] > target) l--;
                else if(nums[l] == target) {a[1]=l; t+=2;}
            }
        }while(s<=l && t!=3);

        return a;
    }
}