/**
 * Created by User on 11.12.2016.
 */
public abstract class ItCompany implements Company {

    private String name;
    private String location;
    private int developers;

    public void setName(String name){
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setWorkers(int developers) {
        this.developers = developers;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public int getWorkers() {
        return developers;
    }
}
