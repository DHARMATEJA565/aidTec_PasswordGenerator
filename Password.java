import java.util.Scanner;
import java.util.Random;

public class Password {

	public String UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
	public String NUMBERS = "0123456789";
	public String SYMBOLS = "!@#$%^&*()_+=-<,>./?;[]{}\"";
	public String b="";

  	public String Generator(int n,String Pool,int x){ //Generates the password 
		for(int i=x ; i<n; ++i)
		{
			int  rand = new Random().nextInt(Pool.length());
			char randc = Pool.charAt(rand);
			b = b + randc;
		}
		return b;
	}

	public String Charset(int a ){ // To select the character set
	    String str ="";
	    while(a!=0){
		int rand =0;
		char randc='a';
		int c = a%10;
		a=a/10;
		switch(c){
			case 1 : str = str + UPPERCASE_LETTERS;
				//to append atleast one upper case letter
			         rand = new Random().nextInt(UPPERCASE_LETTERS.length());
			         randc =UPPERCASE_LETTERS.charAt(rand);
			         b = b+randc;
				 break;

			case 2 : str = str + LOWERCASE_LETTERS;
				 //to append atleast one lower case letter
			         rand = new Random().nextInt(LOWERCASE_LETTERS.length());
			         randc = LOWERCASE_LETTERS.charAt(rand);
			         b = b+randc;
			         break;

			case 3 : str = str + NUMBERS;
				 //to append atleast one number
			         rand = new Random().nextInt(NUMBERS.length());
			         randc = NUMBERS.charAt(rand);
			         b = b+randc;
        			 break;

			case 4 : str = str + SYMBOLS;
				 //to append atleast one special character
			         rand = new Random().nextInt(SYMBOLS.length());
			         randc = SYMBOLS.charAt(rand);
			         b = b+randc;
 	              		 break;
		}
            }
           return str;
        }

	public static void main (String [] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("\n\n			**** PASSWORD GENERATOR ****");
		System.out.print("\nEnter the length of password :");
		int l = sc.nextInt();
		System.out.println("Select the Character set to be used :\n 1.UPPER CASE LETTERS \n 2.LOWER CASE LETTERS \n 3.NUMBERS \n 4.SPECIAL CHARACTERS ");
		System.out.print("Enter the numbers side by side :");
		int num = sc.nextInt();
		int num1=num;
		int c=0;
		while(num1!=0){
			num1=num1/10;
			c++;
		}
		Password obj = new Password();
                String ch = obj.Charset(num);
		System.out.print("\n YOUR PASSWORD IS   :    ");
		System.out.print(obj.Generator(l,ch,c) + "\n");

}
}