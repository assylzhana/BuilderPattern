package mazeBuilder;


class Wall {
    private boolean isDoor;

    public Wall(boolean isDoor) {
        this.isDoor = isDoor;
    }

    public Wall() {

    }

    public boolean isDoor() {
        return isDoor;
    }
}
