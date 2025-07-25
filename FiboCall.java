class Fibonacci {
    public void printFibonacciSeries(int n) {
        int a = 0, b = 1, c;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}

class FiboCall {
    public static void main(String args[]) {
        int n = Integer.parseInt(args[0]);
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.printFibonacciSeries(n);
    }
}
