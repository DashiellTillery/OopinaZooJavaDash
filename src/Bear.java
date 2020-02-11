public class Bear extends Animal {
    private String favoriteFood = "fish";

    public Bear(String name) {
        super(name,"fish");
    }

    public void sleep() {
        System.out.println(this.getName() + " Hibernates for 4 months");

    }

    /*public void eat(String food) {
        if (food == this.favoriteFood) {
            System.out.println(this.Name + " eats " + food);
            System.out.println("yum " + this.Name + " wants more " + this.favoriteFood);
        } else {
            System.out.println(this.Name + " eats " + food);
            sleep();
        }
    }*/
}
