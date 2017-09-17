package ex1;

public class Example {
	public static void main(String[] args) {
		ChinaPeople cn=new ChinaPeople();
		AmericanPeople ac=new AmericanPeople();
		BeijingPeople bj=new BeijingPeople();
		cn.averageHeight();
		cn.averageWeight();
		cn.chinaGongfu();
		ac.americanBoxing();
		ac.averageWeight();
		ac.averageHeight();
		bj.averageHeight();
		bj.averageWeight();
		bj.beijingOpera();
	}
}
