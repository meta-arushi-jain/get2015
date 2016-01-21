public with sharing class PaginationExtension {
    Public Integer noOfRecords{get; set;}
    Public Integer size{get;set;}
    
    public string BillingCity{get;set;}
   public string BillingState{get;set;}
   public string BillingCountry{get;set;}
      public List<Account> getAccounts{get;set;}
    
    public ApexPages.StandardSetController setCon {
        get{
            if(setCon == null) {
                size = 10;
					List<Account > createAccountList=null;
                    string Query = 'SELECT id,name,billingcity,billingCountry,billingState FROM Account where ';
                      if(string.isBlank(BillingCity)  && string.isBlank(BillingState) && string.isBlank(BillingCountry)) 
                     {
                          Query = 'SELECT id,name,billingcity,billingCountry,billingState FROM Account';
                 	 }    
                      if(!(string.isBlank(BillingCity)))
                      {
                           Query = Query + 'billingcity LIKE \'%'+BillingCity+'%\' AND ';
                      
                      }
                      if(!(string.isBlank(BillingCountry)))
                      {
                          Query = Query + ' billingcountry  LIKE  \'%'+BillingCountry+'%\' AND ';
                      }
                      if(!(string.isBlank(BillingState)))
                      {
                        Query = Query +  ' billingstate LIKE  \'%'+BillingState+'%\' AND ';
                      }
                      if(Query.substring(Query.length()-4,Query.length()).equals('AND '))
                      {
                      Query= Query.substring(0,Query.length()-4);
                      }
                      Query = Query + ' limit 100';
                      createAccountList= Database.query(Query);       
                     
                       setCon = new ApexPages.StandardSetController(createAccountList);
            
                setCon.setPageSize(size);
                noOfRecords = setCon.getResultSize();
    
            }
            return setCon;
        }set;
    }
    
    public void searchRecords(){
        getAccounts= (List<Account>) setCon.getRecords();
   }
}