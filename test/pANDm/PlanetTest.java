package pANDm;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PlanetTest {

    //Excercise 3
    @Test
    void getMoons() {
        Planet planet = new Planet(1000,"earth",1);
        assertEquals(1000,planet.getRadiusSize());
        assertEquals("earth",planet.getName());
        assertEquals(1,planet.getMoons());
    }

    @Test
    void setMoons() {
        Planet planet = new Planet(1000,"earth",1);
        assertEquals(1,planet.getMoons());
        planet.setMoons(2);
        assertEquals(2,planet.getMoons());
    }
    @Test
    void setRadius(){
        Planet planet = new Planet(1000,"earth",1);
        assertEquals(1000,planet.getRadiusSize());
        planet.setRadiusSize(1200);
        assertEquals(1200,planet.getRadiusSize());
    }
    @Test
    void setName(){
        Planet planet = new Planet(1000,"earth",1);
        assertEquals("earth",planet.getName());
        planet.setName("notEarth");
        assertEquals("notEarth",planet.getName());
    }
    @Test
    void setNotPlanet(){
       Moon moon = new Moon(12313,"Moon",true);
        assertTrue(moon.isIsOrbital());
        moon.setIsOrbital(false);
        assertFalse(moon.isIsOrbital());
    }
    @Test
    void setListMoon(){
        Planet planet = new Planet(1000,"earth",1);
        ArrayList<Moon> moonlist = planet.getListMoon();
        planet.setListMoon(moonlist);
        assertEquals(moonlist,planet.getListMoon());
    }

    @Test
    void planetToStringTest(){
        Planet planet = new Planet(1000,"earth",1);
        String expected =  planet.getName() + " is " + planet.getRadiusSize() + " km in radius and has " + planet.getMoons() + " moon(s) called " + planet.getListMoon();
        assertEquals(expected,planet.toString());
    }
    //Excercise 4
    @Test
    void moonRadiusTest(){
        Moon moon = new Moon(100,"moon",true);
        assertAll("Test af moon oprettelse",
                () -> assertEquals(100,moon.getRadiusSize()),
                () -> assertEquals("moon",moon.getName()),
                () -> assertTrue(moon.isIsOrbital())
                );
    }
    // Excercise 5
    @Test
    void amountOfMoons(){
        Planet planet = new Planet(1000,"earth",4);
        assertEquals(4,planet.amountOfMoons());
    }
    // Excercise 6
    /*
    * Jeg indså her, at jeg mangler nogle fields (distance til sol)
    * Jeg har istedet lavet en lappeløsning, der udregner den samlede længde på 2 planeter,
    * da fokus her, er på JUnit, så jeg ville hellere gå videre med den næste JUnit opgave istedet
    * for at starte om
    * */
    @Test
    void calculateDistance(){
        Planet planet1 = new Planet(113,"earth",2);
        Planet planet2 = new Planet(10111,"jupiter",4);
        int value = (113*2) + (10111*2);
        assertEquals(value,planet1.calculateDistance(planet1,planet2));
    }
}