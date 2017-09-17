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
		choiceGrade=new JMenu("ѡ�񼶱�");
		grade1=new JMenuItem("�׶�����");
		grade2=new JMenuItem("��ͯ����");
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
		textOne=new JTextField(5);    //�ɼ��ַ���5
		textTwo=new JTextField(5);
		textResult=new JTextField(5);
		operatorLabe1=new JLabel("+");
		operatorLabe1.setFont(new Font("Arial", Font.BOLD, 20)); //���ñ�ǩ������
		message =new JLabel("�㻹û�лش���");
		getProblem=new JButton("��ȡ��Ŀ");
		giveAnswer=new JButton("ȷ�ϴ�");
		this.add(getProblem);
		this.add(textOne);
		this.add(operatorLabe1);
		this.add(textTwo);
		this.add(new JLabel("="));
		this.add(textResult);
		this.add(giveAnswer);
		this.add(message);
		textResult.requestFocus(); //��ȡ���㣿
		textOne.setEditable(false);
		textTwo.setEditable(false);
		getProblem.setActionCommand("getProblem");  //���ô���������Ĳ����¼�����������
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
