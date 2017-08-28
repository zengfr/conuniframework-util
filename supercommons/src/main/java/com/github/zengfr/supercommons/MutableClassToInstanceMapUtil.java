package com.zengfr.supercommons;
import com.google.common.collect.MutableClassToInstanceMap;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class MutableClassToInstanceMapUtil{ 
public static <B> com.google.common.collect.MutableClassToInstanceMap<B> create(){
return MutableClassToInstanceMap.create();
}
public static <B> com.google.common.collect.MutableClassToInstanceMap<B> create(java.util.Map<java.lang.Class<? extends B>, B> p0){
return MutableClassToInstanceMap.create(p0);
}
}
