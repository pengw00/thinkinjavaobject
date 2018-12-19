class Person{
	public void eat(Apple apple){
		Apple peeled = apple.getPeeled();
		System.out.println("Yummy!");
	}
}
class Peeler{
	//static is important, without it 
	//you might in trouble.
	//no need to initial peeler, 
	//static method attached to class not object
	static Apple peel(Apple apple){
		return apple;
	}
}
//using this to execute one object for several times
class Apple{
	Apple getPeeled(){return Peeler.peel(this);}
}

public class PassingThis{
	public static void main(String[] args){
		new Person().eat(new Apple());
	}
}