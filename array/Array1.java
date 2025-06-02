//1
//Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
public boolean firstLast6(int[] nums) {
    return  nums.length >= 1 && (nums[0]==6 || nums[nums.length-1]==6);

}

//2
//Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.
public boolean commonEnd(int[] a, int[] b) {
    if(a.length < 1 && b.length < 1){
        return false;
    }
    int aFirstNum = a[0];
    int aLastNum = a[a.length-1];
    int bFirstNum = b[0];
    int bLastNum = b[b.length-1];
    return aFirstNum == bFirstNum || aLastNum == bLastNum;
}

//3
//Given an int array length 2, return true if it does not contain a 2 or 3.
public boolean no23(int[] nums) {
    if (nums.length != 2) {
        throw new IllegalArgumentException("Array must be of length 2");
    }

    return nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3;
}

//4
//Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. The original array will be length 2 or more.
public int[] makeMiddle(int[] nums) {
    int [] newArray = new int[2];
    newArray[0] = nums[nums.length / 2 - 1];
    newArray[1] = nums[nums.length / 2];
    return newArray;
}
