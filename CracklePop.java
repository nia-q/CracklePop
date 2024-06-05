


/**
 * //Write a program that prints out the numbers 1 to 100 (inclusive).
 * If the number is divisible by 3, print Crackle instead of the number.
 * If it's divisible by 5, print Pop. If it's divisible by both 3 and 5, print CracklePop.
 */
public class CracklePop
{
    //default constructor
    public CracklePop() {

    }


    //
    public static void print() {
        int i =1;

        while (i < 101) {

            if (i % 3 == 0 && i%5==0) {
                System.out.println("CracklePop");
                i++;
            }

            else if (i % 3==0) {
                System.out.println("Crackle");
                i++;
            }
            else if (i % 5==0 ) {
                System.out.println("Pop");
                i++;
            }
            else
            {
                System.out.println(i);
                i++;
            }


        }

    }

    public static void main(String[] args) {
        CracklePop.print();
    }
}



