public class Application {
    public static void main(String[] args)
    {
        //parent class object
        LibraryItem item1= new LibraryItem("1","PCS","Mahesh Arali");
        item1.displayInfo();

        //child class object
        Book book1= new Book("2","DSA","Bari",368);
        book1.displayInfo();
        book1.checkOut();

        //book1.searchItems("PCS");
        //item1.searchItems("DSA");

        Magazine Magazine1= new Magazine("1","Spardha Spoorthi","Chanakya Academy",45327);
        Magazine1.displayInfo();
        Magazine1.checkOut();


        Ebook Ebook1 = new Ebook("eB1","DSA.pdf","Abhishek",234,"pdf");
        Ebook1.displayInfo();

        //override check
        LibraryItem li = new Book("2", "DSA", "Bari", 368);//This is called upcasting:
                                                                        //Child object (Book) is assigned to parent reference (LibraryItem).
        li.displayInfo(); 

    }
}
