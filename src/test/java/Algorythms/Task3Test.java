package Algorythms;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task3Test {

    @Test
    @DisplayName("should return graphCounter value equal to 2")
    void checkGraphCount_returnGraphCount() {
        // given
        GraphCountService graphCountService = new GraphCountService();
        // when

        graphCountService.addVertices(1,2);
        graphCountService.addVertices(2,3);
        graphCountService.addVertices(1,15);
        graphCountService.addVertices(6,2);
        graphCountService.addVertices(7,9);
        graphCountService.addVertices(9,2);
        graphCountService.addVertices(10,12);

        // then

        assertEquals(graphCountService.getGraphCounter(), 2);
    }

    @Test
    @DisplayName("should return graphCounter value equal to 4")
    void checkGraphCount_returnGraphCount_secondTest() {
        // given
        GraphCountService graphCountService = new GraphCountService();
        // when

        graphCountService.addVertices(1 ,2);
        graphCountService.addVertices(2 ,3);
        graphCountService.addVertices(14 ,15);
        graphCountService.addVertices(16 ,17);
        graphCountService.addVertices(4 ,5);
        graphCountService.addVertices(9 ,2);
        graphCountService.addVertices(15 ,12);

        // then

        assertEquals(graphCountService.getGraphCounter(), 4);
    }

}