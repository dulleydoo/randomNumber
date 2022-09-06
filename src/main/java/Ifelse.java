public class Ifelse {
    public static void main(String[] args) {

        int randomGrade = (int) (Math.random() * 100);
        System.out.println(randomGrade);

        if (randomGrade >= 90) {
            System.out.println("you got an A");
        } else if (randomGrade >= 80) {
            System.out.println("you got a B");
        } else if (randomGrade >= 70) {
            System.out.println("you got a C");
        } else if (randomGrade >= 60) {
            System.out.println("you got a D");
        } else {
            System.out.println("you got an F");
        }


//        int age = 18;
//
//        if (age > 20){
//            System.out.println("can join my class");
//        }else if(age == 18){
//            System.out.println("can also join my class");
//        }else{
//            System.out.println("The bag with the shit got shit on the bag!");
//        }


    }
}