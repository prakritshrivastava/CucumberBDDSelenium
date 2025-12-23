package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    private  Properties prop;

    public Properties getConfigData(){

        try{
            prop=new Properties();
            FileInputStream configStream = new FileInputStream("./src/test/resources/config/config.properties");
            prop.load(configStream);
        }
        catch(IOException fileLoadException){
            System.out.println("Error obtained while loading the Config File: "+fileLoadException.getMessage());
        }
        return prop;
    }

}
