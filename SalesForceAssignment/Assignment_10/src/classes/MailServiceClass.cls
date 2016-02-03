global class MailServiceClass implements Messaging.InboundEmailHandler {
    
    global Messaging.InboundEmailResult handleInboundEmail(Messaging.InboundEmail email, Messaging.InboundEnvelope envelope) {
        
        Messaging.InboundEmailResult result = new Messaging.InboundEmailResult();
        for (Messaging.Inboundemail.TextAttachment file : email.textAttachments) {
            list<Contact>contactList=new list<Contact>();
            String fileBody = (String)file.body;
            
            
            Dom.Document doc = new Dom.Document();
            doc.load(fileBody);
            
            for(DOM.XMLNode xmlnodeobj:doc.getRootElement().getChildElements())
            {          Contact con = new Contact();
                 
            String fName = xmlnodeobj.getChildElement('fname', null).getText();
            //system.assertEquals(null, fName);
            String lName = xmlnodeobj.getChildElement('lname', null).getText();
            system.debug(fName + ' ' + lName);
                  con.FirstName = fName;
           con.LastName = lName;
             contactList.add(con);
             system.debug(contactList);
                
            }
            
            insert contactList;
            
        }
        
  return result;
    }
}