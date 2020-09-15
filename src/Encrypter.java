import java.lang.String;
import java.util.Scanner;

public class Encrypter {

    public static int [] getInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 4 digit number to Encrypt:");
        String nums = sc.nextLine(); //

        int[] arr = new int[nums.length()]; // creates new array based off user input
        for (int i = 0; i < nums.length(); i++)
        {
            arr[i] = nums.charAt(i) - '0'; // turns user input int into array
        }
        int x = 0;
        sc.close(); //closes scanner
        return arr;
    }

    public static void addMod(int [] array) // adds 7 and mods all elements in array
    {
        for(int i = 0; i < 4; i++)
        {
            array[i] = array[i] + 7; // adds 7 to all elements in array
        }

        for(int i = 0; i < 4; i++)
        {
            array[i] = array[i] % 10; // mod all elements in array
        }
    }

    public static void swap(int [] array) // swaps elements positions in array
    {
        int a = array[0]; // stores first 2 elements in array in ints
        int b = array [1];

        array[0] = array[2]; // swaps places in array
        array[1] = array[3];

        array[2] = a; // takes stored elements and places them back in array
        array[3] = b;

    }


    public static void main(String args[])
    {
        int [] myArr = getInput();

        addMod(myArr);
        swap(myArr);

        for(int i = 0; i < 4; i++)
        {
            System.out.print(myArr[i]);
        }
    }
}

