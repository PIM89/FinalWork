package Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class HumanFriendModel {
    private static final AtomicInteger seed = new AtomicInteger();
    private static int id = 0;
    private String name;
    private LocalDate birthday;
    private ArrayList<String> command = new ArrayList<>();
    private ArrayList<HumanFriendModel> humanFriendModels = new ArrayList<>();


    public HumanFriendModel() {
    }

    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void addCommand(HumanFriendModel humanFriendModel, String command, int id) {

        if (humanFriendModel.id == id) {
            humanFriendModel.command.add(command);
        }
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", имя животного: " + name +
                ", дата рождения: " + birthday;
    }

    public void getShowHumanFriendModels(HumanFriendModel humanFriendModels) {
        for (HumanFriendModel humanFriendModel : this.humanFriendModels) {
            System.out.println(humanFriendModel.toString());
        }
    }

    public void setHumanFriendModels(HumanFriendModel humanFriendModels) {
        this.humanFriendModels.add(humanFriendModels);
    }

    public void getHumanFriendsCommand(HumanFriendModel humanFriendModel, int id) {
        if (humanFriendModel.id == id) {
            if (humanFriendModel.command.size() == 0) {
                System.out.println("Животное ничего не умеет! Обучите её!");
            } else {
                for (int i = 0; i < command.size(); i++) {
                    System.out.println(i + 1 + " команда: " + command.get(i));
                }
            }
        }
    }
}
