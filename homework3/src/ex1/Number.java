package ex1;
import java.util.*;
public class Number {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int number=0;
		int d5=0;
		int d4=0;
		int d3=0;   //12321
		int d2=0;   //1221
		int d1=0;
//		int d5=0;
		System.out.println("������һ��1��99999֮�����");
		number=s.nextInt();
		if(number>=1&&number<=99999){
			d5=number/10000;
			d4=(number-d5*10000)/1000;
			d3=(number-d5*10000-d4*1000)/100;
			d2=(number-d5*10000-d4*1000-d3*100)/10;
			d1=(number-d5*10000-d4*1000-d3*100-d2*10)/1;
			if(number>=10000&&number<=99999){
				System.out.println(number+"����λ��");
				if((d5==d1)&&(d4==d2)){
					System.out.println(number+"�ǻ�����");
				}
				else{
					System.out.println(number+"���ǻ�����");
				}
			}//end if ��λ��
			if(number>=1000&&number<=9999){
				System.out.println(number+"����λ��");
				if((d4==d1)&&(d3==d2)){
					System.out.println(number+"�ǻ�����");
				}
				else{
					System.out.println(number+"���ǻ�����");
				}
			}//end if ��λ��
			if(number>=100&&number<=999){
				System.out.println(number+"����λ��");
				if((d3==d1)){
					System.out.println(number+"�ǻ�����");
				}
				else{
					System.out.println(number+"���ǻ�����");
				}
			}//end if ��λ��
			if(number>=10&&number<=99){
				System.out.println(number+"�Ƕ�λ��");
				if((d2==d1)){
					System.out.println(number+"�ǻ�����");
				}
				else{
					System.out.println(number+"���ǻ�����");
				}
			}//end if ��λ��
			if(number>=0&&number<=9){
				System.out.println(number+"�Ǹ�λ��");
				
					System.out.println(number+"�ǻ�����");
				
			}//end if ��λ��
		}//end if 1-99999
		else{
			System.out.println("����0-99999֮��");
		}
	}
}
