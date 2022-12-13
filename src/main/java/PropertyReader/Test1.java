package PropertyReader;

import java.io.IOException;
import java.util.Properties;

public class Test1 {
    public static Properties prop;
    public static void main(String[] args) throws IOException {
         prop=Test3.readProperty();
        Test test= new Test();
        test.addition(prop.getProperty("a"),prop.getProperty("b"));

    }
}
