package basic.programs;

public class Hello_World {

	private String name;
	static int objectcount=0;
	static int o;
	private String id;
	
	public Hello_World(String name,String id)
	{
		this.name=name;
		this.id=id;
	
	objectcount++;
	}
	public Hello_World() {
		// TODO Auto-generated constructor stub
		objectcount++;
		
	}
	
	public Hello_World(int i, int j, int k) {
		// TODO Auto-generated constructor stub
		objectcount++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello World.....!!!!");
Hello_World e3=new Hello_World(1,2,3);
Hello_World e6=new Hello_World(1,2,3);
Hello_World e7=new Hello_World(1,2,3);
Hello_World e4=new Hello_World();
Hello_World e5=new Hello_World();
Hello_World e1=new Hello_World("ABC","1"); 
Hello_World e2=new Hello_World("ABC","1"); 
System.out.println("Number of Hello_World objects created ="+ objectcount);
}
	}


