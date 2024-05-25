package interfaceclasses;

public class Banks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sbi s=new Sbi();
		Icici i=new Icici();
		Hdfs h=new Hdfs();
		s.roi(4.4);
		s.loan();
		i.roi(4.8);
		i.loan();
		h.roi(5.0);
		h.loan();
	}

}
