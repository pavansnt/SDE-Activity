public class Ebook extends Book {
    private String format;

    public Ebook(String id, String title,String Author,int pages,String format)
    {
        super(id, title, Author, pages);
        this.format = format;
    }
    @Override
    public  void displayInfo()
    {
        super.displayInfo();
        System.out.println("Format: " + format);
    }
}
