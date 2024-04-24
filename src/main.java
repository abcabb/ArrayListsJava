import java.util.Arrays;

public class main {

    record GroceryList(String name, String type, int count){
        public GroceryList(String name){
            this(name, "DAIRY", 1);
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


    }
}
