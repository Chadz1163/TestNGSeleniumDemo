package UITest.utils;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author shidao.zhang
 */
public class ProUtil {

    private Properties prop;
    private String filePath;

    public ProUtil(String filePath) {
        this.filePath = filePath;
        this.prop = readProperties();
    }

    private Properties readProperties() {
        Properties properties = new Properties();
        try {
            InputStream inputStream = new FileInputStream(filePath);
            BufferedInputStream in = new BufferedInputStream(inputStream);
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    public String getPro(String key){

        if (prop.containsKey(key)) {
            String value = prop.getProperty(key);
            return value;
        } else {
            System.out.println("输入的key不存在");
            return "";
        }

    }
}
