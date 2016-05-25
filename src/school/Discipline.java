package school;

/**
 *
 * @author mustafa
 */
public class Discipline {
    private String name;
    private int countLessons;
    private int countExcercises;

    public Discipline(String name, int countLessons, int countExcercises) {
        this.name = name;
        this.countLessons = countLessons;
        this.countExcercises = countExcercises;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountLessons() {
        return countLessons;
    }

    public void setCountLessons(int countLessons) {
        this.countLessons = countLessons;
    }

    public int getCountExcercises() {
        return countExcercises;
    }

    public void setCountExcercises(int countExcercises) {
        this.countExcercises = countExcercises;
    }
    
}
