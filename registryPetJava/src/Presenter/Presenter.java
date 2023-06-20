package Presenter;

import Model.*;
import View.*;

public class Presenter {
    View view;
    CamelModel camelModel;
    CatModel catModel;
    DogModel dogModel;
    DonkeyModel donkeyModel;
    HamsterModel hamsterModel;
    HorseModel horseModel;

    public Presenter(View view, CamelModel camelModel, CatModel catModel, DogModel dogModel, DonkeyModel donkeyModel, HamsterModel hamsterModel, HorseModel horseModel) {
        this.view = view;
        this.camelModel = camelModel;
        this.catModel = catModel;
        this.dogModel = dogModel;
        this.donkeyModel = donkeyModel;
        this.hamsterModel = hamsterModel;
        this.horseModel = horseModel;
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
                        camelModel.setHumanFriendModels(camelModel);
                        view.successfulOperation();
                        break;
                    }
                    case 2: {
                        catModel.setName(view.setName());
                        catModel.setBirthday(view.setBirtday());
                        catModel.setHumanFriendModels(catModel);
                        view.successfulOperation();
                        break;
                    }
                    case 3: {
                        dogModel.setName(view.setName());
                        dogModel.setBirthday(view.setBirtday());
                        dogModel.setHumanFriendModels(dogModel);
                        view.successfulOperation();
                        break;
                    }
                    case 4: {
                        donkeyModel.setName(view.setName());
                        donkeyModel.setBirthday(view.setBirtday());
                        donkeyModel.setLifting(view.setLifting());
                        dogModel.setHumanFriendModels(dogModel);
                        view.successfulOperation();
                        break;
                    }
                    case 5: {
                        hamsterModel.setName(view.setName());
                        hamsterModel.setBirthday(view.setBirtday());
                        hamsterModel.setHumanFriendModels(hamsterModel);
                        view.successfulOperation();
                        break;
                    }
                    case 6: {
                        horseModel.setName(view.setName());
                        horseModel.setBirthday(view.setBirtday());
                        horseModel.setLifting(view.setLifting());
                        horseModel.setHumanFriendModels(horseModel);
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
                        camelModel.getShowHumanFriendModels(camelModel);
                        camelModel.getHumanFriendsCommand(camelModel, view.setChooseIdPet());
                        view.successfulOperation();
                        break;
                    }
                    case 2: {
                        catModel.getShowHumanFriendModels(catModel);
                        catModel.getHumanFriendsCommand(catModel, view.setChooseIdPet());
                        view.successfulOperation();
                        break;
                    }
                    case 3: {
                        dogModel.getShowHumanFriendModels(dogModel);
                        dogModel.getHumanFriendsCommand(dogModel, view.setChooseIdPet());
                        view.successfulOperation();
                        break;
                    }
                    case 4: {
                        donkeyModel.getShowHumanFriendModels(donkeyModel);
                        donkeyModel.getHumanFriendsCommand(donkeyModel, view.setChooseIdPet());
                        view.successfulOperation();
                        break;
                    }
                    case 5: {
                        hamsterModel.getShowHumanFriendModels(hamsterModel);
                        hamsterModel.getHumanFriendsCommand(hamsterModel, view.setChooseIdPet());
                        view.successfulOperation();
                        break;
                    }
                    case 6: {
                        horseModel.getShowHumanFriendModels(horseModel);
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
                        camelModel.getShowHumanFriendModels(camelModel);
                        camelModel.addCommand(camelModel, view.setComandString(), view.setChooseIdPet());
                        view.successfulOperation();

                        break;
                    }
                    case 2: {
                        catModel.getShowHumanFriendModels(catModel);
                        catModel.addCommand(catModel, view.setComandString(), view.setChooseIdPet());
                        view.successfulOperation();
                        break;
                    }
                    case 3: {
                        dogModel.getShowHumanFriendModels(dogModel);
                        dogModel.addCommand(dogModel, view.setComandString(), view.setChooseIdPet());
                        view.successfulOperation();
                        break;
                    }
                    case 4: {
                        donkeyModel.getShowHumanFriendModels(donkeyModel);
                        donkeyModel.addCommand(donkeyModel, view.setComandString(), view.setChooseIdPet());
                        view.successfulOperation();
                        break;
                    }
                    case 5: {
                        hamsterModel.getShowHumanFriendModels(hamsterModel);
                        hamsterModel.addCommand(hamsterModel, view.setComandString(), view.setChooseIdPet());
                        view.successfulOperation();
                    }
                    case 6: {
                        horseModel.getShowHumanFriendModels(horseModel);
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