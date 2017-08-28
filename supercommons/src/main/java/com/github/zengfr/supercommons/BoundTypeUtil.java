package com.zengfr.supercommons;
import com.google.common.collect.BoundType;
import com.google.common.collect.Range;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BoundTypeUtil{ 
public static com.google.common.collect.BoundType valueOf(java.lang.String p0){
return BoundType.valueOf(p0);
}
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> range(C p0,com.google.common.collect.BoundType p1,C p2,com.google.common.collect.BoundType p3){
return Range.range(p0,p1,p2,p3);
}
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> downTo(C p0,com.google.common.collect.BoundType p1){
return Range.downTo(p0,p1);
}
public static <C extends java.lang.Comparable<?> > com.google.common.collect.Range<C> upTo(C p0,com.google.common.collect.BoundType p1){
return Range.upTo(p0,p1);
}
}
