package cmd;

public class CellContent {
    private String firstLineLabel;
    private String secondLineLabel;
    private boolean secondLineInItalic;



    public CellContent(String firstLineLabel) {
        this.firstLineLabel = firstLineLabel;
    }

    public CellContent(String firstLineLabel, String secondLineLabel) {
        this.firstLineLabel = firstLineLabel;
        this.secondLineLabel = secondLineLabel;
    }

    public CellContent(String firstLineLabel, String secondLineLabel, boolean secondLineInItalic) {
        this.firstLineLabel = firstLineLabel;
        this.secondLineLabel = secondLineLabel;
        this.secondLineInItalic = secondLineInItalic;
    }
}
