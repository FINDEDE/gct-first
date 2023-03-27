package gct01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo02 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("百度","sima");
        map.put("腾讯","mm");
        map.put("ea","nm");
        System.out.println(map.get("百度"));
        Set<String> key=map.keySet();
        for (String s:key){
            System.out.println(s);
        }
        Collection<String> co=map.values();
        for (String s:co){
            System.out.println(s);
        }
    }
}
