package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapp {
    public static void main(String[] args){
        Map <Integer, String> m = new HashMap<>(Map.of(1,"vivek",2,"samir",3,"golu"));
        for(Entry<Integer,String> entreey : m.entrySet()){
            System.out.println(entreey.getKey()+ " " + entreey.getValue());
        }
    } 
}
