package org.fasttrackit;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class ReflectionExercise {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Person p = new Person("Jhon",33,"Romania",false,"Lidl");


//        Field age = Person.class.getDeclaredField("age");
//        age.setAccessible(true);
//        age.set(p,18);
//
//        System.out.println(p.getAge());

        MyFirstAnnotation annotations = Person.class.getAnnotation(MyFirstAnnotation.class);
        int defaultAge = annotations.defaultAge();

        Field ageField = Person.class.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(p,defaultAge);

        System.out.println(p.getAge());
        System.out.println();


    }
}
