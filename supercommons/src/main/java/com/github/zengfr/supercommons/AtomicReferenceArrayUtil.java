package com.zengfr.supercommons;
import com.google.common.util.concurrent.Atomics;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class AtomicReferenceArrayUtil{ 
public static <E> java.util.concurrent.atomic.AtomicReferenceArray<E> newReferenceArray(int p0){
return Atomics.newReferenceArray(p0);
}
public static <E> java.util.concurrent.atomic.AtomicReferenceArray<E> newReferenceArray(E[] p0){
return Atomics.newReferenceArray(p0);
}
}
