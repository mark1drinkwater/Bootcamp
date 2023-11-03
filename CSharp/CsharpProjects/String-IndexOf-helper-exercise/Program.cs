using System.Globalization;
CultureInfo.CurrentCulture = new CultureInfo("en-US");

string message = "(What if) I am (only interested) in the last (set of parentheses)?";
int openingPosition = message.LastIndexOf('(');

openingPosition += 1;
int closingPosition = message.LastIndexOf(')');
int length = closingPosition - openingPosition;
Console.WriteLine(message.Substring(openingPosition, length));

//////////////// Retrieve all instances of substrings inside parentheses ////////
message = "(What if) there are (more than) one (set of parentheses)?";
while (true)
{
    openingPosition = message.IndexOf('(');
    /// Clever way to exit loop, if end of string.
    if (openingPosition == -1) break;
    // Can only +1 after if statement check.
    openingPosition += 1;

    closingPosition = message.IndexOf(')');
    length = closingPosition - openingPosition;
    Console.WriteLine(message.Substring(openingPosition, length));

    // Note the overloaded method of Substring to return only the remaining
    // unprocessed message:
    // So: |(What if) there are (more than) one (set of parentheses)?"
    // Be: | there are (more than) one (set of parentheses)?
    // When you use Substring() without specifying a length input parameter, 
    // it will return every character after the starting position you specify.
    message = message.Substring(closingPosition + 1);
}

Console.WriteLine("\n\n");

// Searching multiple symbols!
message = "Help (find) the {opening symbols}";
Console.WriteLine($"Searching THIS Message: {message}");
char[] openSymbols = { '[', '{', '(' };
int startPosition = 6;

openingPosition = message.IndexOfAny(openSymbols);
Console.WriteLine($"Found WITHOUT using startPosition: {message.Substring(openingPosition)}");

openingPosition = message.IndexOfAny(openSymbols, startPosition);
Console.WriteLine($"Found WITH using startPosition: {message.Substring(openingPosition)}");

///////////////////////////////////////////////////////////////////////////////
message = "(What if) I have [different symbols] but every {open symbol} needs a [matching closing symbol]?";

// You'll use a slightly different technique for iterating through 
// the characters in the string. This time, use the closing 
// position of the previous iteration as the starting index for the 
//next open symbol. So, you need to initialize the closingPosition 
// variable to zero:

closingPosition = 0;

while (true)
{
    openingPosition = message.IndexOfAny(openSymbols, closingPosition);
    if (openingPosition == -1) break;
    string currentSymbol = message.Substring(openingPosition, 1);
    // Now find the matching closing symbol.
    char matchingSymbol = ' ';

    switch (currentSymbol)
    {
        case "[":
            matchingSymbol = ']';
            break;
        case "{":
            matchingSymbol = '}';
            break;
        case "(":
            matchingSymbol = ')';
            break;
    }
    // To find the closingPosition, use an overload of the IndexOf method to specify
    // that the search for the matchingSymbol should start at the openingPosition in the string.
    openingPosition++;
    closingPosition = message.IndexOf(matchingSymbol, openingPosition);

    // Finally, use the techniques you've already learned to display the sub-string:
    length = closingPosition - openingPosition;
    Console.WriteLine(message.Substring(openingPosition, length));
}

// Exercise - Use the Remove() and Replace() methods
string data = "12345John Smith          5000  3  ";
string updatedData = data.Remove(5, 20);
Console.WriteLine(updatedData);

message = "This--is--ex-amp-le--da-ta";
message = message.Replace("--", " ");
message = message.Replace("-", "");
Console.WriteLine(message);

// Exercise: Complete a challenge to extract, replace, and remove data from an input string
const string input = "<div><h2>Widgets &trade;</h2><span>5000</span></div>";

string quantity = "";
string output = "";

// Your work here
string startPat = "<span>";
string endPat = "</span>";

int startPos = input.IndexOf(startPat) + startPat.Length;
int endPos = input.IndexOf(endPat);

int len = endPos - startPos;
quantity = input.Substring(startPos, len);
//////////////////////////////////////////////////////////
startPat = "<div>";
endPat = "</div>";

startPos = input.IndexOf(startPat) + startPat.Length;
endPos = input.IndexOf(endPat);

len = endPos - startPos;
output = input.Substring(startPos, len);
output = output.Replace("&trade;", "&reg;");

Console.WriteLine("Quantity: " + quantity);
Console.WriteLine(output);