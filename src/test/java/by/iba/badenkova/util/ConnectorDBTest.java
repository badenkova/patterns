package by.iba.badenkova.util;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectorDBTest {
    @Test
    public void testGetConnection() throws SQLException {
//give
        Connection connection = ConnectorDB.getConnection();
//when
//then
        Assert.assertNotNull (connection);

}}
