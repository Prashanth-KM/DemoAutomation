public class Reverse {
    void reverse(){
        String S="Praveen";
        String S1="";
        System.out.println("Length :"+S.length());
        for(int i=S.length()-1;i>=0;i--){
            //S1=n;
            //S1=n+e==ne
            //S1=ne+e==nee
            //S1=nee+v==neev
            //S1=neev+a==neeva
            //S1=neeva+r==neevar
            //S1=neevar+P==neevarP
            S1= S1+ S.charAt(i);
        }
        System.out.println(S1);
    }

    //Palindrome- amma
    void reverseByChar(){
        String S="Praveen";
        char c[]= S.toCharArray();//{'P','r','a','v','e','e','n'}
        for(int j=c.length-1;j>=0;j--){
            System.out.print(c[j]);
        }
    }

    public static void main(String[] args){
        Reverse obj = new Reverse();
        obj.reverse();
//        obj.reverseByChar();

    }
}
