package Introduction;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] a= new int[3][3];
        a[0][0]=10;
        a[0][1]=11;
        a[0][2]=12;
        a[1][0]=20;
        a[1][1]=21;
        a[1][2]=22;
        a[2][0]=30;
        a[2][1]=31;
        a[2][2]=32;
        System.out.println("Size of the array :"+a.length);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    System.out.println("****************");
        int[][] b={{10,11,12},{20,21,22},{30,31,32}};
        for(int i=0;i<b.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }


    }
}
