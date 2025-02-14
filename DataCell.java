package cmd;

public class DataCell {
    private CellContent cellContent;
    private String borderLeftColor;
    private int colspan = 1;

    private boolean withBorder;
    private AlignmentType alignmentType = AlignmentType.LEFT;

    public DataCell(CellContent cellContent) {
        this.cellContent = cellContent;
    }

    public DataCell(CellContent cellContent, String borderLeftColor) {
        this.cellContent = cellContent;
        this.borderLeftColor = borderLeftColor;
    }

    public DataCell(CellContent cellContent, String borderLeftColor, int colspan, AlignmentType alignmentType) {
        this.cellContent = cellContent;
        this.borderLeftColor = borderLeftColor;
        this.colspan = colspan;
        this.alignmentType = alignmentType;
    }

    public DataCell(CellContent cellContent, String borderLeftColor, int colspan, boolean withBorder, AlignmentType alignmentType) {
        this.cellContent = cellContent;
        this.borderLeftColor = borderLeftColor;
        this.colspan = colspan;
        this.withBorder = withBorder;
        this.alignmentType = alignmentType;
    }
}
