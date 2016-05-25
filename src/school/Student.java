package school;

/**
 *
 * @author mustafa
 */
public class Student {
    private String name;
    private String uniqueID;

    public Student(String name, String uniqueID) {
        this.name = name;
        this.uniqueID = uniqueID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }
    
}
