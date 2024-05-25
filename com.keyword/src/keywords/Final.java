package keywords;

public class Final {
	public static void main(String[] args ) {
		final int a=10;
		int b=2*5;
		try {
			if(a==b) {
				System.out.println(a+1);
			}else {
				System.out.println(a);
			}
		}catch(Exception e) {
			System.out.println("error");
			e.printStackTrace();
		}
	}
}
