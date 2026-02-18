package progetto;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StackTest {
    @Test
    public void testNewStackIsEmpty() {
      Stack<Integer> stack = new Stack<>();
      assertTrue(stack.isEmpty());
    }

    @Test
    public void testPushMakesStackNonEmpty() {
      Stack<Integer> stack = new Stack<>();
      stack.push(10);
      assertFalse(stack.isEmpty());
    }

    @Test
    public void testPushThenPop() {
      Stack<String> stack = new Stack<>();
      stack.push("hello");
      String item = stack.pop();
      assertEquals("hello", item);
      assertTrue(stack.isEmpty());
    }

    @Test
    public void testPeek() {
      Stack<Integer> stack = new Stack<>();
      assertEquals(null,stack.peek());
      stack.push(10);
      assertEquals(10,stack.peek());
    }
}