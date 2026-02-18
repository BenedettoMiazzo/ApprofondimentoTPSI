package progetto;

import java.util.ArrayList;

public class Stack<E> {
  private ArrayList<E> data;

    public Stack() {
        data = new ArrayList<>();
    }

    public void push(E element) {
        data.add(element);
    }

      public boolean isEmpty() {
      return data.isEmpty();
    }
  
}
