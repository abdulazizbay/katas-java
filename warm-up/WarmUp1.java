//1
//When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars. Return true if the party with the given values is successful, or false otherwise.
public boolean cigarParty(int cigars, boolean isWeekend){
    int min = 40;
    int max = 60;
    return (cigars >= min && (cigars <= max || isWeekend));
}

//2
//The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
public boolean sleepIn(boolean weekday, boolean vacation) {
    if (!weekday || vacation) {
        return true;
    } else {
        return false;
    }
}
//3
//Given a string, return true if the string starts with "hi" and false otherwise.

public boolean startHi(String str) {
    if (str.length() >= 2) {
        return str.substring(0, 2).equals("hi");
    } else {
        return false;
    }
}

//4
//Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.
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