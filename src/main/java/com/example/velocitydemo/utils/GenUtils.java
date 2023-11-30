package com.example.velocitydemo.utils;

import org.apache.velocity.app.Velocity;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.zip.ZipOutputStream;

public class GenUtils {

    public static void generatroCode(Map<String,Object> data, List<String> template, ZipOutputStream zip){
        Properties properties = new Properties();
        properties.put("file.resource.loader.class","org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        Velocity.init(properties);
    }

    public static String getFileName(String template,String className, String packageName){
        return null;
    }
}
