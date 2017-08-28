package com.zengfr.supercommons;
import org.apache.commons.beanutils.locale.LocaleConvertUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LocaleConverterUtil{ 
public static void register(org.apache.commons.beanutils.locale.LocaleConverter p0,java.lang.Class<?> p1,java.util.Locale p2){
 LocaleConvertUtils.register(p0,p1,p2);
}
public static org.apache.commons.beanutils.locale.LocaleConverter lookup(java.lang.Class<?> p0,java.util.Locale p1){
return LocaleConvertUtils.lookup(p0,p1);
}
}
