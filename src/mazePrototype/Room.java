package mazePrototype;

import java.util.HashMap;
import java.util.Map;

class Room implements MazePrototype {
    private Map<Direction, Wall> sides = new HashMap<>();
    private int roomNo;

    public Room(int roomNo) {
        this.roomNo = roomNo;
    }

    public Wall getSide(Direction direction) {
        return sides.get(direction);
    }

    public void setSide(Direction direction, Wall wall) {
        sides.put(direction, wall);
    }

    public int getRoomNo() {
        return roomNo;
    }

    @Override
    public Room clone() {
        Room room = new Room(roomNo);
        for (Map.Entry<Direction, Wall> entry : sides.entrySet()) {
            room.setSide(entry.getKey(), entry.getValue().clone());
        }
        return room;
    }
}