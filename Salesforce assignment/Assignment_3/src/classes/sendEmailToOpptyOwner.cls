global class sendEmailToOpptyOwner implements Database.Batchable<SObject>{
   global Database.QueryLocator start(Database.BatchableContext BC){
      Date Date1=System.today().addDays(-1); 
     return Database.getQueryLocator('Select Id,Owner.Email from Opportunity where LastModifiedDate <:Date1');
   }

   global void execute(Database.BatchableContext BC, List<Opportunity > scope){
   
       List<Messaging.SingleEmailMessage> mailList = new List<Messaging.SingleEmailMessage>();
     for(Opportunity s : scope){

        Messaging.SingleEmailMessage mail = new Messaging.SingleEmailMessage();

        String[] toAddresses = new String[] {s.Owner.Email};

        mail.setToAddresses(toAddresses);

        mail.setSubject('RegardingUpdatationOfOpportunity');

        mail.setPlainTextBody('Accountisnotupdatedfrom30days');

        // Pass this email message to the built-in sendEmail method

        // of the Messaging class
        mailList.add(mail);
       
     }
     Messaging.sendEmail(mailList);

   }

   global void finish(Database.BatchableContext BC){
   }

}