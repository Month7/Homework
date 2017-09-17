package ex3notdone;
import java.io.*;
import java.util.zip.*;

public class ReadZipFile {
	public static void main(String[] args) throws IOException {
		File f=new File("D:/book.zip");
		File dir=new File("mybook");
		byte b[]=new byte[100];
		dir.mkdir();               //建立一级文件夹
		try {
			ZipInputStream in=new ZipInputStream(new FileInputStream(f));
			ZipEntry ze=null;
			while((ze=in.getNextEntry())!=null){
				File file=new File(dir, ze.getName());             //父目录，子目录
				FileOutputStream out=new FileOutputStream(file);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
