package ex3;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;

public class LetterLabel extends JTextField implements FocusListener{
	public  LetterLabel() {
		// TODO Auto-generated constructor stub
		this.setEditable(false);
		this.addFocusListener(this);
		this.setBackground(Color.white);
	}
	public static LetterLabel[] getLetterLabel(int n){
		LetterLabel l[]=new LetterLabel[n];
		for(int i=0;i<l.length;i++){
			l[i]=new LetterLabel();
		}
		return l;
	}
	@Override
	public void focusGained(FocusEvent e) {           //�����ü��̽���
		// TODO Auto-generated method stub
		this.setBackground(Color.red);
	}

	@Override
	public void focusLost(FocusEvent e) {            //���ʧȥ���̽���
		// TODO Auto-generated method stub
		this.setBackground(Color.white);
	}
	public void setText(char c){
		this.setText(""+c);
	}
}
