package ex1;
import java.sql.*;
import java.util.*;

public class RandomGetRecord {
	public static void main(String[] args) {
		Random random=new Random();
		int guessnum=10;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				Connection c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/shop?characterEncoding=UTF-8",
				    "root", "admin");
				Statement s=c.createStatement();
				String sql="select* from goods";
				ResultSet rs=s.executeQuery(sql);
				rs.last();
				Vector <Integer> vector=new Vector<Integer>();
				int count=rs.getRow();
				for(int i=1;i<=count;i++){
					vector.add(i);
				}
				int num=Math.min(guessnum, count);
				System.out.println("ͳ��"+num+"��");
				double sum=0;
				int n=num;
				while(num>0){
					int randomIndex=random.nextInt(vector.size());              //����һ����0-vector.size֮���α�����
					int index=vector.elementAt(randomIndex).intValue();          //����ָ�������������
					rs.absolute(index);
					String number=rs.getString(1);
					String name=rs.getString(2);
					java.util.Date date=rs.getDate(3);
					double price=rs.getDouble(4);
					sum+=num;
					num--;
					vector.removeElementAt(randomIndex);       //ɾ��ָ�������������
				}
				double average=sum/n;
				System.out.println("ƽ���۸�"+average);
				c.close();
				s.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
