package ex2;
import java.util.*;
public class ComputerPrice {
	public static void main(String[] args) {
		String menu="������Ѽ:189Ԫ ���۳���:12.9Ԫ �����:69Ԫ ����ţ��:32Ԫ";
		Scanner s=new Scanner(menu);
		String regex="[^0123456789.]+";   //������ʽ
		s.useDelimiter(regex);            //�ֽ�
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
		System.out.println("�˵��ܼ۸�"+sum+"Ԫ");
	}
}
