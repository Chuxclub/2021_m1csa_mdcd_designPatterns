import java.util.List;

public class FilterStoryType extends Filter {
    private TypeUserStory storyType;

    public FilterStoryType(TypeUserStory storyType){
        this.storyType = storyType;
    }

    @Override
    public void applyFilter(List<UserStory> aFiltrer){
        userStoryToRemove(aFiltrer);
        super.applyFilter(aFiltrer);
    }

    @Override
    public void userStoryToRemove(List<UserStory> aFiltrer){
        aFiltrer.removeIf(user -> user.getType() == this.storyType);
    }
}
