package lesson_eight;

public class Main {
	  public static void main(String[] args) {
	    Student bob = new Student("Bob", 36, false, "Berlin");
	    Student alice = new Student("Alice", 36, true, "Berlin");
	    Student john = new Student("John", 36, true, "Berlin");
	    Student jane = new Student("Jane", 36, false, "Berlin");

	    bob.friends.add(alice);
	    bob.friends.add(jane);

	    alice.friends.add(bob);
	    alice.friends.add(jane);

	    john.friends.add(jane);

	    jane.friends.add(john);
	    jane.friends.add(alice);
	    jane.friends.add(bob);

	    bob.introduce();
	    alice.introduce();
	    john.introduce();
	    jane.introduce();
	    
	    
	    Square s= new Square(5);
	    System.out.println("Square " + s.l + "=" + area(s));
	       
	    Rectangle r= new Rectangle(4, 6);
	    System.out.println("Rectangle " + r.a + " and " + r.b + " = "+ area(r));
	  }
	    
	    
	    public static double area(Square s) {
	    	return s.l * s.l;
	    }
	    
	    public static double area(Rectangle r) {
	    	return r.a *r.b;
	    }
}


