package ru.otus.drioma2002.java.basic.homeworks.homework10;

import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> map = new HashMap<>();
    private Set<String> set = new HashSet<>();

    public void add (String name, String phone) {
        if(!map.containsKey(name)) {
            map.put(name, new ArrayList<String>());
        }
        map.get(name).add(phone);
        set.add(phone);
    }

    public void find (String name) {
        if (!map.containsKey(name)) {
            System.out.println(name + " отсутствует в справочнике");
            return;
        }

        System.out.println("Телефон " + name + ":");
        for (String phone : map.get(name)) {
            System.out.println(phone);
        }
    }

    public void containsPhoneNumber (String phone) {
        if (set.contains(phone)) {
            System.out.println("Телефон " + phone + " присутствует в справочнике");
        } else {
            System.out.println("Телефон " + phone + " отсутствует в справочнике");
        };
    }
}
