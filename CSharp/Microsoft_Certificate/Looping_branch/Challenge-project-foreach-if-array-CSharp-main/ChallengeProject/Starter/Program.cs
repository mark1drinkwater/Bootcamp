/* 
This C# console application is designed to:
- Use arrays to store student names and assignment scores.
- Use a `foreach` statement to iterate through the student names as an outer program loop.
- Use an `if` statement within the outer loop to identify the current student name and access that student's assignment scores.
- Use a `foreach` statement within the outer loop to iterate though the assignment scores array and sum the values.
- Use an algorithm within the outer loop to calculate the average exam score for each student.
- Use an `if-elseif-else` construct within the outer loop to evaluate the average exam score and assign a letter grade automatically.
- Integrate extra credit scores when calculating the student's final score and letter grade as follows:
    - detects extra credit assignments based on the number of elements in the student's scores array.
    - divides the values of extra credit assignments by 10 before adding extra credit scores to the sum of exam scores.
- use the following report format to report student grades: 

    Student         Grade

    Sophia:         92.2    A-
    Andrew:         89.6    B+
    Emma:           85.6    B
    Logan:          91.2    A-
*/
// int examAssignments = 5;

// string[] studentNames = new string[] { "Sophia", "Andrew", "Emma", "Logan" };

// int[] sophiaScores = new int[] { 90, 86, 87, 98, 100, 94, 90 };
// int[] andrewScores = new int[] { 92, 89, 81, 96, 90, 89 };
// int[] emmaScores = new int[] { 90, 85, 87, 98, 68, 89, 89, 89 };
// int[] loganScores = new int[] { 90, 95, 87, 88, 96, 96 };

// int[] studentScores = new int[10];

// string currentStudentLetterGrade = "";

// // display the header row for scores/grades
// Console.Clear();
// Console.WriteLine("Student\t\tExam Score\tOverall Score\tLetter Grade\n");

// /*
// The outer foreach loop is used to:
// - iterate through student names 
// - assign a student's grades to the studentScores array
// - sum assignment scores (inner foreach loop)
// - calculate numeric and letter grade
// - write the score report information
// */
// foreach (string name in studentNames)
// {
//     string currentStudent = name;

//     if (currentStudent == "Sophia")
//         studentScores = sophiaScores;

//     else if (currentStudent == "Andrew")
//         studentScores = andrewScores;

//     else if (currentStudent == "Emma")
//         studentScores = emmaScores;

//     else if (currentStudent == "Logan")
//         studentScores = loganScores;

//     int sumAssignmentScores = 0;
//     int gradedAssignments = 0;

//     /* 
//     the inner foreach loop sums assignment scores
//     extra credit assignments are worth 10% of an exam score
//     */
//     int currentStudentExtraCredit = 0;
//     int currentStudentExamScore = 0;
//     int gradedExtraCreditAssignments = 0;

//     foreach (int score in studentScores)
//     {
//         gradedAssignments += 1;

//         if (gradedAssignments <= examAssignments)
//             currentStudentExamScore += score;
//         else
//         {
//             currentStudentExtraCredit += score;
//             gradedExtraCreditAssignments++;
//         }
//     }

//     decimal currentStudentGrade = (decimal)(currentStudentExamScore+currentStudentExtraCredit/10.0) / examAssignments;
//     decimal currentStudentGradeExam = (decimal)(currentStudentExamScore) / examAssignments;
//     decimal currentStudentGradeCredits = (decimal)(currentStudentExtraCredit/10.0) / examAssignments;
//     currentStudentExtraCredit /= gradedExtraCreditAssignments;

//     if (currentStudentGrade >= 97)
//         currentStudentLetterGrade = "A+";

//     else if (currentStudentGrade >= 93)
//         currentStudentLetterGrade = "A";

//     else if (currentStudentGrade >= 90)
//         currentStudentLetterGrade = "A-";

//     else if (currentStudentGrade >= 87)
//         currentStudentLetterGrade = "B+";

