@IsTest
public class StackTest  {
   @isTest static void testPushMethod(){
      StackClass test=new StackClass();
       test.push(new Account(Name='abc'));
       Account TestAcc = (Account)test.peek();
       system.assertEquals('abc',TestAcc.Name);
       
      }
    @isTest static void testPopMethod(){
       StackClass test=new StackClass();
       test.push(new Account(Name='abc'));
       Account TestAcc = (Account)test.pop();
       system.assertEquals('abc',TestAcc.Name);
    }
   
   @isTest static void testNullPopMethod(){
       StackClass test=new StackClass();
       Account TestAcc = (Account)test.pop();
       system.assertEquals(null,TestAcc);    
      }
        
   @isTest static void testNullPeekMethod(){
       StackClass test=new StackClass();
       Account TestAcc = (Account)test.peek();
       system.assertEquals(null,TestAcc); 
      }
}