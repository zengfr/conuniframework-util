package com.zengfr.supercommons;
import org.apache.commons.collections.primitives.adapters.FloatListIteratorListIterator;
import org.apache.commons.collections.primitives.adapters.ListIteratorFloatListIterator;
import org.apache.commons.collections.primitives.decorators.UnmodifiableFloatListIterator;
import org.apache.commons.collections.primitives.FloatCollections;
import it.unimi.dsi.fastutil.floats.FloatBigListIterators;
import it.unimi.dsi.fastutil.floats.FloatIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FloatListIteratorUtil{ 
public static java.util.ListIterator wrap(org.apache.commons.collections.primitives.FloatListIterator p0){
return FloatListIteratorListIterator.wrap(p0);
}
public static org.apache.commons.collections.primitives.FloatListIterator wrap(java.util.ListIterator p0){
return ListIteratorFloatListIterator.wrap(p0);
}
public static org.apache.commons.collections.primitives.FloatListIterator singletonFloatListIterator(float p0){
return FloatCollections.singletonFloatListIterator(p0);
}
public static org.apache.commons.collections.primitives.FloatListIterator unmodifiableFloatListIterator(org.apache.commons.collections.primitives.FloatListIterator p0){
return FloatCollections.unmodifiableFloatListIterator(p0);
}
public static org.apache.commons.collections.primitives.FloatListIterator getEmptyFloatListIterator(){
return FloatCollections.getEmptyFloatListIterator();
}
public static it.unimi.dsi.fastutil.floats.FloatBigListIterator asBigListIterator(it.unimi.dsi.fastutil.floats.FloatListIterator p0){
return FloatBigListIterators.asBigListIterator(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatListIterator wrap(float[] p0){
return FloatIterators.wrap(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatListIterator wrap(float[] p0,int p1,int p2){
return FloatIterators.wrap(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.FloatListIterator singleton(float p0){
return FloatIterators.singleton(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatListIterator unmodifiable(it.unimi.dsi.fastutil.floats.FloatListIterator p0){
return FloatIterators.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatListIterator asFloatIterator(java.util.ListIterator p0){
return FloatIterators.asFloatIterator(p0);
}
}
