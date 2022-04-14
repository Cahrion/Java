public class CustomerManager {
    private BaseLogger baseLogger;
    public CustomerManager(BaseLogger logger){
        this.baseLogger     = logger;
    }
    public void Add(){
        System.out.println("Müşteri eklendi");
        this.baseLogger.log("Log Mesajı");
    }
}
