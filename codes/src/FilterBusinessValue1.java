import java.util.List;

public class FilterBusinessValue1 extends Filter {
    @Override
    public void applyFilter(List<UserStory> aFiltrer){
        aFiltrer.removeIf(user -> user.getBusinessValueEnEuro() < 30);
        super.applyFilter(aFiltrer);
    }
}
