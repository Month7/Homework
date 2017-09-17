package ex3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SpellingWordFrame extends JFrame implements KeyListener,ActionListener{
	JTextField inputWord;
	JButton button;
	LetterLabel label[];
	JPanel northP,centerP;
	Box wordBox;
	String hintMessage="用鼠标单击字母，按左右箭头交换字母，将其排列成所输入的单词";
	JLabel messageLabel=new JLabel(hintMessage);
	String word="";
	public SpellingWordFrame() {
		// TODO Auto-generated constructor stub
		inputWord =new JTextField(12);
		button=new JButton("确定");
		button.addActionListener(this);
		inputWord.addActionListener(this);
		northP=new JPanel();
		northP.add(new JLabel("输入单词"));
		northP.add(inputWord);
		northP.add(button);
		centerP=new JPanel();
		wordBox=Box.createHorizontalBox();  //创建一个从左到右显示其组件的 Box。
		centerP.add(wordBox);
		this.setBounds(100, 100, 350, 180);
		this.add(northP,BorderLayout.NORTH);
		this.add(centerP, BorderLayout.CENTER);
		this.add(messageLabel, BorderLayout.SOUTH);
		this.setVisible(true);
		validate();
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {            //  发生操作时调用。
		// TODO Auto-generated method stub
		RandomString random=new RandomString();
		word=inputWord.getText();
		int n=word.length();
		String randomword=random.getRandomString(word);
		wordBox.removeAll();
		if(n>0){
			label=LetterLabel.getLetterLabel(n);
			for(int i=0;i<n;i++){
				label[i].setText(""+randomword.charAt(i));
				wordBox.add(label[i]);
				label[i].addKeyListener(this);
			}
		}
		validate();
		inputWord.setText(null);
		label[0].requestFocus();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		LetterLabel sourceLabel=(LetterLabel) e.getSource();
		int index=-1;
		if(e.getKeyCode()==KeyEvent.VK_LEFT){
			for(int i=0;i<label.length;i++){
				if(label[i]==sourceLabel){
					index=i;
					break;
				}
			}
			if(index!=0){
				String temp=label[index].getText();
				label[index].setText(label[index-1].getText());
				label[index-1].setText(temp);
				label[index-1].requestFocus();
			}
		}
		else if(e.getKeyCode()==KeyEvent.VK_RIGHT){
			for(int i=0;i<label.length;i++){
				if(label[i]==sourceLabel){
					index=i;
					break;
				}
			}
			if(index!=0){
				String temp=label[index].getText();
				label[index].setText(label[index+1].getText());
				label[index+1].setText(temp);
				label[index+1].requestFocus();
			}
		}
		validate();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		String result="";
		for(int i=0;i<label.length;i++){
			String str=label[i].getText();
			result+=str;
		}
		if(result.equals(word)){
			messageLabel.setText("成功！");
			for(int i=0;i<label.length;i++){
				label[i].removeKeyListener(this);
				label[i].removeFocusListener(label[i]);
				label[i].setBackground(Color.white);
			}
		}
		inputWord.requestFocus();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

}
