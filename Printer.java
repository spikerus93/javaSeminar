public class Printer {
/*  public static void main(String[] args) { 
        int n = 0;
        if (args.length == 0) {
            n = 3;
        }
        else {
            n = Integer.parseInt(args[0]);
        }     
        Answer ans = new Answer(); 
        int itresume_res = ans.countNTriangle(n);     
        System.out.println(itresume_res);
    }*/
/*  public static void main(String[] args) {    
        Answer ans = new Answer();
        ans.printPrimeNums();
    }*/
    public static void main(String[] args) { 
        int a = 0;
        char op = ' ';
        int b = 0;
        if (args.length == 0) {
            a = 3;
            op = '+';
            b = 7;
        }
        else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }
        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);
    }
}
