using System.Globalization;
CultureInfo.CurrentCulture = new CultureInfo("en-US");

string[] values = { "12.3", "45", "ABC", "11", "DEF" };
string message = "";
decimal sum = 0;
decimal num;
bool validNumber;

for (int i = 0; i < values.Length; i++)
{
    validNumber = decimal.TryParse(values[i], out num);
    if (validNumber)
    {
        sum += num;
    }
    else
    {
        message += values[i];
    }
}

Console.WriteLine("Message: " + message);
Console.WriteLine("Total: " + sum);

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

string[] values = { "12.3", "45", "ABC", "11", "DEF" };

decimal total = 0m;
string message = "";

// Interesting that it will switch the types.
foreach (var value in values)
{
    decimal number; // stores the TryParse "out" value
    if (decimal.TryParse(value, out number))
    {
        total += number;
    } else
    {
        message += value;
    }
}

Console.WriteLine($"Message: {message}");
Console.WriteLine($"Total: {total}");