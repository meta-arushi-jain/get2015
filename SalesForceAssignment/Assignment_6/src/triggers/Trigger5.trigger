trigger Trigger5 on Opportunity (before update) {
  for(Opportunity o : Trigger.New){
      if(o.stageName =='Closed Won' || o.StageName=='Closed Lost'){
          o.CloseDate = Date.today();
      }
  }
}