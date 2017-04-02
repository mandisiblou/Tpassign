package cput.ac.za.AbstractFactory.Factories;

import cput.ac.za.AbstractFactory.Domain.Person;

/**
 * Created by Mandisi on 4/1/2017.
 */
public interface PersonFactory {
    public abstract Person getPersonName(String personName);
}
