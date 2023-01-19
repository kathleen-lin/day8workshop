package day8revision;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        ArraySortExample ase = new ArraySortExample();
        ase.arraysort();

        ase.sortint();
        
        CollectionSortExample cse = new CollectionSortExample();
        cse.collectionsort();
        cse.example02();


    }
}
