package ogr.oyj.com;

import java.io.Serializable;

public class Student implements Comparable<Student>{
     private String name;
     private int id;
     private int count;
     public Student(int id,String name,int count) {
    	 this.setName(name);
    	 this.setCount(count);
    	 this.setId(id);
     }
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int compareTo(Student stu) {
		if(this.count>stu.count) {
			return -1;
		}else if(this.count<stu.count){
		    return  1;
 		}else {
 			return 0;
 		}
	}    
}
