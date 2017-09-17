package ex1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

public class Teacher implements ActionListener {
	
		int numberOne,numberTwo;
		String operator="";
		boolean isRight;
		Random random;
		int maxInteger;
		JTextField textOne,textTwo,textResult;
		JLabel operatorLabel,message;
		public Teacher(){
			random=new Random();
	}
		public void setMaxInteger(int maxInteger){
			this.maxInteger=maxInteger;
		}
		public void actionPerformed(ActionEvent e){
			String str=e.getActionCommand();
			if(str.equals("getProblem")){
				numberOne=random.nextInt(maxInteger)+1;
				numberTwo=random.nextInt(maxInteger)+1;
				double d=Math.random();
				if(d>=0.5){
					operator="+";
				}
				else
					operator="-";
				textOne.setText(""+numberOne);
				textTwo.setText(""+numberTwo);
				operatorLabel.setText(operator);
				message.setText("��ش�");
				textResult.setText(null);
			}
			else if(str.equals("giveAnswer")){
				String answer=textResult.getText();
				try{ int result=Integer.parseInt(answer);
					if(operator.equals("+")){
						if(result==(numberOne+numberTwo))
							message.setText("��ش���ȷ");
						else
							message.setText("��ش����");
					}
					else if(operator.equals("-")){
						if(result==(numberOne-numberTwo))
							message.setText("��ش���ȷ");
						else
							message.setText("��ش����");
					}
				
				}
				catch(NumberFormatException ex){
					message.setText("����������");
				}
			}
		}
		public void setJTextField(JTextField...t){
			textOne=t[0];
			textTwo=t[1];
			textResult=t[2];
		}
		public void setJLabel(JLabel...labels){
			operatorLabel=labels[0];
			message=labels[1];
		}
}
