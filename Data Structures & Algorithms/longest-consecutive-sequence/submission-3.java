class Solution {
    public int longestConsecutive(int[] nums) {

        int length = 0;
        int maxlength = 0;

        Arrays.sort(nums);

        Set<Integer> setarr = new TreeSet<Integer>();

        if(nums.length == 0)
        {
            return 0;
        }



        for(int num : nums){
            setarr.add(num); }   

        int[] numsarr = setarr.stream()
                            .mapToInt(Integer::intValue)
                            .toArray();

        if(nums.length == 1)
        {
            return 1;
        }

        for(int i = 0; i < numsarr.length-1; i++){

            int diff = numsarr[i+1] - numsarr[i];

            if(diff == 1 ){
                length += 1;
            }

            if(diff != 1){ 
               length = 0;
            }

            if(length > maxlength)
            {
                    maxlength = length;
            }
        }

        return maxlength + 1;

    }
}
