package ex3;

public class CheckDogState {
	public static void main(String[] args) {
	Dog dog=new Dog();
	dog.setState(new SoftlyState());
	System.out.print("����������ǰ:");
	dog.show();
	dog.setState(new MeetEnemyState());
	System.out.print("����������:");
	dog.show();
	dog.setState(new MeetFriendState());
	System.out.print("����������:");
	dog.show();
	dog.setState(new MeetAnotherDog());
	System.out.print("������ͬ��:");
	dog.show();
	}
}
