public class FizzBuzz {
    public String fizzBuzz(int num) {
        //fizzbuzz logic here
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 ==0) {      //multiples of 3 & 5
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {            //multiples of 3
                System.out.println("Fizz");
            } else if (i % 5 == 0) {               //multiples of 5
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
            System.out.print(" ");
        }
        return "Results!";
    }
    
}
