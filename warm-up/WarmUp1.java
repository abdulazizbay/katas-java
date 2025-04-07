```java
public boolean cigarParty(int cigars, boolean isWeekend) {
    if (isWeekend) {
        return (cigars >= 40);
    } else {
        return (cigars >= 40 && cigars <= 60);
    }
}
```

```java
public boolean sleepIn(boolean weekday, boolean vacation) {
    if (!weekday || vacation) {
        return true;
    } else {
        return false;
    }
}
```

```java
public boolean startHi(String str) {
    if (str.length() >= 2) {
        return str.substring(0, 2).equals("hi");
    } else {
        return false;
    }
}
```

```java
public int close10(int a, int b) {
    int diffA = Math.abs(10 - a);
    int diffB = Math.abs(10 - b);
    if (diffA < diffB) {
        return a;
    } else if (diffB < diffA) {
        return b;
    } else {
        return 0;
    }
}
```