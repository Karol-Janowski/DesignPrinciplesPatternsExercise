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

    public static void main(String[] args) {
        if (true) {
            new AmountCalculationServiceImpl(new impl1(), new impl3());
        } else {
            new AmountCalculationServiceImpl(new impl2(), new impl4());
        }
    }



}
