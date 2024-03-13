public class CharArrayVowel {
    public static void main(String[] args){
        String str = "tutort";
        findVowel(str);
    }

    public static void findVowel(String str){
        char[] chStr = str.toCharArray();
        for(int i=0; i<chStr.length ; i++) {
            if (chStr[i] == 'a' || chStr[i] == 'e' || chStr[i] == 'i' || chStr[i] == 'o' || chStr[i] == 'u') {
                System.out.print(chStr[i]);
            }
        }
    }
}
