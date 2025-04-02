```java
class Solution {
    public boolean cigarParty(int cigars, boolean isWeekend){
        if(isWeekend){
            return (cigars >= 40);
        }
        return (cigars >= 40 && cigars <= 60);
    }
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
    public boolean startHi(String str) {
        return str.startsWith("hi");
    }
    public int close10(int a, int b) {
        int absA = Math.abs(10 - a);
        int absB = Math.abs(10 - b);
        if (absA < absB) return a;
        if (absB < absA) return b;
        return 0;
    }
}
```