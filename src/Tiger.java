
public class Tiger extends Animal{
    public static void main(String[] args) {
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");

    }


    public Tiger(String name) {
        super(name,"meat");
    }

    /*public void sleep() {
        System.out.println(this.Name + " sleeps for 8 hours");

    }

    public void eat(String food) {
        if (food == this.favoriteFood) {
            System.out.println(this.Name + " eats " + food);
            System.out.println("yum Tigger wants more " + this.favoriteFood);
        } else {
            System.out.println(this.Name + " eats " + food);
            sleep();
        }
    }*/
}
