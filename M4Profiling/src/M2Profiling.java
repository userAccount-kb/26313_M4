import java.util.*;

/**
 * Calls 3 methods that will add 2 million random integers into an
 * ArrayList, LinkedList, and Hashtable respectively which then are deleted.
 */
public class M2Profiling {
    public static void main(String[] args) throws Exception {
        /*Call a new method which adds 2,000,000 random integers into an ArrayList, then 
        deletes each one from the ArrayList*/
        randArrayList();

        /*Call a new method which adds 2,000,000 random integers into a LinkedList, 
        then deletes each one from the LinkedList*/
        randLinkedList();

        /*Call a new method which adds 2,000,000 random integers into a Hashtable, then 
        deletes each one from the Hashtable*/
        randHastable();
    }

    /**
     * Creates, confirms, and then erases 2 million integers from an ArrayList.
     */
    public static void randArrayList() {
        System.out.println("Beginning the ArrayList method");

        //add 2M random int to an ArrayList
        int randNum;
        ArrayList<Integer> randArray = new ArrayList<>();

        for (int i = 0; i < 2000000; i++) {
            randNum = (int)Math.random();
            randArray.add(randNum);
        }

        //confirm number of ints
        System.out.println("There are " + randArray.size() + " in this ArrayList");

        //delete 2M int from ArrayList + confirm deletion
        randArray.clear();
        System.out.println("Hastable is clear: " + randArray.isEmpty());
    }

    /**
     * Creates, confirms, and then erases 2 million integers from a LinkedList.
     */
    public static void randLinkedList() {
        System.out.println("\nBeginning the LinkedList method");

        //add 2M random int to an LinkedList
        int randNum;
        LinkedList<Integer> randList = new LinkedList<>();

        for (int i = 0; i < 2000000; i++) {
            randNum = (int)Math.random();
            randList.add(randNum);
        }

        //confirm number of ints
        System.out.println("There are " + randList.size() + " in this LinkedList");

        //delete 2M int from LinkedList + confirm deletion
        randList.clear();
        System.out.println("Hastable is clear: " + randList.isEmpty());
    }

    /**
     * Creates, confirms, and then erases 2 million integers from a Hashtable.
     */
    public static void randHastable() {
        System.out.println("\nBeginning the Hashtable method");

        //add 2M random int to an Hastable
        int randNum;
        Hashtable<Integer, Integer> randHashtable = new Hashtable<>();

        for (int i = 0; i < 2000000; i++) {
            randNum = (int)Math.random();
            randHashtable.put(i, randNum);
        }

        //confirm number of ints
        System.out.println("There are " + randHashtable.size() + " in this Hashtable");

        //delete 2M int from Hastable + confirm deletion
        randHashtable.clear();
        System.out.println("Hastable is clear: " + randHashtable.isEmpty());
    }
}
