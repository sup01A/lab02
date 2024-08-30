package cn.oushubo.pojo;

import java.util.Map;

/**
 * 专业类
 */
public class Major{
    private String majorId;//专业ID
    private String majorName;//专业
    private Integer tuition;//学费
    private Integer deptId;//系别ID
    private Map<String,String> classs;//班级集合属性
    private Dept dept;
    public Major(){}
    //添加有参构造函数
    public Major(String majorId, String majorName, Integer tuition, Integer deptId, Map<String, String> classs) {
        this.majorId = majorId;
        this.majorName = majorName;
        this.tuition = tuition;
        this.deptId = deptId;
        this.classs = classs;
    }
    public Major(Dept dept) {
        this.dept = dept;
    }
    //为属性提供setter和getter方法
    public String getMajorId() {
        return majorId;
    }

    public void setMajorId(String majorId) {
        this.majorId = majorId;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public Integer getTuition() {
        return tuition;
    }

    public void setTuition(Integer tuition) {
        this.tuition = tuition;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Map<String, String> getClasss() {
        return classs;
    }

    public void setClasss(Map<String, String> classs) {
        this.classs = classs;
    }

    @Override
    public String toString() {
        return "Major{" +
                "majorId='" + majorId + '\'' +
                ", majorName='" + majorName + '\'' +
                ", tuition=" + tuition +
                ", deptId=" + deptId +
                '}';
    }
    /**
     * 打印Map集合
     */
    public void sayClasss() {
        if (null != classs && classs.size() > 0) {
            System.out.println("注入Map集合-->");
            //遍历map的集合
            for (Map.Entry<?, ?> entry : classs.entrySet()) {
                System.out.println("key= " + entry.getKey() + ", value= " + entry.getValue());
            }
        }
    }
    public void sayDept(){
        if (dept != null){
            System.out.println(dept);
        }else {
            System.out.println("没有");
        }
    }
}