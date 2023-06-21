import Model.*;
import Presenter.Presenter;
import View.View;
import Counter.Counter;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Presenter presenter = new Presenter(new View(),
                new CamelModel(),
                new CatModel(),
                new DogModel(),
                new DonkeyModel(),
                new HamsterModel(),
                new HorseModel(),
                new Counter());
        presenter.buttonClick();
    }
}