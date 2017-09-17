package ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordStatistic {
	Vector<String> allWord,noSameWord;
	File file=new File("D:/english.txt");
	Scanner sc=null;
	String regex;
	public WordStatistic() {
		// TODO Auto-generated constructor stub
		allWord= new Vector<String>();
		noSameWord =new Vector<String>();
		regex="[\\s\\d\\p{Punct}]+";
		try {
			sc=new Scanner(file);
			sc.useDelimiter(regex);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void setFileName(String name){
		File file=new File(name);
		try {
			sc=new Scanner(file);
			sc.useDelimiter(regex);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void wordStatistic(){
		while(sc.hasNext()){
			String word=sc.next();
			allWord.add(word);
			if(!noSameWord.contains(word)){
				noSameWord.add(word);
			}
		}
	}
	public Vector<String> getAllWord(){
		return allWord;
	}
	public Vector<String> getNoSameWord(){
		return noSameWord;
	}
}
