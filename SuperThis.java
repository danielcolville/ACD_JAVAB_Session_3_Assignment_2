package sesssion3;

public class SuperThis {
	String field1;
	int field2;
	
	public String toString() {
		return super.toString();
	}
	public SuperThis() {
		super();
	}
	public SuperThis(String field1) {
		this(field1,0);
	}
	public SuperThis(String field1,int field2) {
		this.field1=field1;
		this.field2=field2;
	}
	public static void main(String[] args) {
		SuperThis test=new SuperThis("ABC",10);
		System.out.println(test.toString());
		SuperThis test2=new SuperThis();
		SuperThis test3=new SuperThis("XYZ");
		
		
		test.print1("DEF");
	}
	public void print1(String field1) {
		System.out.println(this.field1);
		System.out.println(field1);
	}
}
