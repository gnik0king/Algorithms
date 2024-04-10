
public class App {
    public static void main(String[] args) throws Exception {

        Integer[] intArray = {2, 4, 6, 12, 9, 76, 100, 4, 4, 12};
        String[] stringArray = {"car", "house", "table", "chair", "city", "car", "car", "computer", "house"};
        
        
        int count1 = countIntegerOccurences(intArray, 4);
        System.out.println("count1 = " + count1);

        int count2 = countStringOccurences(stringArray, "Bellevue");
        System.out.println("count2 = " + count2);

        // Now using a method with Generics
        System.out.println("Using a method that employs Generics:");

        int count3 = countOccurences(intArray, 12);
        int count4 = countOccurences(stringArray, "house");
        System.out.println("count3 = " + count3);
        System.out.println("count4 = " + count4);

        Node<Integer> n1 = new Node<Integer>(5);
        Node<Integer> n2 = new Node<Integer>(20);
        n1.setNext(n2);

        Node<String> m1 = new Node<String>("Step 1");
        Node<String> m2 = new Node<String>("Step 2");
        m1.setNext(m2);


    }

    private static <T> int countOccurences(T[] array, T target) {
        int count = 0;
        for (T t : array) {
            if(t.equals(target)) {
                count++;
            }
        }

        return count;
    }

    private static int countStringOccurences(String[] array, String target) {
        int count = 0;
        for (String t : array) {
            if(t.equals(target)) {
                count++;
            }
        }

        return count;
    }

    private static int countIntegerOccurences(Integer[] array, Integer target) {
        int count = 0;
        for (Integer t : array) {
            if(t.equals(target)) {
                count++;
            }
        }

        return count;
    }
}
