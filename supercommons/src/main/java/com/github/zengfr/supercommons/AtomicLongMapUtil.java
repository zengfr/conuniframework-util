package com.zengfr.supercommons;
import com.google.common.util.concurrent.AtomicLongMap;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class AtomicLongMapUtil{ 
public static <K> com.google.common.util.concurrent.AtomicLongMap<K> create(){
return AtomicLongMap.create();
}
public static <K> com.google.common.util.concurrent.AtomicLongMap<K> create(java.util.Map<? extends K, ? extends java.lang.Long> p0){
return AtomicLongMap.create(p0);
}
}
