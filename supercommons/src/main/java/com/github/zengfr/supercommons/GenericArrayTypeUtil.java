package com.github.zengfr.supercommons;
import org.apache.commons.lang3.reflect.TypeUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class GenericArrayTypeUtil{ 
public static java.lang.reflect.GenericArrayType genericArrayType(java.lang.reflect.Type p0){
return TypeUtils.genericArrayType(p0);
}
}
