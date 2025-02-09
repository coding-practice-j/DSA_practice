import java.lang.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Queue<String> output= new ArrayDeque<>();
        for(int i=0; i<Integer.valueOf(input); i++){
        	String names = sc.nextLine();
            String []inp = names.split(" ");
            String x = inp[0];
            String y = inp[1];
            if(Integer.valueOf(x) == 1){
                output.offer(y);
                System.out.println("added");
            }else if(Integer.valueOf(x) == 2){
                try{
                    output.offer(output.element());
                    System.out.println("added last");
                }catch(Exception e){
                    output.offer("-1");
                    System.out.println("added -1");
                }
            }else if(Integer.valueOf(x) == 3){
                String temp = output.peek();
                System.out.println("removed");
                if(temp != null){
                	System.out.println("removed!");
                    output.poll();
                }
            }
        }
        
        output.stream().forEach(s -> System.out.println(s));       
        
    }
}