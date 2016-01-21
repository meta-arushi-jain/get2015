public with sharing class AttachPdf
{
    public Student__c studentItem{get;set;} 
    public string idVal{get;set;} 
   
    public AttachPdf(ApexPages.StandardController stdController)
    {
        idVal =stdController.getId(); 
     
        studentItem = [Select ID, Name From Student__c where ID = :idVal];
        
     
    } 
    public void savePDF(){
       
        PageReference pagePdf = new PageReference('/'+idVal);
        pagePdf.getParameters().put('id', idVal);
        Blob pdfPageBlob;
        pdfPageBlob = pagePdf.getContentAsPDF();
        Attachment a = new Attachment();
        a.Body = pdfPageBlob; a.ParentID = idVal;
        a.Name = 'Student'+idVal+'.pdf';
        a.Description = 'TestDescription1';
        insert a;
      
    } 
}