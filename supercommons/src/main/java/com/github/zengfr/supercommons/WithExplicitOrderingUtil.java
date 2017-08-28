package com.zengfr.supercommons;
import com.google.common.util.concurrent.CycleDetectingLockFactory;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class WithExplicitOrderingUtil{ 
public static <E extends java.lang.Enum<E> > WithExplicitOrdering<E> newInstanceWithExplicitOrdering(java.lang.Class<E> p0,Policy p1){
return CycleDetectingLockFactory.newInstanceWithExplicitOrdering(p0,p1);
}
}
