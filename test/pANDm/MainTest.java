package pANDm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        Planet p = new Planet(10000,"Earth",3);
        assertAll("Testing af object oprettelse",
                () -> assertEquals(10000,p.getRadiusSize()),
                () -> assertEquals("Earth",p.getName()),
                () -> assertEquals(3,p.getMoons())
        );
    }
}