package com.school;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String args[])
    {
        List<Person> someCollection = new ArrayList<>();
        someCollection.add(new Person("John", 25));
        someCollection.add(new Person("David", 21));
        someCollection.add(new Person("Tommy", 27));
        someCollection.add(new Person("Ann", 30));
        someCollection.add(new Person("Emily", 29));

        Map m = Streams.of(someCollection)
                .filter(p -> p.getAge() > 20)
                .transform( p -> new Person(p.getName()+"Bobby",p.getAge() + 30))
                                      .toMap(p -> p.getName(), p -> p);

        m.forEach((k,v) -> System.out.println("key: "+k+" value:"+v));
    }
}
