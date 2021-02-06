package utilities;

import org.junit.Before;
import org.junit.Test;

import java.sql.*;

public class DatabaseBasicJDBC_Ders {

    //Database url
    String url = "jdbc:mysql://107.182.225.121:3306/LibraryMgmt";
    //username
    String username = "techpro";
    //password
    String password = "tchpr2020";
    //connection, statement, resultset oluşturmak gerekiyor.

    Connection connection;
    Statement statement;
    ResultSet resultSet;

    @Before
    public void before() throws SQLException {

        connection = DriverManager.getConnection(url, username, password);
        statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
    }

    @Test
    public void test1() throws SQLException {
        resultSet=statement.executeQuery("SELECT * FROM Book;");
        //ilk satiri atlamamiz gerekiyor
        resultSet.next();

        String deger = resultSet.getString("BookName");
        System.out.println("deger1: " + deger);
    }
    @Test
    public void test2() throws SQLException {
        resultSet = statement.executeQuery("SELECT * FROM Book;");
        resultSet.next();
        //tüm degerleri yazdirma
        //next() ile birsonraki var oldukca yazdir
        while (resultSet.next()){
            String deger = resultSet.getString("Bookname");
            System.out.println(deger);
        }
    }
    @Test
    public void test3() throws SQLException {
        resultSet = statement.executeQuery("SELECT * FROM Book;");
        resultSet.next();
        int sumRow=1;
        while (resultSet.next()){
            sumRow++;
        }
        System.out.println("total rows: " + sumRow);
        //5.row.a git
        resultSet.absolute(5);
        //suan 5. row.dasin veriyi al
        System.out.println(resultSet.getString("Bookname"));
    }
    @Test
    public void test4() throws SQLException {
        resultSet = statement.executeQuery("SELECT * FROM Book;");
        //son degere kadar git
        resultSet.last();
        System.out.println(resultSet.getString("Bookname"));
        resultSet.first();
        System.out.println(resultSet.getString("Bookname"));
    }

    @Test
    public void test5() throws SQLException {
        //Metadata data ile ilgili bilgiler
        DatabaseMetaData data = connection.getMetaData();
        System.out.println("username: " + data.getUserName());
        System.out.println("product verison: " + data.getDatabaseProductVersion());
    }
}
