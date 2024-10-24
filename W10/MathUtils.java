package W10;

public class MathUtils{
    //-------------------------------------------------------------
    // Returns the factorial of the argument given
    //-------------------------------------------------------------
public static int factorial(int n){
    if (n < 0) 
        throw new IllegalArgumentException("cannot count negative : " + n); 
    if (n >= 17)
        throw new IllegalArgumentException("cannot count more than 16 : " + n); 
    int fac = 1;
    for (int i=n; i>0; i--)
        fac *= i;
    return fac;
    }
}