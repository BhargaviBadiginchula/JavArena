class Book{
    private String bookName;
    private String author;
    
    Book(String book,String author){
        this.bookName = book;
        this.author=author;
        
    }
    void show(){
        System.out.println("library has a book  called "+bookName+" by "+author);
    }
}  


public class Library {
    Book book;
    Library(Book book){
        this.book=book;
        
    }

    public static void main(String[] args){
        Library lib=new Library(new Book("java","Devansh"));
        lib.book.show();
    }
}
