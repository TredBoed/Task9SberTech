package com.school;

public class Person implements Comparable<Person>  {
   private String name;
   private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%8s \t %3s", this.name, this.age);

    }

    @Override
    public int hashCode() {
        return this.getAge() + this.getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Person p;
        if (obj instanceof Person) {
            p = (Person) obj;
        } else {
            throw new ClassCastException();
        }
        return this.getName().equals(p.getName()) && this.getAge() == (p.getAge());
    }

    @Override
    public int compareTo(Person o) {
        return this.getAge() - o.getAge();

    }
}
