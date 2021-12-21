import java.util.List;

public class FilterComplexity extends Filter {
    private Integer complexity;

    public FilterComplexity(Integer complexity){
        this.complexity = complexity;
    }

    public void applyFilter(List<UserStory> aFiltrer){
        aFiltrer.removeIf(user -> user.getComplexiteEnPoints() > this.complexity);
        super.applyFilter(aFiltrer);
    }
}
