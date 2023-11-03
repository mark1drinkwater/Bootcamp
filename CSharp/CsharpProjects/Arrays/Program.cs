using System.Globalization;
CultureInfo.CurrentCulture = new CultureInfo("en-US");

// string[] pallets = { "B14", "A11", "B12", "A13" };

// Console.WriteLine("Sorted...");
// Array.Sort(pallets);
// foreach (var pallet in pallets)
// {
//   Console.WriteLine($"-- {pallet}");
// }


// Console.WriteLine("Sorted...");
// Array.Sort(pallets);
// foreach (var pallet in pallets)
// {
//     Console.WriteLine($"-- {pallet}");
// }

// Console.WriteLine("");
// Console.WriteLine("Reversed...");
// // Pretty easy
// Array.Reverse(pallets);
// foreach (var pallet in pallets)
// {
//     Console.WriteLine($"-- {pallet}");
// }


///////////////////////////////////////////////////////////////////////////////////////////////////////////
///
string[] pallets = { "B14", "A11", "B12", "A13" };
Console.WriteLine("");

Array.Clear(pallets, 0, 2);
Console.WriteLine($"Clearing 2 ... count: {pallets.Length}");
foreach (var pallet in pallets)
{
    Console.WriteLine($"-- {pallet}");
}

Console.WriteLine("");
Array.Resize(ref pallets, 6);
Console.WriteLine($"Resizing 6 ... count: {pallets.Length}");

pallets[4] = "C01";
pallets[5] = "C02";

foreach (var pallet in pallets)
{
    Console.WriteLine($"-- {pallet}");
}

Console.WriteLine("");
// This is pretty convient
Array.Resize(ref pallets, 3);
Console.WriteLine($"Resizing 3 ... count: {pallets.Length}");

foreach (var pallet in pallets)
{
    Console.WriteLine($"-- {pallet}");
}

// Use the ToCharArray() to reverse a string
// string value = "abc123";
// char[] valueArray = value.ToCharArray();
// Array.Reverse(valueArray);
// string result = new string(valueArray); // Makes a new string from an array of characters.
// Console.WriteLine(result);

string value = "abc123";
char[] valueArray = value.ToCharArray();
Array.Reverse(valueArray);
// string result = new string(valueArray);
// Join characters of an array into a string using specified delimeter.
string result = String.Join(",", valueArray);
Console.WriteLine(result);

// Split() the comma-separated-value string into an array of strings
string[] items = result.Split(',');
foreach (string item in items)
{
    Console.WriteLine(item);
}