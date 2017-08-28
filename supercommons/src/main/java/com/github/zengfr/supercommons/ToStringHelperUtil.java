package com.zengfr.supercommons;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ToStringHelperUtil{ 
public static ToStringHelper toStringHelper(java.lang.Object p0){
return MoreObjects.toStringHelper(p0);
}
public static ToStringHelper toStringHelper(java.lang.String p0){
return MoreObjects.toStringHelper(p0);
}
public static ToStringHelper toStringHelper(java.lang.Class<?> p0){
return MoreObjects.toStringHelper(p0);
}
}
