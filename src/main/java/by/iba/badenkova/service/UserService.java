package by.iba.badenkova.service;

import by.iba.badenkova.exception.RepositoryException;
import by.iba.badenkova.exception.ServiceException;
import by.iba.badenkova.model.User;
import by.iba.badenkova.repository.RepositoryCreator;
import by.iba.badenkova.repository.SQLHelper;
import by.iba.badenkova.repository.UserRepository;
import by.iba.badenkova.repository.specification.UserByLogin;
import by.iba.badenkova.repository.specification.UserByLoginPassword;

import java.util.Optional;

public class UserService {
    public Optional<User> login(String login, byte[] password) throws
            ServiceException {
        try (RepositoryCreator repositoryCreator = new RepositoryCreator()) {
            UserRepository userRepository = repositoryCreator.getUserRepository();
            UserByLoginPassword params = new UserByLoginPassword(login, password);
            return userRepository.queryForSingleResult(SQLHelper.SQL_GET_USER,
                    params);
        } catch (RepositoryException e) {
            throw new ServiceException(e.getMessage(), e);
        }
    }
    public Integer save(User user) throws ServiceException {
        try (RepositoryCreator repositoryCreator = new RepositoryCreator()) {
            UserRepository userRepository = repositoryCreator.getUserRepository();
            UserByLogin param = new UserByLogin(user.getLogin());
            if (!userRepository.queryForSingleResult(SQLHelper.SQL_CHECK_LOGIN,
                    param).isPresent()) {
                return userRepository.save(user);
            } else {
                return 0;
            }
        } catch (RepositoryException exception) {throw new ServiceException(exception.getMessage(), exception);
        }
    }
}
