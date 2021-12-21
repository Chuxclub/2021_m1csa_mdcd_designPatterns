import java.util.List;

public class FilterComplexity2 extends Filter {
    @Override
    public void applyFilter(List<UserStory> aFiltrer){
        aFiltrer.removeIf(user -> user.getComplexiteEnPoints() > 300);
        super.applyFilter(aFiltrer);
    }
}
