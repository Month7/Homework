package ex3;

public class RandomString {
	String str="";
	public String getRandomString(String s){
		StringBuffer sb=new StringBuffer(s);
		int m=sb.length();
		for(int i=0;i<m;i++){
			int index=(int)(Math.random()*sb.length());
			char c=sb.charAt(index);  // ���ش�������ָ���������� char ֵ��
			str+=c;
			sb.deleteCharAt(index);
		}
		return str;
	}
}
