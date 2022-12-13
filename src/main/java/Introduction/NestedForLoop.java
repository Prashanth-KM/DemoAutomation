package Introduction;

public class NestedForLoop {
    public static void main(String[] args) {
       for (int i=1;i<=4;i++){//no of rows
           for (int j=1;j<=4;j++){// no of columns
               System.out.print("* ");//column data
           }
           System.out.println();
       }
    }
}
