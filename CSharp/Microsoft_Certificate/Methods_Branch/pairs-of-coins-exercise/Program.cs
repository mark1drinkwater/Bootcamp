using System.Globalization;
CultureInfo.CurrentCulture = new CultureInfo("en-US");

int target = 30;
int[] coins = new int[] { 5, 5, 50, 25, 25, 10, 5 };
int[,] result = TwoCoins(coins, target);

if (result.Length == 0)
{
    Console.WriteLine("No two coins make change");
}
else
{
    Console.WriteLine("Change found at positions:");
    for (int i = 0; i < result.GetLength(0); i++)
    {
        if (result[i, 0] == -1)
        {
            break;
        }
        Console.WriteLine($"{result[i, 0]},{result[i, 1]}");
    }
}

int[,] TwoCoins(int[] coins, int target)
{
    int[,] result = { { -1, -1 }, { -1, -1 }, { -1, -1 }, { -1, -1 }, { -1, -1 } };
    int count = 0;

    for (int current = 0; current < coins.Length; current++)
    {
        for (int next = current + 1; next < coins.Length; next++)
        {
            if (coins[current] + coins[next] == target)
            {
                result[count, 0] = current;
                result[count, 1] = next;
                count++;
            }
            // Checks if you've found 5 pairs
            if (count == result.GetLength(0))
            {
                return result;
            }
        }
    }
    // If no matches were found return an array of 0 else return the result
    return (count == 0) ? new int[0, 0] : result;
}

// Code Challenge: Add methods to make the game playable
Random random = new Random();

Console.WriteLine("Would you like to play? (Y/N)");
if (ShouldPlay())
{
    PlayGame();
}

void PlayGame()
{
    var play = true;

    while (play)
    {
        var target = GetTarget();
        var roll = RollDice();

        Console.WriteLine($"Roll a number greater than {target} to win!");
        Console.WriteLine($"You rolled a {roll}");
        Console.WriteLine(WinOrLose(target, roll));
        Console.WriteLine("\nPlay again? (Y/N)");

        play = ShouldPlay();
    }
}

string WinOrLose(int target, int roll)
{
    if (roll > target)
    {
        return "You win!";
    }
    else
    {
        return "You lose!";
    }
}

int GetTarget()
{
    return random.Next(1, 6);
}

int RollDice()
{
    return random.Next(1,7);
}

bool ShouldPlay()
{
    while (true)
    {
        string? readResult = Console.ReadLine();
        if (readResult != null)
        {
            if (readResult.ToLower() == "y")
            {
                return true;
            }
            else if (readResult.ToLower() == "n")            
            {
                return false;
            }
        }
        Console.WriteLine("Invalid input. Play again? (Y/N)");
    }
    // string response = Console.ReadLine();
    // return response.ToLower().Equals("y");
}