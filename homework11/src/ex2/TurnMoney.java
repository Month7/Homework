package ex2;
import java.sql.*;
//import java.util.*;

public class TurnMoney {
	public static void main(String[] args) {
		Connection c=null;
		Statement s=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bank?/characterEncoding=utf-8","root","admin");
			String sql1="select* from card1 where number=1";
			String sql2="select* from card2 where number=2";
			c.setAutoCommit(false);            //事务
			s=c.createStatement();
			rs=s.executeQuery(sql1);
			rs.next();
			double amount=100;
			double amount1=rs.getDouble("amount");
			System.out.println("账户1转账前的金额为"+amount1);
			rs=s.executeQuery(sql2);
			rs.next();
			double amount2=rs.getDouble("amount");
			System.out.println("账户2转账前的金额为"+amount2);
			amount1+=amount;
			amount2-=amount;
			String sql3="update card1 set amount=amount+100 where number =1";
			String sql4="update card2 set amount=amount-100 where number =2";
			s.executeUpdate(sql3);
			s.executeUpdate(sql4);
//			String sql5="select* from card2 where number=2";
//			rs=s.executeQuery(sql5);
//			rs.next();
//			double amount5=rs.getDouble("amount");
			System.out.println("账户1转账后的金额为"+amount1);
			System.out.println("账户2转账后的金额为"+amount2);
			c.commit();    //事务
			c.close();
			s.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
