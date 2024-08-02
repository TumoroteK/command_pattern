package cmd;

import java.util.List;

public class DocumentWithDataAsArray extends DocumentToGenerate {
    private List<CellLine> listCellLine;

    @Override
    public DataAsArray getData() {
        return (DataAsArray) super.getData();
    }
}
