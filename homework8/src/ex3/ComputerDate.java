package ex3;
import java.util.*;
public class ComputerDate {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("输入第一个年，月，日数据");
		System.out.print("输入年份");
		short yearOne=s.nextShort();
		System.out.print("输入月份");
		byte monthOne=s.nextByte();
		System.out.print("输入日期");
		byte dayOne=s.nextByte();
		System.out.println("输入第二个年，月，日数据");
		System.out.print("输入年份");
		short yearTwo=s.nextShort();
		System.out.print("输入月份");
		byte monthTwo=s.nextByte();
		System.out.print("输入日期");
		byte dayTwo=s.nextByte();
		Calendar calendar=Calendar.getInstance();
		calendar.set(yearOne,monthOne,dayOne);
		long timeOne=calendar.getTimeInMillis(); //转换成毫秒
		calendar.set(yearTwo, monthTwo-1,dayTwo);
		long timeTwo=calendar.getTimeInMillis();
		Date date1=new Date(timeOne);
		Date date2=new Date(timeTwo);
		if(date2.equals(date1)){
			System.out.println("两个日期的年、月、日完全相同");
		}
		else if(date2.after(date1)){
			System.out.println("您输入的第二个日期大于第一个日期");
		}
		else if(date2.before(date1)){
			System.out.println("您输入的第二个日期小于第一个日期");
		}
		long days=Math.abs(timeTwo-timeOne)/(1000*60*60*24);
		System.out.println(yearOne+"年"+monthOne+"月"+dayOne+"日和"+yearTwo+"年"+monthTwo+"月"+dayTwo+"相隔"+days+"天");
	}
}
