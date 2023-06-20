package Model;

import java.time.LocalDate;

public class CatModel extends PetModel {
    public CatModel(String name, LocalDate birthday) {
        super(name, birthday);
    }

    public CatModel() {
        super();
    }
}
