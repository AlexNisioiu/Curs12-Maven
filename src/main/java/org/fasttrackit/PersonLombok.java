package org.fasttrackit;

import lombok.*;

@Data
public class PersonLombok {
    private final String name;
    private final int age;

    private final String country;
    private final boolean isMarried;
    private final String company;

}