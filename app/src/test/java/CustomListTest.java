import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    @BeforeEach
    public void createList(){

        list = new CustomList(null, new ArrayList<City>());

    }

    @Test
    public void addCityTest(){

        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(listSize + 1, list.getCount());
    }

    @Test
    public void hasCityTest(){

        list.addCity(new City("Edmonton", "AB"));

        City edm = new City("Edmonton", "AB");
        City cal = new City("Calgary", "AB");

        assertTrue(list.hasCity(edm));

        assertFalse(list.hasCity(cal));
    }
}
