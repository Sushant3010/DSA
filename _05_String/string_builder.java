public class string_builder {
     public static void main(String[] args) {
         StringBuilder sb = new StringBuilder("h");
        

         //char at index 0
         //System.out.println(sb.charAt(0));

         //set char at index 0
        // sb.setCharAt(0, 'T');
         //System.out.println(sb);

         //insert char at any index
        // sb.insert(0,'S');
         //System.out.println(sb);

         sb.append("e");
         sb.append("l");
         sb.append("l");
         sb.append("o");
         System.out.println(sb);


     }
}
