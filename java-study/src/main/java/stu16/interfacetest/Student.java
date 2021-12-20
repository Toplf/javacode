package stu16.interfacetest;

public class Student implements Comparable {
	
	private int id;
	private String name;
	private int grade;
	private double score;
	
	public Student() {
	}

	public Student(int id, String name, int grade, double score) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.score = score;
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

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + ", score=" + score + "]";
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Student) {
			/*
			if (this.grade > ((Student)o).grade) {
				return 1;
			} else if (this.grade < ((Student)o).grade) {
				return -1;
			}
			return 0;
			*/
			return this.grade - ((Student)o).grade;
		}
		return 0x80000000;
	}
	
}
