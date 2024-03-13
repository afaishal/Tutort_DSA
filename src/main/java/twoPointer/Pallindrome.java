package twoPointer;

import java.util.Arrays;

public class Pallindrome {
    public boolean isPalindrome(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        char[] sChar = s.toCharArray();
        char[] sChar1 = new char[sChar.length];
        int j =0;
        for(int i=sChar.length-1; i>=0;i--){

            sChar1[j] = sChar[i];
            ++j;

        }
        if(Arrays.equals(sChar1,sChar)){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Pallindrome pallindrome = new Pallindrome();
        pallindrome.isPalindrome("A man, a plan, a canal: Panama");
    }
}
