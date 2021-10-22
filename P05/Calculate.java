public class Calculate
{
    public static void main(String[] args)
    {
        char choice;
        int length, width;
        double area;

        length = inputInteger("Input the length");
        width = inputInteger("Input the width");

        choice = inputCharacter("Enter the units, Input M for Metres, or C for Centimetres");

        area = calcArea(length, width);

        switch (choice)
        {
            case 'M':
                System.out.println("The area is " + area + " m^2");
            case 'C':
                System.out.println("The area is " + area + " cm^2.");
            default:
                System.out.println("You have entered a wrong letter!");
        }
    }

    public static char inputCharacter()
    {
        Scanner sc = new Scanner(System.in);
        int character;

        System.out.println(prompt);

        character = sc.nextChar();

        return character;
    }

    public static int inputInteger(String prompt)
    {
        int integer;
        Scanner sc = new Scanner(System.in);

        System.out.println("prompt");

        integer = sc.nextInt();

        return integer;
    }

    public static int calcArea(int length, int width)
    {
        double area;

        area = (double)length * (double) width;

        return area;
    }


}
