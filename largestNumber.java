class Solution {
    public String largestNumber(int[] nums) {
        if(nums == null || nums.length == 0) return "";
        Integer[] nums_dup = new Integer[nums.length];
        for(int i = 0; i < nums.length; i++) nums_dup[i] = nums[i];
        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                String one = a+""+b;
                String two = b+""+a;
                return two.compareTo(one);
            }
        };
        Arrays.sort(nums_dup,comp);
        if(nums_dup[0] == 0) return "0";
        StringBuilder sb = new StringBuilder();
        for(int i : nums_dup) {
            sb.append(i+"");
        }
        return sb.toString();
    }
}