//     else if (currentStudentGrade >= 83)
//         currentStudentLetterGrade = "B";

//     else if (currentStudentGrade >= 80)
//         currentStudentLetterGrade = "B-";

//     else if (currentStudentGrade >= 77)
//         currentStudentLetterGrade = "C+";

//     else if (currentStudentGrade >= 73)
//         currentStudentLetterGrade = "C";

//     else if (currentStudentGrade >= 70)
//         currentStudentLetterGrade = "C-";

//     else if (currentStudentGrade >= 67)
//         currentStudentLetterGrade = "D+";

//     else if (currentStudentGrade >= 63)
//         currentStudentLetterGrade = "D";

//     else if (currentStudentGrade >= 60)
//         currentStudentLetterGrade = "D-";

//     else
//         currentStudentLetterGrade = "F";

//     // Student         Grade
//     // Sophia:         92.2    A-
    

//     Console.WriteLine($"{currentStudent}\t\t{currentStudentGradeExam}\t\t{currentStudentGrade}\t{currentStudentLetterGrade}\t{currentStudentExtraCredit} ({currentStudentGradeCredits} pts)");
// }

// // required for running in VS Code (keeps the Output windows open to view results)
// Console.WriteLine("\n\rPress the Enter key to continue");
// Console.ReadLine();

// Console.WriteLine("a" == "a");
// Console.WriteLine("a" == "A");
// Console.WriteLine(1 == 2);

// string myValue = "a";
// Console.WriteLine(myValue == "a");

// string value1 = " a";
// string value2 = "A ";
// Console.WriteLine(value1.Trim().ToLower() == value2.Trim().ToLower());

// Console.WriteLine("a" != "a");
// Console.WriteLine("a" != "A");
// Console.WriteLine(1 != 2);

// string myValue = "a";
// Console.WriteLine(myValue != "a");

// string pangram = "The quick brown fox jumps over the lazy dog.";
// Console.WriteLine(pangram.Contains("fox"));
// Console.WriteLine(pangram.Contains("cow"));

// int saleAmount = 1001;
// int discount = saleAmount > 1000 ? 100 : 50;
// Console.WriteLine($"Discount: {discount}");

// int saleAmount = 1001;
// // int discount = saleAmount > 1000 ? 100 : 50;

// Console.WriteLine($"Discount: {(saleAmount > 1000 ? 100 : 50)}");

// Challenge:
// Random rand = new Random();
// int outcome = rand.Next(1,3);
// Console.WriteLine(outcome == 1 ? "Heads" : "Tails");

// string permission = "Admin|Manager";
// int level = 55;

// if (permission.Contains("Admin")) 
// {
//     if (level > 55)
//     {
//         Console.WriteLine("Welcome, Super Admin user.");
//     }
//     else
//     {
//         Console.WriteLine("Welcome, Admin user.");
//     }
// }
// else if (permission.Contains("Manager")) 
// {
//     if (level >= 20)
//     {
//         Console.WriteLine("Contact an Admin for access.");
//     }
//     else
//     {
//         Console.WriteLine("You do not have sufficient privileges.");
//     }
// }
// else
// {
//     Console.WriteLine("You do not have sufficient privileges.");
// }

// bool flag = true;
// if (flag)
// {
//     int value = 10;
//     Console.WriteLine($"Inside of code block: {value}");
// }
// Console.WriteLine($"Outside of code block: {value}");

// bool flag = true;
// int value;

// if (flag)
// {
//     value = 10;
//     Console.WriteLine("Inside of code block: " + value);
// }
// Console.WriteLine($"Outside of code block: {value}");

// bool flag = true;
// int value = 0;

// if (flag)
// {
//     value = 10;
//     Console.WriteLine("Inside of code block: " + value);
// }
// Console.WriteLine("Outside of code block: " + value);

// bool flag = true;
// if (flag)
//     Console.WriteLine(flag);

