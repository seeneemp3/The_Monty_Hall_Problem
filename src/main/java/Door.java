public class Door {
    String name;
    boolean isRight;
    boolean isChosen;

    @Override
    public String toString() {
        return "Door{" +
                "name='" + name + '\'' +
                ", isRight=" + isRight +
                ", isChosen=" + isChosen +
                '}';
    }

    public Door(String name, boolean isRight, boolean isChosen) {
        this.name = name;
        this.isRight = isRight;
        this.isChosen = isChosen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRight() {
        return isRight;
    }

    public void setRight(boolean right) {
        isRight = right;
    }

    public boolean isChosen() {
        return isChosen;
    }

    public void setChosen(boolean chosen) {
        isChosen = chosen;
    }
}
