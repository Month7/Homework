package ex3;
import java.util.*;
public class ComputerDate {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("�����һ���꣬�£�������");
		System.out.print("�������");
		short yearOne=s.nextShort();
		System.out.print("�����·�");
		byte monthOne=s.nextByte();
		System.out.print("��������");
		byte dayOne=s.nextByte();
		System.out.println("����ڶ����꣬�£�������");
		System.out.print("�������");
		short yearTwo=s.nextShort();
		System.out.print("�����·�");
		byte monthTwo=s.nextByte();
		System.out.print("��������");
		byte dayTwo=s.nextByte();
		Calendar calendar=Calendar.getInstance();
		calendar.set(yearOne,monthOne,dayOne);
		long timeOne=calendar.getTimeInMillis(); //ת���ɺ���
		calendar.set(yearTwo, monthTwo-1,dayTwo);
		long timeTwo=calendar.getTimeInMillis();
		Date date1=new Date(timeOne);
		Date date2=new Date(timeTwo);
		if(date2.equals(date1)){
			System.out.println("�������ڵ��ꡢ�¡�����ȫ��ͬ");
		}
		else if(date2.after(date1)){
			System.out.println("������ĵڶ������ڴ��ڵ�һ������");
		}
		else if(date2.before(date1)){
			System.out.println("������ĵڶ�������С�ڵ�һ������");
		}
		long days=Math.abs(timeTwo-timeOne)/(1000*60*60*24);
		System.out.println(yearOne+"��"+monthOne+"��"+dayOne+"�պ�"+yearTwo+"��"+monthTwo+"��"+dayTwo+"���"+days+"��");
	}
}
