//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        //A program that takes an integer (java int) and uses the modulo function to indicate if the number is odd or even.
        // Since we can't do input in java yet, just hard code the value for the input as a variable instantiation.

        int favoriteNumber = 3;
        int moddedNumber = 5;

        moddedNumber = favoriteNumber % 2;

        System.out.println("If your mod is 1, then your number was odd. If your mod is 0, then your number was even. Your mod: "
        + moddedNumber);
    }
}