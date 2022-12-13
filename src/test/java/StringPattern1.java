public class StringPattern1 {

    public static void main(String[] args) {
        char c[]={'P','R','O','G','R','A','M'};
        for(int i=c.length-1;i>=0;i--) {
            for (int j=0;j<=i;j++) {
                System.out.print(c[j]+ " ");
            }
            System.out.println();
        }

        System.out.println("*************");
        for(int k=0;k<c.length;k++){
            for(int l=0;l<c.length;l++){
                System.out.print(c[l]+" ");
            }
            System.out.println();
        }
        System.out.println("*************");
        for(int i=0;i<c.length;i++) {
            for (int j=0;j<=i;j++) {
                System.out.print(c[j]+ " ");
            }
            System.out.println();
        }

    }
}
