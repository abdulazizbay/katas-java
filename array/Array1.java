```java
class Solution {
    public boolean firstLast6(int[] nums) {
        return  nums.length >= 1 && (nums[0]==6 || nums[nums.length-1]==6);
    }
    public boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length-1] == b[b.length-1];
    }
    public boolean no23(int[] nums) {
        return nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3;
    }
    public int[] makeMiddle(int[] nums) {
        int [] newArray = new int[2];
        newArray[0] = nums[nums.length / 2 - 1];
        newArray[1] = nums[nums.length / 2];
        return newArray;
    }
}
```