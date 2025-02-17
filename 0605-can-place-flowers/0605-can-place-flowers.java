class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                boolean emptyLeft = (i==0) || (flowerbed[i-1]==0);
                boolean emptyRight = (i==flowerbed.length -1)|| (flowerbed[i+1]==0);
            

            // if both plots are empty, we can plat a flower here
            if(emptyLeft && emptyRight){
                flowerbed[i] =1;
                count++;
               
            }
            }
        }
        return count>=n;
    }
}