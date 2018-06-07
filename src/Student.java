/**
 * Created by asd on 4/6/2018.
 */
public class Student {

    private String name;
    private String maths;
    private String science;
    private String english;

    public Student(){}

    public Student(String name, String maths, String science, String english) {
        this.name = name;
        this.maths = maths;
        this.science = science;
        this.english = english;
    }

    //getters and setter..

    public String getMaths() {
        return maths;
    }

    public void setMaths(String maths) {
        this.maths = maths;
    }

    public String getScience() {
        return science;
    }

    public void setScience(String science) {
        this.science = science;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name+ ": Maths "+maths+ " Science "+science+" English "+english;
    }
}

