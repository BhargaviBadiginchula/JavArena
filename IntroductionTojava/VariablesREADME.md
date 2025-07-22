## Definition
  *A variable is a named memory location used to store data that can be modified during program execution.*

 
## Declaration
*This is when we specify the data type and the variable name.*

ex: int a ;
Here datatype is integer and a is variable name.

### Assignment 
*This is the process of assigning a value to the variable;*


#### Initialization
It is the process of declaration+assignment;
It is important to initialize the local varible. Only declaration is not possible ;

###### Redeclaration 
It is the process of re-declaring the the same named variable which is not possible in same scope but possible in different scope.for example two variables in same class cannot have same name, but it is possible to declare them in different method scope or classes.

###### ReAssignment:
It is the process of updating / modifying the value of variable.


 *** Variables are classified as Global and Local Variables based where they are declared.

Global Variables:- 1.Static variables(Class ) & 2.Nonstatic(Instance) variables

Local variables:- 3.Parameter variables & 4.local variables.

  1.Static variables:declared using static keyword,inside a class outside a method ,accessed using class name anywhere in the class.

  2.Instance Variable: Declared inside a class and outside a method these are accessed using instances(objects).

  3.Parameter Variable these are declared in the method definition these are accessible within in the method itself.Values are passed as arguments from method calls.

  4.Local Variables:- These are declared inside a method accessible with in method. Every varibles must be initialized inside a method.