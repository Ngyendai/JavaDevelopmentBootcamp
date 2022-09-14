package arraylist;

import java.util.ArrayList;

public class ResizableArrays {

  public static void main(String[] args) {
    ArrayList<String> name = new ArrayList<String>();
    name.add("Dong");
    name.add("Nguyen");
    name.add("Dai");
    name.size();
    for (int i = 0; i < name.size(); i++) {
      System.out.println(name.get(i));
    }
    name.set(0, "D");
    name.add(3, "Bien");
    name.remove(2);
    name.clear();
  }
}
