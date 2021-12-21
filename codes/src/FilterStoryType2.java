import java.util.List;

public class FilterStoryType2 extends Filter {
    @Override
    public void applyFilter(List<UserStory> aFiltrer){
        aFiltrer.removeIf(user -> user.getType() == TypeUserStory.POC);
        super.applyFilter(aFiltrer);
    }
}
