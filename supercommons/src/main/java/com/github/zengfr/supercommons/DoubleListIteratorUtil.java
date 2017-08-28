package com.zengfr.supercommons;
import org.apache.commons.collections.primitives.adapters.DoubleListIteratorListIterator;
import org.apache.commons.collections.primitives.adapters.ListIteratorDoubleListIterator;
import org.apache.commons.collections.primitives.decorators.UnmodifiableDoubleListIterator;
import org.apache.commons.collections.primitives.DoubleCollections;
import it.unimi.dsi.fastutil.doubles.DoubleBigListIterators;
import it.unimi.dsi.fastutil.doubles.DoubleIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class DoubleListIteratorUtil{ 
public static java.util.ListIterator wrap(org.apache.commons.collections.primitives.DoubleListIterator p0){
return DoubleListIteratorListIterator.wrap(p0);
}
public static org.apache.commons.collections.primitives.DoubleListIterator wrap(java.util.ListIterator p0){
return ListIteratorDoubleListIterator.wrap(p0);
}
public static org.apache.commons.collections.primitives.DoubleListIterator getEmptyDoubleListIterator(){
return DoubleCollections.getEmptyDoubleListIterator();
}
public static org.apache.commons.collections.primitives.DoubleListIterator singletonDoubleListIterator(double p0){
return DoubleCollections.singletonDoubleListIterator(p0);
}
public static org.apache.commons.collections.primitives.DoubleListIterator unmodifiableDoubleListIterator(org.apache.commons.collections.primitives.DoubleListIterator p0){
return DoubleCollections.unmodifiableDoubleListIterator(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleBigListIterator asBigListIterator(it.unimi.dsi.fastutil.doubles.DoubleListIterator p0){
return DoubleBigListIterators.asBigListIterator(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleListIterator wrap(double[] p0,int p1,int p2){
return DoubleIterators.wrap(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.doubles.DoubleListIterator wrap(double[] p0){
return DoubleIterators.wrap(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleListIterator singleton(double p0){
return DoubleIterators.singleton(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleListIterator unmodifiable(it.unimi.dsi.fastutil.doubles.DoubleListIterator p0){
return DoubleIterators.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleListIterator asDoubleIterator(java.util.ListIterator p0){
return DoubleIterators.asDoubleIterator(p0);
}
}
