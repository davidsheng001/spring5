package cn.pear.spring.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Classes {
    private String name;
    private List<Student> stu;
    private Set<String> setString;
    private Map<String,String> map;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStu() {
        return stu;
    }

    public void setStu(List<Student> stu) {
        this.stu = stu;
    }

    public Set<String> getSetString() {
        return setString;
    }

    public void setSetString(Set<String> setString) {
        this.setString = setString;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "name='" + name + '\'' +
                ", stu=" + stu +
                ", setString=" + setString +
                ", map=" + map +
                '}';
    }
}
