package ex1;

public class Estimator {
	public static void main(String[] args) {
		double a[]={9.89,9.88,9.99,9.12,9.69,9.76,8.97};
		double b[]={89,56,78,90,100,77,56,45,36,79,98};
		CompurerAverage computer;
		computer=new Gymnastics();
		double result=computer.average(a);
		System.out.printf("%n体操选手的最后得分:%5.3f\n",result);
		computer=new School();
		result=computer.average(b);
		System.out.printf("%n班级平均分数:%-5.2f\n",result);
	}
}
