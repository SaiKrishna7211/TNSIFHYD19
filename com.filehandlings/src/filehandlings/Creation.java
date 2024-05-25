package filehandlings;

import java.io.File;

public class Creation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f=new File("File.txt");
			if(f.createNewFile()) {
				System.out.println("File created "+f);
			}else {
				System.out.println("File already exist");
			}
		} catch (Exception e) {
			System.out.println("error occured while creating a file "+e);
			e.printStackTrace();
		}
	}

}
