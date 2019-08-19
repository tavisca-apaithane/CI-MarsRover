import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestClass {

    @Test
    public void Test1()
    {
        MarsRoboRover marsRoboRover = new MarsRoboRover();
        String actual = MarsRoboRover.executeCommands(MarsRoboRover.rover, 3,3,"E","MMRMMRMRRM");
        assertEquals("5 1 E", actual);
    }
    @Test
    public void Test2()
    {
        MarsRoboRover marsRoboRover = new MarsRoboRover();
        String actual = MarsRoboRover.executeCommands(MarsRoboRover.rover, 4,3,"E","MMRMMRMRRM");
        assertEquals("6 1 E", actual);
    }
}
