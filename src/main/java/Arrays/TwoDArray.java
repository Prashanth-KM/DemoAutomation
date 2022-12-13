package Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] a= new int[2][2];
        a[0][0]=10;
        a[0][1]=20;
        a[1][0]=30;
        a[1][1]=40;

        for (int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("*************");
        int[][] b={{10,20,30},{40,50,60},{70,80,90}};
        for(int k=0;k<b.length;k++){
            for(int l=0;l<b[k].length;l++){
                System.out.print(b[k][l]+" ");
            }
            System.out.println();
        }
        System.out.println("*************");

        String[][] names={{"A","B"},{"C","D"}};
        for(int x=0;x<names.length;x++){
            for(int y=0;y< names[x].length;y++){
                System.out.print(names[x][y] +" ");
            }
            System.out.println();
        }

    }
}
