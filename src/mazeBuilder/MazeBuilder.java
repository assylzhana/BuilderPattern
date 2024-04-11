package mazeBuilder;

interface MazeBuilder {
    void buildRooms();
    void buildWalls();
    void buildDoors();
    Maze getMaze();
}