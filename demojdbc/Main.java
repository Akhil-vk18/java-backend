import  java.sql.*;
public class Main {
    //private for not accessing  from outside the class , static for accessing from the static method ,final for not modifying the value;
 private  static final  String url="jdbc:mysql://127.0.0.1:3306/college";
    private  static final  String username="root";
    private  static final    String password="root";
    public static void main(String[] args) {
// load driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            //create connection

            Connection con = DriverManager.getConnection(url,username,password);
            //create statement
            Statement stm = con.createStatement();

            //execute query
//            String query ="insert into student (name,mark) values('appu',45); ";
//            String query ="delete from student where name = 'appu' ; ";
            String query ="update student set mark=35 where name = 'akhil' ; ";
            stm.executeUpdate(query);
            //close connection
            con.close();
//            System.out.println("data inserted");
//            System.out.println("data deleted");
            System.out.println("data updated");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}