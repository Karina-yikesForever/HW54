package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        ArrayList<Cities>cities=new ArrayList<>();
        HashSet<Cities>citiesHashSet=new HashSet<>();
        TreeSet<Cities>citiesTreeSet=new TreeSet<>();
        Cities cities1=new Cities(1,"Bishkek");
        Cities cities2=new Cities(2,"Paris");
        Cities cities3=new Cities(3,"London");
        Cities cities4=new Cities(4,"Soul");
        Cities cities5=new Cities(5,"New-York");
        cities.add(cities1);
        cities.add(cities2);
        cities.add(cities3);
        cities.add(cities4);
        cities.add(cities5);

        for (Cities ct:cities){
            if(ct.getCode() %2==0){
                citiesHashSet.add(ct);

            }
           // System.out.println(citiesHashSet);
            //System.out.println(citiesTreeSet);

            Iterator iterator=citiesTreeSet.iterator();
            while (iterator.hasNext()){
                for (Iterator iterator1=iterator; iterator.hasNext();){
                    Cities c=(Cities) iterator1.next();
                    if(c.getName().length()>5){
                        iterator.remove();
                    }
                }
            }
            citiesHashSet.removeIf(r->r.getName().length()>5);
            System.out.println(citiesTreeSet);
            System.out.println(citiesHashSet);
        }
    }
}
