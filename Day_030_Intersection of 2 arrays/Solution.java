class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int len1=nums1.length;
        int len2=nums2.length;
        int i=0;
        int j= 0;
        int idx=0;
        int ans[]=new int [Math.min(len1,len2)];
        while(i < len1 && j < len2){
            if(nums1[i]==nums2[j]){
                ans[idx++]=nums1[i];
                i++;
                j++;
            }
            else{
                if(nums1[i]<nums2[j]){
                    i++;
                }
                else j++;
            }
        }
        return Arrays.copyOf(ans,idx);
    }
}