/**
 * Created by User on 11.12.2016.
 */
public class InterLink extends ItCompany {

    public InterLink() {
        setName("InterLink");
        setLocation("Ukraine");
        setDevelopers(50);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setLocation(String location) {
        super.setLocation(location);
    }

    @Override
    public void setDevelopers(int developers) {
        super.setDevelopers(developers);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getLocation() {
        return super.getLocation();
    }

    @Override
    public int getDevelopers() {
        return super.getDevelopers();
    }

}
