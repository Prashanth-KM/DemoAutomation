package Introduction;

public class Duplicate {
    public static void main(String[] args) {
        int a[]={2,3,4,5,2,3,4,6,5};//a.length=7
        //a[0]=2
        //a[1]=3
        //a[2]=4
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                //a[0]==a[1],a[0]==a[2],a[0]==a[3],a[0]==a[4],a[0]==a[5],a[0]==a[6]-->i=0
                //a[1]==a[2],a[1]==a[3],a[1]==a[4],a[1]==a[5]-,a[1]==a[6]->i=1
                //a[2]==a[3],a[2]==a[4],a[2]==a[5],a[2]==a[6]-->i=2
                if(a[i]==a[j]){
                    System.out.println(a[i]);
                    //2
                    //3
                    //4
                }
            }
        }
    }
}
