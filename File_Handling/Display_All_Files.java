import java.io.File;
public class Display_All_Files{
	public static void main(String []args) {
		File f = new File("C:/Regex Frontend Work/Java Regex/Java-Code/File_Hadnling_Eclipse_Projects");
		String files[] = f.list();
		for(int i =0;i<files.length;i++) {
			System.out.println(files[i]);
		}

		
	}
}