package com.liqiangit.Thinking_in_java_4th.dao;

//实现
//java获取泛型信息
//https://www.cnblogs.com/one777/p/7833789.html
public class PersonDao extends BaseDao<Person> {
  public static void main(String[] args) throws InstantiationException, IllegalAccessException {
      PersonDao pDao = new PersonDao();
      System.out.println( pDao.getEntity().toString() );
  }
}