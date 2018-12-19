class Book{
	boolean checkedOut = false;
	Book(boolean checkOut){
		checkedOut = checkOut;
	}
	void checkIn(){
		checkedOut = false;
	}
	protected void finalize(){
		if(checkedOut) System.out.println("Error: checked out");
		//Normally you can also use:
		//super.finalize(); call the base- class version

	}
}
//finalize() is triggered by the GC, when ever 
//there is no reference to the object, finalize() work

public class TreminationCondition{
	public static void main(String[] args) {
		Book novel = new Book(true);
		System.out.println("first point!");
		//proper clean up
		novel.checkIn();
		System.out.println("second point!");
		//Drop the reference. forget to clean up
		new Book(true);
		System.out.println("third point!");
		System.gc(); // if comment this line finalize() will not be triggered
	}
}