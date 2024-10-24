import java.util.Scanner;

public class Module3 {

    String[] datascienceBooks = {"Machine Learning", "Operating System", "DBMS", "Software Engineering", "Foundation of Data Science"};
    String[] computerScienceBooks = {"Data Structure and Algorithm", "Computer Networks", "Computer Vision"};
    String[] ITBooks = {"Internet and Web Technology", "Artificial Intelligence", "Data Visualization"};

    public void chooseBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a department:");
        System.out.println("1 - Data Science");
        System.out.println("2 - Computer Science");
        System.out.println("3 - IT");

        int deptChoice = scanner.nextInt();
        String[] selectedBooks = null;

        switch(deptChoice) {
            case 1:
                System.out.println("You selected Data Science department.");
                selectedBooks = datascienceBooks;
                break;
            case 2:
                System.out.println("You selected Computer Science department.");
                selectedBooks = computerScienceBooks;
                break;
            case 3:
                System.out.println("You selected IT department.");
                selectedBooks = ITBooks;
                break;
            default:
                System.out.println("Invalid selection. Exiting.");
                return;
        }

        System.out.println("The available books are:");
        for (int i = 0; i < selectedBooks.length; i++) {
            System.out.println((i + 1) + " - " + selectedBooks[i]);
        }

        System.out.println("Choose a book by entering the number corresponding to the book:");
        int bookChoice = scanner.nextInt();

        if (bookChoice > 0 && bookChoice <= selectedBooks.length) {
            System.out.println("You selected the book: " + selectedBooks[bookChoice - 1]);
        } else {
            System.out.println("Invalid book selection.");
        }
    }
}
