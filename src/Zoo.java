public class Zoo {
    String favoriteFood = "bacon";
    public static void main(String[] args){
Zoo z = new Zoo();

        Tiger tigger = new Tiger("Tigger");
        Bear pooh = new Bear("Pooh");
        Unicorn Rarity = new Unicorn("Rarity");
        Giraffe Gemma = new Giraffe("Gemma");
        Bee Stinger = new Bee("Stinger");
        Animal[] animals = {Gemma,tigger,Rarity,pooh,Stinger};
        Zookeeper Zoe = new Zookeeper("Zoe");
        Zoe.feedAnimals("Bread",animals);
        /*tigger.eat("meat");
        pooh.eat("fish");
        pooh.eat("meat");
        Rarity.eat("marshmellows");
        Gemma.eat("meat");
        Gemma.eat("leaves");
        Stinger.eat("Ice Cream");
        Stinger.eat("pollen");*/



    }
    public void sleep(String name){
        System.out.println(name + "sleeps for 8 hours");
    }
    public void eat(String name,String food){
        if(food.equals(favoriteFood)){
            System.out.println(name + " eats " + food);
            System.out.println( "YUM!!! " + name +  " wants more " + food);
        }else{
            System.out.println(name + " eats " + food);
            sleep(name);
        }
    }
}
