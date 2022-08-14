package ch11;

public class MakeReport {

    private StringBuffer buffer = new StringBuffer();

    private String line = "=====================================\n";
    private String title = "이름 \t주소 \t\t\t전화번호\n";

    private void makeHeader()
    {
        buffer.append(line);
        buffer.append(title);
        buffer.append(line);
    }

    private void generateBody()
    {
        buffer.append("James \t");
        buffer.append("Seoul Korea \t");
        buffer.append("010-1234-1234\n");

        buffer.append("Tomas \t");
        buffer.append("NewYork US \t\t");
        buffer.append("010-5678-5678\n");
    }

    private void makeFooter()
    {
        buffer.append(line);
    }

    public String getReport()
    {
        this.makeHeader();
        this.generateBody();
        this.makeFooter();

        return buffer.toString();
    }
}
