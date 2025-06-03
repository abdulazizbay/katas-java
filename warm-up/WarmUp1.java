//1
//When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars. Return true if the party with the given values is successful, or false otherwise.
public boolean cigarParty(int cigars, boolean isWeekend){
    int min = 40;
    int max = 60;
    if(cigars >= min && (cigars <= max || isWeekend)){
        return true;
    }else {
        return false;
    }
}
