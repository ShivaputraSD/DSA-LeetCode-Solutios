class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<=image.length-1;i++){
            int p=0,k=image[i].length-1;
            while(p<=k){
                int temp=(image[i][p]==0)?1:0;
                image[i][p]=(image[i][k]==0)?1:0;
                image[i][k]=temp;
                p++;
                k--;

            }
        }
        return image;
        
    }
}