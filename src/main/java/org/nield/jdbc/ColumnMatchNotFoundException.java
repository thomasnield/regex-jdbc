package org.nield.jdbc;


import java.sql.SQLException;

public class ColumnMatchNotFoundException extends SQLRuntimeException {
    public ColumnMatchNotFoundException(String column) {
        super("Column " + column + " not found!");
    }
    public ColumnMatchNotFoundException(SQLException e) {
        super(e);
    }
}
