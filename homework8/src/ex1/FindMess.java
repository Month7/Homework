package ex1;

public class FindMess {
	public static void main(String[] args) {
		String mess="����:���� ����ʱ��:1996.10.6��������վ:agblog.me��"+"���:185cm,����:72kg";
		int index=mess.indexOf(":");
		String name=mess.substring(index+1);
		if(name.startsWith("��")){
			System.out.println("�����е�������\"��\"");
		}
		index=mess.indexOf(":",index+1);
		String date=mess.substring(index+1,index+11 );
		System.out.println(date);
		index=mess.indexOf(":",index+1);
		int heightPosition=mess.indexOf("���");
		String personNet=mess.substring(index+1,heightPosition-1);
		System.out.println(personNet);
		index=mess.indexOf(":",index+1);
		int cmPosition=mess.indexOf("cm");
		String height=mess.substring(index+1,cmPosition);
		int h=Integer.parseInt(height);
		if(h>=180){
			System.out.println("�����е����"+height+"���ڻ����180cm");
		}
		else{
			System.out.println("�����е����"+height+"С��180cm");
		}
		index=mess.indexOf(":",index+1);
		int kgPosition=mess.indexOf("kg");
		String weight=mess.substring(index+1,kgPosition);
		int w=Integer.parseInt(weight);
		if(w>=75){
			System.out.println("�����е�����"+weight+"���ڻ����75kg");
		}
		else{
			System.out.println("�����е�����"+weight+"С��75kg");
		}
	}
}
