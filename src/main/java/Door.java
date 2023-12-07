public class Door {
    int name;
    boolean hasPrize;
    boolean isChosen;

    @Override
    public String toString() {
        return "Door{" +
                "name='" + name + '\'' +
                ", hasPrize=" + hasPrize +
                ", isChosen=" + isChosen +
                '}';
    }

    public Door(int name, boolean hasPrize, boolean isChosen) {
        this.name = name;
        this.hasPrize = hasPrize;
        this.isChosen = isChosen;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
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
