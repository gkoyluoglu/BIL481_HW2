import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
    Util c;

  @Before
  public void setUp() { c = new Util(); }
  @Test
  public void lengthOne() {
      assertFalse(c.compute(1));
  }
  @Test
  public void isEven() {
      assertFalse(c.compute(1, 2));
      assertFalse(c.compute(1, 2, 3, 4));
      assertFalse(c.compute(1, 23, 4, 5, 6, 5));
      assertFalse(c.compute(1, 2, 4, 3, 5, 6, 7, 8));
  }
  @Test(expected=RuntimeException.class)
  public void testException() {
      c.compute(0, 1, 23, 4654, 15);
  }
  @Test
  public void check() {
      assertTrue(c.compute(2, 3, 4, 5, 6, 7, 8));
      assertFalse(c.compute(2, 5));
  }
    @Test
    public void isFalse() {
        assertFalse(c.compute());
        assertFalse(c.compute());
    }
}