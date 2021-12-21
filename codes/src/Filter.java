import java.util.List;

public abstract class Filter {
    private Filter nextFilter;

    public void setNextFilter(Filter nextFilter) {
        this.nextFilter = nextFilter;
    }

    public abstract void userStoryToRemove(List<UserStory> aFiltrer);

    public void applyFilter(List<UserStory> aFiltrer){
        if(this.nextFilter != null)
            this.nextFilter.applyFilter(aFiltrer);
    }
}
