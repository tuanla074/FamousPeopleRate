/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rating;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class RAccess {
    public static PreparedStatement preparedStatement(String sql) throws ClassNotFoundException, SQLException{
      PreparedStatement pre = null;
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      String url = "jdbc:sqlserver://localhost;databaseName=Accounts";
      String user = "sa";
      String pass = "sa";
      pre=DriverManager.getConnection(url,user,pass).prepareStatement(sql);
    
      return pre;
    }
    public void insert(int a, int b,int c, String d) throws ClassNotFoundException, SQLException{
        String sql ="insert into rate (PID,RaterID,rating,comment) values (?,?,?,?)";
        PreparedStatement pstm = preparedStatement(sql);
        pstm.setInt(1,a);
        pstm.setInt(2,b);
        pstm.setInt(3,c);
        pstm.setString(4,d);
        pstm.executeUpdate();
        pstm.close();
    }
    
    public static double getRate(int b) throws ClassNotFoundException, SQLException{
        double l = 0;
        int u = 0;
        double i;
        String sql ="select*from rate where PID= "+b;
        ResultSet rs = preparedStatement(sql).executeQuery();
        while(rs.next()){
            u+=1;
            l+= rs.getInt("Rating");
        }
        System.out.print(l/u);
        rs.close();
        return l/u;
        
    }
    
    public static boolean rateone(int b , int c) throws ClassNotFoundException, SQLException{
        
        String sql ="select*from rate where PID= "+b+" and RaterID = " +c;
        ResultSet rs = preparedStatement(sql).executeQuery();
        while(rs.next()){
            rs.close();
            return false;
        }
        rs.close();
        return true;
    
    }
}
