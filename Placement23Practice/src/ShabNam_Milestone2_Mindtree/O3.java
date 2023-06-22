package ShabNam_Milestone2_Mindtree;

class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String errorMessage) {
        super(errorMessage);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String errorMessage) {
        super(errorMessage);
    }
}

class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        this.rollNo = rollNo;
        this.course = course;
        if (!name.matches("^[a-zA-Z]+$")) {
            throw new NameNotValidException("Name is not Valid");
        }
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age is not between 15 and 21");
        }
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return rollNo + " " + name + " " + age + " " + course;
    }
}

public class O3 {
    public static void main(String[] args) {
        try {
            Student student = new Student(100, "Babu4", 27, "MCA");
            System.out.println(student.toString());
        } catch (NameNotValidException e) {
            System.out.println(e.getMessage());
        } catch (AgeNotWithinRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}