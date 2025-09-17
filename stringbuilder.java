public class stringbuilder {
    public static void main(String[] args) {
        

        //char at index 0
        // System.out.println(sb.charAt(0));
        // //set char at index
        // sb.setCharAt(0, 'R');
        // System.out.println(sb);
        // //insert
        // sb.insert(0, 'K');
        // System.out.println(sb);

        // //delete
        // sb.delete(0, 1);
        // System.out.println(sb);

        //append
        // sb.append("r");
        // sb.append("o");
        // System.out.println(sb);

        //q1
        StringBuilder sb = new StringBuilder("Hello");
        for(int i = 0;i<sb.length()/2;i++){
            int front = i;
            int end = sb.length() - 1 - i;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(end);
            sb.setCharAt(front, backChar);
            sb.setCharAt(end, frontChar);
        }
        System.out.println(sb);
    }
    
}
