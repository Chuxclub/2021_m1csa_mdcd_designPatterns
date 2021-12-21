import java.util.List;

public class FilterBusinessValue extends Filter {
    private Integer businessValue;

    public FilterBusinessValue(Integer businessValue){
        this.businessValue = businessValue;
    }

    @Override
    public void applyFilter(List<UserStory> aFiltrer){
        aFiltrer.removeIf(user -> user.getBusinessValueEnEuro() < businessValue);
        super.applyFilter(aFiltrer);
    }
}
