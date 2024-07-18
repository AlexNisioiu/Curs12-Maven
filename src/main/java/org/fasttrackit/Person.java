package org.fasttrackit;

import java.util.Objects;
@MyFirstAnnotation(defaultAge = 21)
public class Person {

    private String name;
    @MyFirstAnnotation
    private int age;

    private String country;
    private boolean isMarried;
    private String company;

    public Person(String name, int age, String country, boolean isMarried, String company) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.isMarried = isMarried;
        this.company = company;
    }
@MyFirstAnnotation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", isMarried=" + isMarried +
                ", company='" + company + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && isMarried == person.isMarried && Objects.equals(name, person.name) && Objects.equals(country, person.country) && Objects.equals(company, person.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, country, isMarried, company);
    }
}