// // Readibility
// string name = "steve";
// if (name == "bob") Console.WriteLine("Found Bob");
// else if (name == "steve") Console.WriteLine("Found Steve");
// else Console.WriteLine("Found Chuck");    

// name = "steve";

// if (name == "bob")
//     Console.WriteLine("Found Bob");
// else if (name == "steve") 
//     Console.WriteLine("Found Steve");
// else
//     Console.WriteLine("Found Chuck");

// int[] numbers = { 4, 8, 15, 16, 23, 42 };

// int total = 0;
// bool found = false;
// foreach (int number in numbers)
// {
//     total += number;
//     if (number == 42)
//        found = true;
// }

// if (found) 
// {
//     Console.WriteLine("Set contains 42");

// }

// Console.WriteLine($"Total: {total}");

// int employeeLevel = 100;
// string employeeName = "John Smith";

// string title = "";

// switch (employeeLevel)
// {
//     case 100:
//     case 200:
//         title = "Senior Associate";
//         break;
//     case 300:
//         title = "Manager";
//         break;
//     case 400:
//         title = "Senior Manager";
//         break;
//     default:
//         title = "Associate";
//         break;
// }

// Console.WriteLine($"{employeeName}, {title}");


// SKU = Stock Keeping Unit. 
// SKU value format: <product #>-<2-letter color code>-<size code>
// string sku = "01-MN-L";

// string[] product = sku.Split('-');

// string type = "";
// string color = "";
// string size = "";

// switch (product[0])
// {
//     case "01":
//         type = "Sweat shirt";
//         break;
//     case "02":
//         type = "T-Shirt";
//         break;
//     case "03":
//         type = "Sweat pants";
//         break;
//     default:
//         type = "Other";
//         break;
// }

// switch (product[1])
// {
//     case "BL":
//         color = "Black";
//         break;
//     case "MN":
//         color = "Maroon";
//         break;
//     default:
//         color = "White";
//         break;
// }

// switch (product[2])
// {
//     case "S":
//         size = "Small";
//         break;
//     case "M":
//         size = "Medium";
//         break;
//     case "L":
//         size = "Large";
//         break;
//     default:
//         size = "One Size Fits All";
//         break;
// }

// Console.WriteLine($"Product: {size} {color} {type}");

// for (int i = 10; i >= 0; i--)
// {
//     Console.WriteLine(i);
// }

// for (int i = 0; i < 10; i += 3)
// {
//     Console.WriteLine(i);
// }

// for (int i = 0; i < 10; i++)
// {
//     Console.WriteLine(i);
//     if (i == 7) break;
// }

// string[] names = { "Alex", "Eddie", "David", "Michael" };
// for (int i = names.Length - 1; i >= 0; i--)
// {
//     Console.WriteLine(names[i]);
// }

// Examine the limitation of the foreach statement
// string[] names = { "Alex", "Eddie", "David", "Michael" };
// foreach (var name in names)
// {
//     // Can't do this:
//     if (name == "David") name = "Sammy";
// }

// Overcoming the limitation of the foreach statement using the for statement
// string[] names = { "Alex", "Eddie", "David", "Michael" };
// for (int i = 0; i < names.Length; i++)
//     if (names[i] == "David") names[i] = "Sammy";

// foreach (var name in names) Console.WriteLine(name);

// for (int i = 1; i <= 100; i++)
// {
//     if ( (i % 3 == 0) && (i % 5 == 0) )
//     {
//         Console.WriteLine(i + " - FizzBuzz ");
//     }
//     else if (i % 3 == 0)
//     {
//         Console.WriteLine(i + " - Fizz");
//     }
//     else if (i % 5 == 0)
//     {
//         Console.WriteLine(i + " - Buzz");
//     }
//     else
//     {
//         Console.WriteLine(i);
//     }
// }

// Random random = new Random();
// int current = 0;

// do
// {
//     current = random.Next(1, 11);
//     Console.WriteLine(current);
// } while (current != 7);

// Random random = new Random();
// int current = random.Next(1, 11);

