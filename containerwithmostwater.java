// 11. Container With Most Water
// You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
// Find two lines that together with the x-axis form a container, such that the container contains the most water.
// Return the maximum amount of water a container can store.
// Notice that you may not slant the container.

// Example
// Input: height = [1,8,6,2,5,4,8,3,7]
// Output: 49
// Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int i=0;
        int j = height.length-1;
        int h;
        int w;
        while(i<j){ // using 2 pointer method 
            h = Math.min(height[i],height[j]); // finding min height or else water spills
            w = j-i;//finding width
            maxWater = Math.max(maxWater,h*w);// setting the new maxWater as the area 
            if(height[i]>height[j]){// pretty self explanatory
                j--;
            }
            else{
                i++;
            }
        }
        return maxWater;
    }
}
