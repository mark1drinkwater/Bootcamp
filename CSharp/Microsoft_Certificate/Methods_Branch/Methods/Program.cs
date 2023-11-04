using System.Globalization;
CultureInfo.CurrentCulture = new CultureInfo("en-US");

// int[] a = {1,2,3,4,5};

// Console.WriteLine("Contents of Array:");
// PrintArray();

// void PrintArray()
// {
//     foreach (int x in a)
//     {
//         Console.Write($"{x} ");
//     }
//     Console.WriteLine();
// }

// Console.WriteLine("Generating random numbers:");
// DisplayRandomNumbers();

// void DisplayRandomNumbers() 
// {
//     Random random = new Random();

//     for (int i = 0; i < 5; i++) 
//     {
//         Console.Write($"{random.Next(1, 100)} ");
//     }

//     Console.WriteLine();
// }

// int[] times = {800, 1200, 1600, 2000};
// int diff = 0;

// Console.WriteLine("Enter current GMT");
// int currentGMT = Convert.ToInt32(Console.ReadLine());

// Console.WriteLine("Current Medicine Schedule:");
// DisplayTimes();

// Console.WriteLine("Enter new GMT");
// int newGMT = Convert.ToInt32(Console.ReadLine());

// if (Math.Abs(newGMT) > 12 || Math.Abs(currentGMT) > 12)
// {
//     Console.WriteLine("Invalid GMT");
// }
// else if (newGMT <= 0 && currentGMT <= 0 || newGMT >= 0 && currentGMT >= 0) 
// {
//     diff = 100 * (Math.Abs(newGMT) - Math.Abs(currentGMT));
//     AdjustTimes();
// } 
// else 
// {
//     diff = 100 * (Math.Abs(newGMT) + Math.Abs(currentGMT));
//     AdjustTimes();
// }

// Console.WriteLine("New Medicine Schedule:");
// DisplayTimes();

// void DisplayTimes()
// {
//     /* Format and display medicine times */
//     foreach (int val in times)
//     {
//         string time = val.ToString();
//         int len = time.Length;

//         if (len >= 3)
//         {
//             time = time.Insert(len - 2, ":");
//         }
//         else if (len == 2)
//         {
//             time = time.Insert(0, "0:");
//         }
//         else
//         {
//             time = time.Insert(0, "0:0");
//         }

//         Console.Write($"{time} ");
//     }
//     Console.WriteLine();
// }

// void AdjustTimes() 
// {
//     /* Adjust the times by adding the difference, keeping the value within 24 hours */
//     for (int i = 0; i < times.Length; i++) 
//     {
//         times[i] = ((times[i] + diff)) % 2400;
//     }
// }

/*
if ipAddress consists of 4 numbers
and
if each ipAddress number has no leading zeroes
and
if each ipAddress number is in range 0 - 255

then ipAddress is valid
else ipAddress is invalid
*/

// string[] ipv4Input = { "107.31.1.5", "255.0.0.255", "555..0.555", "255...255" };
// string[] address;

// bool validLength = false;
// bool validZeroes = false;
// bool validRange = false;

// foreach (string ip in ipv4Input)
// {
//     // This option omits empty entries from the address array & prevents attempts to parse empty strings.
//     address = ip.Split(".", StringSplitOptions.RemoveEmptyEntries);

//     ValidateLength();
//     ValidateZeroes();
//     ValidateRange();

//     if (validLength && validZeroes && validRange)
//     {
//         Console.WriteLine($"{ip} is a valid IPv4 address");
//     }
//     else
//     {
//         Console.WriteLine($"{ip} is an invalid IPv4 address");
//     }
// }

// void ValidateLength()
// {
//     validLength = address.Length == 4;
// }

// void ValidateZeroes()
// {
//     foreach (string number in address)
//     {
//         if (number.Length > 1 && number.StartsWith("0"))
//         {
//             validZeroes = false;
//             return;
//         }
//     }
//     validZeroes = true;
// }

// void ValidateRange()
// {
//     foreach (string number in address)
//     {
//         int value = int.Parse(number);
//         if (value < 0 || value > 255)
//         {
//             validRange = false;
//             return;
//         }
//     }
//     validRange = true;
// }



// int[] schedule = {800, 1200, 1600, 2000};
// DisplayAdjustedTimes(schedule, 6, -6);

// void DisplayAdjustedTimes(int[] times, int currentGMT, int newGMT)
// {
//     int diff = 0;
//     if (Math.Abs(newGMT) > 12 || Math.Abs(currentGMT) > 12)
//     {
//         Console.WriteLine("Invalid GMT");
//     }
//     else if (newGMT <= 0 && currentGMT <= 0 || newGMT >= 0 && currentGMT >= 0)
//     {
//         diff = 100 * (Math.Abs(newGMT) - Math.Abs(currentGMT));
//     }
//     else
//     {
//         diff = 100 * (Math.Abs(newGMT) + Math.Abs(currentGMT));
//     }
//     for (int i = 0; i < times.Length; i++)
//     {
//         int newTime = ((times[i] + diff)) % 2400;
//         Console.WriteLine($"{times[i]} -> {newTime}");
//     }
// }

// double pi = 3.14159;
// PrintCircleInfo(12);
// PrintCircleInfo(24);

// void PrintCircleArea(int radius)
// {
//     double pi = 3.14159;
//     double area = pi * (radius * radius);
//     Console.WriteLine($"Area = {area}");
// }

// void PrintCircleCircumference(int radius)
// {
//     double pi = 3.14159;
//     double circumference = 2 * pi * radius;
//     Console.WriteLine($"Circumference = {circumference}");
// }

// void PrintCircleInfo(int radius) 
// {
//     Console.WriteLine($"Circle with radius {radius}");
//     PrintCircleArea(radius);
//     PrintCircleCircumference(radius);
// }   



// int[] array = {1, 2, 3, 4, 5};

// PrintArray(array);
// Clear(array);
// PrintArray(array);

// void PrintArray(int[] array) 
// {
//     foreach (int a in array) 
//     {
//         Console.Write($"{a} ");
//     }
//     Console.WriteLine();
// }

// void Clear(int[] array) 
// {
//     for (int i = 0; i < array.Length; i++) 
//     {
//         array[i] = 0;
//     }
// }

// string status = "Healthy";

// Console.WriteLine($"Start: {status}");
// SetHealth(false);
// Console.WriteLine($"End: {status}");

// void SetHealth(bool isHealthy) 
// {
//     status = (isHealthy ? "Healthy" : "Unhealthy");
//     Console.WriteLine($"Middle: {status}");
// }

double total = 0;
double minimumSpend = 30.00;

double[] items = {15.97, 3.50, 12.25, 22.99, 10.98};
double[] discounts = {0.30, 0.00, 0.10, 0.20, 0.50};

for (int i = 0; i < items.Length; i++)
{
    total += GetDiscountedPrice(i);
}
if (TotalMeetsMinimum())
{
    total -= 5.00;
}
Console.WriteLine($"Total: ${FormatDecimal(total)}");

double GetDiscountedPrice(int itemIndex)
{
    return items[itemIndex] * (1 - discounts[itemIndex]);
}

bool TotalMeetsMinimum()
{
    return total >= minimumSpend;
}

string FormatDecimal(double input)
{
    return input.ToString().Substring(0, 5);
}