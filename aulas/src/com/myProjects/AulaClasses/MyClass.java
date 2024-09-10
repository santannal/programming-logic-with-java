package com.myProjects.AulaClasses;
public class MyClass {
    public static void main(String[] args) {
        String firstName = "Leonardo";
        String lastName = "Oliveira";

        String fullName = completeName(firstName, lastName);

        System.out.println(fullName);
    }

    public static String completeName(String firstName, String lastName) {
        return firstName.concat(" ").concat(lastName);
    }
}
