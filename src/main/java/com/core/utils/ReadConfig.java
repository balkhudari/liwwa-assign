package com.core.utils;

import com.core.Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig extends Base {

    public static String readConfig(String configKey) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("src/test/resources/config.properties");
        Properties prop = new Properties();
        prop.load(fileInputStream);
        String configValue = (String)
                prop.get(configKey);
        return configValue;
    }


}