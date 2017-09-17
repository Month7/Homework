package ex1;
import java.util.*;

public class Fenxi {
	public static double getTotalScore(String s){
		Scanner sc=new Scanner(s);
		sc.useDelimiter("[^0123456789.]+");
		double sum=0;
		while(sc.hasNext()){
			double score=sc.nextDouble();
			sum+=score;
		}
		return sum;
	}
}
