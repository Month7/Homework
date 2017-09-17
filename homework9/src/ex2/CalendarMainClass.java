package ex2;
import javax.swing.*;

public class CalendarMainClass {
	public static void main(String[] args) {
		CalendarFrame f=new CalendarFrame();
		f.setBounds(100,100,360,300);
		f.setVisible(true);
		f.setYearAndMonth(2017,9);
	}
}
