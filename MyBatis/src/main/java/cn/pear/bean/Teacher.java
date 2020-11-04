package cn.pear.bean;

public class Teacher {

    private Integer id;
    private String teacherName;
    private Integer teacherGender;
    private String address;
    private String course;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Integer getTeacherGender() {
        return teacherGender;
    }

    public void setTeacherGender(Integer teacherGender) {
        this.teacherGender = teacherGender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", teacherName='" + teacherName + '\'' +
                ", teacherGender=" + teacherGender +
                ", address='" + address + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
