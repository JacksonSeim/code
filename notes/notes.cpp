//Starter code for a C++ file
#include<iostream> 
#include<string>
using namespace std;

int main() {
    /*                                                                                                      BASICS OF C++
    cout << "Hello World";//prints Hello World
    cout  << "\n";//starts new line
    
    //different variable types are int, double, char, string, and bool, float
    int num = 0;
    double decimal = .46;
    char letter = 'J';
    string text = "Jackson";
    bool lmoa = true; //when printed it prints 1 or 0
    
    cout << num << "\n";
    cout << decimal << "\n";
    cout << letter << "\n";     // << works like the + operator in other programming languages
    cout << text << "\n";
    cout << lmoa << "\n";

    
    num += 1;
    cout << num << "\n";
    int num1 = 1; 
    int numSum = num + num1;//syntax for adding numbers/variables together
    cout << numSum;
    

    
    int x = 1, y = 2, z = 3; //syntax for intilizing multiple variables
    cout << x + y + z; //outputs 6
    
    int a,b,c;
    a = b = c = 1;

    const double PI = 3.14159;
    //PI = 5.5; gives error because you tried to change a const
    */
   
   /*                                                                       USER INPUT
   int x = 0;
   cout << "Type a number: ";
   cin >> x; //takes user input notice the >> operator
   cout << "Your number is: " << x;
   */

   //                                                                   OPERATORS
   //operators +, -, *, /, %, ++, -- all work
   // =, +=, -=, *=, /=, %= all work
   //==, !=, >, <, >=, <= all work
   // &&, ||, ! all work

   /*                                                                     STRINGS
    string firstName = "John ";
    string lastName = "Doe";
    string fullName = firstName + " " + lastName;
    fullName = firstName.append(lastName);//outputs the same thing as above(without the space)
    cout << fullName;

    cout << fullName.length();//gives length of string
    cout << fullName.size();//does the same thing as .length()

    cout << firstName[0];//outputs J

    firstName[0] = 'H';//firstName now = Hohn

    // \', \", \\, \n, \t all work


    cin >> fullName; //if "John Doe" is inputed then only "John" is saved
    getline (cin, fullName); //if "John Doe" is inputed the "John Doe" is saved
    */

   //                                                                                                   MATH





    return 0;
}
