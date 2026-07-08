class Solution {
    public static int removeDuplicates(int[] nums) {
       int i=0;
       int j;
       for(j=1;j<nums.length;j++){
        if(nums[i]!=nums[j]){
        nums[i]=nums[j];
             i++;  
        }
       }
     return i+1;
    }
    public static void main(String[] args){
        int nums[]={22,33,44,44,44,67};
        int ans=removeDuplicates(nums);
        System.out.println("New unique elements are"+ ans);
    }
}
