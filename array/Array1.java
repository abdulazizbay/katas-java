```java
public boolean firstLast6(int[] nums) {
    return  nums.length >= 1 && (nums[0]==6 || nums[nums.length-1]==6);

}
```

```java
public boolean commonEnd(int[] a, int[] b) {
    return a[0] == b[0] || a[a.length-1] == b[b.length-1];
}
```

```java
public boolean no23(int[] nums) {
    return nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3;
}
```

```java
public int[] makeMiddle(int[] nums) {
    return new int[]{nums[nums.length / 2 - 1], nums[nums.length / 2]};
}
```