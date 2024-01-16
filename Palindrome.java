// Given an integer x, return true if x is a 
// palindrome, and false otherwise.

// Example 1:

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.



class Solution {
    public boolean isPalindrome(int x) {
        int given = x;
        int ans = 0;
        if(x<0){ //if the given number is negative then automatically returns false as negative numbers cant be palindrome
            return false;
        }
        while(x>0){
            int temp = x%10; // returns the ones digit of the number
            x /=10;          // divides the given number by 10 to remove the ones digit from the og number
            ans = ans*10+temp;// multiplies the ans by 10 and adds the temp variable (ones digit of og number) and updates the ans variable 
                              // in short reversing the number
        }
        if(given==ans){ //checks if the given number is equivalent to reversed number and returns true if the condition meets.
            return true; // in short confirms if its a palindrome or not
        }
        return false;
    }
}