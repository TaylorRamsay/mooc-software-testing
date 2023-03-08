package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MirrorTest {

    private Mirror mirror;

    @BeforeEach
    public void initialize() {this.mirror = new Mirror();}

    @Test
    public void OddNumWord_Mirror() {
        String result = mirror.mirrorEnds("racecar");
        Assertions.assertEquals("racecar", result);
    }

    @Test
    public void OddNumWord_NoMirror() {
        String result = mirror.mirrorEnds("careful");
        Assertions.assertEquals("", result);
    }

    @Test
    public void OddNumWord_PartialMirror() {
        String result = mirror.mirrorEnds("racefar");
        Assertions.assertEquals("ra", result);
    }

    @Test
    public void EvenNumWord_Mirror() {
        String result = mirror.mirrorEnds("adfvvfda");
        Assertions.assertEquals("adfv", result);
    }

    @Test
    public void EvenNumWord_NoMirror() {
        String result = mirror.mirrorEnds("abdfecfe");
        Assertions.assertEquals("", result);
    }

    @Test
    public void EvenNumWord_PartialMirror() {
        String result = mirror.mirrorEnds("adfdcfda");
        Assertions.assertEquals("adf", result);
    }
}
