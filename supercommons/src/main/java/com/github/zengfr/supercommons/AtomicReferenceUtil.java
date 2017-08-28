package com.zengfr.supercommons;
import com.google.common.util.concurrent.Atomics;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class AtomicReferenceUtil{ 
public static <V> java.util.concurrent.atomic.AtomicReference<V> newReference(V p0){
return Atomics.newReference(p0);
}
public static <V> java.util.concurrent.atomic.AtomicReference<V> newReference(){
return Atomics.newReference();
}
}
