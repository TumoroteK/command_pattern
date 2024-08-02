package cmd;

import java.util.List;

public interface DocumentProducer {
    void produce(List<DocumentToGenerate> documents);
}
