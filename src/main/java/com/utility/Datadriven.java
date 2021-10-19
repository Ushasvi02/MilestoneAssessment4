package com.utility;

 

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.IOException;

import java.util.Properties;

 

 

public class Datadriven {

            public static String datadriver(String inp) throws IOException

            {

                        Properties prop=new Properties(); // properties class is present in java.util which will help us to interact with properties file

                        FileInputStream fis=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\Milestone4\\data.properties"); // all these packages comes under selenium jars

                        prop.load(fis);

                        String val=prop.getProperty(inp);

                        System.out.println(val);

                        return val;

                       

            }

}