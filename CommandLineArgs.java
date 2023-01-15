public class CommandLineArgs {
    public static void main(String[] args) {
        // String name = args[0];
        // System.out.println("Hello "+ name);

        // String fname = args[0];
        // String lname = args[1];
        // String fullName = fname + " " + lname;
        // System.out.println("Hello " + fullName);

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[2]);
        int z = 0;
        // int z = x + y;
        // System.out.println("Sum is " + z);
        String opr = args[1];
        if(opr.equals("+")) {
            z = x + y;
        }
        else if(opr.equals("-")) {
            z = x - y;
        }
        System.out.println("Result is " + z);
    }
}
