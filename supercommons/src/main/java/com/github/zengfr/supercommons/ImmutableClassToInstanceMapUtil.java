package com.zengfr.supercommons;
import com.google.common.collect.ImmutableClassToInstanceMap;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ImmutableClassToInstanceMapUtil{ 
public static <B,S> com.google.common.collect.ImmutableClassToInstanceMap<B> copyOf(java.util.Map<? extends java.lang.Class<? extends S>, ? extends S> p0){
return ImmutableClassToInstanceMap.copyOf(p0);
}
public static <B,T> com.google.common.collect.ImmutableClassToInstanceMap<B> of(java.lang.Class<T> p0,T p1){
return ImmutableClassToInstanceMap.of(p0,p1);
}
public static <B> com.google.common.collect.ImmutableClassToInstanceMap<B> of(){
return ImmutableClassToInstanceMap.of();
}
}
