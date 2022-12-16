package lap07;
import java.text.ParseException;
import java.util.Set;
@SuppressWarnings("unused")
public class MainTest {
	
	public static void main(String[] args) {
		Student st;
		
		st = new Student();
		Person tc = new  Person("nguyen van thanh", "ha noi");
		
		st.setProgram("Chuong trinh hoc java");
		st.setYear(2022);
		st.setFee((double) 400000);
		
		System.out.println("\n  tin Student:");
		System.out.println("\n Thong tin Person:"+"Name:"+tc.getName()+" *----* Address:"+tc.getAddress());
		System.out.println("\n  Program:"+st.getProgram());
		System.out.println("\n  Year:"+st.getYear());
		System.out.println("\n  Fee:"+st.getFee());
		
		System.out.println("-----------------------------Staff--------------------------------------------");
		
		Staff aff = null;
		aff = new Staff();
		aff.setSchool("Bach Khoa Aptech");
		aff.setPay((double) 234000000);
		
		System.out.println("\n  tin Staff:");
		System.out.println("\n Thong tin Person:"+"Name:"+tc.getName()+" *----* Address:"+tc.getAddress());
		System.out.println("\n  School:"+aff.getSchool());
		System.out.println("\n  Pay:"+aff.getPay());
	}

}
