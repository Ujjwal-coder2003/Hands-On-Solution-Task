public class Main {
    public static void main(String[] args) {
        // Create a Word document
        DocumentFactory WORD = new WordDocumentFactory();
        Document WORDdoc = WORD.createDocument();
        WORDdoc.openDocument();

        // Create a PDF document
        DocumentFactory PDF = new PdfDocumentFactory();
        Document PDFdoc = PDF.createDocument();
        PDFdoc.openDocument();

        // Create an Excel document
        DocumentFactory EXCEL = new ExcelDocumentFactory();
        Document EXCELdoc = EXCEL.createDocument();
        EXCELdoc.openDocument();
    }
}