package lap07;
import java.util.Scanner;
@SuppressWarnings("unused")
public class Student extends Person{
	
	private String program;
	private int year;
	private Double fee;
	
	public Student() {}
	
	public Student(String program, int year, Double fee) {
		this.program = program;
		this.year = year;
		this.fee = fee;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

}
