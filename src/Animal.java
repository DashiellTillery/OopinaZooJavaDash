class Animal {
        String name;
        String favoriteFood;
        public static int population;
        public Animal(String name, String favoriteFood) {
            this.name = name;
            this.favoriteFood = favoriteFood;
            population++;
        }

    public String getName() {
        return name;
    }

    public void sleep() {
            System.out.println(this.name + " sleeps for 8 hours");


        }

        public void eat(String food) {

            if (food == this.favoriteFood) {
                System.out.println(this.name + " eats " + food);
                System.out.println("yum " + this.name + " wants more " + this.favoriteFood);
            } else {
                System.out.println(this.name + " eats " + food);
                sleep();
            }
        }
    }





