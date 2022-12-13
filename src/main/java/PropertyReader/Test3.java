package PropertyReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Test3 {
//    public static Properties properties;

    //write the code to interact property file

    public static Properties readProperty() throws IOException {
        String path= System.getProperty("user.dir")+ File.separator+"src"+File.separator+"main"+File.separator
                +"java"+File.separator+"Properties"+File.separator+"testData.properties";
        System.out.println("Path :"+path);

        FileReader reader= new FileReader(path);
        Properties properties= new Properties();
        properties.load(reader);
        return properties;
    }
}
