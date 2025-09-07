public class Magazine extends LibraryItem{
    private int issueNumber;

    public Magazine(String Id,String Title,String Author,int issueNumber)
    {
        super(Id,Title,Author);
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Issue Number of MAgazine is : " + issueNumber);
    }

    public void checkOut(){
        System.out.println("Magazine is checked out");
    }
}
