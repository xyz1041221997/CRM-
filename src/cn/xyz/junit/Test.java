package cn.xyz.junit;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import cn.xyz.domain.SysUserGroup;

public class Test {
      
        public void test1() {
            Configuration cft = new Configuration();
            Configuration configure = cft.configure();
            
            SessionFactory sessionFactory = configure.buildSessionFactory();
            Session session = sessionFactory.openSession();
             Transaction transaction = session.beginTransaction();
             
             SysUserGroup sysUserGroup = new SysUserGroup();
             sysUserGroup.setId(1);
             sysUserGroup.setName("zhangsan");
            session.save(sysUserGroup);
            transaction.commit();
            
        }
        public static void main(String[] args) {
            Test test = new Test();
            test.test1();
        }
}
