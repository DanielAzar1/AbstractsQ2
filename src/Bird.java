public class Bird extends Animal implements Flyable{
    @Override
    public void makeSound() {
        System.out.println("Chirp");
    }

    @Override
    public void eat() {
        System.out.println("Nom nom");
    }

    @Override
    public void Fly() {
        System.out.println("Flying");
    }
}
