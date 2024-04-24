import java.util.ArrayList;
import java.util.Arrays;

public class main {

    record GroceryList(String name, String type, int count){
        public GroceryList(String name){
            this(name, "DAIRY", 1);
        }

        @Override
        public String toString(){
            return String.format("%d %s in %s", count, name, type);
        }
    }

    public static void main(String[] args) {
        Object[] objectList = new Object[3];
        objectList[0] = new GroceryList("Milk");
        objectList[1] = new GroceryList("Bread", "Bakery", 3);
        objectList[2] = "5 oranges";
        System.out.println(Arrays.toString(objectList));

        // But thats not what we want.

        GroceryList[] groceryList1 = new GroceryList[3];
        groceryList1[0] = new GroceryList("Milk");
        groceryList1[1] = new GroceryList("Bread", "Bakery", 3);
        groceryList1[2] = new GroceryList("Water");
        System.out.println(Arrays.toString(groceryList1));

        ArrayList objectList2 = new ArrayList(); // this is a raw usage of the class which uses List Interface. And it counts the list elements as Object instances.
        objectList2.add(new GroceryList("Pineapple", "Grocery", 1));
        objectList2.add(new GroceryList("Steak", "Meat", 2));
        objectList2.add(0, "2 Waters");
        System.out.println(objectList2);

        ArrayList<GroceryList> groceryList2 = new ArrayList<>();
        groceryList2.add(new GroceryList("Water"));
        groceryList2.add(0, new GroceryList("Cucumber", "Salad", 1));
        groceryList2.set(1, new GroceryList("Beef", "Steak", 1));
        groceryList2.toString(); // Its equal to write sysout(groceryList2) because you overrided toString method in record which sysout used to show the output.

    }
}
