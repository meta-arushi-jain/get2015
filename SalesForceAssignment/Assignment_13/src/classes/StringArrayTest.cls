public class StringArrayTest {
    public static List<String> generateStringArray(Integer n) {
        List<String> test = new List<String>();
        For(Integer i=0;i<n;i++){
            test.add('Test '+i);
        }
       System.debug(test);
       return test;  
        
    }
     
}