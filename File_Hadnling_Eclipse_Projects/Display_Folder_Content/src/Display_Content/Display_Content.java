package Display_Content;
import java.io.File;
public class Display_Content {
public static void main(String []args) {
	File f = new File("C:/Regex Frontend Work/Java Regex/Java-Code/File_Hadnling_Eclipse_Projects");
	File  content[] = f.listFiles();
	for(int i =0;i<content.length;i++) {
		System.out.println(content[i].getName());
	}
}
}
