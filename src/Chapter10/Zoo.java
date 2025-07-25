package Chapter10;

public class Zoo {
    public static void main(String [] Args){

        Dog Buster =  new Dog();
        Buster.makeSound();
        Buster.fetch();
        feedAnimal(Buster);

        Animal tina = new Dog();
        tina.makeSound();

        tina = new Cat();
        tina.makeSound();
        ((Cat) tina).scratch(); 
        feedAnimal(tina);


    }

    private static void feedAnimal(Animal Animal) {
        if(Animal instanceof Dog){
            System.out.println("Here's your Dog Food");
        }else if(Animal instanceof Cat){
            System.out.println("Here's your Cat Food");} 
        }
        
    }


