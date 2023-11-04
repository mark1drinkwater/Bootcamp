public class TryCatchChallenge
{
    public TryCatchChallenge()
    {
        try
        {
            Process1();
        }
        catch
        {
            Console.WriteLine("An exception has occurred");
        }

        Console.WriteLine("Exit program");

        static void Process1()
        {
            try
            {
                WriteMessage();
            }
            catch (Exception ex)
            {
                Console.WriteLine($"Exception caught in Process1: {ex.Message}");
            }
        }

        static void WriteMessage()
        {
            double float1 = 3000.0;
            double float2 = 0.0;
            int number1 = 3000;
            int number2 = 0;
            byte smallNumber;

            Console.WriteLine(float1 / float2);
            //Console.WriteLine(number1 / number2);

            // Without checked this will not generate an exception if overflow occurs.
            checked
            {
                smallNumber = (byte)number1;
            }

        }

    }
}
