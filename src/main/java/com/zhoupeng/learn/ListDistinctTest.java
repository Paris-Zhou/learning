package com.zhoupeng.learn;

import com.zhoupeng.pojo.Person;

import java.util.*;
import java.util.stream.Collectors;

public class ListDistinctTest {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("zhangsan", 18),
                new Person("lisi", 20),
                new Person("wangwu", 23),
                new Person("zhangsan", 18),
                new Person("lisi", 18),
                new Person("wangwu", 23));
        people.sort(Comparator.comparing(Person::getAge));
        ArrayList<Person> people2 = new ArrayList<>(new LinkedHashSet<>(people));
        System.out.println("people2 = " + people2);

        LinkedHashSet<Person> people3 = people.stream().sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getName)).distinct().collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println("people3 = " + people3);
    }

}
