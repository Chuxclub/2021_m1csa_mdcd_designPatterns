import java.util.List;

public class FilterComplexity extends Filter {
    private Integer complexity;

    public FilterComplexity(Integer complexity){
        this.complexity = complexity;
    }

    @Override
    public void userStoryToRemove(List<UserStory> aFiltrer){
        aFiltrer.removeIf(user -> user.getComplexiteEnPoints() > this.complexity);
    }
}
