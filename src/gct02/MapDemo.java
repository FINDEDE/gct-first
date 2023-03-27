package gct02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Student> map=new HashMap<String,Student>();
        Student s1=new Student("令狐冲",20);
        Student s2=new Student("段誉",26);
        Student s3=new Student("张三丰",99);
        map.put("01",s1);
        map.put("02",s2);
        map.put("03",s3);
        Set<String> keySet = map.keySet();
        for (String s:keySet){
            Student values = map.get(s);
            System.out.println(s+""+values.getName()+" "+values.getAge());
        }
        System.out.println("--------");
        Set<Map.Entry<String, Student>> entrySet = map.entrySet();
        for (Map.Entry<String, Student> m:entrySet){{
            Student value = m.getValue();
            System.out.println(m.getKey()+" "+value.getName()+" "+value.getAge());
        }}
    }
}
