
public class Zookeeper {

    private String Name;
    public Zookeeper(String Name){
        this.Name = Name;
    }
    public void feedAnimals(String food, Animal[] animals){
        System.out.println("zoe is feeding " + food + " to " + animals.length + " out of "+ Animal.population );
        for(int i = 0; i < animals.length;i++) {
           animals[i].eat(food);

        }

    }
}
