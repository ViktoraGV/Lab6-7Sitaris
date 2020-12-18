package by.bsuir.ak.entity;

public class Student {
    private int id;
    private String surname;
    private String name;
    private String middleName;
    private String faculty;
    private String group;

    public Student() {}

    public Student(int id, String surname, String name, String middleName, String faculty, String group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.faculty = faculty;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        if (!surname.equals(student.surname)) return false;
        if (!name.equals(student.name)) return false;
        if (!middleName.equals(student.middleName)) return false;
        if (!faculty.equals(student.faculty)) return false;
        return group.equals(student.group);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + surname.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + middleName.hashCode();
        result = 31 * result + faculty.hashCode();
        result = 31 * result + group.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", facult='" + faculty + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
