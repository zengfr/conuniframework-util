package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class WithExplicitOrderingUtil{ 
/**
*public static <E> com.google.common.util.concurrent.CycleDetectingLockFactory.com.google.common.util.concurrent.CycleDetectingLockFactory$WithExplicitOrdering<E> com.google.common.util.concurrent.CycleDetectingLockFactory.newInstanceWithExplicitOrdering(java.lang.Class<E>,com.google.common.util.concurrent.CycleDetectingLockFactory$Policy)
*/ 
public static <E extends java.lang.Enum<E> > WithExplicitOrdering<E> newInstanceWithExplicitOrdering(java.lang.Class<E> p0,Policy p1){
	return com.google.common.util.concurrent.CycleDetectingLockFactory.newInstanceWithExplicitOrdering(p0,p1);
}
}
