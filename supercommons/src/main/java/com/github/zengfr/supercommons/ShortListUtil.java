package com.zengfr.supercommons;
import org.apache.commons.collections.primitives.adapters.ListShortList;
import org.apache.commons.collections.primitives.adapters.ShortListList;
import org.apache.commons.collections.primitives.decorators.UnmodifiableShortList;
import org.apache.commons.collections.primitives.ShortCollections;
import it.unimi.dsi.fastutil.shorts.ShortBigLists;
import it.unimi.dsi.fastutil.shorts.ShortIterators;
import it.unimi.dsi.fastutil.shorts.ShortLists;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ShortListUtil{ 
public static org.apache.commons.collections.primitives.ShortList wrap(java.util.List p0){
return ListShortList.wrap(p0);
}
public static java.util.List wrap(org.apache.commons.collections.primitives.ShortList p0){
return ShortListList.wrap(p0);
}
public static org.apache.commons.collections.primitives.ShortList unmodifiableShortList(org.apache.commons.collections.primitives.ShortList p0) throws java.lang.NullPointerException{
return ShortCollections.unmodifiableShortList(p0);
}
public static org.apache.commons.collections.primitives.ShortList singletonShortList(short p0){
return ShortCollections.singletonShortList(p0);
}
public static org.apache.commons.collections.primitives.ShortList getEmptyShortList(){
return ShortCollections.getEmptyShortList();
}
public static it.unimi.dsi.fastutil.shorts.ShortBigList asBigList(it.unimi.dsi.fastutil.shorts.ShortList p0){
return ShortBigLists.asBigList(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortList pour(it.unimi.dsi.fastutil.shorts.ShortIterator p0){
return ShortIterators.pour(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortList pour(it.unimi.dsi.fastutil.shorts.ShortIterator p0,int p1){
return ShortIterators.pour(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.ShortList shuffle(it.unimi.dsi.fastutil.shorts.ShortList p0,java.util.Random p1){
return ShortLists.shuffle(p0,p1);
}
public static it.unimi.dsi.fastutil.shorts.ShortList singleton(short p0){
return ShortLists.singleton(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortList singleton(java.lang.Object p0){
return ShortLists.singleton(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortList unmodifiable(it.unimi.dsi.fastutil.shorts.ShortList p0){
return ShortLists.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortList synchronize(it.unimi.dsi.fastutil.shorts.ShortList p0){
return ShortLists.synchronize(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortList synchronize(it.unimi.dsi.fastutil.shorts.ShortList p0,java.lang.Object p1){
return ShortLists.synchronize(p0,p1);
}
}
