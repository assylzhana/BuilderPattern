package mazePrototype;

import java.util.HashMap;
import java.util.Map;

class Maze implements MazePrototype {
    private Map<Integer, Room> rooms = new HashMap<>();

    public void addRoom(Room r) {
        rooms.put(r.getRoomNo(), r);
    }

    public Room roomNo(int r) {
        return rooms.get(r);
    }

    @Override
    public Maze clone() {
        Maze maze = new Maze();
        for (Room room : rooms.values()) {
            maze.addRoom(room.clone());
        }
        return maze;
    }
}
