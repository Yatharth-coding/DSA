/*189. Rotate Array
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

=> solution
// first reverse an array
        rotate(nums , 0  ,nums.length-1);
        rotate(nums , 0 , k-1);
        rotate(nums , k , nums.length-1);
 */


// while solving question like if the element is traverse or not for this make a boolean array and which ever element it traverse make them true , boolean take less space
// sometime while doing calculation do a = a%n where n is outer limit like in the problem of 189 if arraysize is 2 and k=9 is given to solve this problem do k = k%arraysize
