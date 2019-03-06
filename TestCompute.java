import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestCompute {
  Compute c;

  @Test
  public void checkSizeZero() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    when(mq.size()).thenReturn(0);
    assertEquals(c.countNumberOfOccurrences("11654") , -1);
  }
  @Test
  public void checkContains() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    when(mq.contains("asdas")).thenReturn(false);
    when(mq.size()).thenReturn(2);
    assertTrue(c.countNumberOfOccurrences("asdas") == 0);
  }
  @Test
  public void check(){
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    when(mq.size()).thenReturn(3);
    when(mq.contains("abc")).thenReturn(true);
    when(mq.getAt(0)).thenReturn("abc");
    when(mq.getAt(1)).thenReturn("abc");
    when(mq.getAt(2)).thenReturn("abc");
    assertTrue(c.countNumberOfOccurrences("abc") == 3);
  }

}