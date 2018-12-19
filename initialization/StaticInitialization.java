class Bowl{
	Bowl(int marker){
		System.out.println("Bowl" + marker);
	}
	void f1(int marker){
		System.out.println("f1" + marker);
	}
}
class Table{
	static Bowl bowl1 = new Bowl(1);
	Table(){
		System.out.println("Tbale()");
		bowl2.f1(1);
	}
	void f2(int marker){
        System.out.println("f2");
	}
	static Bowl bowl2 = new Bowl(2);
}
class CupBoard{
	Bowl bowl3 = new Bowl(3);
	static Bowl bowl4 = new Bowl(4);
	CupBoard(){
		System.out.println("CupBoard");
		bowl4.f1(2);
	}
	void f3(int marker){
		System.out.println("f3"+ marker);
	}
	static Bowl bowl5 = new Bowl(5);
}
public class StaticInitialization{
	public static void main(String[] args) {
		System.out.println("Creat new CupBoard in main");
		new CupBoard();
		System.out.println("create new CupBoard in main");
		new CupBoard();
		table.f2(1);
		cupboard.f3(1);
	}
	static Table table = new Table();
	static CupBoard cupboard = new CupBoard();

}
//first static field or method, and non static object
//so before main(), all the other static method 
// was initialized first, the corresponding class
//was also initialzed. 
