package com.bhavya;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String name = "Bhavya";
        int code = name.hashCode();
        System.out.println(code);

        HashMap<String, Integer> map = new HashMap<>();
        map.put("kunal", 99);
        map.put("karan", 39);
        map.put("Bhavya", 92);
        System.out.println(map.get("Bhavya"));
        System.out.println(map.getOrDefault("Aarav", 334));
        System.out.println(map.containsKey("karan"));

        HashSet<Integer> set = new HashSet<>();
//      it will include only distinct values in O(1)
        set.add(34);
        set.add(23);
        set.add(44);
        set.add(34);
        set.add(22);
        System.out.println(set);

//      our own created hashmap
        MapUsingHash maphash = new MapUsingHash();
        maphash.put("mango","bade majedar aam");
        System.out.println(maphash.get("mango"));


    }

    //    now we create our own hashmap

}

class MapUsingHash {
    private Entity[] entities;

    public MapUsingHash() {
        entities = new Entity[100];
    }

    public void put(String key, String value) {
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity(key, value);  // overriding
    }

    public String get(String key) {
        int hash = Math.abs(key.hashCode() % entities.length);
        if (entities[hash] != null && entities[hash].key.equals(key)) {
            return entities[hash].value;
        }
        return null;
    }

    public void remove(String key) {
        int hash = Math.abs(key.hashCode() % entities.length);
        if (entities[hash] != null && entities[hash].key.equals(key)) {
            entities[hash] = null;
        }
    }

    private class Entity {
        String key;
        String value;

        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}

// Difference between hashmap and hashtable is that hashmap is not synchronized,
// so it is not thread safe and cannot be shared between various threads as we,
// require thread synchronization code whereas hashtable is synchronized
// and also hashmap allows multiple null values whereas hashtable doesn't allow any null key or value