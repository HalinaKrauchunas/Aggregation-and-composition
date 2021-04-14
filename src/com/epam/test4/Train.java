package com.epam.test4;

public class Train {

    String namePlace;
    int numberTrain;

    public String getNamePlace() {

        return namePlace;
    }

    public void setNamePlace(String namePlace) {

        this.namePlace = namePlace;
    }

    @Override
    public String toString() {

        return "namePlace - '" + namePlace + '\'' +
            ", numberTrain - " + numberTrain +
            ", time - '" + time + '\'';
    }

    public int getNumberTrain() {

        return numberTrain;
    }

    public void setNumberTrain(int numberTrain) {

        this.numberTrain = numberTrain;
    }

    public String getTime() {

        return time;
    }

    public void setTime(String time) {

        this.time = time;
    }

    String time;

    public Train(String namePlace, int numberTrain, String time) {

        this.namePlace = namePlace;
        this.numberTrain = numberTrain;
        this.time = time;
    }
}
