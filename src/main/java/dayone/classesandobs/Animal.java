package dayone.classesandobs;
//blueprint for making objects
public class Animal {
    //instance variable or property
    public String animalName;
    public int eyes;
    public String animalSound;

    //Constructor construct objects in main
    public Animal(String name, int eye, String animalSound){
        this.animalName = name;
        this.eyes = eyes;
        this.animalSound = animalSound;
    }

    //Overloaded constructor
    public Animal(String name){
        this.animalName = name;
    }
    //Method
    /*
        accessModifier | return Data Type | name () |{}

     */
    public String printNameAndMakeNoise(){
        return this.animalName + " =========== " + this.animalSound;
    }
    public int numberOfEyes(){
        return this.eyes;
    }


    public boolean makeNoisee(){
        return true; // return a data type value
    }
    public int makenoiseee(){
        return 10;
    }

}
