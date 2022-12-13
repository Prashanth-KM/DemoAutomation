package Files;


import java.io.File;

public class Example {

    public static void main(String[] args){
        File file = new File("/Users/prashanthkumar/Downloads/Demo.pdf");
        String fileName = file.getName();
        boolean flag= file.isFile();
        boolean directory= file.isDirectory();
        file.canRead();
        file.canWrite();

        System.out.println("File name :" +fileName);
        System.out.println("Is file :" +flag);
        System.out.println("Is directory :" +directory);
        System.out.println(file.canRead());
        System.out.println(file.canWrite());



    }
}
