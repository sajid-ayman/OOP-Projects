
package library.management.system;

public class LibraryManagementSystem {

    public static void main(String[] args) {
        // array of object hold books 
        Book [] books = new Book[4];
        
        //
        Librarian librarian = new Librarian("Alia",2);
        
        //
        Member[] members = new Member[3];
        
        
        //add books to the library 
        librarian.addBook(books, new Book("Java","1","Mahmoud"), 0);
        librarian.addBook(books, new Book("C++","8","Mahmoud"), 1);
        librarian.addBook(books, new Book("Python","3","Mahmoud"), 2);
        
        System.out.println("------------------------");
        
        // Register member
        librarian.registerMember(members, new Member("Amr",201), 0);
        librarian.registerMember(members, new Member("Sajid",231), 1);
        librarian.registerMember(members, new Member("Islam",291), 2);
        
        System.out.println("------------------------");
        
        //Borrow a book
        members[0].borrowBook(books[0]);
        
        System.out.println("------------------------");
        
        //Display available book
        System.out.println("Avilable Books:");
        for (Book book : books) {
            if(book != null ){
                System.out.println(book.title+" by "+book.author);
            }
            
        }
        
        
    }
    
}
