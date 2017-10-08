package item1;

public class Student {
	String name;
	float score;
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	public Student(){
		this.setName("YinZheng");
		this.setScore(100);
	}
	public Student(String name,float score){
		this.name=name;
		this.score=score;
	}
	public static void main(String[] args) {
		Student stu1=new Student();
		Student stu2=new Student("LiMing",59);
		System.out.println(stu1.name+"的成绩为"+stu1.score);
		System.out.println(stu2.name+"的成绩为"+stu2.score);
	}
}
