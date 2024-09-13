package secondWeek;

public class binaryExample {
    public static void main(String[] args) {
        // // More binary examples
        // int n = 13;
        // String binaryString = Integer.toBinaryString(n);
        // System.out.println("n in binary format: "+ binaryString);
        
        // int fourthBitFromRight = (n & 0b1000) / 0b1000;
        // int fourthBitFromRight = (n & (1 << 3)) >> 3;

        
        // binaryString = Integer.toBinaryString(fourthBitFromRight);
        // binaryString = Integer.toBinaryString(1 << 3);
        // System.out.println("1 << 3 in integer format: "+ (1 << 3));
        // System.out.println("1 << 3 in binary format: "+ binaryString);

        // binaryString = Integer.toBinaryString(13 >> 3);
        // System.out.println("13 in binary format: "+ Integer.toBinaryString(13));
        // System.out.println("13 >> 3 in binary format: "+ binaryString);
        // System.out.println("13 >> 3 in integer format: "+ (13 >> 3));

        // // Apply & and | to boolean values, no short circuit:

        // int x = 0;

        // if(x != 0 & 1 / x > 1) {
        //     System.out.println("here is true");
        // }

        
        // // String Methods
        // String greeting = "Hello";

        // String sub = greeting.substring(0, 3);
	    // int lenGreeting = greeting.length();
	    // int lenSub = sub.length();
	    // if (greeting.equals(sub)) {
		//     System.out.println("greeting equals to sub: " + greeting);
	    // }

        // // Text block demo
        // String textBlock = """
        //                     Hello
        //                     World
        //                     """;
        // System.out.println(textBlock);

        // // Format print output in Java with printf
        // System.out.printf("%d\n", 16);
        // System.out.printf("%x\n", 16);
        // System.out.printf("%o\n", 16);
        // System.out.printf("%e\n", 16.0); 
        // System.out.printf("%c\n", 65);
        // System.out.printf("%b\n", 0==1); 

        // // Java Scope Class  
        // int x = 10; 
        // { 
        //     int y = 20; 
        //     System.out.println(x); // Output: 10 
        //     System.out.println(y); // Output: 20 
        // } //
        //     System.out.println(y); // Compilation Error
        
        // Switch fallthrough cases
        String program = "undergrad"; 

        //// Improved synatax with -> support no fallthrough
        // switch (program) {  // case sensitive
        //     case "undergrad" ->
        //             System.out.println("U");
        //     case "ms", "phd"->
        //             System.out.println("G");
        //     default ->
        //             System.out.println("high school?");
        // }

        // // traditional syntax needs to use break keyworkds to prevent fall throughs
        switch (program) {
            case "undergrad":
                System.out.println("U");
                break;
            case "ms", "phd":
                System.out.println("G");
                break;
            default:
                System.out.println("high school?");
        }
    }
}
