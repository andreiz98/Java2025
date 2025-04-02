package session_12_OOP_3;

import java.util.List;

public interface CsvExpb {
    void exportToCsv();
}

abstract class Report {
    public String title;
    public List<String> data;

    Report(String title, List<String> data) {
        this.title = title;
        this.data = data;
    }

    public void display() {
        System.out.println("title: " + title);
    }

    public abstract void showPreview();
}


class CsvReport extends Report implements CsvExpb {

    CsvReport(String title, List<String> data) {
        super(title, data);
    }

    @Override
    public void exportToCsv() {
        System.out.println("export");
    }

    @Override
    public void showPreview() {
        System.out.println("preview");
    }
}

interface PdfExportable {
    void exportToPdf();
}

class PdfReport extends Report implements PdfExportable {
    PdfReport(String title, List<String> data) {
        super(title, data);
    }

    @Override
    public void showPreview() {
        System.out.println("preview");
    }

    @Override
    public void exportToPdf() {
        System.out.println("export to pdf");
    }
}


class Main {
    public static void main(String[] args){
        CsvReport csv = new CsvReport("Example Table", List.of("1", "2"));
        csv.display();
        csv.exportToCsv();
        csv.showPreview();

        PdfReport pdf = new PdfReport("Pdf content", List.of("1", "2"));
        pdf.display();
        pdf.exportToPdf();
        pdf.showPreview();
    }
}