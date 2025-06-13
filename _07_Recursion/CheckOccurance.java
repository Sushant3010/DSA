
public class CheckOccurance {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str, int index, char element){
        if(index == str.length()){
            System.out.println("First Occurrence: " + first);
            System.out.println("Last Occurrence: " + last);
            return;
        }
        char currChar = str.charAt(index);
        if(currChar == element){
            if(first == -1){
                first = index; // First occurrence
            }
            last = index; 
        }
            findOccurance(str, index+1, element);
    
        }
        public static void main(String[] args) {
            String str = "abaaachddhlkjl";
            char element = 'a';
            findOccurance(str, 0, element);
        }
    }
    