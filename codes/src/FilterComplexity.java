import java.util.List;

public class FilterComplexity extends Filter {
    private Integer complexity;

    public FilterComplexity(Integer complexity){
        this.complexity = complexity;
    }

    @Override
    public void applyFilter(List<UserStory> aFiltrer){
        userStoryToRemove(aFiltrer);
        super.applyFilter(aFiltrer);
    }

    @Override
    public void userStoryToRemove(List<UserStory> aFiltrer){
        aFiltrer.removeIf(user -> user.getComplexiteEnPoints() > this.complexity);
    }
}
