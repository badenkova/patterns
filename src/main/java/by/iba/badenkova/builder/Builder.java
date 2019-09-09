package by.iba.badenkova.builder;

import by.iba.badenkova.exception.RepositoryException;

import java.sql.ResultSet;

public interface Builder <T> {
    T build(ResultSet resultSet) throws RepositoryException, RepositoryException;
}
