import java.util.ArrayList;
import java.util.Scanner;

public class SortingLimitedLibrary {
	
	static void linearSearch(String target, ArrayList<Book> a)
	{
		for (int i = 0; i < a.size(); i++)
			{
				if (target.equals(a.get(i).getTitle()))
				{
					System.out.println(a.get(i).toString());
					break; //Stop loop if found
				}
				/*else if (!target.equals(a.get(i)));
				{
                    System.out.println("Not Found");
                }*/
			}
	}

	public static void main(String[] args) {
		
		//Case-sensitive search at the moment
		
		ArrayList<Book> smallLibrary = new ArrayList<Book>();
		Book a1 = new Book("Feed", "M.T. Anderson", "Candlewick Press", 2002);
		Book a2 = new Book("Wizard of OZ", "L. Frank Baum", "George M. Hill Company", 1900);
		Book a3 = new Book("Alice in Wonderland", "Lewis Carroll", "Macmillan", 1865);
		Book a4 = new Book("Haroun and the Sea of Stories", "Salman Rushdie", "Granta", 1990);
		Book a5 = new Book("1984", "George Orwell", "Harvill Secker", 1949);
		Book a6 = new Book("Animal Farm", "George Orwell", "Secker and Warburg", 1945);
		Book a7 = new Book("Elsewhere", "Gabrielle Zevin", "Farrar", 2005);
		Book a8 = new Book("Farenheit 451", "Ray Bradbury", "Ballantine Books", 1953);
		Book a9 = new Book("The Autobiography of Malcolm X", "Malcolm X", "Grove Press", 1965);
		Book a10 = new Book("Black Boy", "Richard Wright", "Harper", 1945);
		smallLibrary.add(a1);
		smallLibrary.add(a2);
		smallLibrary.add(a3);
		smallLibrary.add(a4);
		smallLibrary.add(a5);
		smallLibrary.add(a6);
		smallLibrary.add(a7);
		smallLibrary.add(a8);
		smallLibrary.add(a9);
		smallLibrary.add(a10);
		
		@SuppressWarnings("resource")
		Scanner Keyboard = new Scanner(System.in);
		
		System.out.print("Enter name, author, publisher, or year of book, enter 'quit' to quit: " );
		String s= Keyboard.nextLine();
			if (s.equalsIgnoreCase("quit")) //"Quit isn't case-sensitive...Quit anyway you like.
			{
				System.exit(-1);
			}

		linearSearch(s, smallLibrary);
	}
}
