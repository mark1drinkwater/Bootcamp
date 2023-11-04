using System.Globalization;
CultureInfo.CurrentCulture = new CultureInfo("en-US");
////////////////// Exchange Rate
double usd = 23.73;
int vnd = UsdToVnd(usd);

Console.WriteLine($"${usd} USD = ${vnd} VND");
Console.WriteLine($"${vnd} VND = ${VndToUsd(vnd)} USD");

int UsdToVnd(double usd) 
{
    int rate = 23500;
    return (int) (rate * usd);
}

double VndToUsd(int vnd) 
{
    double rate = 23500;
    return vnd / rate;
}
////////////////////////////// Reverse Word
string input = "snake";

Console.WriteLine(input);
Console.WriteLine(ReverseWord(input));

string ReverseWord(string word)
{
    string result = "";
    for (int i = word.Length-1; i >= 0 ; i--)
    {
        result += word[i];
    }
    return result;
}

input = "there are snakes at the zoo";
Console.WriteLine(input);
Console.WriteLine(ReverseSentence(input));

////////////////////////////////// Reverse Sentence
string ReverseSentence(string input) 
{
    string result = "";

    string[] words = input.Split(' ');
    foreach (string word in words)
    {
        result += ReverseWord(word) + " ";
    }
    result.Trim();

    return result;
}
//////////////////////////////// Palindrome
string[] words = {"racecar" ,"talented", "deified", "tent", "tenet"};

Console.WriteLine("Is it a palindrome?");
foreach (string word in words) 
{
    Console.WriteLine($"{word}: {IsPalindrome(word)}");
}

bool IsPalindrome(string word)
{
    // string reversedWord = "";
    // for (int i = word.Length - 1; i >= 0; i--)
    // {
    //     reversedWord += word[i];        
    // }

    // return word == reversedWord ? true : false;

    // Smart.
    int start = 0;
    int end = word.Length - 1;

    while (start < end)
    {
        if (word[start] != word[end])
        {
            return false;
        }
        start++;
        end--;
    }
    return true;
}
//////////////////////////// Find coins to make change
int target = 60;
int[] coins = new int[] {5, 5, 50, 25, 25, 10, 5};
int[] result = TwoCoins(coins, target);

if (result.Length == 0) 
{
    Console.WriteLine("No two coins make change");
} 
else 
{
    Console.WriteLine($"Change found at positions {result[0]} and {result[1]}");
}

int[] TwoCoins(int[] coins, int target)
{
    for (int i = 0; i < coins.Length; i++)
    {
        for (int j = i+1; j < coins.Length; j++)
        {
            if (coins[i] + coins[j] == target)
            {
                return new int[] {i, j};
            }
        }
    }

    return new int[0];
}
