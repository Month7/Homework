package ex1;
import java.io.*;
import java.util.*;

public class AnalysisResult {
	public static void main(String[] args) {
		File fRead=new File("D:/score.txt");
		File fWrite=new File("D:/scoreAnalysis.txt");
		try {
			Writer out=new FileWriter(fWrite, true);
			BufferedWriter bW=new BufferedWriter(out);
			Reader in=new FileReader(fRead);
			BufferedReader bR=new BufferedReader(in);
			String str="";
			while((str=bR.readLine())!=null){
				double sum=Fenxi.getTotalScore(str);
				str=str+"×Ü·Ö:"+sum;
				System.out.print(sum);
				bW.write(str);
				bW.newLine();
			}
			bR.close();
			bW.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
