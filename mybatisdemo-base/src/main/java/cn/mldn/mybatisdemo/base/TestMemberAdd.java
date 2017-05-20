package cn.mldn.mybatisdemo.base;

import java.util.Date;
import java.util.Random;

import org.junit.Test;

import cn.mldn.mybatisdemo.vo.Member;
import cn.mldn.util.MyBatisSessionFactory;

public class TestMemberAdd {
	@Test
	public void testInsert() {
		// 5、实现数据保存
		Member vo = new Member();
		vo.setMid("mldn - " + new Random().nextInt(1000));
		vo.setName("测试名字");
		vo.setAge(19);
		vo.setBirthday(new Date());
		vo.setSalary(1.1);
		vo.setNote("是个好人。");
		// 6、进行数据保存，第一个参数为命名空间的名称，第二个参数是VO类对象；
		System.out.println(MyBatisSessionFactory.getSession()
				.insert("cn.mldn.mapping.MemberNS.doCreate", vo));
		MyBatisSessionFactory.getSession().commit();
		MyBatisSessionFactory.close();
	}
}
