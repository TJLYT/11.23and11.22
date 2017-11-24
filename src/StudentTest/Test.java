package StudentTest;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import Student.Student;

public class Test {
	public static void main(String[] args) {
		//创建数组存放分数
		 int [] arr= {60,70,80,90,95,100};
		
		//创建一个集合，而且是可变的，可以放入任何数量对象或者数组（只允许一类）
		List<Student> list =  Arrays.asList(  
	        new Student (1,"a",new BigDecimal(60)),
	        new Student(2,"b",new BigDecimal(70)),
	        new Student(3,"c",new BigDecimal(80)),
	        new Student(4,"d",new BigDecimal(90)),
	        new Student(5,"e",new BigDecimal(60)),
	        new Student(6,"f",new BigDecimal(100))
	        //...
		  );  
		Map<BigDecimal, List<Student>> collect
		 =list.stream().collect(Collectors.groupingBy(Student::getScore));
	
	 Iterator<Entry<BigDecimal, List<Student>>> li=collect.entrySet().iterator();
	   while(li.hasNext()) {
		   Entry<BigDecimal, List<Student>> entry=li.next();
		   System.out.println("分数： " +entry.getKey() +"有"+collect.get(entry.getKey()).size()+"人"+ "信息 " + entry.getValue());
	      }

	   }
	
	
}

