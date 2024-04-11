package mazeBuilder;


class AMazeBuilder implements MazeBuilder {
    private Maze maze;

    AMazeBuilder() {
        this.maze = new Maze();
    }

    public void buildRooms() {
        for (int i = 1; i <= 2; i++) {
            maze.addRoom(new Room(i));
        }
    }

    public void buildWalls() {
        for (int i = 1; i <= 2; i++) {
            Room room = maze.roomNo(i);
            room.setSide(Direction.NORTH, new Wall());
            room.setSide(Direction.EAST, new Wall());
            room.setSide(Direction.SOUTH, new Wall());
            room.setSide(Direction.WEST, new Wall());
        }
    }

    public void buildDoors() {
        Room r1 = maze.roomNo(1);
        Room r2 = maze.roomNo(2);
        DoorWall d = new DoorWall(r1, r2);
        r1.setSide(Direction.SOUTH, d);
        r2.setSide(Direction.NORTH, d);
    }

    public Maze getMaze() {
        return maze;
    }
}
