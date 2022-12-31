package engine;

import IO.ConsoleManager;

import java.util.Arrays;

public class Navigation {
    //TODO looking like a game engine....
    //TODO method for spawn enemy, method for encounter with enemy, boolean for winning, boolean for game checking inventory,
    public int[][] map = new int[][]{
            {1,1,1,1,1,1},
            {9,0,0,0,0,0},
            {1,0,0,0,0,1},
            {1,0,0,0,0,1},
            {1,1,1,1,1,1}};
    private int x = map[2][0];
    private int y = map[0][3];
    private int playerPosition = map [x][y];
    private ConsoleManager input = new ConsoleManager();
    public Navigation(){
    }
    public String printMap(int [][]map){
        return Arrays.toString(map);
    }
    public void move(){
    }
    public void doAtLocation(){
        int tile = 0;
        int wall = 1;

        int enemy = 3;
        int hazard =4;
    }
}
