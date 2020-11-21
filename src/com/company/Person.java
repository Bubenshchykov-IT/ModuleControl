package com.company;

public abstract class Person implements AbilityToFight
{
    private String name;
    private String surname;
    private int age;

    public Person (String name, String surname, int age)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String toString ()
    {
        return "{ name = " + name + ", " +
                "surname = " + surname + ", age = " + age + "};";
    }
}
