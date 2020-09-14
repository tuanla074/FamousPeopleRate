package Login;


import Login.Accounts;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class DBLoginAccess {
    public static PreparedStatement preparedStatement(String sql) throws ClassNotFoundException, SQLException{
      PreparedStatement pre = null;
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      String url = "jdbc:sqlserver://localhost;databaseName=Accounts";
      String user = "sa";
      String pass = "sa";
      pre=DriverManager.getConnection(url,user,pass).prepareStatement(sql);
    
      return pre;
    }
    public void insert(String a, String b,int c, String d) throws ClassNotFoundException, SQLException{
        String sql ="insert into Phone (Name,brand,price,descriptions) values (?,?,?,?)";
        PreparedStatement pstm = preparedStatement(sql);
        pstm.setString(1,a);
        pstm.setString(2,b);
        pstm.setInt(3,c);
        pstm.setString(4,d);
        pstm.executeUpdate();
        pstm.close();
    }
    public Accounts checking(String a, String b) throws ClassNotFoundException, SQLException{
        String sql ="select * from Accountss";
        ResultSet rs = preparedStatement(sql).executeQuery();
        Accounts p = new Accounts();
        while(rs.next()){
            p.setId(rs.getInt("ID"));
            p.setUser(rs.getString("users"));
            p.setPass(rs.getString("pass"));
            String d = rs.getString("users");
            String c = rs.getString("pass");
            if(d.equals(a) && c.equals(b)){
                rs.close();
                return p;
            }
        }
        rs.close();
        return null;
    }
    public Accounts takeID(int a) throws ClassNotFoundException, SQLException{
        String sql ="select * from Accountss where id=" +a;
        ResultSet rs = preparedStatement(sql).executeQuery();
        Accounts p = new Accounts();
        while(rs.next()){
            p.setId(rs.getInt("ID"));
            p.setUser(rs.getString("users"));
            p.setPass(rs.getString("pass"));
                
            }
        rs.close();
        return p;
        }
       
}
