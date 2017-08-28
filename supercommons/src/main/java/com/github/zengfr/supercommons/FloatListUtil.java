package com.zengfr.supercommons;
import org.apache.commons.collections.primitives.adapters.FloatListList;
import org.apache.commons.collections.primitives.adapters.ListFloatList;
import org.apache.commons.collections.primitives.decorators.UnmodifiableFloatList;
import org.apache.commons.collections.primitives.FloatCollections;
import it.unimi.dsi.fastutil.floats.FloatBigLists;
import it.unimi.dsi.fastutil.floats.FloatIterators;
import it.unimi.dsi.fastutil.floats.FloatLists;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FloatListUtil{ 
public static java.util.List wrap(org.apache.commons.collections.primitives.FloatList p0){
return FloatListList.wrap(p0);
}
public static org.apache.commons.collections.primitives.FloatList wrap(java.util.List p0){
return ListFloatList.wrap(p0);
}
public static org.apache.commons.collections.primitives.FloatList singletonFloatList(float p0){
return FloatCollections.singletonFloatList(p0);
}
public static org.apache.commons.collections.primitives.FloatList unmodifiableFloatList(org.apache.commons.collections.primitives.FloatList p0) throws java.lang.NullPointerException{
return FloatCollections.unmodifiableFloatList(p0);
}
public static org.apache.commons.collections.primitives.FloatList getEmptyFloatList(){
return FloatCollections.getEmptyFloatList();
}
public static it.unimi.dsi.fastutil.floats.FloatBigList asBigList(it.unimi.dsi.fastutil.floats.FloatList p0){
return FloatBigLists.asBigList(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatList pour(it.unimi.dsi.fastutil.floats.FloatIterator p0,int p1){
return FloatIterators.pour(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.FloatList pour(it.unimi.dsi.fastutil.floats.FloatIterator p0){
return FloatIterators.pour(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatList shuffle(it.unimi.dsi.fastutil.floats.FloatList p0,java.util.Random p1){
return FloatLists.shuffle(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.FloatList singleton(float p0){
return FloatLists.singleton(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatList singleton(java.lang.Object p0){
return FloatLists.singleton(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatList unmodifiable(it.unimi.dsi.fastutil.floats.FloatList p0){
return FloatLists.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatList synchronize(it.unimi.dsi.fastutil.floats.FloatList p0){
return FloatLists.synchronize(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatList synchronize(it.unimi.dsi.fastutil.floats.FloatList p0,java.lang.Object p1){
return FloatLists.synchronize(p0,p1);
}
}
