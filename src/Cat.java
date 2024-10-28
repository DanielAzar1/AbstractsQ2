public class Cat extends Animal implements Runnable{
    @Override
    public void makeSound() {
        System.out.println("Meow");
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
