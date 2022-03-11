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

        City edm = new City("Edmonton", "AB");

        list.addCity(edm);

        City cal = new City("Calgary", "AB");

        assertTrue(list.hasCity(edm));

        assertFalse(list.hasCity(cal));
    }

    @Test
    public void deleteCityTest(){

        City edm = new City("Edmonton", "AB");
        list.addCity(edm);

        assertEquals(1, list.getCount());

        list.deleteCity(edm);

        assertEquals(0, list.getCount());

    }

    @Test
    public void countCitiesTest(){

        assertEquals(0, list.countCities());

        City city = new City("Edmonton", "AB");
        list.addCity(city);

        assertEquals(1, list.countCities());

        City city2 = new City("Calgary", "AB");
        list.addCity(city2);

        assertEquals(2, list.countCities());

        City city3 = new City("Vancouver", "BC");
        list.addCity(city3);

        assertEquals(3, list.countCities());

    }
}
