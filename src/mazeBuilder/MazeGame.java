package mazeBuilder;

class MazeGame {
    public static void main(String[] args) {
        MazeBuilder builder = new AMazeBuilder();
        createMaze(builder);
        Maze maze = builder.getMaze();
        System.out.println("Starting the maze game!");
        System.out.println("You are currently in room 1.");
        Room currentRoom = maze.roomNo(1);
        Direction nextDirection = Direction.EAST;
        for (int i = 0; i < 3; i++) {
            System.out.println("Moving to the " + nextDirection + " direction...");
            Wall nextWall = currentRoom.getSide(nextDirection);
            if (nextWall instanceof DoorWall) {
                DoorWall door = (DoorWall) nextWall;
                if (door.isOpen()) {
                    System.out.println("Passing through the door...");
                    currentRoom = (currentRoom == door.getRoom1()) ? door.getRoom2() : door.getRoom1();
                    System.out.println("You entered room " + currentRoom.getRoomNo() + ".");
                } else {
                    System.out.println("The door is closed!");
                }
            } else {
                System.out.println("Hitting a wall!");
            }

            nextDirection = (nextDirection == Direction.EAST) ? Direction.SOUTH : Direction.EAST;
        }

        System.out.println("Game over!");
    }

    private static void createMaze(MazeBuilder builder) {
        builder.buildRooms();
        builder.buildWalls();
        builder.buildDoors();
    }
}
