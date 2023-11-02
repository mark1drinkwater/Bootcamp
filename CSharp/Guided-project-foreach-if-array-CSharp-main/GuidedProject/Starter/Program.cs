using System;

// initialize variables - graded assignments 
int examAssignments = 5;


int[] sophiaScores = new int[] { 90, 86, 87, 98, 100, 94, 90 };
int[] andrewScores = new int[] { 92, 89, 81, 96, 90, 89 };
int[] emmaScores = new int[] { 90, 85, 87, 98, 68, 89, 89, 89 };
int[] loganScores = new int[] { 90, 95, 87, 88, 96, 96 };
int[] beckyScores = new int[] { 92, 91, 90, 91, 92, 92, 92 };
int[] chrisScores = new int[] { 84, 86, 88, 90, 92, 94, 96, 98 };
int[] ericScores = new int[] { 80, 90, 100, 80, 90, 100, 80, 90 };
int[] gregorScores = new int[] { 91, 91, 91, 91, 91, 91, 91 };    

// Student names
string[] studentNames = new string[] { "Sophia", "Andrew", "Emma", "Logan", "Becky", "Chris", "Eric", "Gregor" };

int[] studentScores;

Console.WriteLine("Student\t\tGrade\n");
foreach (string name in studentNames)
{
    if (name == "Sophia")
        studentScores = sophiaScores;
    else if (name == "Andrew")
        studentScores = andrewScores;
    else if (name == "Emma")
        studentScores = emmaScores;
    else if (name == "Logan")
        studentScores = loganScores;
    else if (name == "Becky")
        studentScores = beckyScores;
    else if (name == "Chris")
        studentScores = chrisScores;
    else if (name == "Eric")
        studentScores = ericScores;
    else if (name == "Gregor")
        studentScores = gregorScores;
    else
        continue;    

    int sum = 0;
    int gradedAssignments = 0;
    foreach (int score in studentScores)
    {
        gradedAssignments++;
        if (gradedAssignments > examAssignments)
        {
            sum += score / 10;
        }
        else 
        {
            sum += score;
        }
    }

    decimal avg = (decimal)sum / examAssignments;

    string currentGrade;

    if (avg >= 97)
        currentGrade = "A+";
    else if (avg >= 93)
        currentGrade = "A";
    else if (avg >= 90)
        currentGrade = "A-";
    else if (avg >= 87)
        currentGrade = "B+";
    else if (avg >= 83)
        currentGrade = "B";
    else if (avg >= 80)
        currentGrade = "B-";
    else if (avg >= 77)
        currentGrade = "C+";
    else if (avg >= 73)
        currentGrade = "C";
    else if (avg >= 70)
        currentGrade = "C-";
    else if (avg >= 67)
        currentGrade = "D+";
    else if (avg >= 63)
        currentGrade = "D";
    else if (avg >= 60)
        currentGrade = "D-";
    else
        currentGrade = "F";

    Console.WriteLine($"{name}:\t\t{avg}\t{currentGrade}");    
}

Console.WriteLine("Press the Enter key to continue");
Console.ReadLine();