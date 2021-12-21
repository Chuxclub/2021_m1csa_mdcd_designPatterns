import java.util.List;

public class FilterStoryType1 extends Filter {
    @Override
    public void applyFilter(List<UserStory> aFiltrer){
        aFiltrer.removeIf(user -> user.getType() == TypeUserStory.TECHNICAL);
        super.applyFilter(aFiltrer);
    }
}
