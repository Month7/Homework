package average;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainFrame extends JFrame implements ActionListener{
	JFrame f;
	JButton submit;
	JTextField num1;
	JTextField num2;
	JTextField num3;
	JTextField num4;
	JTextField num5;
	JTextField aver;
	JLabel text1;
	JLabel text2;
	JLabel text3;
	JLabel text4;
	JLabel text5;
	JLabel text6;
	JLabel text7;
	double number1=0;
	double number2=0;
	double number3=0;
	double number4=0;
	double number5=0;
	double average=0;
	public MainFrame() {
		// TODO Auto-generated constructor stub
		Init();
	}
	private void Init() {
		// TODO Auto-generated method stub
		f=new JFrame("计算平均数");
		text1=new JLabel("请输入第一个成绩");
		text2=new JLabel("请输入第二个成绩");
		text3=new JLabel("请输入第三个成绩");
		text4=new JLabel("请输入第四个成绩");
		text5=new JLabel("请输入第五个成绩");
		text6=new JLabel("平均成绩");
		text7=new JLabel();
		submit=new JButton("计算平均值");
		num1=new JTextField();
		num2=new JTextField();
		num3=new JTextField();
		num4=new JTextField();
		num5=new JTextField();
		aver=new JTextField();
		f.setLayout(null);
		f.setSize(600, 600);
		f.setLocation(400, 400);
		submit.setSize(150,50);
		submit.setLocation(200, 400);
		submit.addActionListener(this);
		text1.setSize(180,50);
		text2.setSize(180,50);
		text3.setSize(180,50);
		text4.setSize(180,50);
		text5.setSize(180,50);
		text6.setSize(180,50);
		text7.setSize(180,50);
		num1.setSize(150,50);
		num2.setSize(150,50);
		num3.setSize(150,50);
		num4.setSize(150,50);
		num5.setSize(150,50);
		aver.setSize(150,50);
		num1.setLocation(200, 10);
		num2.setLocation(200, 60);
		num3.setLocation(200, 110);
		num4.setLocation(200, 160);
		num5.setLocation(200, 210);
		aver.setLocation(200, 260);
		text1.setLocation(10, 10);
		text2.setLocation(10, 60);
		text3.setLocation(10, 110);
		text4.setLocation(10, 160);
		text5.setLocation(10, 210);
		text6.setLocation(10, 260);
		text7.setLocation(200, 310);
		f.add(num1);
		f.add(num2);
		f.add(num3);
		f.add(num4);
		f.add(num5);
		f.add(aver);
		f.add(submit);
		f.add(text1);
		f.add(text2);
		f.add(text3);
		f.add(text4);
		f.add(text5);
		f.add(text6);
		f.add(text7);
		f.setVisible(true);
		f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		number1=Double.valueOf(num1.getText()).doubleValue();
		number2=Double.valueOf(num2.getText()).doubleValue();
		number3=Double.valueOf(num3.getText()).doubleValue();
		number4=Double.valueOf(num4.getText()).doubleValue();
		number5=Double.valueOf(num5.getText()).doubleValue();
		average=Calculate.average(number1,number2,number3,number4,number5);
		String result=Double.toString(average);
		aver.setText(result);
		if(average>=60){
			text7.setText("及格");
		}
		else{
			text7.setText("不及格");
		}
	}
	
}
