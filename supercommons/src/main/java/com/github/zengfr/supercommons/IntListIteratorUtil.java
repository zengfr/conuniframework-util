package com.github.zengfr.supercommons;
import org.apache.commons.collections.primitives.adapters.IntListIteratorListIterator;
import org.apache.commons.collections.primitives.adapters.ListIteratorIntListIterator;
import org.apache.commons.collections.primitives.IntCollections;
import org.apache.commons.collections.primitives.decorators.UnmodifiableIntListIterator;
import it.unimi.dsi.fastutil.ints.IntBigListIterators;
import it.unimi.dsi.fastutil.ints.IntIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IntListIteratorUtil{ 
public static java.util.ListIterator wrap(org.apache.commons.collections.primitives.IntListIterator p0){
return IntListIteratorListIterator.wrap(p0);
}
public static org.apache.commons.collections.primitives.IntListIterator wrap(java.util.ListIterator p0){
return ListIteratorIntListIterator.wrap(p0);
}
public static org.apache.commons.collections.primitives.IntListIterator singletonIntListIterator(int p0){
return IntCollections.singletonIntListIterator(p0);
}
public static org.apache.commons.collections.primitives.IntListIterator getEmptyIntListIterator(){
return IntCollections.getEmptyIntListIterator();
}
public static org.apache.commons.collections.primitives.IntListIterator unmodifiableIntListIterator(org.apache.commons.collections.primitives.IntListIterator p0){
return IntCollections.unmodifiableIntListIterator(p0);
}
public static it.unimi.dsi.fastutil.ints.IntBigListIterator asBigListIterator(it.unimi.dsi.fastutil.ints.IntListIterator p0){
return IntBigListIterators.asBigListIterator(p0);
}
public static it.unimi.dsi.fastutil.ints.IntListIterator wrap(int[] p0,int p1,int p2){
return IntIterators.wrap(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.ints.IntListIterator wrap(int[] p0){
return IntIterators.wrap(p0);
}
public static it.unimi.dsi.fastutil.ints.IntListIterator singleton(int p0){
return IntIterators.singleton(p0);
}
public static it.unimi.dsi.fastutil.ints.IntListIterator asIntIterator(java.util.ListIterator p0){
return IntIterators.asIntIterator(p0);
}
public static it.unimi.dsi.fastutil.ints.IntListIterator unmodifiable(it.unimi.dsi.fastutil.ints.IntListIterator p0){
return IntIterators.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.ints.IntListIterator fromTo(int p0,int p1){
return IntIterators.fromTo(p0,p1);
}
}
