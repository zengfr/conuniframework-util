package com.github.zengfr.supercommons;
import org.apache.commons.lang3.reflect.TypeUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class WildcardTypeBuilderUtil{ 
public static WildcardTypeBuilder wildcardType(){
return TypeUtils.wildcardType();
}
}
