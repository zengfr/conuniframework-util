package com.github.zengfr.supercommons;
import com.google.common.collect.Maps;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.collections.ExtendedProperties;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.text.StrSubstitutor;
import org.apache.commons.text.StrSubstitutor;
import org.apache.commons.lang.text.StrSubstitutor;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PropertiesUtil{ 
public static com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> fromProperties(java.util.Properties p0){
return Maps.fromProperties(p0);
}
public static java.util.Properties toProperties(java.util.Map p0){
return MapUtils.toProperties(p0);
}
public static org.apache.commons.collections.ExtendedProperties convertProperties(java.util.Properties p0){
return ExtendedProperties.convertProperties(p0);
}
public static <K,V> java.util.Properties toProperties(java.util.Map<K, V> p0){
return MapUtils.toProperties(p0);
}
public static java.lang.String replace(java.lang.Object p0,java.util.Properties p1){
return StrSubstitutor.replace(p0,p1);
}
}
