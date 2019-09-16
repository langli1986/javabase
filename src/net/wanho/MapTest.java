package net.wanho;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        //键值对   key-value
        Map<String, String> map = new HashMap<>();
        map.put("name", "ali");
        map.put("age", "12");
        map.put("sex", "男");


        Set<String> keys = map.keySet();
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String key = it.next();
            System.out.println(key + ":" + map.get(key));
        }


        for (String key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }

        Set<Map.Entry<String, String>> entries = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        System.out.println(map.containsKey("name"));
        System.out.println(map.containsValue("12"));
        System.out.println(map.isEmpty());
//        map.clear();
        map.put("name", "zhangli");
        System.out.println(map.get("name"));

        String value = "I am happy to join with you today in what will go down in history as the greatest demonstration for freedom in the history of our nation"+
                "Five score years ago, a great American, in whose symbolic shadow we stand today, signed the Emancipation Proclamation. " +
                "This momentous decree came as a great beacon light of hope to millions of Negro slaves who had been seared in the flames of withering injustice. " +
                "It came as a joyous daybreak to end the long night of their captivity. ";
        //统计上述段落中所有的单词个数
        Map<String,Integer> map1 = new HashMap<>();
        String[] strings = value.split(" ");
        System.out.println(strings);
        for(String s:strings)
        {
            if(map1.containsKey(s))//之间已经存在过，+1
            {
                int count = map1.get(s);
                count ++;
                map1.put(s,count);
            }
            else {
                map1.put(s,1);
            }
        }
        for(String s:map1.keySet())
        {
            System.out.println(s+":"+map1.get(s));
        }
    }
}
