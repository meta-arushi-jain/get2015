public class GovernerLimitController {
    public List<Account> accList { get; set; }
   public double percent{get; set;}
   public boolean display{get;set;}
   public GovernerLimitController(){
       accList=new List<Account>();
       display=false;
   }
   public void updateAccount() {
       accList=[Select Id,Name from Account Limit 10];
       update accList;
       display=true;
       percent=limits.getQueries();
       System.debug('No Of Queries Executed' +limits.getQueries());
       System.debug('Queries Limit' +limits.getLimitQueries());
   }
}