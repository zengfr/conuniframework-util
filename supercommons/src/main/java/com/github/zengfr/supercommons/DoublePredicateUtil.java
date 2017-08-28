package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.doubles.DoubleIterators;
import it.unimi.dsi.fastutil.floats.FloatIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class DoublePredicateUtil{ 
public static boolean all(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.util.function.DoublePredicate p1){
return DoubleIterators.all(p0,p1);
}
public static int indexOf(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.util.function.DoublePredicate p1){
return DoubleIterators.indexOf(p0,p1);
}
public static boolean any(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.util.function.DoublePredicate p1){
return DoubleIterators.any(p0,p1);
}
public static boolean all(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.util.function.DoublePredicate p1){
return FloatIterators.all(p0,p1);
}
public static int indexOf(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.util.function.DoublePredicate p1){
return FloatIterators.indexOf(p0,p1);
}
public static boolean any(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.util.function.DoublePredicate p1){
return FloatIterators.any(p0,p1);
}
}
