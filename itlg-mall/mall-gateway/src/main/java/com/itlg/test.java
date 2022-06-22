package com.itlg;

import java.util.HashMap;

public class test {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap();
        map.put("1", "1");
        int hash = HashMap.hash("1");
        System.out.println(hash);
    }

    static class Node<K, V> implements Map.Entry<K, V> {
        final int hash; //key的hash值
        final K key; //与你put进去的key一样
        V value; //与你put进去的value一样
        Node<K, V> next;//存放下一个节点
    }
}
