import java.util.Scanner;
import java.lang.String;

public class Decrypter {
    public static int [] getInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 4 digit number to Decrypt:");
        String nums = sc.nextLine(); //

        int[] arr = new int[nums.length()]; // creates new array based off user input
        for (int i = 0; i < nums.length(); i++)
        {
            arr[i] = nums.charAt(i) - '0'; // turns user input int into array
        }
    int x = 0;
        sc.close();
        return arr;
    }

    public static void unMod(int [] array) // undoes the mod on all elements in array
    {
        for(int i = 0; i < 4; i++)
        {
            array[i] = array[i] + 10;
        }


    }

    public static void sub7 (int [] array) // subtract 7 from all elements in array
    {
        for(int i = 0; i < 4; i++)
        {
            array[i] = array[i] - 7;
        }
        for(int i = 0; i < 4; i++)
        {
            if(array[i] > 9)
            {
                array[i] = array[i] % 10;
            }
        }
    }

    public static void swap(int [] array) // swaps elements in array
    {
        int a = array[0];
        int b = array [1];

        array[0] = array[2];
        array[1] = array[3];

        array[2] = a;
        array[3] = b;

    }


    public static void main(String args[])
    {
        int [] myArr = getInput();

        swap(myArr);
        unMod(myArr);
        sub7(myArr);

        for(int i = 0; i < 4; i++)
        {
            System.out.print(myArr[i]);
        }
    }
}
