import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class ListIteratorDemo
{
    public static void main(String[] args) {
        Connection c=null;
        Statement stmt=null;
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
//getting connection
            c= DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe",
                    "system","123123");
            System.out.println("database successfully opened");
            stmt =c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM company15");
            System.out.println("id name age address salary");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String address = rs.getString("address");
                String salary = rs.getString("salary");
                System.out.println(id+" "+name+" "+age+" "+address+" "+salary);

            }
            stmt.close();
            c.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getClass().getName()+":"+e.getMessage());
            System.exit(0);
        }
        System.out.println("table values successfully");
    }
}