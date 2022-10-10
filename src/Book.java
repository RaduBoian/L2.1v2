public class Book {
    private String name;
    private int year_of_publish;

    public Book(String name,int year_of_publish){
        this.name=name;
        this.year_of_publish=year_of_publish;
    }

    public void set_name(String new_name){
        name=new_name;
    }

    public String get_name(){
        return name;
    }

    public void set_year(int new_year){
        year_of_publish=new_year;
    }

    public int get_year(){
        return year_of_publish;
    }
}
