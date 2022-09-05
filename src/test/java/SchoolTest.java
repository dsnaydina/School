import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SchoolTest {

    @Test
    public void increaseNumberOfKlassesAfterAdding() {
        //given
        List<Klasa> klasas = new LinkedList<>();
        Klasa klasa1 = new Klasa();
        Klasa klasa2 = new Klasa();
        Klasa klasa3 = new Klasa();
        klasas.add(klasa1);
        klasas.add(klasa2);
        klasas.add(klasa3);
        School school = new School(klasas);

        //when
        Klasa klasa4 = new Klasa();
        school.addKlasa(klasa4);

        //then
        assertEquals(4, school.getKlasas().size());
    }



}