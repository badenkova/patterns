package by.iba.badenkova.builder;

import by.iba.badenkova.exception.RepositoryException;
import by.iba.badenkova.model.Person;
import by.iba.badenkova.repository.dbconstants.PersonTableConstants;

import org.junit.Before;
import org.junit.Ignore;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PersonBuilderTest {
    private static final Integer ID = 1;
    private static final String NAME = "Olga";
    private static final String PHONE = "+365482828344";
    private static final String EMAIL = "olga@gmail.com";
    private Person EXPECTED_PERSON = null;
    @Before
    public void initExpectedPerson() {
        EXPECTED_PERSON = new Person(
                ID,
                NAME,
                PHONE,
                EMAIL
        );
    }
    @Ignore
    @Test
    public void shouldBuildAndReturnUserWithParameters() throws SQLException,
            RepositoryException {
//Arrange
        ResultSet resultSet = mock(ResultSet.class);
        when(resultSet.getInt(PersonTableConstants.ID.getFieldName())).thenReturn(ID);
        when(resultSet.getString(PersonTableConstants.NAME.getFieldName())).thenReturn(NAME);
        when(resultSet.getString(PersonTableConstants.PHONE.getFieldName())).thenReturn(PHONE);
        when(resultSet.getString(PersonTableConstants.EMAIL.getFieldName())).thenReturn(EMAIL);
//Act
        PersonBuilder personBuilder = new PersonBuilder();
        Person actualPerson = personBuilder.build(resultSet);
//Assert
        assertEquals(EXPECTED_PERSON, actualPerson);
    }
}

