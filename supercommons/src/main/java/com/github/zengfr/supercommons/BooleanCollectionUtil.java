package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.booleans.BooleanCollections;
import it.unimi.dsi.fastutil.booleans.BooleanIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BooleanCollectionUtil{ 
public static it.unimi.dsi.fastutil.booleans.BooleanCollection unmodifiable(it.unimi.dsi.fastutil.booleans.BooleanCollection p0){
return BooleanCollections.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.booleans.BooleanCollection synchronize(it.unimi.dsi.fastutil.booleans.BooleanCollection p0,java.lang.Object p1){
return BooleanCollections.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.booleans.BooleanCollection synchronize(it.unimi.dsi.fastutil.booleans.BooleanCollection p0){
return BooleanCollections.synchronize(p0);
}
public static it.unimi.dsi.fastutil.booleans.BooleanCollection asCollection(it.unimi.dsi.fastutil.booleans.BooleanIterable p0){
return BooleanCollections.asCollection(p0);
}
public static long unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,it.unimi.dsi.fastutil.booleans.BooleanCollection p1){
return BooleanIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,it.unimi.dsi.fastutil.booleans.BooleanCollection p1,int p2){
return BooleanIterators.unwrap(p0,p1,p2);
}
public static int pour(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,it.unimi.dsi.fastutil.booleans.BooleanCollection p1,int p2){
return BooleanIterators.pour(p0,p1,p2);
}
public static int pour(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,it.unimi.dsi.fastutil.booleans.BooleanCollection p1){
return BooleanIterators.pour(p0,p1);
}
}
