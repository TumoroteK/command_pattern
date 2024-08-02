package cmd;

import java.util.List;

public abstract class AbstractPlanCongelateurGenerator implements PlanCongelateurGenerator {
    public void generate(List<Conteneur> list) {

    }

    protected DocumentWithDataAsArray buildPlanConteneur(Conteneur c) {
        return new DocumentWithDataAsArray();
    }


    protected DocumentContext buildEntetePlan(Conteneur c){
        return new DocumentContext();
    }


    protected  DocumentWithDataAsArray buildDetailPlan(Conteneur c){
        return null;
    }



    protected abstract DocumentFooter buildPiedPagePlan(Conteneur c);

    protected abstract DocumentProducer getDocumentProducer();

}
