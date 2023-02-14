# Crud-operation-using-Spring-JdbcTemplate

here are the general steps to perform CRUD operations using Spring JdbcTemplate:

1.Create a DataSource object that will be used to connect to your database. The DataSource can be configured in your application context file.

2.Create a JdbcTemplate object using the DataSource you created in step 1. The JdbcTemplate will be used to execute SQL queries.

3.To perform a "Create" operation, use the JdbcTemplate's update() method to execute an INSERT statement. For example, jdbcTemplate.update("INSERT INTO mytable (col1, col2) VALUES (?, ?)", value1, value2).

4.To perform a "Read" operation, use the JdbcTemplate's query() method to execute a SELECT statement. For example, jdbcTemplate.query("SELECT * FROM mytable", new MyRowMapper()).

5.To perform an "Update" operation, use the JdbcTemplate's update() method to execute an UPDATE statement. For example, jdbcTemplate.update("UPDATE mytable SET col1 = ? WHERE id = ?", newValue, id).

6.To perform a "Delete" operation, use the JdbcTemplate's update() method to execute a DELETE statement. For example, jdbcTemplate.update("DELETE FROM mytable WHERE id = ?", id).

Note that the MyRowMapper() class mentioned in step 4 is a custom class you create that implements the RowMapper interface to map a row in the ResultSet to an object.


# Make sure Database is same name with the given Database .
![image](https://user-images.githubusercontent.com/98210740/218813121-532a2288-46dd-4868-8636-dbe576943f81.png)
