public class Giraffe extends Animal {
    public Giraffe(String name) {
        super(name, "leaves");
    }
    public void eat(String food) {
        if (food == this.favoriteFood) {
            System.out.println(this.name + " eats " + food);
            System.out.println("yum"+ this.name + "wants more " + this.favoriteFood);
            sleep();
        } else {
            System.out.println("Yuck!! " + this.name + " will not eat " + food);

        }
    }
}
