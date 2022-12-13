public class Palindrome {
    public static void main(String[] args){
      palindrome1();
      palindrome2();
    }
    static void palindrome1(){
        String S= "nitin";
        String S1= "";
        for(int i=S.length()-1;i>=0;i--){
            S1= S1+S.charAt(i);//nitin
        }

        if(S1.equals(S)){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }
    }
    static void palindrome2(){
        StringBuffer S1= new StringBuffer("1234");
        StringBuffer S2= new StringBuffer(S1);//4321
        S2.reverse();//4321
//        if(String.valueOf(S1).compareTo(String.valueOf(S2))==0){
//            System.out.println("It is a palindrome");
//        }else{
//            System.out.println("It is not a palindrome");
//        }

        if(String.valueOf(S1).equals(String.valueOf(S2))){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }

    }
}
