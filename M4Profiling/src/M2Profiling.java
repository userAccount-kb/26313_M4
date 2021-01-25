import java.util.*;

public class M2Profiling {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        /*Call a new method which adds 2,000,000 random integers into an ArrayList, then 
        deletes each one from the ArrayList*/
        System.out.println("Beginning the ArrayList method");
        randArrayList();

        /*Call a new method which adds 2,000,000 random integers into a LinkedList, 
        then deletes each one from the LinkedList*/
        System.out.println("Beginning the LinkedList method");
        randLinkedList();

        /*Call a new method which adds 2,000,000 random integers into a Hashtable, then 
        deletes each one from the Hashtable*/
        System.out.println("Beginning the Hashtable method");
        randHastable();
    }

    public static void randArrayList() {
        //add 2M random int to an ArrayList
        int randNum;
        ArrayList<Integer> randArray = new ArrayList<>();

        for (int i = 0; i <= 2000000; i++) {
            randNum = (int)Math.random();
            randArray.add(randNum);
        }

        //confirm number of ints
        System.out.println("There are " + randArray.size() + " in this ArrayList");

        //delete 2M int from ArrayList + confirm deletion
        randArray.clear();
        System.out.println("Hastable is clear: " + randArray.isEmpty());
    }

    public static void randLinkedList() {
        //add 2M random int to an LinkedList
        int randNum;
        LinkedList<Integer> randList = new LinkedList<>();

        for (int i = 0; i <= 2000000; i++) {
            randNum = (int)Math.random();
            randList.add(randNum);
        }

        //confirm number of ints
        System.out.println("There are " + randList.size() + " in this LinkedList");

        //delete 2M int from LinkedList + confirm deletion
        randList.clear();
        System.out.println("Hastable is clear: " + randList.isEmpty());
    }

    public static void randHastable() {
        //add 2M random int to an Hastable
        int randNum;
        Hashtable<Integer, Integer> randHashtable = new Hashtable<>();

        for (int i = 0; i <= 2000000; i++) {
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
