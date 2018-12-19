public class Flower{
	int petalCount = 0;
	String s = "initial value";
	Flower(int petals){
		petalCount = petals;
		System.out.println("int value only" + petalCount);

	}
	Flower(String ss){
		System.out.println("String" + ss);
		s = ss;
	}
	Flower(String s, int petals){
		//this can reference one constrcutor
		//
		this(petals);
		this.s = s;
		//because the para s is the same as the 
		//data member s, so this.s = s can be used
		//use another this
		System.out.println("string and int");
	}
	Flower(){
		this("hi", 47);
		System.out.println("default");
	}
	void printPetalCount(){
		System.out.println("string"+ s + "printPetalCount"+ petalCount);
	}
	public static void main(String[] args){
		Flower x = new Flower();
		x.printPetalCount();
	}
}