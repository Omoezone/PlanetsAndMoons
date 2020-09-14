package pANDm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        Planet p = new Planet(10000.12,"Earth",1);
        assertAll("Testing af object oprettelse",
                () -> assertEquals(10000.12,p.getRadiusSize()),
                () -> assertEquals("Earth",p.getName()),
                () -> assertEquals(1,p.getMoons())
        );
    }
}