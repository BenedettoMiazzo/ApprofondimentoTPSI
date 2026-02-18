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

    @Test
    public void testSize() {
      Stack<Integer> stack = new Stack<>();
      assertEquals(0, stack.size());
      stack.push(5);
      assertEquals(1, stack.size());
    }

    @Test
    public void testElementAt() {
      Stack<Integer> stack = new Stack<>();
      stack.push(10);
      stack.push(20);
      assertEquals(10, stack.elementAt(0));
      assertEquals(20, stack.elementAt(1));
    }
}