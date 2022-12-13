package Properties;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class Test {
    public static void main(String[] args){
      try{

          String Path= System.getProperty("user.dir")+File.separator+"src"+File.separator+"main"+File.separator
                  +"java"+File.separator+"Properties"+File.separator+"testData.properties";
          System.out.println("Path :"+Path);

          FileReader reader= new FileReader(Path);
          Properties prop= new Properties();
          prop.load(reader);
          String userName= prop.getProperty("userName");
          String password= prop.getProperty("password");
          System.out.println("username :" +userName);
          System.out.println("password :" +password);
          String name= prop.getProperty("name");
          String age = prop.getProperty("age");
          String city = prop.getProperty("city");
          System.out.println("Name :" +name);
          System.out.println("age :" +age);
          System.out.println("city :" +city);


      }catch (Exception e){
          e.printStackTrace();
      }
    }
}
