@isTest
public class StudentListTest {
    
    @testSetup static void addClass(){
        Class__c testClass = new Class__c(Name__c = 'tenth',MaxSize__c=40,MyCount__c=0);
        insert testClass;
        List<Student__c> listStud=new List<Student__c>();
        Student__c std = new Student__c(Name = 'abc' , LastName__c = 'aaa', Class__c = testClass.Id);
        listStud.add(std);
        Student__c std1 = new Student__c(Name = 'abc1' , LastName__c = 'aaa', Class__c = testClass.Id);
        listStud.add(std1);
        insert listStud;
    }
    
    @isTest static void testStudentsList() {
        Class__c test = [Select Id From Class__c  where  Name__c = 'tenth'];
        List<String> testList =  StudentList.StudentsList(test.Id);
        System.assertEquals(2, testList.size());
    }
    
    @isTest static void testgetMapOfClass() {
        System.assertEquals(1,  StudentList.getMapOfClass().size());
    }
    
    @isTest static void testgetWorkingDays() {
        Date date1=Date.newInstance(2016, 1, 6);
        Date date2=Date.newInstance(2016, 1, 8);
        System.assertEquals(3,StudentList.getWorkingDays(date1, date2));
    }
    
}