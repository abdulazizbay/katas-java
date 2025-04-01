```java
//1
//
//Given a string and a non-negative int n, return a larger string that is n copies of the original string.
public String stringTimes(String str, int n) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
        sb.append(str);
    }
    return sb.toString();
}

//2
//Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
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

//3
//Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
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
```