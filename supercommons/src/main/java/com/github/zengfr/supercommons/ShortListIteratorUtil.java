package com.zengfr.supercommons;
import org.apache.commons.collections.primitives.adapters.ListIteratorShortListIterator;
import org.apache.commons.collections.primitives.adapters.ShortListIteratorListIterator;
import org.apache.commons.collections.primitives.decorators.UnmodifiableShortListIterator;
import org.apache.commons.collections.primitives.ShortCollections;
import it.unimi.dsi.fastutil.shorts.ShortBigListIterators;
import it.unimi.dsi.fastutil.shorts.ShortIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ShortListIteratorUtil{ 
public static org.apache.commons.collections.primitives.ShortListIterator wrap(java.util.ListIterator p0){
return ListIteratorShortListIterator.wrap(p0);
}
public static java.util.ListIterator wrap(org.apache.commons.collections.primitives.ShortListIterator p0){
return ShortListIteratorListIterator.wrap(p0);
}
public static org.apache.commons.collections.primitives.ShortListIterator getEmptyShortListIterator(){
return ShortCollections.getEmptyShortListIterator();
}
public static org.apache.commons.collections.primitives.ShortListIterator unmodifiableShortListIterator(org.apache.commons.collections.primitives.ShortListIterator p0){
return ShortCollections.unmodifiableShortListIterator(p0);
}
public static org.apache.commons.collections.primitives.ShortListIterator singletonShortListIterator(short p0){
return ShortCollections.singletonShortListIterator(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortBigListIterator asBigListIterator(it.unimi.dsi.fastutil.shorts.ShortListIterator p0){
return ShortBigListIterators.asBigListIterator(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortListIterator wrap(short[] p0){
return ShortIterators.wrap(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortListIterator wrap(short[] p0,int p1,int p2){
return ShortIterators.wrap(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.shorts.ShortListIterator singleton(short p0){
return ShortIterators.singleton(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortListIterator unmodifiable(it.unimi.dsi.fastutil.shorts.ShortListIterator p0){
return ShortIterators.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortListIterator asShortIterator(java.util.ListIterator p0){
return ShortIterators.asShortIterator(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortListIterator fromTo(short p0,short p1){
return ShortIterators.fromTo(p0,p1);
}
}
