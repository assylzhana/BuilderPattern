package mazePrototype;


class Wall implements MazePrototype {

    @Override
    public Wall clone() {
        return new Wall();
    }
}