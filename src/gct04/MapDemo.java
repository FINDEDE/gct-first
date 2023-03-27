package gct04;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line = sc.nextLine();
        TreeMap<Character,Integer> tm=new TreeMap<Character,Integer>();
        for (int i=0;i<line.length();i++){
            char key=line.charAt(i);
            Integer value=tm.get(key);
            if (value==null){
                tm.put(key,1);
            }
            else {
                value++;
                tm.put(key,value);
            }
        }
        StringBuilder sb=new StringBuilder();
        Set<Character> characters = tm.keySet();
        for (Character key:characters){
            Integer integer = tm.get(key);
            sb.append(key).append("(").append(integer).append(")");

        }
        String s = sb.toString();
        System.out.println(s);
    }
}
