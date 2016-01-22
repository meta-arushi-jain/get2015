trigger Trigger1 on Contact (before insert,after update) {
      for(Contact cnt:Trigger.new)
    {
        if(cnt.Subjects__c.Contains('Hindi'))
        {
            cnt.addError('Not allowed hindi teacher to insert or update');
        }
    }

}