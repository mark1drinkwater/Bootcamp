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

string permission = "Admin|Manager";
int level = 55;

if (permission.Contains("Admin") && level > 55) 
{
    Console.WriteLine("Welcome, Super Admin user.");
}
else if (permission.Contains("Admin") && level <= 55) 
{
    Console.WriteLine("Welcome, Admin user.");
}
else if (permission.Contains("Manager") && level >= 20) 
{
    Console.WriteLine("Contact an Admin for access.");
}
else if (permission.Contains("Manager") && level < 20) 
{
    Console.WriteLine("You do not have sufficient privileges.");
}
else if (!permission.Contains("Manager") || !permission.Contains("Admin"))
{
    Console.WriteLine("You do not have sufficient privileges.");
}