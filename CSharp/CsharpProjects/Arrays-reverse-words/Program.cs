using System.Globalization;
CultureInfo.CurrentCulture = new CultureInfo("en-US");

string pangram = "The quick brown fox jumps over the lazy dog";
string reversedPangram = "";

string[] words = pangram.Split(' ');
foreach (string word in words)
{
    char[] letters = word.ToCharArray();
    Array.Reverse(letters);
    string reversedWord = string.Join("", letters);
    reversedPangram += reversedWord + " ";
}

Console.WriteLine(reversedPangram);

/////////////////////////////////////////////////////////////////////////////////
/// Another Solution:
// Instead of appending the words to a new string
// This takes the approach of placing the reversed lettering words in a new array
// Then joining them together.
string[] message = pangram.Split(' ');
string[] newMessage = new string[message.Length];

for (int i = 0; i < message.Length; i++)
{
    char[] letters = message[i].ToCharArray();
    Array.Reverse(letters);
    newMessage[i] = new string(letters);
}

string result = string.Join(" ", newMessage);
Console.WriteLine(result);