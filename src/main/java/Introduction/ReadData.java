package Introduction;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadData {
    public static void main(String[] args) throws IOException {
        String path= "/Users/prashanthkumar/Desktop/JavaTraining/src/main/java/Introduction/Data.properties";

        String genericPath= System.getProperty("user.dir")+ File.separator+"src"+File.separator+"main"+
                File.separator+"java"+File.separator+"Introduction"+File.separator+"Data.properties";
        System.out.println(genericPath);
        FileReader reader= new FileReader(genericPath);
        Properties properties= new Properties();
        properties.load(reader);
        String name=properties.getProperty("userName");
        System.out.println(name);
        System.out.println(properties.getProperty("password"));

        login(properties.getProperty("UserName"),properties.getProperty("Password"));

    }

    static void login(String userName, String password){
        System.out.println("Entering userName");
        System.out.println("Password");
    }
}
