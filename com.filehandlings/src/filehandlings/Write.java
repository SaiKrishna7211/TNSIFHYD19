package filehandlings;

import java.io.FileWriter;
class Write {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("File.txt");
			fw.write("hii, this is a File , its hard to understand file handlings in java");
			fw.close();
			System.out.println("successfully completed wrote content into "+fw);
		} catch (Exception e){
			System.out.println("failed wrote content ");
		}
	}
}
