package com.ilya.designpattern.structurepatterns.composite;


public class CompositeRunner {
    public static void main(String[] args) {
        Pioneer schoolboy = new Schoolboy();
        Pioneer schoolboy1 = new Schoolboy();
        Pioneer schoolboy2 = new Schoolboy();
        Pioneer student = new Student();
        Pioneer student1 = new Student();
        Pioneer student2 = new Student();


        Party schoolUnit = new Party();
        Party studentUnit = new Party();
        Party cityPart = new Party();

        schoolUnit.addToFormation(schoolboy);
        schoolUnit.addToFormation(schoolboy1);
        schoolUnit.addToFormation(schoolboy2);

        studentUnit.addToFormation(student);
        studentUnit.addToFormation(student1);
        studentUnit.addToFormation(student2);

        cityPart.addToFormation(schoolUnit);
        cityPart.addToFormation(studentUnit);
        System.out.println("Salute schoolboys!!!");
        schoolUnit.greetingPioneer();
        System.out.println("Salute students!!!");
        studentUnit.greetingPioneer();
        System.out.println("Salute pioneers!!!");
        cityPart.greetingPioneer();
    }

}
