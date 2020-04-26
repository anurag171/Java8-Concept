package com.anurag.java8.practise;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

class Lambda4 {
    static int outerStaticNum;
    int outerNum;

    void testScopes() {
        MyConvertor<Integer, String> stringConverter1 = (from) -> {
            outerNum = 23;
            return String.valueOf(from);
        };

        MyConvertor<Integer, String> stringConverter2 = (from) -> {
            outerStaticNum = 72;
            return String.valueOf(from);
        };
        
        Optional<String> optional = Optional.of("bfgh");

        System.out.println(optional.isPresent());           // true
        System.out.println(optional.get());                 // "bam"
        System.out.println(optional.orElse("fallback"));    // "bam"

        optional.ifPresent((s) -> System.out.println(s.charAt(0))); 
        
        Predicate<String> predicate = (s) -> s.length() > 0;
        System.out.println(predicate.test("foo"));              // true
        System.out.println(predicate.negate().test("foo"));     // false

        Predicate<Boolean> nonNull = Objects::nonNull;
        System.out.println(nonNull.negate());
        Predicate<Boolean> isNull = Objects::isNull;

        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();
    }
}