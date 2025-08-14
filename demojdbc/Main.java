import  java.sql.*;
import java.util.Scanner;

public class Main {
    //private for not accessing  from outside the class , static for accessing from the static method ,final for not modifying the value;
    private  static final  String url="jdbc:mysql://127.0.0.1:3306/college";
    private  static final  String username="root";
    private  static final    String password="root";
    public static void main(String[] args) {

        //taking input from prompt
        Scanner sc =new Scanner(System.in);

// load driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            //create connection

            Connection con = DriverManager.getConnection(url,username,password);
            //create statement
//            Statement stm = con.createStatement();

            PreparedStatement prestm = con.prepareStatement("insert into student (name,mark) values(?,?);");//using prepared statement
            //execute query
//            String query ="insert into student (name,mark) values('appu',45); ";
//            String query ="delete from student where name = 'appu' ; ";
//            String query ="update student set mark=35 where name = 'akhil' ; ";
//            stm.executeUpdate(query);
            char opt = 'y';
            while (opt == 'y'|| opt =='Y') {
                System.out.print("Enter the Name of the student : ");
                String name = sc.nextLine().toUpperCase();
                System.out.printf("Enter the Mark of %s :", name);
                int mark = sc.nextInt();
                sc.nextLine();

                prestm.setString(1, name);//passing value to the first parameter in values(?,?)
                prestm.setInt(2, mark);//setting mark (2nd index in values)
                prestm.executeUpdate();
                System.out.println("Do you want to continue : 'y' or 'n' :");
                opt =  sc.next().charAt(0) ;
                sc.nextLine();
            }
            sc.close();
            //close connection
            con.close();
            System.out.println("data inserted");
//            System.out.println("data deleted");
//            System.out.println("data updated");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}