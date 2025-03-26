```java
class Solution {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        return (cigars >= 40) && (isWeekend || cigars <= 60);
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public boolean startHi(String str) {
        return str.startsWith("hi");
    }

    public int close10(int a, int b) {
        int absA = Math.abs(a - 10);
        int absB = Math.abs(b - 10);

        if (absA < absB) return a;
        if (absB < absA) return b;
        return 0;
    }
}
```