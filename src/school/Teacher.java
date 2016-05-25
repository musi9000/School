package school;

import java.util.ArrayList;

/**
 *
 * @author mustafa
 */
public class Teacher {
    private String name;
    private ArrayList<Discipline> discipline = new ArrayList<Discipline>(); 

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Discipline> getDiscipline() {
        return discipline;
    }

    public void setDiscipline(ArrayList<Discipline> discipline) {
        this.discipline = discipline;
    }
    
}
