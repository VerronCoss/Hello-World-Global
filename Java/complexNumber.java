class Display{
    Display(int a,int b, int c, int d){
        System.out.println("First Number is: " + a + " + i" + b);
        System.out.println("Second Number is: " + c + " + i" + d);
    }
}

class Addition{
    Addition(int a,int b, int c, int d){
        int sum = a + c;
        int isum = b + d;
        System.out.println("Addition of 2 numbers is: " + sum + " + i" + isum);
    }
}

class Subtraction{
    Subtraction(int a,int b, int c, int d){
        int diff = a - c;
        int idiff = b - d;
        System.out.println("Subtraction of 2 numbers is: " + diff + " + i(" + idiff + ")");
    }
}

class Multiply{
    Multiply(int a,int b, int c, int d){
        int mpl = (a*c) - (b*d);
        int impl = (a*d) + (b*c);
        System.out.println("Multiplication of 2 numbers is: " + mpl + " + i" + impl);
    }
}

class Divide{
    Divide(int a,int b, int c, int d){
        int num = (a*c) + (b*d);
        int inum = (b*c) - (a*d);
        int dem = (c*c) + (d*d);
        System.out.println("Division of 2 numbers is: " + num + " + i" + inum + " / " + dem);
    }
}

public class complexNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Real part of First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter Imaginary part of First Number: ");
        int b = sc.nextInt();
        System.out.println("Enter Real part of Second Number: ");
        int c = sc.nextInt();
        System.out.println("Enter Imaginary part of Second Number: ");
        int d = sc.nextInt();
        System.out.println("Enter: ");
        System.out.println(" \t 1 for Displaying the Complex Numbers");
        System.out.println(" \t 2 for Displaying Addition of 2 Numbers");
        System.out.println(" \t 3 for Displaying Subtraction of 2 Numbers");
        System.out.println(" \t 4 for Displaying Multiplication of 2 Numbers");
        System.out.println(" \t 5 for Displaying Division of 2 Numbers");
        System.out.println(" \t 6 for Exiting");
        int n;

        do{
            System.out.println("Enter Operation Value: ");
            n = sc.nextInt();

            switch(n){
                case 1:
                    Display cmd1 = new Display(a, b, c, d);
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Addition: ");
                    Addition cmd2 = new Addition(a, b, c, d);
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Subtraction: ");
                    Subtraction cmd3 = new Subtraction(a, b, c, d);
                    System.out.println("");
                    break;

                case 4:
                    System.out.println("Multiplication: ");
                    Multiply cmd4 = new Multiply(a, b, c, d);
                    System.out.println("");
                    break;

                case 5:
                    System.out.println("Division: ");
                    Divide cmd5 = new Divide(a, b, c, d);
                    System.out.println("");
                    break;

                case 6:
                    break;

                default:
                    System.out.println("Enter Valid Value");
                    System.out.println("");

            }
        }while(n!=6);

    }
}
