public class SwapCharacters {

    static char[] swap(String str, int i, int j) {
        char ch[] = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return ch;
    }

    static void swapChar(String S, int i, int j){
        char c[]= S.toCharArray();//{'s','e','l', 'e', 'n','i','u','m'}
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
        System.out.println(c);
    }
    public static void main(String[] args) {
        String s = "Selenium";//meleniuS
        System.out.println(swap(s, 0, s.length() - 1));
        char[] a=swap(s,0,s.length()-1);

        swapChar(s,0,s.length()-1);

    }

}
