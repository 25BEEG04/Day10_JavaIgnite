1)Explain Java Exception hierarchy:

Throwable
Exception-a type of error where the system will crash 
Error- a mistake which will not allow the code to run

Give one example for each.
exception-InputMismatchException
error-missig ';' symbol
2)Can we have multiple catch blocks? Yes
Explain with example when it is useful.
Yes multiple catch blocks can be used, when a program can have multiple type of errors or exceptions in it.
Such as in case of a single program involving cases of 
( int result= 10/0 ) OR (Array index being out of range) used in a single problem then after one try block there can be multiple catch blocks of "ArithmeticException" and a "ArrayIndexOutOfBoundsException" too.
Its useful specific error resolution, separating critical and minor errors and also knowing the order in which the exception comes.

3)A program crashes when user enters text instead of number.

What exception occurs?
InputMismatchException
How will you handle it?
using try-catch
Where should try-catch be placed?
in try- input statement
in catch- handling part


4)try {
    int a = 10 / 0;
    
    System.out.println("Hello");

}

catch(Exception e) {

    System.out.println("Error handled");

}

System.out.println("End");

Predict the output - 
Error handled
hello

What prints first?
Error handled

Does program stop?
No




