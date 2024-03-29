﻿using System.Globalization;
CultureInfo.CurrentCulture = new CultureInfo("en-US");

// int[] inventory = { 200, 450, 700, 175, 250 };
// int sum = 0;

// int bin = 0;
// foreach (int items in inventory)
// {
//     sum += items;
//     bin++;
//     Console.WriteLine($"Bin {bin} = {items} items (Running total: {sum})");
// }

// Console.WriteLine($"We have {sum} items in inventory.");

// Fraudulent order challenge
// String[] orderIDs = { "B123", "C234", "A345", "C15", "B177", "G3003", "C235", "B179" };

// foreach (String orderID in orderIDs)
// {
//     if (orderID.StartsWith("B"))
//     {
//         Console.WriteLine(orderID);
//     }
// }

// Random random = new Random();
// string[] orderIDs = new string[5];
// // Loop through each blank orderID
// for (int i = 0; i < orderIDs.Length; i++)
// {
//     // Get a random value that equates to ASCII letters A through E
//     int prefixValue = random.Next(65, 70);
//     // Convert the random value into a char, then a string
//     string prefix = Convert.ToChar(prefixValue).ToString();
//     // Create a random number, pad with zeroes
//     string suffix = random.Next(1, 1000).ToString("000");
//     // Combine the prefix and suffix together, then assign to current OrderID
//     orderIDs[i] = prefix + suffix;
// }
// // Print out each orderID
// foreach (var orderID in orderIDs)
// {
//     Console.WriteLine(orderID);
// }

/*
  The following code creates five random OrderIDs
  to test the fraud detection process.  OrderIDs 
  consist of a letter from A to E, and a three
  digit number. Ex. A123.
*/


// Random random = new Random();
// string[] orderIDs = new string[5];

// for (int i = 0; i < orderIDs.Length; i++)
// {
//     int prefixValue = random.Next(65, 70);
//     string prefix = Convert.ToChar(prefixValue).ToString();
//     string suffix = random.Next(1, 1000).ToString("000");

//     orderIDs[i] = prefix + suffix;
// }

// foreach (var orderID in orderIDs)
// {
//     Console.WriteLine(orderID);
// }

// Example 1:

// Console
// .
// WriteLine
// (
// "Hello Example 1!"
// )
// ;

// // Example 2:
// string firstWord="Hello";string lastWord="Example 2";Console.WriteLine(firstWord+" "+lastWord+"!");

/*
    Reverses a string message.
    Then counts the number of times 'o' appears.
    Prints the output to the console.
*/

// string str = "The quick brown fox jumps over the lazy dog.";

// char[] charMessage = str.ToCharArray();
// Array.Reverse(charMessage);

// int letterCount = 0;

// foreach (char i in charMessage) 
// { 
//     if (i == 'o') 
//     { 
//         letterCount++; 
//     } 
// }

// string new_message = new String(charMessage);

// Console.WriteLine(new_message);
// Console.WriteLine($"'o' appears {letterCount} times.");

// Console.WriteLine("Signed integral types:");

// Console.WriteLine($"sbyte  : {sbyte.MinValue} to {sbyte.MaxValue}");
// Console.WriteLine($"short  : {short.MinValue} to {short.MaxValue}");
// Console.WriteLine($"int    : {int.MinValue} to {int.MaxValue}");
// Console.WriteLine($"long   : {long.MinValue} to {long.MaxValue}");


// Console.WriteLine("");
// Console.WriteLine("Unsigned integral types:");
// Console.WriteLine($"byte   : {byte.MinValue} to {byte.MaxValue}");
// Console.WriteLine($"ushort : {ushort.MinValue} to {ushort.MaxValue}");
// Console.WriteLine($"uint   : {uint.MinValue} to {uint.MaxValue}");
// Console.WriteLine($"ulong  : {ulong.MinValue} to {ulong.MaxValue}");

// int[] data = new int[3];

// string shortenedString = "Hello World!";
// Console.WriteLine(shortenedString);

// int myInt = 3;
// Console.WriteLine($"int: {myInt}");

// decimal myDecimal = myInt;
// Console.WriteLine($"decimal: {myDecimal}");

decimal myDecimal = 3.14m;
// Console.WriteLine($"decimal: {myDecimal}");

// int myInt = (int)myDecimal;
// Console.WriteLine($"int: {myInt}");

// decimal myDecimal = 1.23456789m;
// float myFloat = (float)myDecimal; // narrowing conversion

// Console.WriteLine($"Decimal: {myDecimal}");
// Console.WriteLine($"Float  : {myFloat}");

// string first = "5";
// string second = "7";
// int sum = int.Parse(first) + int.Parse(second);
// Console.WriteLine(sum);

// string value1 = "5";
// string value2 = "7";
// int result = Convert.ToInt32(value1) * Convert.ToInt32(value2);
// Console.WriteLine(result);

// int value = (int)1.5m; // casting truncates
// Console.WriteLine(value);

// int value2 = Convert.ToInt32(1.5m); // converting rounds up
// Console.WriteLine(value2);
// 
// string name = "Bob";
// Console.WriteLine(int.Parse(name)); // If you want to avoid format exception, use TryParse()

// string value = "bad";
// int result = 0;
// if (int.TryParse(value, out result))
// {
//     Console.WriteLine($"Measurement: {result}");
// }
// else
// {
//     Console.WriteLine("Unable to report the measurement.");
// }

// if (result > 0)
//     Console.WriteLine($"Measurement (w/ offset): {50 + result}");

// string[] values = { "12.3", "45", "ABC", "11", "DEF" };
// string message = "";
// decimal sum = 0;
// decimal num;
// bool validNumber;

// for (int i = 0; i < values.Length; i++)
// {
//     validNumber = decimal.TryParse(values[i], out num);
//     if (validNumber)
//     {
//         sum += num;
//     }
//     else
//     {
//         message += values[i];
//     }
// }

// Console.WriteLine("Message: " + message);
// Console.WriteLine("Total: " + sum);

