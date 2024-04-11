package mazeBuilder;

public class BMazeBuilder implements MazeBuilder{
    private Maze maze;

    BMazeBuilder() {
        this.maze = new Maze();
    }

    public void buildRooms() {
        for (int i = 1; i <= 3; i++) {
            maze.addRoom(new Room(i));
        }
    }

    public void buildWalls() {
        for (int i = 1; i <= 3; i++) {
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
        DoorWall d1 = new DoorWall(r1, r2);
        r1.setSide(Direction.EAST, d1);
        r2.setSide(Direction.WEST, d1);

        Room r3 = maze.roomNo(3);
        DoorWall d2 = new DoorWall(r2, r3);
        r2.setSide(Direction.EAST, d2);
        r3.setSide(Direction.WEST, d2);
    }

    public Maze getMaze() {
        return maze;
    }
}
