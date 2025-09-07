public class Application {
    public static void main(String[] args) 
    {
        AlphalibManagement AlphaApp = new AlphalibManagement();
        AlphaApp.checkout();
        System.out.println("-------------------------");

        IlibManagement appHandler;
        
        boolean isAlpha=true;
        
        if(isAlpha)
        {
            appHandler= new AlphalibManagement();
        }
        else
        {
            appHandler = new BetalibManagement();
        }
        
        //common code for the application
        appHandler.init();
        appHandler.checkout();
        appHandler.checkin();
       
        
        

    }
}
