public class BookController {
    private Book[] shelf=new Book[10];
    private int nr_books;
    public BookController(){
        nr_books=0;
    }

    public void add_book(String name,int year){
        Book book=new Book(name,year);
        if(nr_books==shelf.length){
            Book[] new_repo= new Book[shelf.length*2];
            for(int i=0;i<shelf.length;i++)
                new_repo[i]=shelf[i];
            shelf=new_repo;
        }
        shelf[nr_books++]=book;
    }

    public void rm_book(String name){
        for(int i=0;i<nr_books;i++) {
            if (shelf[i].get_name() == name) {
                shelf[i] = shelf[nr_books - 1];
                nr_books--;
            }
        }
    }

    public void show_books(){
        for(int i=0;i<nr_books;i++)
            BookView.print_str(shelf[i].get_name() +" "+shelf[i].get_year() );
    }
}
