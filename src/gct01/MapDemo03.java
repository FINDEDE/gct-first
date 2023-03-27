package gct01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo03 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<String,String>();
        map.put("令狐冲","任盈盈");
        map.put("乔峰","段誉");
        map.put("郭襄","张三丰");
//        Set<String> keyset = map.keySet();
//        for (String s:keyset){
//            String s1 = map.get(s);
//            System.out.println(s+" "+s1);
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> m:entries){
            String key = m.getKey();
            String value = m.getValue();
            System.out.println(key+" "+value);
        }
    }
}
