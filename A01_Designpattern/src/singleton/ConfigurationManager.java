package singleton;

import java.util.HashMap;

public class ConfigurationManager {

    private static ConfigurationManager instance;//null

    private HashMap<String,String> properties = new HashMap<>();

    private ConfigurationManager(){}

    public static ConfigurationManager getInstance(){
        if(instance==null){
            instance= new ConfigurationManager();
        }

        return instance;
    }


    //
    public void setProperty(String key, String value){
        properties.put(key,value);
    }

     public String getProperty(String key) {
        return properties.get(key);
     }

     public void  printAllProperties(){
        for (String key:properties.keySet()){
            System.out.println(key+":"+properties.get(key));
        }
     }
}
