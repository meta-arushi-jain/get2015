public class StudentList {
    public static List<Student__C> StudentsList(ID id){
        list<Student__c>studentList=[Select s.Name From Student__c s where  s.Class__r.ID=:id];
        System.debug(studentList); 
        return studentList; 
        
}
    
    
    public static Map<Class__c,Set<ID>>MapofClassAndStudentId(){
         list<Class__c>classList=[Select c.ID From Class__c c];
        Map<Class__c, Set<ID>> mapStudentInClass = new Map<Class__c, Set<ID>>();
        for(Integer i =0;i<classList.size();i++){
           Set<ID> studentSet= new Map<Id, Student__c>([Select s.ID from Student__c s where s.Class__r.id=:classList.get(i).Id ]).keySet();

           mapStudentInClass.put(classList[i],studentSet); 
        }
         System.debug(mapStudentInClass);
        return mapStudentInClass;

    }
    
     public static Integer getWorkingDays(Date startDate,Date dueDate){
      
        Date instance=Date.newInstance(1900, 1, 7);
        Integer count=0; 
        Integer value=math.mod(startDate.daysBetween(instance), 7);
        
        Integer numberDaysDue = startDate.daysBetween(dueDate)+1;
        System.debug(numberDaysDue);
        
        Integer rem=math.mod(numberDaysDue, 7);
        
        Date tempDate = dueDate.addDays(-(rem-1));
        
        
        Integer weeks = numberDaysDue/7;
        for(Integer i = 0; i< rem; i++) {
            if(math.mod(instance.daysBetween(tempDate), 7)>=1 && math.mod(instance.daysBetween(tempDate), 7)<=5)  {
              count++;
            }
            System.debug(count+'  '+math.mod(instance.daysBetween(tempDate), 7));
             tempDate=tempDate.addDays(1);
        }
        count = count+5*weeks;
        System.debug(numberDaysDue+'  '+count);
		return count;
    } 

}