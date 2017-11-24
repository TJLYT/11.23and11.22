package Student;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;

public class Student {
   //编号，姓名，成绩
	
	private int id;
	private String name;
	private  BigDecimal Score;
	
	
	
	public Student() {
		super();
	}
	public Student(int id, String name, BigDecimal score) {
		super();
		this.id = id;
		this.name = name;
		Score = score;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getScore() {
		return Score;
	}
	public void setScore(BigDecimal score) {
		Score = score;
	}
	public static Object stream() {
		// TODO Auto-generated method stub
		return null;
	}
	public Map<BigDecimal, List<Student>> collect(Collector<Student, ?, Map<BigDecimal, Set<String>>> collector) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
