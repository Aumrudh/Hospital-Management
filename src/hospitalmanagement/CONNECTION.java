package hospitalmanagement;
import java.sql.*;  
public class CONNECTION{
    Connection c;
    Statement s;
    public CONNECTION(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql:///HOSPITAL","root","Jeyakumar28");    
            s =c.createStatement(); 
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  

