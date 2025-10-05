#Count Hills and Valleys in an Array
  class Solution {
    public int countHillValley(int[] arr) {
                int c =0;
        int  i=0;
        for(int j =1;j<arr.length -1;j++){
            if (arr[j] == arr[j+1]) continue;

            if(arr[i] < arr[j] && arr[j]>arr[j+1] || arr[i]> arr[j] && arr[j]<arr[j+1]){
                c++;
            }
            i= j;
        }

        return  c;
    }
}
