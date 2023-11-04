using System;

public class SpecificExceptions
{
	public SpecificExceptions()
	{
        //int productCount = 2000;
        //string[,] products = new string[productCount, 2];

        //LoadProducts(products, productCount);

        //for (int i = 0; i < productCount; i++)
        //{
        //    string result;
        //    result = Process1(products, i);

        //    if (result != "obsolete")
        //    {
        //        result = Process2(products, i);
        //    }
        //}

        //bool pauseCode = true;
        //while (pauseCode == true) ;

        //static void LoadProducts(string[,] products, int productCount)
        //{
        //    Random rand = new Random();

        //    for (int i = 0; i < productCount; i++)
        //    {
        //        int num1 = rand.Next(1, 10000) + 10000;
        //        int num2 = rand.Next(1, 101);

        //        string prodID = num1.ToString();

        //        if (num2 < 91)
        //        {
        //            products[i, 1] = "existing";
        //        }
        //        else if (num2 == 91)
        //        {
        //            products[i, 1] = "new";
        //            prodID = prodID + "-n";
        //        }
        //        else
        //        {
        //            products[i, 1] = "obsolete";
        //            prodID = prodID + "-0";
        //        }

        //        products[i, 0] = prodID;
        //    }
        //}

        //static string Process1(string[,] products, int item)
        //{
        //    Console.WriteLine($"Process1 message - working on {products[item, 1]} product");

        //    return products[item, 1];
        //}

        //static string Process2(string[,] products, int item)
        //{
        //    Console.WriteLine($"Process2 message - working on product ID #: {products[item, 0]}");
        //    if (products[item, 1] == "new")
        //        Process3(products, item);

        //    return "continue";
        //}

        //static void Process3(string[,] products, int item)
        //{
        //    Console.WriteLine($"Process3 message - processing product information for 'new' product");
        //}



        //string? readresult;
        //int startindex = 0;
        //bool goodentry = false;

        //int[] numbers = { 1, 2, 3, 4, 5 };

        //// display the array to the console.
        //console.clear();
        //console.write("\n\rthe 'numbers' array contains: { ");
        //foreach (int number in numbers)
        //{
        //    console.write($"{number} ");
        //}

        //// to calculate a sum of array elements, 
        ////  prompt the user for the starting element number.
        //console.writeline($"}}\n\r\n\rto sum values 'n' through 5, enter a value for 'n':");
        //while (goodentry == false)
        //{
        //    readresult = console.readline();
        //    goodentry = int.tryparse(readresult, out startindex);

        //    if (startindex > 5)
        //    {
        //        goodentry = false;
        //        console.writeline("\n\renter an integer value between 1 and 5");
        //    }
        //}

        //// display the sum and then pause.
        //console.writeline($"\n\rthe sum of numbers {startindex} through {numbers.length} is: {sumvalues(numbers, startindex - 1)}");

        //console.writeline("press enter to exit");
        //readresult = console.readline();

        //// this method returns the sum of elements n through 5
        //static int sumvalues(int[] numbers, int n)
        //{
        //    int sum = 0;
        //    for (int i = n; i < numbers.length; i++)
        //    {
        //        sum += numbers[i];
        //    }
        //    return sum;
        //}


        //using System.Numerics;

        //bool exit = false;
        //var rand = new Random();
        //int num1 = 5;
        //int num2 = 5;

        //do
        //{
        //    num1 = rand.Next(1, 11);
        //    num2 = num1 + rand.Next(1, 51);

        //} while (exit == false);



        // Exercise - Complete a challenge activity using the debugger

        /*  
        This code instantiates a value and then calls the ChangeValue method
        to update the value. The code then prints the updated value to the console.
        */
        int x = 5;

        x = ChangeValue(x);
        Console.WriteLine(x);

        int ChangeValue(int value)
        {
            value = 10;
            return value;
        }
    }
}






//ArrayTypeMismatchException
//string[] names = { "Dog", "Cat", "Fish" };
//Object[] objs = (Object[])names;

//Object obj = (Object)13;
//objs[2] = obj; // ArrayTypeMismatchException occurs


//int number1 = 3000;
//int number2 = 0;
//Console.WriteLine(number1 / number2); // DivideByZeroException occurs


//int valueEntered;
//string userValue = "two";
//valueEntered = int.Parse(userValue); // FormatException occurs


//object obj = "This is a string";
//int num = (int)obj;


//int[] values = null;
//for (int i = 0; i <= 9; i++)
//    values[i] = i * 2;

//string? lowCaseString = null;
//Console.WriteLine(lowCaseString.ToUpper());


// Overflow Exception

//decimal x = 400;
//byte i;

//i = (byte)x; // OverflowException occurs
//Console.WriteLine(i);

//double float1 = 3000.0;
//double float2 = 0.0;
//int number1 = 3000;
//int number2 = 0;

//try
//{
//    Console.WriteLine(float1 / float2);
//    Console.WriteLine(number1 / number2);
//}
//catch
//{
//    Console.WriteLine("An exception has been caught");
//}


//try
//{
//    Process1();
//}
//catch
//{
//    Console.WriteLine("An exception has occurred");
//}

//Console.WriteLine("Exit program");

//static void Process1()
//{
//    WriteMessage();
//}

//static void WriteMessage()
//{
//    double float1 = 3000.0;
//    double float2 = 0.0;
//    int number1 = 3000;
//    int number2 = 0;

//    Console.WriteLine(float1 / float2);
//    Console.WriteLine(number1 / number2);
//}