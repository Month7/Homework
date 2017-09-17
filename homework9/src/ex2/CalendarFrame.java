package ex2;
import java.util.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.plaf.basic.BasicBorders;

public class CalendarFrame extends JFrame implements ActionListener{
	JLabel labelDay[]=new JLabel[42];
	JButton titleName[]=new JButton[7];
	String name[]={"日","一","二","三","四","五","六"};
	JButton nextMonth,previousMonth;
	CalendarBean calendar;
	JLabel showMessage=new JLabel(""+JLabel.CENTER);
	int year=2011,month=2;
	public  CalendarFrame() {
		// TODO Auto-generated constructor stub
		JPanel pCenter=new JPanel();
		pCenter.setLayout(new GridLayout(7, 7));
		for(int i=0;i<7;i++){
			titleName[i]=new JButton(name[i]);
			titleName[i].setBorder(new SoftBevelBorder(BevelBorder.RAISED));    //设置边框  双线斜面边框
			pCenter.add(titleName[i]);
		}
		for(int i=0;i<42;i++){
			labelDay[i]=new JLabel("",JLabel.CENTER);
			labelDay[i].setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
			pCenter.add(labelDay[i]);
		}
		calendar=new CalendarBean();
		nextMonth=new JButton("下月");
		previousMonth =new JButton("上月");
		nextMonth.addActionListener(this);
		previousMonth.addActionListener(this);
		JPanel pNorth=new JPanel();
		JPanel pSouth=new JPanel();
		pNorth.add(previousMonth);
		pNorth.add(nextMonth);
		pSouth.add(showMessage);
		this.add(pCenter,BorderLayout.CENTER);
		this.add(pNorth,BorderLayout.NORTH);
		this.add(pSouth,BorderLayout.SOUTH);
		this.setYearAndMonth(year,month);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	void setYearAndMonth(int year2, int month2) {
		// TODO Auto-generated method stub
		calendar.setYear(year2);
		calendar.setMonth(month2);
		String day[]=calendar.getCalendar();
		for(int i=0;i<42;i++){
			labelDay[i].setText(day[i]);
			showMessage.setText("日历:"+calendar.getYear()+"年"+calendar.getMonth()+"月");
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==nextMonth){
			month+=1;
			if(month>12)
				month=1;
			calendar.setMonth(month);
			String day[]=calendar.getCalendar();
			for(int i=0;i<42;i++){
				labelDay[i].setText(day[i]);
			}
		}
		else if(e.getSource()==previousMonth){
			month-=1;
			if(month<1)
				month=12;
			calendar.setMonth(month);
			String day[]=calendar.getCalendar();
			for(int i=0;i<42;i++){
				labelDay[i].setText(day[i]);
			}
		}
		showMessage.setText("日历:"+calendar.getYear()+"年"+calendar.getMonth()+"月");
	}
	
}
