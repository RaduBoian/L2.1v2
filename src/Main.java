public class Main {
    public static void main(String[] args) {
        BookController ctrl=new BookController();
        ctrl.add_book("bla",1234);
        ctrl.show_books();
        ctrl.rm_book("bla");
        ctrl.show_books();

    }
}