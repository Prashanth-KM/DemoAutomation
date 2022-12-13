package Files;

import java.io.File;

public class Example1 {
    public static void main(String[] args){
       getDetails();
    }

    static void getDetails(){
        File file=null;
        try{
             file= new File("/Users/prashanthkumar/Downloads/Demo.xlsx");
            System.out.println("File name:"+file.getName());
            System.out.println("File path:"+file.getAbsolutePath());
            System.out.println("IsFile or not:"+file.isFile());
            System.out.println("id Directory or not :"+file.isDirectory());
            System.out.println("File can write or not:"+file.canRead());
            System.out.println("File can read or not:"+file.canWrite());

        }catch (Exception e){
            System.out.println("Catch block executed");
        }
    }

}
