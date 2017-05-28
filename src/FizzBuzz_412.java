/*
 * Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output ��Fizz�� instead of the number and for the multiples of five output ��Buzz��. For numbers which are multiples of both three and five output ��FizzBuzz��.

Example:

n = 15,

Return:
[
    "1",
    "2",
    "Fizz",
    "4",
    "Buzz",
    "Fizz",
    "7",
    "8",
    "Fizz",
    "Buzz",
    "11",
    "Fizz",
    "13",
    "14",
    "FizzBuzz"
]

 */
public class FizzBuzz_412 {
  public List<String> fizzBuzz(int n) {
    ArrayList<String> result = new ArrayList<String>();
    
    for(int i=1; i<=n; i++)
    {
        if(i%3 == 0)
        {
            if(i%5 == 0)
                result.add("FizzBuzz");
            else
                result.add("Fizz");
        }
        else if(i%5 == 0)
            result.add("Buzz");
        else
        {
            Integer num = i;
            result.add(num.toString());
        }
    }
    
    return result;
}
}
