```java
public class Solution {
    public String stringTimes(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    public int last2(String str) {
        if (str.length() < 2) {
            return 0;
        }
        String last2Chars = str.substring(str.length()-2);
        int counter = 0;
        for(int i=0; i<str.length()-2; i++) {
            String sub = str.substring(i, i+2);
            if(sub.equals(last2Chars)){
                counter++;
            }
        }
        return counter;

    }

    public String altPairs(String str) {
        StringBuilder newWordBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i += 4) {
            newWordBuilder.append(str.charAt(i));

            if (i + 1 < str.length()) {
                newWordBuilder.append(str.charAt(i + 1));
            }
        }

        return newWordBuilder.toString();
    }
}
```