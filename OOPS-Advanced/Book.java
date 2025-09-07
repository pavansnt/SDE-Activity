public class Book extends LibraryItem{
    private int pages;

    public Book(String Id,String Title,String Author,int Pages){
            super(Id, Title, Author);
            this.pages=Pages;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("pages : " + pages);
    }

    public void checkOut(){
        System.out.println(" is checked out");
    }

    // public void printBookDetails()
    // {
    //     System.out.println(this.title);
    //     System.out.println(this.author);
    //     System.out.println(this.category);
    //     System.out.println(this.id);
    // }
}