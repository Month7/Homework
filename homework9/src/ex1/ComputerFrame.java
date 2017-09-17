package ex1;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ComputerFrame extends JFrame{
	JMenuBar menubar;
	JMenu choiceGrade;
	JMenuItem grade1,grade2;
	JTextField textOne,textTwo,textResult;
	JButton getProblem,giveAnswer;
	JLabel operatorLabe1,message;
	Teacher teacherZhang;
	public ComputerFrame(){
		teacherZhang=new Teacher();
		teacherZhang.setMaxInteger(20);
		this.setLayout(new FlowLayout());
		menubar=new JMenuBar();
		choiceGrade=new JMenu("选择级别");
		grade1=new JMenuItem("幼儿级别");
		grade2=new JMenuItem("儿童级别");
		grade1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				teacherZhang.setMaxInteger(10);
			}
		});
		grade2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				teacherZhang.setMaxInteger(50);
			}
		});
		choiceGrade.add(grade1);
		choiceGrade.add(grade2);
		menubar.add(choiceGrade);
		this.setJMenuBar(menubar);
		textOne=new JTextField(5);    //可见字符长5
		textTwo=new JTextField(5);
		textResult=new JTextField(5);
		operatorLabe1=new JLabel("+");
		operatorLabe1.setFont(new Font("Arial", Font.BOLD, 20)); //设置标签的字体
		message =new JLabel("你还没有回答呢");
		getProblem=new JButton("获取题目");
		giveAnswer=new JButton("确认答案");
		this.add(getProblem);
		this.add(textOne);
		this.add(operatorLabe1);
		this.add(textTwo);
		this.add(new JLabel("="));
		this.add(textResult);
		this.add(giveAnswer);
		this.add(message);
		textResult.requestFocus(); //获取焦点？
		textOne.setEditable(false);
		textTwo.setEditable(false);
		getProblem.setActionCommand("getProblem");  //设置此组件激发的操作事件的命令名称
		textResult.setActionCommand("textResult");
		giveAnswer.setActionCommand("giveAnswer");
		teacherZhang.setJTextField(textOne,textTwo,textResult);
		teacherZhang.setJLabel(operatorLabe1,message);
		getProblem.addActionListener(teacherZhang);
		giveAnswer.addActionListener(teacherZhang);
		textResult.addActionListener(teacherZhang);
		setVisible(true);
		validate();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}
