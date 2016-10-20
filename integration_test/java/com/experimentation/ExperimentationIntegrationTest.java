import org.junit.Test;
import static org.junit.Assert.assertFalse;

public class ExperimentationIntegrationTest {
  @Test
  public void unittest() {
    assertFalse(new Experimentation().integrationTestable());
  }
}
