package cmd;

public abstract class AbstractPlanCongelateurAvecBoiteGenerator extends AbstractPlanCongelateurGenerator {
    @Override
    protected DocumentWithDataAsArray buildDetailPlan(Conteneur c) {
        return new DocumentWithDataAsArray();
    }
}