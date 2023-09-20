// Abstract class
abstract class Person {
    protected String name;
    protected String address;
    protected int phone;
    protected String profession;
    protected String nic;

    public abstract String register(String nic);
    public abstract String perform(String duty);
    public abstract String include(String service);
    public abstract String like(String item);
}

// Polymorphic class
class Student extends Person {
    protected String studentId;
    protected String major;
    protected int year;
    protected int semester;
    protected String college;
    protected int grade;

    @Override
    public String register(String nic) {
        this.nic = nic;
        return this.nic;
    }

    @Override
    public String perform(String duty) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String include(String service) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String like(String item) {
        // TODO Auto-generated method stub
        return null;
    }

    public Student(String name) {
        this.name = name;
    }
}

// Polymorphic class
class Staff extends Person {
    protected String id;
    protected String role;
    protected String dept;
    protected int salary=80000;
    protected int experience;

    public Staff(String name) {
    }

    public String Attend(String duty) {
        return duty;
    }

    public int getPromotion() {
        return salary+10000;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String register(String nic) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String perform(String duty) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String include(String service) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String like(String item) {
        // TODO Auto-generated method stub
        return null;
    }
}

// Concrete class
class PGStudent extends Student {
    public PGStudent(String name) {
        super(name);
    }

    protected String rollNo;
    protected String specialization;

    public void submitThesis () {
        System.out.println("Thesis is submited");
    }
}

// Concrete class
class Faculty extends Staff {
    protected String section;
    public Faculty(String name) {
        super(name);
    }

    public void teach (String course) {
        System.out.println("Teaching the course");
    }
}

// Concrete class
class Technician extends Staff {
    protected String techType;

    public Technician(String name) {
        super(name);
    }

    public void install(String system) {
        System.out.println("Installed the system" + system);
    }
}





public class App {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}