// while (current >= 3)
// {
//     Console.WriteLine(current);
//     current = random.Next(1, 11);
// }
// Console.WriteLine($"Last number: {current}");

// Random random = new Random();
// int current = random.Next(1, 11);

// do
// {
//     current = random.Next(1, 11);
//     if (current >= 8)
//         continue;
    
//     Console.WriteLine(current);
// } while (current != 7);

// Role playing game battle challenge

// int heroHealth = 10;
// int monsterHealth = 10;
// Random rand = new Random();

// do
// {
//     int heroAttack = rand.Next(1, 11);
//     monsterHealth -= heroAttack;

//     Console.WriteLine($"Monster was damanged and lost {heroAttack} health and now has {monsterHealth} health.");

//     // So continue in a while loop, means to skip ahead and re-check the condition
//     if (monsterHealth <= 0) continue;

//     int monsterAttack = rand.Next(1, 11);
//     heroHealth -= monsterAttack;

//     Console.WriteLine($"Hero was damanged and lost {monsterAttack} health and now has {heroHealth} health.");    
// } while(heroHealth > 0 || monsterHealth > 0);

// Console.WriteLine(hero > monster ? "Hero wins!" : "Monster wins!");

// Manage user input during this challenge

// string? readResult;
// bool validEntry = false;
// Console.WriteLine("Enter a string containing at least three characters:");
// do
// {
//     readResult = Console.ReadLine();
//     if (readResult != null)
//     {
//         if (readResult.Length >= 3)
//         {
//             validEntry = true;
//         }
//         else
//         {
//             Console.WriteLine("Your input is invalid, please try again.");
//         }
//     }
// } while (validEntry == false);

// string? readResult = Console.ReadLine();
// int numericValue = 0;
// bool validNumber = false;

// validNumber = int.TryParse(readResult, out numericValue);

// Code project 1 - write code that validates integer input
// Console.WriteLine("Please enter an integer value between 5 and 10.");

// string? readResult;
// bool validEntry = false;
// int numericValue = 0;

// do
// {
//     readResult = Console.ReadLine();
//     if (readResult != null)
//     {
//         validEntry = int.TryParse(readResult, out numericValue);  
//         if (!validEntry)               
//         {
//             Console.WriteLine("Sorry, you entered an invalid number, please try again");
//         }
//         else if (numericValue < 5 || numericValue > 10)
//         {
//             Console.WriteLine($"You entered {numericValue}. Please enter a number between 5 and 10.");
//             validEntry = false;   
//         }
//     }
// } while (validEntry == false);

// Console.WriteLine($"Your input ({numericValue}) has been accepted.");

//Code project 2 - write code that validates string input.

// Console.WriteLine("Enter your role name (Administrator, Manager, or User)");
// string? readUser;
// bool validInput = false;

// do
// {
//     readUser = Console.ReadLine();
//     if (readUser != null)
//     {
//         readUser = readUser.Trim().ToLower();
//         if (readUser == "administrator" || readUser == "manager" || readUser == "user")
//         {
//             validInput = true;
//             continue;
//         }
//     }
//     Console.WriteLine("Enter your role name (Administrator, Manager, or User)");
// } while (validInput == false);

// Console.WriteLine($"Your input value ({readUser}) has been accepted.");

// Code Project 3 - Write code that processes the contents of a string array
// string[] myStrings = new string[2] { "I like pizza. I like roast chicken. I like salad", "I like all three of the menu choices" };

// int periodLocation = 0;
// string workingString = "";

// foreach (string myString in myStrings)
// {
//     periodLocation = myString.IndexOf(".");
//     workingString = myString;   

//     while (periodLocation != -1)
//     {    
//         Console.WriteLine(workingString.Substring(0, periodLocation));
//         workingString = workingString.Remove(0, periodLocation+1).TrimStart();
//         periodLocation = workingString.IndexOf(".");
//     } 
//     Console.WriteLine(workingString);
// }

