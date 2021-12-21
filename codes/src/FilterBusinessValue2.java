import java.util.List;

public class FilterBusinessValue2 extends Filter {
    @Override
    public void applyFilter(List<UserStory> aFiltrer){
        aFiltrer.removeIf(user -> user.getBusinessValueEnEuro() < 10);
        super.applyFilter(aFiltrer);
    }
}
