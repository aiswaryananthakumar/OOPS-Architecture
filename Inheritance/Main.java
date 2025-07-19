package Inheritance;
	class Animal {
	    void eat() {
	        System.out.println("Animal eats");
	    }

	    void sleep() {
	        System.out.println("Animal sleeps");
	    }
	}

	class Bird extends Animal {
	    @Override
	    void eat() {
	        System.out.println("Bird pecks at food");
	    }

	    @Override
	    void sleep() {
	        System.out.println("Bird sleeps in nest");
	    }

	    void fly() {
	        System.out.println("Bird flies in the sky");
	    }
	}
	
public class Main {
	public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println("Animal class methods:");
        animal.eat();
        animal.sleep();

        Bird bird = new Bird();
        System.out.println("\nBird class methods:");
        bird.eat();    
        bird.sleep(); 
        bird.fly();    
	}
}
