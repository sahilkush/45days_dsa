class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.size();
        for(int i=0; i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    system.out.println(i,j);
                }
            }
        }
        
    }
}




public class Main {
    public static void main(String[] args){
        System.out.println("Hello World");
        
    }
}

