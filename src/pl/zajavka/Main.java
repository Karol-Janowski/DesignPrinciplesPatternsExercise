package pl.zajavka;

public class Main {
    //DRY - dont repeat yourself
    //KISS - keep it stupid simple
    //YAGNI - u aint gonna need it

    // composition over inheritance
    // is-a / has-a
    // inheritance breaks encaplusation
    // inheritance is-a
    //composition has-a

    //strongly coupled loosely coupled - wiazanie obiektow

    // SOLID
    // SRP - Single responsibility Principle, class should have only one reason to change
    // OCP - Open/Closed Principle
    // LSP - Liskov Substitution Principle
    // ISP - Interface Segregation Principle
    // DIP - Dependency Inversion Principle

    // high-level modules should not import everything from low-level modules
    // Both should depend on abstraction

    // Abstractions should not depend on details
    // Details should depend on abstractions

    // IoC - Inversion of control
    // DI - Dependency Injection
    // IoC Container - framework do dependency injection (Spring)


    public static void main(String[] args) {
        if (true) {
            new AmountCalculationServiceImpl(new impl1(), new impl3());
        } else {
            new AmountCalculationServiceImpl(new impl2(), new impl4());
        }

        Rectangle rectangle = new Square(10);
        rectangle.setA(2);
        rectangle.setB(4);
        System.out.println(rectangle.area());
    }



}
