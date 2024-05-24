package belajar.test.junit.test.repository;

import belajar.test.junit.test.data.Person;

public interface PersonRepo {
    Person selectById(String id);

    void insert(Person person);
}
