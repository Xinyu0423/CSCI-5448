/*public class addNum{
	public static int add(int x, int y){
		int sum=x+y;
		return sum;
	}
	public static int add(int x, double y){
		double sum=x+y;
		return sum;
	}
	public static int add(double x, double y){
		double sum=x+y;
		return sum;
	}
	public static void main(String[] args){
	addNum test=new addNum();
	System.out.println(test.add(2,3));
	//System.out.println(addNum.add(2,3.5));
	//System.out.println(addNum.add(2.5,3.5));
	}
}*/
/*class student{
    private String name;
    private String id;
    public void setName(String name){
    	this.name=name;
    }
    public void setID(String id){
    	this.id=id;
    }
    public String getName(){
    	return name;
    }
    public String getID(){
    	return id;
    }
    public void printName(){
    	System.out.println(name);
    }
    public void printID(){
    	System.out.println(id);
    }

}

class Test{
    public static void main(String[] args){
    student studentDemo=new student();
    studentDemo.setName("foo");
    studentDemo.setID("1234");
    studentDemo.printName();
    studentDemo.printID();

    }
}*/

/*class rectArea{
	private double area;
	public void calArea(double base,double height){
		area=0.5*base*height;
	}
	public void printArea(){
		System.out.println(area);
	}
}
class mainFun{
	public static void main(String[] args){
		rectArea demo=new rectArea();
		demo.calArea(3.0,4.0);
		demo.printArea();
	}
}*/
class student{
	private String name;
	private String id;
	public void setNameID(String name, String id){
		this.name=name;
		this.id=id;
	}
	
}
class mainFun{
	public static void main(String[] args){
		student stud1=new student();
		stud1.setNameID("Jack","001");
		student stud2=new student();
		stud1.setNameID("Jack","001");
		if(stud1==stud2){
			System.out.println("same");
		}else{
			System.out.println("different");
		}
	}
}
