package by.iba.badenkova.service;

import by.iba.badenkova.exception.RepositoryException;
import by.iba.badenkova.exception.ServiceException;
import by.iba.badenkova.model.Person;
import by.iba.badenkova.repository.PersonRepository;
import by.iba.badenkova.repository.RepositoryCreator;

import java.util.List;

public class PersonService {
    public List<Person> findAll() throws ServiceException {
        try (RepositoryCreator repositoryCreator = new RepositoryCreator()) {
            PersonRepository personRepository =
                    repositoryCreator.getPersonRepository();
            return personRepository.findAll();
        } catch (RepositoryException e) {
            throw new ServiceException(e.getMessage(), e);
        }
    }
    public void save(Person person) throws ServiceException {
        try (RepositoryCreator repositoryCreator = new RepositoryCreator()) {
            PersonRepository personRepository =
                    repositoryCreator.getPersonRepository();
            personRepository.save(person);
        } catch (RepositoryException exception) {
            throw new ServiceException(exception.getMessage(), exception);
        }
    }
}
