package cput.ac.za.AbstractFactory.Factories;

import cput.ac.za.AbstractFactory.Domain.Person;

/**
 * Created by Mandisi on 4/1/2017.
 */
public class StudentFactory implements PersonFactory {
    @Override
    public Person getPersonName(String personName) {
        System.out.println(personName);
        return null;
    }
}
