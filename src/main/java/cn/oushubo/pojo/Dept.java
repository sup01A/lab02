package cn.oushubo.pojo;

import org.springframework.util.CollectionUtils;

import java.util.List;
/**
 * 系别类
 */
public class Dept{
    private Integer deptId;//系别ID
    private String deptname;//系名
    private List<Major> majors; //关联属性

    //添加无参构造函数
    public Dept(){}

    //添加有参构造函数，构造系的编码和名称信息
    public Dept(Integer deptId,String deptname) {
        this.deptId = deptId;
        this.deptname = deptname;
    }

    //为属性提供setter和getter方法
    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public List<Major> getMajors() {
        return majors;
    }

    public void setMajors(List<Major> majors) {
        this.majors = majors;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptId=" + deptId +
                ", deptname='" + deptname + '}';
    }
    /**
     * 打印List集合
     */
    public void sayMajors() {
        if (!CollectionUtils.isEmpty(majors)) {
            System.out.println("注入List集合-->");
            for (Major major : majors) {
                System.out.println(major.toString());
            }
        }
    }

}