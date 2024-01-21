// Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
// Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
// Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
// Return k.

// Input: nums = [3,2,2,3], val = 3
// Output: 2, nums = [2,2,_,_]
// Explanation: Your function should return k = 2, with the first two elements of nums being 2.
// It does not matter what you leave beyond the returned k (hence they are underscores).
class Solution {
    // Function to remove all occurrences of a specified value 'val' from the array 'nums'
    public int removeElement(int[] nums, int val) {
        // Initialize a variable 'count' to keep track of the valid elements without 'val'
        int count = 0;

        // Iterate through each element in the array 'nums'
        for (int i = 0; i < nums.length; i++) {
            // Check if the current element is not equal to the specified value 'val'
            if (nums[i] != val) {
                // If not equal, update the element at position 'count' in the array with the current element
                nums[count] = nums[i];
                
                // Increment 'count' to move to the next valid position for the next non-'val' element
                count++;
            }
        }

        // 'count' now represents the length of the array without the specified value 'val'
        return count;
    }
}
