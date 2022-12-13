public class StringPattern2 {

    public static void main(String[] args) {
        char ch[]={'P','R','O','G','R','A','M','M','I','N','G'};
        for(int i=0;i<=ch.length-1;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print(ch[i] + " ");
            }
            System.out.println();
        }
    }

}
