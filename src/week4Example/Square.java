package week4Example;

class Square extends Shape {
    private double side;

    // More information about the difference between THROWs and TRY-CATCH
    // If you only throws an exception (like in the example below, which throws exception, 
    // advertise it in the method head) the program will terminate when an exception happe
    // but still provide a valid message
    public Square(double side) throws InvalidShapeException {
        super("Square");
 
            if(side <= 0){
                throw new InvalidShapeException("Side length cannot be 0 or a negative number.");
            }
            this.side = side;

    }

    // Here is the try-catch version
    //  public Square(double side)  {
    //      super("Square");
    //         try {
    //             if(side <= 0){
    //                 throw new InvalidShapeException("Side length cannot be 0 or a negative number.");
    //             }
    //         this.side = side;

    //         }
    //         catch(InvalidShapeException e){
    //             System.out.println(e.getMessage());
    //              this.side = 1;
    //         }
 
    //         

    // }

    @Override
    public double area() {
        return side * side;
    }

    public double getSide(){
        return this.side;
    }

    // A throwed exception from new Square(-4) will be propagated to main method here
    // can either progogate up (adding throws to method head) or handled by some catch blocks here in the main
    
    // public static void main(String[] args) throws InvalidShapeException {
    //     Square square = new Square(-4);
    //     System.out.println(square.getSide());
    // }
    
    // an alternative to catch the exception and handle it more gracefully - so the exception won't terminate the program
    public static void main(String[] args) {
        try {
            Square square = new Square(-4);
            System.out.println(square.getSide());
        }
        catch(InvalidShapeException e){
            System.out.println(e.getMessage());
        }
    }

}




