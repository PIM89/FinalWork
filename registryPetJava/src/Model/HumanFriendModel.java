package Model;

import java.time.LocalDate;
import java.util.ArrayList;


public abstract class HumanFriendModel {
    private int id;
    private String name;
    private LocalDate birthday;
    private ArrayList<String> command = new ArrayList<>();
    private ArrayList<HumanFriendModel> humanFriendModels = new ArrayList<>();


    public HumanFriendModel() {

    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "ID: " + id +
                ", имя животного: " + name +
                ", дата рождения: " + birthday;
    }

    public void getShowHumanFriend() {
        for (HumanFriendModel humanFriendModel : humanFriendModels) {
            System.out.println(humanFriendModel.toString());
        }
    }

    public void setHumanFriend(HumanFriendModel humanFriendModel) {
        humanFriendModel.humanFriendModels.add(humanFriendModel);
    }

    public void addCommand(HumanFriendModel humanFriendModel, String command, int id) {

        if (humanFriendModel.id == id) {
            humanFriendModel.command.add(command);
        } else {
            System.out.println("Животного с таким id нет!");
        }
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
