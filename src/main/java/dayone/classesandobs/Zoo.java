package dayone.classesandobs;

public class Zoo {
    public static void main(String[] args) {

        //data type of thing we want to create
        Animal animal1 = new Animal("dog",2,"woof woof");
        Animal animal2 = new Animal("spider", 4,"silent");
        Animal animal3 = new Animal("fish");
        Animal animal4 = new Animal("chris");

        String result = animal2.printNameAndMakeNoise();
        //System.out.println(result);
        //or
        //System.out.println(animal1.printNameAndMakeNoise());

        System.out.println(animal1.numberOfEyes());



    }
}
