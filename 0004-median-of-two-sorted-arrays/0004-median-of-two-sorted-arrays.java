class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i;
        float median;
        int size=nums1.length+nums2.length;
        int[] arr=new int[size];
        for(i=0;i<nums1.length;i++){
            arr[i]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++){
            arr[i]=nums2[j];
            i++;
        }
        if((arr.length)%2==0){
            Arrays.sort(arr);
            median=(((float)arr[((arr.length)/2)-1]+(float)arr[(arr.length)/2])/2);
        }
        else{
            Arrays.sort(arr);
            median=arr[(arr.length)/2];
        }
        return median;
    }
}