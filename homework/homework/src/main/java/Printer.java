public class Printer {

    private int paper;

    public Printer(int paper) {
        this.paper = paper;
    }

    public int getPaper() {
        return paper;
    }

    public void setPaper(int paper) {
        this.paper = paper;
    }

    public int print(int pages, int copies) {
        if(this.paper > pages) {
            return this.paper - (pages * copies);
        }
        return String.format("The printer has %d paper to make %d copies.", 0, 0);
    }
}
