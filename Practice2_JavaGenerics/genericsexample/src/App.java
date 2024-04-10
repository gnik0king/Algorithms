import org.w3c.dom.Node;

public class App {
    
    //// countStringOccurences method
    private static String countStringOccurences(String[] array, String target){
        int occurences = 0;
        for( int i = 0; i < array.length; i++){
            if(array[i] == target){
                occurences += 1;
            }
        }
        System.out.println(occurences);
        return target;
    }
    //// countIntegerOccurences method
    private static int countIntegerOccurences(Integer[] array, Integer target){
        int occurences = 0;
        for( int i = 0; i < array.length; i++){
            if(array[i] == target){
                occurences += 1;
            }
        }
        System.out.println(occurences);
        return target;
    }

    //// countOccurences method
    private static <T> int countOccurences(T[] array, T target){
        int occurences = 0;
        for( int i = 0; i < array.length; i++){
            if(array[i] == target){
                occurences += 1;
            }
        }
        System.out.println(occurences);
        return (int) target;
    }



    //.. Practice writing a generics class
    //// Node class
    public class Node<T> {
        private Node<T> next;
        private T data;

        public Node(T value){
            this.data = value;
        }



        // Get the data field
        public T getData(){
            return data;
        }

        //Set the data field
        public void setData(T value){
            this.data = value;
        }

        // Get the next node
        public Node<T> getNext(){
            return next;
        }

        // Set the next node
        public void setNext(Node<T> n){
            this.next = n;
        }

    }

    public static void main(String[] args) throws Exception {
        //// System.out.println("Hello, World!");
        
        
        Integer[] intArray = {2, 4, 6, 12, 9, 76, 100, 4, 4, 12};
        String[] stringArray = {"car", "house", "table", "chair", "city", "car", "car", "computer", "house"};

        // Occurences tests
        countIntegerOccurences(intArray, 4);
        countStringOccurences(stringArray, "car");
        countOccurences(intArray, 100);

        // Node tests
        Node<Integer> n1 = new Node<Integer>(5);
        Node<Integer> n2 = new Node<Integer>(20);
        n1.setNext(n2);

        Node<String> m1 = new Node<String>("Step 1");
        Node<String> m2 = new Node<String>("Step 2");
        m1.setNext(m2);
        
        
    }
    

}
