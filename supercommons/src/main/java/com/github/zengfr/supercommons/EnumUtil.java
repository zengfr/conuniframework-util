package com.zengfr.supercommons;
import java.lang.Enum;
import org.apache.commons.lang3.EnumUtils;
import org.apache.commons.lang.enum.EnumUtils;
import org.apache.commons.lang.enums.EnumUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class EnumUtil{ 
public static <T extends java.lang.Enum<T> > T valueOf(java.lang.Class<T> p0,java.lang.String p1){
return Enum.valueOf(p0,p1);
}
public static <E extends java.lang.Enum<E> > E getEnum(java.lang.Class<E> p0,java.lang.String p1){
return EnumUtils.getEnum(p0,p1);
}
public static org.apache.commons.lang.enum.Enum getEnum(java.lang.Class p0,java.lang.String p1){
return EnumUtils.getEnum(p0,p1);
}
}
