package Presenter;

import Model.*;
import View.*;
import Counter.Counter;

public class Presenter {
    View view;
    CamelModel camelModel;
    CatModel catModel;
    DogModel dogModel;
    DonkeyModel donkeyModel;
    HamsterModel hamsterModel;
    HorseModel horseModel;
    Counter counter;

    public Presenter(View view,
                     CamelModel camelModel,
                     CatModel catModel,
                     DogModel dogModel,
                     DonkeyModel donkeyModel,
                     HamsterModel hamsterModel,
                     HorseModel horseModel,
                     Counter counter) {
        this.view = view;
        this.camelModel = camelModel;
        this.catModel = catModel;
        this.dogModel = dogModel;
        this.donkeyModel = donkeyModel;
        this.hamsterModel = hamsterModel;
        this.horseModel = horseModel;
        this.counter = counter;
    }

    public void buttonClick() throws ClassNotFoundException {
        view.showMenu();
        int choose = view.setChooseMenu();
        if (choose == 4) {
            System.exit(0);
        }
        switch (choose) {
            case 1: {
                switch (View.setChooseTypePet()) {
                    case 1: {
                        camelModel.setName(view.setName());
                        camelModel.setBirthday(view.setBirtday());
                        camelModel.setLifting(view.setLifting());
                        camelModel.setId(counter.add());
                        camelModel.setHumanFriend(camelModel);
                        view.successfulOperation();
                        break;
                    }
                    case 2: {
                        catModel.setName(view.setName());
                        catModel.setBirthday(view.setBirtday());
                        catModel.setHumanFriend(catModel);
                        catModel.setId(counter.add());
                        view.successfulOperation();
                        break;
                    }
                    case 3: {
                        dogModel.setName(view.setName());
                        dogModel.setBirthday(view.setBirtday());
                        dogModel.setId(counter.add());
                        dogModel.setHumanFriend(dogModel);
                        view.successfulOperation();
                        break;
                    }
                    case 4: {
                        donkeyModel.setName(view.setName());
                        donkeyModel.setBirthday(view.setBirtday());
                        donkeyModel.setLifting(view.setLifting());
                        donkeyModel.setId(counter.add());
                        donkeyModel.setHumanFriend(donkeyModel);
                        view.successfulOperation();
                        break;
                    }
                    case 5: {
                        hamsterModel.setName(view.setName());
                        hamsterModel.setBirthday(view.setBirtday());
                        hamsterModel.setId(counter.add());
                        hamsterModel.setHumanFriend(hamsterModel);
                        view.successfulOperation();
                        break;
                    }
                    case 6: {
                        horseModel.setName(view.setName());
                        horseModel.setBirthday(view.setBirtday());
                        horseModel.setLifting(view.setLifting());
                        horseModel.setId(counter.add());
                        horseModel.setHumanFriend(horseModel);
                        view.successfulOperation();
                        break;
                    }
                }
                buttonClick();
                break;
            }
            case 2: {
                switch (View.setChooseTypePet()) {
                    case 1: {
                        camelModel.getShowHumanFriend();
                        camelModel.getHumanFriendsCommand(camelModel, view.setChooseIdPet());
                        view.successfulOperation();
                        break;
                    }
                    case 2: {
                        catModel.getShowHumanFriend();
                        catModel.getHumanFriendsCommand(catModel, view.setChooseIdPet());
                        view.successfulOperation();
                        break;
                    }
                    case 3: {
                        dogModel.getShowHumanFriend();
                        dogModel.getHumanFriendsCommand(dogModel, view.setChooseIdPet());
                        view.successfulOperation();
                        break;
                    }
                    case 4: {
                        donkeyModel.getShowHumanFriend();
                        donkeyModel.getHumanFriendsCommand(donkeyModel, view.setChooseIdPet());
                        view.successfulOperation();
                        break;
                    }
                    case 5: {
                        hamsterModel.getShowHumanFriend();
                        hamsterModel.getHumanFriendsCommand(hamsterModel, view.setChooseIdPet());
                        view.successfulOperation();
                        break;
                    }
                    case 6: {
                        horseModel.getShowHumanFriend();
                        horseModel.getHumanFriendsCommand(horseModel, view.setChooseIdPet());
                        view.successfulOperation();
                        break;
                    }
                }
                buttonClick();
                break;
            }
            case 3:
                switch (View.setChooseTypePet()) {
                    case 1: {
                        camelModel.getShowHumanFriend();
                        camelModel.addCommand(camelModel, view.setComandString(), view.setChooseIdPet());
                        view.successfulOperation();

                        break;
                    }
                    case 2: {
                        catModel.getShowHumanFriend();
                        catModel.addCommand(catModel, view.setComandString(), view.setChooseIdPet());
                        view.successfulOperation();
                        break;
                    }
                    case 3: {
                        dogModel.getShowHumanFriend();
                        dogModel.addCommand(dogModel, view.setComandString(), view.setChooseIdPet());
                        view.successfulOperation();
                        break;
                    }
                    case 4: {
                        donkeyModel.getShowHumanFriend();
                        donkeyModel.addCommand(donkeyModel, view.setComandString(), view.setChooseIdPet());
                        view.successfulOperation();
                        break;
                    }
                    case 5: {
                        hamsterModel.getShowHumanFriend();
                        hamsterModel.addCommand(hamsterModel, view.setComandString(), view.setChooseIdPet());
                        view.successfulOperation();
                    }
                    case 6: {
                        horseModel.getShowHumanFriend();
                        horseModel.addCommand(horseModel, view.setComandString(), view.setChooseIdPet());
                        view.successfulOperation();
                    }
                }
                buttonClick();
                break;
            case 4: {
                System.out.println("Спасибо за пользование программой!");
                System.exit(0);
            }
        }
    }
}