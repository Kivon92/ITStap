package it.Stap.task01.logic.it.Stap.task01;
import static org.junit.Assert.*;
import it.Stap.task01.logic.Chess;

import org.junit.Test;

public class logicTest {
    @Test
    public void testCheckRookStepTrue1() {
        int x1 = 4, y1 = 4;
        int[][] points = {{1, 4}, {2, 4}, {3, 4}, {5, 4}, {6, 4}, {7, 4}, {8, 4},
                {4, 1}, {4, 2}, {4, 3}, {4, 5}, {4, 6}, {4, 7}, {4, 8}};
        for (int i = 0; i < points.length; i++) {
            int x2 = points[i][0];
            int y2 = points[i][1];
            boolean actual = Chess.checkRookStep(x1, x2, y1, y2);

            String error = String.format("Error with chess cell: (%d ,%d", x2 ,y2);
            assertTrue(error,actual);
        }
//        @Test
//        public void testCheckRookStepTrue2 () {
//            int x1 = 4, y1 = 4;
//            int x2 = 4, y2 = 5;
//            boolean actual = Chess.checkRookStep(x1, x2, y1, y2);
//            assertTrue(actual);
        }

    }
