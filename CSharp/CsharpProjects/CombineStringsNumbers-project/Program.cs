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