package cmd;

public abstract class AbstractPlanCongelateurSansBoiteGenerator extends AbstractPlanCongelateurGenerator {
    @Override
    protected DocumentWithDataAsArray buildDetailPlan(Conteneur c) {

        return new DocumentWithDataAsArray();
    }
}