package Algorythms;

import java.util.*;

public class Task3 {

    public static void main(String[] args) {

        NumbersService numbersService = new NumbersService();
        ParseService parseService = new ParseService();
        GraphCountService graphCountService = new GraphCountService();

        int n = numbersService.getFirstNumber();

        for (int i = 0; i < n; i++) {
            String[] input = numbersService.getNumbers();

            List<Integer> edge = parseService.parse(input);
            graphCountService.addVertices(edge.get(0), edge.get(1));
        }

        System.out.println(graphCountService.getGraphCounter());
    }
}
