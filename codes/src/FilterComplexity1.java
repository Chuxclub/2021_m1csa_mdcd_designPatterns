import java.util.List;

public class FilterComplexity1 extends Filter {
    @Override
    public void applyFilter(List<UserStory> aFiltrer){
        aFiltrer.removeIf(user -> user.getComplexiteEnPoints() > 150);
        super.applyFilter(aFiltrer);
    }
}
