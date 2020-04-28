package collectionsPack1;

public class Student {
	private int Id;
	private String name;
	public Student(int id, String name) {
		super();
		Id = id;
		this.name = name;
		
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Id=" + Id + " name=" + name ;
	}
	
}
