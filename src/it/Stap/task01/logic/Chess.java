package it.Stap.task01.logic;

public class Chess {
    public static boolean checkRookStep(int x1,int y1,int x2,int y2){

        return(x1 == x2 && y1 !=y2 || x1 != x2 && y1 ==y2 );
    }

}
