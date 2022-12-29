package MyProjects.Day.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReadingUtil {
    private static Properties properties = new Properties();
    // using Encapsulation


    static{
        //will get executed before everything
        //get the path for conf properties
        String pathForPropertiesFile = "configuration.properties";
        try{
            FileInputStream fileInputStream = new FileInputStream(pathForPropertiesFile);
            //load the fileto properties by using load method
            properties.load(fileInputStream);
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Properties file not found");
        }
    }
    public static String getProperties(String keyword){
        return properties.getProperty(keyword);
    }
}
