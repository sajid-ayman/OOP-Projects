package library.management.system;

public class Member extends Person {

    int borrowedBookId;

    // اضافة كتاب جديد
    // في اي كلاس لازم اكون موجود 
    public Member(String name, int memberId){
        super(name, memberId);
        this.borrowedBookId=-1;
    }
    
    public void borrowBook(Book book){
        if(borrowedBookId==-1 && !book.isBorrowed){
            System.out.println(name+" has borrowed "+book.title+" .");
            book.isBorrowed=true;
        }else{
            System.out.println(book.title+" is already borrwed.");
        }
    }
    }

