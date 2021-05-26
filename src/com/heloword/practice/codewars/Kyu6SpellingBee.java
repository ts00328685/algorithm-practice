package com.heloword.practice.codewars;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class Kyu6SpellingBee {

    private static char[][] show(final char[][] hive) {
        for (int y = 0; y < hive.length; y++) {
            System.out.println(hive[y]);
        }
        return hive;
    }

    @Test
    public void ex1() {
        final char hive[][] = new char[][]{
                "bee.bee".toCharArray(),
                ".e..e..".toCharArray(),
                ".b..eeb".toCharArray()
        };
        System.out.println();
        assertEquals(5, Dinglemouse.howManyBees(show(hive)));
    }

    @Test
    public void ex2() {
        final char hive[][] = new char[][] {
                "bee.bee".toCharArray(),
                "e.e.e.e".toCharArray(),
                "eeb.eeb".toCharArray()
        };
        assertEquals(8, Dinglemouse.howManyBees(show(hive)));
    }

}

class Dinglemouse {

    public static int howManyBees(final char[][] hive) {

        if (hive == null) {
            return 0;
        }

        Integer beeCounter = 0;

        for (int i = 0; i < hive.length; i++) {
            for (int j = 0; j < hive[i].length - 2; j++) {
                StringBuilder sb = new StringBuilder();
                String possibleBeeOrEeb = sb.append(hive[i][j]).append(hive[i][j + 1]).append(hive[i][j + 2]).toString();
                if ("bee".equals(possibleBeeOrEeb) || "eeb".equals(possibleBeeOrEeb)) {
                    beeCounter++;
                }
            }
        }

        for (int j = 0; j < hive[0].length; j++) {
            StringBuilder sb = new StringBuilder();
            String possibleBeeOrEeb = sb.append(hive[0][j]).append(hive[1][j]).append(hive[2][j]).toString();
            if ("bee".equals(possibleBeeOrEeb) || "eeb".equals(possibleBeeOrEeb)) {
                beeCounter++;
            }
        }

        // Your bee counting code here
        return beeCounter;
    }
}