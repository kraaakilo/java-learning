package com.kraaakilo.database;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class Environment {
    public static Map<String, String> getInstance() throws IOException {
        InputStream inputStream = Environment.class.getResourceAsStream("/application.properties");
        Properties properties = new Properties();
        properties.load(inputStream);
        HashMap<String,String> p = new HashMap<>();

        Iterator<?> k = properties.propertyNames().asIterator();
        Iterator<Object> i = properties.elements().asIterator();

        while (i.hasNext() && k.hasNext()) {
            p.put(k.next().toString(),i.next().toString());
        }
        return p;
    }
}
