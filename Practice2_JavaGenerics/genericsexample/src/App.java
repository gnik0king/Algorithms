import org.w3c.dom.Node;

public class App {
    
    //// countStringOccurences method
    private static int countStringOccurences(String[] array, String target){
        int occurences = 0;
        /*for( int i = 0; i < array.length; i++){
            if(array[i] == target){
                occurences += 1;
            }
        }*/
        for(String t : array){
            if(t.equals(target)){
                occurences++;
            }
        }
        return occurences;
    }
    //// countIntegerOccurences method
    private static int countIntegerOccurences(Integer[] array, Integer target){
        int occurences = 0;
        /*for( int i = 0; i < array.length; i++){
            if(array[i] == target){
                occurences += 1;
            }
        }*/
        for(Integer t : array){
            if(t.equals(target)){
                occurences++;
            }
        }
        return occurences;
    }

    //// countOccurences method
    private static <T> int countOccurences(T[] array, T target){
        int occurences = 0;
        /*for( int i = 0; i < array.length; i++){
            if(array[i] == target){
                occurences += 1;
            }
        }*/
        for(T t : array){
            if(t.equals(target)){
                occurences++;
            }
        }
        return occurences;
    }





    public static void main(String[] args) throws Exception {
        //// System.out.println("Hello, World!");
        
        
        Integer[] intArray = {2, 4, 6, 12, 9, 76, 100, 4, 4, 12};
        String[] stringArray = {"car", "house", "table", "chair", "city", "car", "car", "computer", "house"};

        // Occurences tests
        int count1 = countIntegerOccurences(intArray, 4);
        System.out.println("Count 1: " + count1);

        int count2 = countStringOccurences(stringArray, "car");
        System.out.println("Count 2: " + count2);
        
        int count3 = countOccurences(intArray, 100);
        int count4 = countOccurences(stringArray, "house");
        System.out.println("Count 3: " + count3);
        System.out.println("Count 4: " + count4);

        
        
        
        // Node tests
        Node<Integer> n1 = new Node<Integer>(5);
        Node<Integer> n2 = new Node<Integer>(20);
        n1.setNext(n2);

        Node<String> m1 = new Node<String>("Step 1");
        Node<String> m2 = new Node<String>("Step 2");
        m1.setNext(m2);
        
        
    }
    

}
