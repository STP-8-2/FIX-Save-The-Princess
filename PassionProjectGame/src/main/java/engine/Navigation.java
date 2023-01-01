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
    private int x = map[3][0];
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
        int player = 0;
        int wall = 1;
        int tile = 2;
        int monster = 3;
        int chest = 4;
        int key = 5;

        if(playerPosition == wall){
            System.out.println("Busted your nose. Try new direction.");
        }
        if(playerPosition == tile){
            System.out.println("Empty room.");
        }
        if(playerPosition == monster){
            enemyEncounter();
        }
        if(playerPosition == chest){
            System.out.println("Open chest!");
        }
        if(playerPosition == key){
            System.out.println("Pick up key!");
        }
        else if(playerPosition != wall){
            System.out.println(".");

    }


    }

    private void enemyEncounter() {

    }
}

