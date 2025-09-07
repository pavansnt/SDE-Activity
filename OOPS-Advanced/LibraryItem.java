public  class LibraryItem{
    public String id;
    private String title;
    String author;
    public LibraryItem(String Id, String Title, String Author) {
        this.id = Id;
        this.title = Title;
        this.author=Author;
        }

    public void  displayInfo(){
        System.out.println("--------------------------------------");
        System.out.println("\nThe Id of book is : " + this.id);
        System.out.println("The Title of book is : " + this.title);
        System.out.println("The Author of book is : " + this.author);
      }

    private void searchItem(String name){
        System.out.println("Searching for book : " + name);
    }

    protected void searchItems(String name){
        System.out.println("Inside protected method - Search");
        this.searchItem(name);
    }

    //abstract void checkOut();
}