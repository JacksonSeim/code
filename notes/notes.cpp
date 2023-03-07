//Starter code for a C++ file
#include<iostream> 
#include<string>
#include<cmath>
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

   /*                                                                                               MATH
    cout << max(5, 10); //finds the max of x and y, prints out 10
    cout << min(5, 10); //finds the min of x and y, prints out 5

    //#include<cmath> gives functions sqrt(x), round (y), and log(x) *natural log*
    //as well as many more including the trig functions
    */

   /*                                                                                    IF ELSE STATEMENTS/SWITCH
    int x = 1;
    int y = 2;
    if (x < y){
        cout << y << "\n";
    }
    else if (x == y){
        cout << 0 << "\n";
    }
    else {
        cout << x << "\n";
    }

    int t = 20;
    int result = (t < 18) ? 10 : 5; //prints 5, syntax is (condition) ? if condition true it does this : if false it does this;
    cout << result;

    switch (x) {
        case 0: //if x == 0:
            cout<<"your mom";
            break;
        case 1: //if x == 1:
            cout<<"your dad";
            break;
        default: //runs this if there is no case match
            "your sister";
    }
    */

   /*                                                                                       LOOPS
   int input;
   cin >> input;
   while (input != -1){
    cin >> input;
    cout << input << "input: \n";
   }
   int i = 0;
   while (i < 5){
    cout << i << "\n";
    i++;
   }

   for (int i = 0; i < 5; i++){
    cout << i << "\n";
   }

   int myNumbers[5] = {10, 20, 30, 40, 50};
   for (int i: myNumbers){
    cout << i << "\n";
   }

   // break; and continue; work like always
   */

  /*                                                                                      ARRAYS
  int num[10];
  int sum[2] = {1, 2};// just int sum[] = {1,2}; also works
  
  cout << sum[1];//prints 2;
  num[0] = 0; //num[0] now equals 0
  
  int size = sizeof(num);//returns 40 because sizeof gives the size in bytes 4 bytes X 10 elements = 40
  size = sizeof(num)/sizeof(int);//returns 10

    int nums[3][3];
    int nums1[3][3] = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    */

   //                                                                                           FUNCTIONS
   //CLASSES/OBJECTS
   //FILES












    return 0;
}
