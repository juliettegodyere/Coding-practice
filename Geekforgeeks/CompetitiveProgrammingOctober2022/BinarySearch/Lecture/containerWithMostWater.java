package BinarySearch.Lecture;
//https://leetcode.com/problems/container-with-most-water/submissions/
class Solution {
    public int maxArea(int[] height) {
        int N = height.length;
        int i = 0; 
        int j = N - 1;
        int max = 0;
        while(i < j){
            int h = Math.min(height[i], height[j]);
            int w = (j-i);
            int area = (w*h);
            max = Math.max(area, max);
            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}