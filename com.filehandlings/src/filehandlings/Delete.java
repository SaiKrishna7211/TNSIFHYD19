package filehandlings;

import java.io.File;
public class Delete {
	public static void main(String[] args) {
		File f=new File("Sample.txt");
		if(f.delete()) {
			System.out.println("successfully deteled");
		}else {
			System.out.println("failed to delete");
		}
	}
}
