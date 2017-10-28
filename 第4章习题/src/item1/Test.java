package item1;

public class Test {
	public static void main(String[] args) {
		Student student=new Student("yinzheng", 21);
		Undergraduate undergraduate=new Undergraduate("cyj", 20, "CS");
		student.show();
		undergraduate.show();
	}
}
