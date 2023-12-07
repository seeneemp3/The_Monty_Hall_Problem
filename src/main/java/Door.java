public class Door {
    int number;
    boolean hasPrize;
    boolean isChosen;

    @Override
    public String toString() {
        return "Door{" +
                "number='" + number + '\'' +
                ", hasPrize=" + hasPrize +
                ", isChosen=" + isChosen +
                '}';
    }

    public Door(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isHasPrize() {
        return hasPrize;
    }

    public void setHasPrize(boolean hasPrize) {
        this.hasPrize = hasPrize;
    }

    public boolean isChosen() {
        return isChosen;
    }

    public void setChosen(boolean chosen) {
        isChosen = chosen;
    }
}
