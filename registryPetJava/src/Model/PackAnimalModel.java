package Model;

import java.time.LocalDate;

public abstract class PackAnimalModel extends HumanFriendModel {
    private int lifting;

    public PackAnimalModel(String name, LocalDate birthday, int lifting) {
        super();
        this.lifting = lifting;
    }

    public PackAnimalModel() {

    }

    public int getLifting() {
        return lifting;
    }

    public void setLifting(int lifting) {
        this.lifting = lifting;
    }
}
