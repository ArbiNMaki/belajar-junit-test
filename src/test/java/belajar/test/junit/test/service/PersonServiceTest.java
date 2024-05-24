package belajar.test.junit.test.service;

import belajar.test.junit.test.data.Person;
import belajar.test.junit.test.repository.PersonRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {
    @Mock
    private PersonRepo personRepo;

    private PersonService personService;

    @BeforeEach
    public void setUp() {
        personService = new PersonService(personRepo);
    }

    @Test
    public void testGetNotFound() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> personService.get("not found"));
    }

    @Test
    public void testGetPersonSuccess() {
        Mockito.when(personRepo.selectById("arbi"))
                .thenReturn(new Person("arbi", "Arbi"));

        var person = personService.get("arbi");

        Assertions.assertNotNull(person);
        Assertions.assertEquals("arbi", person.getId());
        Assertions.assertEquals("Arbi", person.getName());
    }
}
