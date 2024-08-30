package cn.oushubo;

import cn.oushubo.pojo.Dept;
import cn.oushubo.pojo.Major;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    // 定义配置文件路径
    String xmlPath = "beans01.xml";
    // 加载配置文件
    ApplicationContext ac =new ClassPathXmlApplicationContext(xmlPath);
    @Test
    public void dept1Test() {
        Dept dept1 = ac.getBean("dept1", Dept.class);
        System.out.println(dept1);
        dept1.sayMajors();
    }

    @Test
    public void major1Test() {
        Major major1 = ac.getBean("major1", Major.class);
        System.out.println(major1);
        major1.sayClasss();
    }

    @Test
    public void majorTet() {
        Major major = ac.getBean("major", Major.class);
        System.out.println(major);
        major.sayDept();
    }
}
