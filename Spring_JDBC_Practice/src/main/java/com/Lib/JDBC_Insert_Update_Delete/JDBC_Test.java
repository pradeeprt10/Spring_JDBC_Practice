package com.Lib.JDBC_Insert_Update_Delete;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JDBC_Test {

	public static void main(String[] args) {
ApplicationContext cxt= new ClassPathXmlApplicationContext("com/Lib/JDBC_Insert_Update_Delete/Configuration.xml");
UserDAO_Implementation ref=  cxt.getBean("user_DAO", UserDAO_Implementation.class);
Enitity_User user = new Enitity_User();
user.setId(110);
user.setName("PRADEEP");
//int cnt = ref.insert(user);
//int cnt = ref.update(user);
int cnt = ref.delete(user);
System.out.println(cnt);

}
}
