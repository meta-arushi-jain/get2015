public class AccountExtensions {
 public string getBillingCitystring{get;set;}
   public string getBillingStatestring{get;set;}
   public string getBillingCountrystring{get;set;}

   public Integer getResultSize{get;set;}
   public List<Account> getAccounts{get;set;}
     public Integer PageNumber{get;set;}
       public Integer PageSize{get;set;}

     public ApexPages.StandardSetController setCon {
        get {
            if(setCon == null) {
                if(string.isBlank(getBillingCitystring)&&string.isBlank(getBillingStatestring)&&string.isBlank(getBillingCountrystring)) 
      			{
          			 setCon = new ApexPages.StandardSetController(Database.getQueryLocator(
                   			 [SELECT id,name,billingcity,billingCountry,billingState FROM Account limit 100]));
   				}    
      			 else 
      			 {
                     
                     List<Account> accountList = Database.query('SELECT id,name,billingcity,billingCountry,billingState FROM Account WHERE billingcity LIKE \'%'+getBillingCitystring+'%\'  AND billingcountry  LIKE  \'%'+getBillingCountrystring+'%\' AND billingstate LIKE  \'%'+getBillingStatestring+'%\' Limit 100');                   
                     ApexPages.StandardSetController ssc = new ApexPages.StandardSetController(accountList);
            
       			}
    
            }
            return setCon;
        }
        set;
    }
 
    
    
   public void searchRecords(){
       
        getAccounts= (List<Account>) setCon.getRecords();
       getResultSize=getAccounts.size();
       PageNumber=1;
       PageSize=5;
   }
}