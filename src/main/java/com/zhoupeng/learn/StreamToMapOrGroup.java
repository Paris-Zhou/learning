package com.zhoupeng.learn;

import com.zhoupeng.pojo.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamToMapOrGroup {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("zhangsan", 18),
                new Person("lisi", 20),
                new Person("wangwu", 23),
                new Person("zhangsan", 18),
                new Person("lisi", 18),
                new Person("wangwu", 23));
        Map<Person, Integer> map = people.stream().collect(Collectors.toConcurrentMap(Function.identity(), v -> 1, Integer::sum));
        System.out.println("map = " + map);
        System.out.println(map.getClass());
        Map<String, List<Person>> map1 = people.stream().collect(Collectors.groupingBy(Person::getName));
        System.out.println("map1 = " + map1);
        System.out.println(map1.getClass());
        Map<Integer, List<Person>> map2 = people.stream().collect(Collectors.groupingByConcurrent(Person::getAge));
        System.out.println("map2 = " + map2);
        System.out.println(map2.getClass());
    }
}
