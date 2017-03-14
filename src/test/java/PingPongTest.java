import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class PingPongTest {

  @Test
  public void runPingPong_countUpToOne_ArrayList() {
    PingPong testPingPong = new PingPong();
    List<Object> expectedOutput = new ArrayList<Object>();
    expectedOutput.add(1);
    assertEquals(expectedOutput, testPingPong.runPingPong(1));
  }
}
