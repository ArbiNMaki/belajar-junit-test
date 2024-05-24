package belajar.test.junit.test.service;

import belajar.test.junit.test.data.Person;
import belajar.test.junit.test.repository.PersonRepo;

public class PersonService {
    private PersonRepo personRepo;

    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public Person get(String id) {
        Person person = personRepo.selectById(id);
        if(person != null) {
            return person;
        } else {
            throw new IllegalArgumentException("Person not found");
        }
    }
}
