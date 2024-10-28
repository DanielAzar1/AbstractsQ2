public class Dog extends Animal implements Runnable{
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    @Override
    public void eat() {
        System.out.println("Nom nom");
    }

    @Override
    public void Run() {
        System.out.println("Running");
    }
}
