trigger MailService1 on Loan__c (before update) {
    List<Loan__c> loanList = new List<Loan__c>();
   for(Loan__c loan : Trigger.new) {
       if((loan.Status__c == 'Approved' || loan.Status__c == 'Rejected')) {
           loanList.add(loan);
       }
   }
   if(loanList.size() > 0) {
       try{
           
           Messaging.SingleEmailMessage email = new Messaging.SingleEmailMessage();
           for(Loan__c loan : loanList) {
               String[] toAddress = new List<String>() ;
               toAddress.add(loan.Applicant_Email__c);
        email.setSenderDisplayName(loan.Manager__c);  
             
               email.setToAddresses(toAddress);
               email.plainTextBody = 'Hii Your Loan is '+loan.Status__c;
               Messaging.SendEmail(New Messaging.SingleEmailMessage[] {email});
           }
       }catch(Exception e) {
           System.debug(e);
       }
      
   }  

}