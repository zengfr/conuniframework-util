package com.github.zengfr.supercommons;
import org.apache.commons.collections.primitives.adapters.IntListList;
import org.apache.commons.collections.primitives.adapters.ListIntList;
import org.apache.commons.collections.primitives.IntCollections;
import org.apache.commons.collections.primitives.decorators.UnmodifiableIntList;
import it.unimi.dsi.fastutil.ints.IntBigLists;
import it.unimi.dsi.fastutil.ints.IntIterators;
import it.unimi.dsi.fastutil.ints.IntLists;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IntListUtil{ 
public static java.util.List wrap(org.apache.commons.collections.primitives.IntList p0){
return IntListList.wrap(p0);
}
public static org.apache.commons.collections.primitives.IntList wrap(java.util.List p0){
return ListIntList.wrap(p0);
}
public static org.apache.commons.collections.primitives.IntList singletonIntList(int p0){
return IntCollections.singletonIntList(p0);
}
public static org.apache.commons.collections.primitives.IntList getEmptyIntList(){
return IntCollections.getEmptyIntList();
}
public static org.apache.commons.collections.primitives.IntList unmodifiableIntList(org.apache.commons.collections.primitives.IntList p0) throws java.lang.NullPointerException{
return IntCollections.unmodifiableIntList(p0);
}
public static it.unimi.dsi.fastutil.ints.IntBigList asBigList(it.unimi.dsi.fastutil.ints.IntList p0){
return IntBigLists.asBigList(p0);
}
public static it.unimi.dsi.fastutil.ints.IntList pour(it.unimi.dsi.fastutil.ints.IntIterator p0,int p1){
return IntIterators.pour(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.IntList pour(it.unimi.dsi.fastutil.ints.IntIterator p0){
return IntIterators.pour(p0);
}
public static it.unimi.dsi.fastutil.ints.IntList shuffle(it.unimi.dsi.fastutil.ints.IntList p0,java.util.Random p1){
return IntLists.shuffle(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.IntList singleton(int p0){
return IntLists.singleton(p0);
}
public static it.unimi.dsi.fastutil.ints.IntList singleton(java.lang.Object p0){
return IntLists.singleton(p0);
}
public static it.unimi.dsi.fastutil.ints.IntList unmodifiable(it.unimi.dsi.fastutil.ints.IntList p0){
return IntLists.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.ints.IntList synchronize(it.unimi.dsi.fastutil.ints.IntList p0){
return IntLists.synchronize(p0);
}
public static it.unimi.dsi.fastutil.ints.IntList synchronize(it.unimi.dsi.fastutil.ints.IntList p0,java.lang.Object p1){
return IntLists.synchronize(p0,p1);
}
}
