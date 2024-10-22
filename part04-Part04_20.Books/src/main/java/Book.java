public class Book {
    private String title;
    private int pages;
    private int years;
    
    public Book(String title, int pages, int year){
        this.title = title;
        this.pages = pages;
        this.years = year;
    }
    
    public String getBookTitle(){
        return this.title;
    }
    
    public int getBookPage(){
        return this.pages;
    }
    
    public int getPublicationYear(){
        return this.years;
    }
    @Override
    public String toString(){
        return this.title + ", " + this.pages + " pages, " + this.years;
    }
}
