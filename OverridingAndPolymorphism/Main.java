package OverridingAndPolymorphism;

class Fruit {
    String name;
    String taste;
    String size;

    Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    void eat() {
        System.out.println("Fruit: " + name + ", Taste: " + taste);
    }
}

class Apple extends Fruit {
    Apple() {
        super("Apple", "Sweet", "Medium");
    }

    @Override
    void eat() {
        System.out.println("Apple tastes sweet and crisp.");
    }
}

class Orange extends Fruit {
    Orange() {
        super("Orange", "Sour", "Medium");
    }

    @Override
    void eat() {
        System.out.println("Orange tastes citrus and tangy.");
    }
}


public class Main {

	public static void main(String[] args) {
		Fruit apple = new Apple();
        apple.eat();

        Fruit orange = new Orange();
        orange.eat();

	}

}
