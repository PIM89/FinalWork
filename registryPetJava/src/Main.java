import Model.*;
import Presenter.Presenter;
import View.View;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Presenter presenter = new Presenter(new View(),
                new CamelModel(),
                new CatModel(),
                new DogModel(),
                new DonkeyModel(),
                new HamsterModel(),
                new HorseModel());
        presenter.buttonClick();
    }
}