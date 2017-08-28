package com.zengfr.supercommons;
import java.lang.reflect.AccessibleObject;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class AccessibleObjectArrayUtil{ 
public static void setAccessible(java.lang.reflect.AccessibleObject[] p0,boolean p1) throws java.lang.SecurityException{
 AccessibleObject.setAccessible(p0,p1);
}
}
