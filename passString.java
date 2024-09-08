public class passString
//5-7
{
    public static void main(String[] args)
    {
        // create a string object conaining "Shakespere".
        // the name variab;le reference the object.
        String name = "Shakespere";

        // display the string reference by the name variabnle 
        System.out.println("In main, the name is " + name);

        // call the change name method passing the contents of the name variable as an argument.
        changeName(name);

        // display the string referenced by the name variable 
        System.out.println("back in main, the name is " + name);

    }

/** The changename method accepts a string as its argument and assigns the str parameter to a new string */

    public static void changeName(String str)
    {
        // create a string object containing "Dickens"
        // assign its address to the str parameter
        str = "Dickens";

        // display the string referenced by str
        System.out.println("In changeName, the name is " + str);
    }
}