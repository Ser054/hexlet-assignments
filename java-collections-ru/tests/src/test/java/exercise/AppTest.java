package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> listAll = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        List<Integer> listWithNElements4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        Integer nReturnElem4 = 4;
        Assertions.assertEquals(App.take(listAll, nReturnElem4), listWithNElements4);

        Integer nReturnElemMoreSizeList = 100;
        Assertions.assertEquals(App.take(listAll, nReturnElemMoreSizeList), listAll);
        // END
    }
}
