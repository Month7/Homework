package ex2;
import java.util.*;
public class ComputerPrice {
	public static void main(String[] args) {
		String menu="北京烤鸭:189元 西芹炒肉:12.9元 酸菜鱼:69元 铁板牛柳:32元";
		Scanner s=new Scanner(menu);
		String regex="[^0123456789.]+";   //正则表达式
		s.useDelimiter(regex);            //分解
		double sum=0;
		while(s.hasNext()){
			try{
				double price=s.nextDouble();
				sum+=price;
				System.out.println(sum);
			}
			catch(IndexOutOfBoundsException e){
				String t=s.next();
			}
		}
		System.out.println("菜单总价格"+sum+"元");
	}
}
