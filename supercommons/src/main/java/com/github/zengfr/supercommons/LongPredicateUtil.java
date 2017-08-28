package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.longs.LongIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LongPredicateUtil{ 
public static boolean all(it.unimi.dsi.fastutil.longs.LongIterator p0,java.util.function.LongPredicate p1){
return LongIterators.all(p0,p1);
}
public static int indexOf(it.unimi.dsi.fastutil.longs.LongIterator p0,java.util.function.LongPredicate p1){
return LongIterators.indexOf(p0,p1);
}
public static boolean any(it.unimi.dsi.fastutil.longs.LongIterator p0,java.util.function.LongPredicate p1){
return LongIterators.any(p0,p1);
}
}
