package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LocaleConverterUtil{ 
/**
*public static org.apache.commons.beanutils.locale.LocaleConverter org.apache.commons.beanutils.locale.LocaleConvertUtils.lookup(java.lang.Class<?>,java.util.Locale)
*/ 
public static org.apache.commons.beanutils.locale.LocaleConverter lookup(java.lang.Class<?> p0,java.util.Locale p1){
	return org.apache.commons.beanutils.locale.LocaleConvertUtils.lookup(p0,p1);
}
/**
*public static void org.apache.commons.beanutils.locale.LocaleConvertUtils.register(org.apache.commons.beanutils.locale.LocaleConverter,java.lang.Class<?>,java.util.Locale)
*/ 
public static void register(org.apache.commons.beanutils.locale.LocaleConverter p0,java.lang.Class<?> p1,java.util.Locale p2){
	 org.apache.commons.beanutils.locale.LocaleConvertUtils.register(p0,p1,p2);
}
}
