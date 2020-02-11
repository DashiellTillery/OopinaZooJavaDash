public class Bee extends Animal {
    public Bee(String name) {
        // don't forget to correct the call to the superclass initializer!
        super(name, "pollen");
    }

    public void sleep() {
    }
    public void eat(String food) {
        if (food == this.favoriteFood) {
            System.out.println(this.name + " eats " + food);
            System.out.println("yum"+ this.name + "wants more pollen");
            System.out.println(this.name + " never sleeps");
        } else {
            System.out.println("Yuck!! " + this.name + " will not eat " + food);

        }
    }
}
