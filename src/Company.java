/**
 * Created by User on 11.12.2016.
 */
public interface Company {

    public abstract void setName(String name);
    public abstract String getName();
    public abstract void setLocation(String location);
    public abstract String getLocation();
    public abstract void setWorkers(int developers);
    public abstract int getWorkers();
}
