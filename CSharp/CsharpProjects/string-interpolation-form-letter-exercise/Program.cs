using System.Globalization;
CultureInfo.CurrentCulture = new CultureInfo("en-US");

string customerName = "Ms. Barros";

string currentProduct = "Magic Yield";
int currentShares = 2975000;
decimal currentReturn = 0.1275m;
decimal currentProfit = 55000000.0m;

string newProduct = "Glorious Future";
decimal newReturn = 0.13125m;
decimal newProfit = 63000000.0m;

// Your logic here
Console.WriteLine($"Dear Ms. Barros,");
Console.WriteLine($"As a customer of our {currentProduct} offering we are excited to tell you about a new financial product that would dramatically increase your return.");
Console.WriteLine($"\nCurrently, you own {currentShares:N} shares at a return of {currentReturn:P2}.");

Console.WriteLine("\nHere's a quick comparison:\n");

string comparisonMessage = "";

// Your logic here
comparisonMessage =  currentProduct.PadRight(20) + $"{currentReturn:P2}".PadRight(10) + $"{currentProfit:C}";
comparisonMessage += "\n" + newProduct.PadRight(20) + $"{newReturn:P2}".PadRight(10) + $"{newProfit:C}";

Console.WriteLine(comparisonMessage);