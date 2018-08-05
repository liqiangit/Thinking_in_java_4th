package com.liqiangit.Thinking_in_java_4th.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

//基本dao
public abstract class BaseDao<T> {
  private Class<T> clazz = null;
  {
	  System.out.println(getClass().getName());
      Type type = getClass().getGenericSuperclass();
      if( type instanceof ParameterizedType ){
          ParameterizedType pType = (ParameterizedType)type;
          Type claz = pType.getActualTypeArguments()[0];
          if( claz instanceof Class ){
              this.clazz = (Class<T>) claz;
          }
      }
  }
   
  public T getEntity() throws InstantiationException, IllegalAccessException{
      return this.clazz.newInstance();
  }
}