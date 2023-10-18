import java.sql.*;

public class SqlCon {
    public static final String DB_URL="jdbc:mysql://localhost/company";
    public static final String DB_USER="root";
    public static final String DB_PASSWORD="mysql";

    public static void main(String[] args) {
        Connection connect=null;
        Statement statement=null;
        String sql="SELECT*FROM employees";
        try {
            connect= DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            statement= connect.createStatement();
            ResultSet database=statement.executeQuery(sql);
            while (database.next()){
                System.out.println("ID : "+database.getInt("id")+
                        "\tName : " +database.getString("employee_name")+
                        "\t\tPosition : " +database.getString("employee_position")+
                        "\tSalary : "+database.getInt("employee_salary"));
                System.out.println("--------------------------------------------------------------------------------------------------------");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

