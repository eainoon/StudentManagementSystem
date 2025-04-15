public class Person{
	protected String name;
	protected String id;
	protected int age;
	
	//Default Constructor
	public Person(){
		this.name="unknown";
		this.id="0";
		this.age=0;
	}
	
	//Parametarized Constructor
	public Person(String name, String id,int age){
		this.name=name;
		this.id=id;
		this.age=age;
	}
	
	//getter method
	public String getName(){return name;}
	public String getId(){return id;}
	public int getAge(){return age;}
	
	//setter method
	public void setName(String name){this.name=name;}
	public void setId(String id){this.id=id;}
	public void setAge(int age){this.age=age;}
	
	//Display method
	public void displayInfo(){
		System.out.println("---Person Details---");
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}
