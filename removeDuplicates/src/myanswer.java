class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> nums2 = new ArrayList<>();
        int i=0;
        while (i< nums.length){
            nums2.add(nums[i]);
            int j = i+1 ;
            while (j<nums.length && nums[i] == nums[j]){
                j++;
            }
            i=j;
        }

       /* ArrayList<Integer> nums2 = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                nums2.add(nums[i]);
            }
        }*/



       /* for (i=0;i<nums.length;){

            nums2.add(nums[i]);

            for (j=i+1;j<nums.length;j++){
                if(nums[i]!=nums[j]){
                    i=j;
                    break;
                }
            }

        }*/
        return nums2.size();
    }
}