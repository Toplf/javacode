package stu11.array;

// alt + shift + s 
public class Student {

	private int id;
	private String name;
	private int grade;
	private double score;

	public Student(int id, String name, int grade, double score) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.score = score;
	}

	public Student() {
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

	public String say() {
		return "学号 : " + id + ", 姓名 : " + name + ", 年级 : " + grade + ", 分数 : " + score;
	}

}