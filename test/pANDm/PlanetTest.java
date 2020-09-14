package pANDm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanetTest {

    @Test
    void getMoons() {
        Planet planet = new Planet(1000.12,"earth",1);
        assertEquals(1000.12,planet.getRadiusSize());
        assertEquals("earth",planet.getName());
        assertEquals(1,planet.getMoons());
    }

    @Test
    void setMoons() {
        Planet planet = new Planet(1000.12,"earth",1);
        assertEquals(1,planet.getMoons());
        planet.setMoons(2);
        assertEquals(2,planet.getMoons());
    }
    @Test
    void setRadius(){
        Planet planet = new Planet(1000.12,"earth",1);
        assertEquals(1000.12,planet.getRadiusSize());
        planet.setRadiusSize(1200.12);
        assertEquals(1200.12,planet.getRadiusSize());
    }
    @Test
    void setName(){
        Planet planet = new Planet(1000.12,"earth",1);
        assertEquals("earth",planet.getName());
        planet.setName("notEarth");
        assertEquals("notEarth",planet.getName());
    }
    @Test
    void planetToStringTest(){
        Planet planet = new Planet(1000.12,"earth",1);
        String expected =  planet.getName() + " is " + planet.getRadiusSize() + " km in radius and has " + planet.getMoons() + " moon(s)";
        assertEquals(expected,planet.toString());
    }
    @Test
    void moonRadiusTest(){
        Moon moon = new Moon(100.12,"moon","earth");
        assertAll("Test af moon oprettelse",
                () -> assertEquals(100.12,moon.getRadiusSize()),
                () -> assertEquals("moon",moon.getName()),
                () -> assertEquals("earth",moon.getOrbitPlanetName()),
                );
    }
}