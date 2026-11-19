class Solution {
    
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length < 3){
        return new ArrayList<>(); } 

        Arrays.sort(nums);

        Set<List<Integer>> tempset = new HashSet<>();
   
        for(int i = 0; i < nums.length; i++){
            int req = -(nums[i]);
            int left = i+1;
            int right = nums.length-1;

            while(left < right)
            { 

            int sum = nums[left] + nums[right];

            if(sum == req){
                List<Integer> temp = new ArrayList<Integer>();
                temp.add(nums[i]);
                temp.add(nums[left]);
                temp.add(nums[right]);
                tempset.add(temp);
                left++;
                }

            else if ( sum > req){
                right--;         } 

            else{
                left++;
                }
            }
        }

     List<List<Integer>> res = new ArrayList<>(tempset);
        return res;

    }
}


