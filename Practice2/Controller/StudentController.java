package Practice2.Controller;

import Practice2.Model.Student;
import java.sql.*;
import java.util.Scanner;

public class StudentController{

    public static void add(){
        Student student = new Student("","","",0);
        Scanner scanner = new Scanner(System.in);
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");

        Statement statement = connection.createStatement();
        ){
            System.out.println("Enter your student ID: ");
            String id = scanner.nextLine();
            student.setId(id);
            System.out.println("Enter your student name: ");
            String name = scanner.nextLine();
            student.setName(name);
            System.out.println("Enter your student address: ");
            String address = scanner.nextLine();
            student.setAddress(address);
            System.out.println("Enter your student phone: ");
            int phone = scanner.nextInt();
            student.setPhone(phone);
            System.out.println("Add student successfull!");
    }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    public static void save(){
        Student student = new Student("","","",0);
        Scanner scanner = new Scanner(System.in);
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
            Statement statement = connection.createStatement();
                ){
            statement.executeUpdate("INSERT INTO student VALUES ("
                    + student.getId() +"','"
                    +student.getName() + "','"
                    +student.getAddress()+"','"
                    +student.getPhone()+"')'");
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    public static void select(){
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
        Statement stmt = conn.createStatement();
        ){
            String strSelect = "select * from student";
            ResultSet rset = stmt.executeQuery(strSelect);
            while (rset.next()){
                String StudentID = rset.getString("StudentID");
                String StudentName = rset.getString("StudentName");
                String Address = rset.getString("Address");
                String Phone = rset.getString("Phone");
                System.out.println(StudentID + ","+StudentName +","+Address+","+Phone);
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}