package PeopleR;

import Login.Accounts;
import Login.DBLoginAccess;
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
public class PeopleRAccess {
    public static PreparedStatement preparedStatement(String sql) throws ClassNotFoundException, SQLException{
      PreparedStatement pre = null;
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      String url = "jdbc:sqlserver://localhost;databaseName=Accounts";
      String user = "sa";
      String pass = "sa";
      pre=DriverManager.getConnection(url,user,pass).prepareStatement(sql);
    
      return pre;
    }
    public void insert(String a, String b,String c, String d) throws ClassNotFoundException, SQLException{
        String sql ="insert into people (Name,ntnl,pics,profession) values (?,?,?,?)";
        PreparedStatement pstm = preparedStatement(sql);
        pstm.setString(1,a);
        pstm.setString(2,b);
        pstm.setString(3,c);
        pstm.setString(4,d);
        pstm.executeUpdate();
        pstm.close();
    }
    
    public void insertd (String a, String b) throws ClassNotFoundException, SQLException{
        String sql ="insert into gallery (PID,pics) values (?,?)";
        PreparedStatement pstm = preparedStatement(sql);
        System.out.print(b+"dvefvrebvtr");
        pstm.setInt(1,Integer.parseInt(b));
        pstm.setString(2,a);
        pstm.executeUpdate();
        pstm.close();
    } 
    public List<PeopleR> show() throws ClassNotFoundException, SQLException{
        List<PeopleR> list = new LinkedList<>();
        String sql ="SELECT TOP 9 * FROM people ORDER BY PID DESC";
        ResultSet rs = preparedStatement(sql).executeQuery();     
        while(rs.next()){
            PeopleR p = new PeopleR();
            p.setId(rs.getInt("PID"));
            p.setName(rs.getString("name"));
            p.setNtnl(rs.getString("ntnl"));
            p.setPics(rs.getString("pics"));
            p.setPros(rs.getString("profession"));
            p.setRate(Double.parseDouble(String.format("%4.1f",rs.getFloat("Arate"))));
            list.add(p);
            }
        rs.close();
        return list;
        }
        public void update(int id, double rate) throws ClassNotFoundException, SQLException{
        List<PeopleR> list = new LinkedList<>();
        String sql ="Update people set Arate ="+rate+" where PID = " + id;
        PreparedStatement pstm = preparedStatement(sql);
        pstm.executeUpdate();
        }
        public List<PeopleR> show(String a) throws ClassNotFoundException, SQLException{
        List<PeopleR> list = new LinkedList<>();
        String sql ="select * from people where name like '%"+a+"%'";
        ResultSet rs = preparedStatement(sql).executeQuery();     
        while(rs.next()){
            PeopleR p = new PeopleR();
            p.setId(rs.getInt("PID"));
            p.setName(rs.getString("name"));
            p.setNtnl(rs.getString("ntnl"));
            p.setPics(rs.getString("pics"));
            p.setPros(rs.getString("profession"));
            p.setRate(Double.parseDouble(String.format("%4.1f",rs.getFloat("Arate"))));
            list.add(p);
            }
        rs.close();
        return list;
        }
         public List<commentandR> sow(String id) throws ClassNotFoundException, SQLException{
        List<commentandR> list = new LinkedList<>();
        String sql ="SELECT * FROM rate where PID = "+id;
        ResultSet rs = preparedStatement(sql).executeQuery();     
        while(rs.next()){
            commentandR p = new commentandR();
            int RID = rs.getInt("RaterID");
            Accounts acc = new Accounts();
            DBLoginAccess db = new DBLoginAccess();
            p.setUser(db.takeID(RID).getUser());
            p.setRate(rs.getInt("rating"));
            p.setComment(rs.getString("comment"));
            list.add(p);
            }
        rs.close();
        return list;
        }
          public List<String> picss(String id) throws ClassNotFoundException, SQLException{
        List<String> list = new LinkedList<>();
        String sql ="SELECT * FROM gallery where PID ="+id+" order by ids DESC";
        System.out.print(sql);
        ResultSet rs = preparedStatement(sql).executeQuery();     
        while(rs.next()){
            String p = rs.getString("pics");
            list.add(p);
            }
        rs.close();
        return list;
        }
}
