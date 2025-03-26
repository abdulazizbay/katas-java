```java
class Solution {
    public String stringTimes(String str, int n) {
        return str.repeat(n);
    }

    public int last2(String str) {
        if (str.length() < 2) return 0;
        String last2 = str.substring(str.length() - 2);
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals(last2)) count++;
        }
        return count;
    }

    public String altPairs(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i += 4) {
            result.append(str.charAt(i));
            if (i + 1 < str.length()) {
                result.append(str.charAt(i + 1));
            }
        }
        return result.toString();
    }
}
```