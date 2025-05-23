package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {

    public static Set<String> createHashSet() {
        Set<String> hash = new HashSet<>();
        hash.add("ELEMENT KPRBC");
        hash.add("ELEMENT YPBTM");
        hash.add("ELEMENT AADXU");
        hash.add("ELEMENT RXCGJ");
        hash.add("ELEMENT WYMVD");
        hash.add("ELEMENT WFGEJ");
        hash.add("ELEMENT TYGBS");
        hash.add("ELEMENT MAPTK");
        hash.add("ELEMENT GJXVE");
        hash.add("ELEMENT BAFGL");
        return hash;
    }

    public static Set<String> createTreeSet() {
        Set<String> tree = new TreeSet<>();
        tree.add("ELEMENT KPRBC");
        tree.add("ELEMENT YPBTM");
        tree.add("ELEMENT AADXU");
        tree.add("ELEMENT RXCGJ");
        tree.add("ELEMENT WYMVD");
        tree.add("ELEMENT WFGEJ");
        tree.add("ELEMENT TYGBS");
        tree.add("ELEMENT MAPTK");
        tree.add("ELEMENT GJXVE");
        tree.add("ELEMENT BAFGL");
        return tree;
    }

    private static void printSet(Set<String> customSet) {
        for(String s: customSet){
            System.out.println(s);
        }
    }


    public static boolean addElementToSet(Set<String> set, String elementToAdd) {
        return set.add(elementToAdd);
    }

    public static void main(String[] args) {
        Set<String> hash = createHashSet();
        Set<String> tree = createHashSet();
        System.out.println("hash: ");
        if (addElementToSet(hash,"ELEMENT AAA")){
            System.out.println("Se añade.");
        } else System.out.println("No se añade.");
        System.out.println("tree: ");
        if (addElementToSet(tree,"ELEMENT AAA")){
            System.out.println("Se añade.");
        } else System.out.println("No se añade.");
        printSet(hash);
        printSet(tree);
    }

}
