package gct03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> arr = new ArrayList<HashMap<String, String>>();
        HashMap<String, String> hm1 = new HashMap<String, String>();
        HashMap<String, String> hm2 = new HashMap<String, String>();
        HashMap<String, String> hm3 = new HashMap<String, String>();
        arr.add(hm1);
        arr.add(hm2);
        arr.add(hm3);
        hm1.put("peter", "lois");
        hm1.put("meg", "chris");
        hm2.put("shit", "bitch");
        hm2.put("beach", "shift");
        hm3.put("spider", "bat");
        hm3.put("iron", "American");
        for (HashMap<String, String> a : arr) {
            Set<String> keySet = a.keySet();
            {
                for (String key : keySet) {
                    String value = a.get(key);
                    System.out.println(key + value);
                }
            }
        }
    }
}
