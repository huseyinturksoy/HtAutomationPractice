package com.dogus.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties = new Properties();

    static{
        try{
            FileInputStream file =new FileInputStream("configuration.properties");
            properties.load(file);
            file.close();

        }catch(IOException e){

            System.out.println("File input stream error !!! ConfigurationReader !!!");
            e.printStackTrace();
        }



    }

    public static String getProperty(String key){

        return properties.getProperty(key);

    }


}
