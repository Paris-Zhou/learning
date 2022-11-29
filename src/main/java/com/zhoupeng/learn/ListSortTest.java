package com.zhoupeng.learn;

import com.zhoupeng.pojo.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListSortTest {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("zhangsan", 18), new Person("lisi", 20), new Person("wangwu", 23));
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        });
        people.sort((Person o1, Person o2) -> {return o1.getAge().compareTo(o2.getAge());});
        people.sort((o1, o2) -> {return o1.getAge().compareTo(o2.getAge());});
        people.sort((o1, o2) ->  o1.getAge().compareTo(o2.getAge()));
        people.sort(Comparator.comparing(Person::getAge));
        people.stream().sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getName));
    }
}
