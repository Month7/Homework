package ex3;

public class CheckDogState {
	public static void main(String[] args) {
	Dog dog=new Dog();
	dog.setState(new SoftlyState());
	System.out.print("狗在主人面前:");
	dog.show();
	dog.setState(new MeetEnemyState());
	System.out.print("狗遇到敌人:");
	dog.show();
	dog.setState(new MeetFriendState());
	System.out.print("狗遇到朋友:");
	dog.show();
	dog.setState(new MeetAnotherDog());
	System.out.print("狗遇到同伴:");
	dog.show();
	}
}
