package myPackage;

import java.util.Set;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<String>();

        set.add("a");
        set.add("b");

        for (String i:
             set) {
            System.out.println(i);
            System.out.println("---");
        }
        set.remove("a");

        System.out.println(set);
    }
}
// Hieu suat thap hon Hash_Set

// Sap xep theo thu tu tang dan;