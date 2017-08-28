package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.booleans.BooleanBigLists;
import it.unimi.dsi.fastutil.booleans.BooleanIterators;
import it.unimi.dsi.fastutil.booleans.BooleanLists;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BooleanListUtil{ 
public static it.unimi.dsi.fastutil.booleans.BooleanBigList asBigList(it.unimi.dsi.fastutil.booleans.BooleanList p0){
return BooleanBigLists.asBigList(p0);
}
public static it.unimi.dsi.fastutil.booleans.BooleanList pour(it.unimi.dsi.fastutil.booleans.BooleanIterator p0){
return BooleanIterators.pour(p0);
}
public static it.unimi.dsi.fastutil.booleans.BooleanList pour(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,int p1){
return BooleanIterators.pour(p0,p1);
}
public static it.unimi.dsi.fastutil.booleans.BooleanList shuffle(it.unimi.dsi.fastutil.booleans.BooleanList p0,java.util.Random p1){
return BooleanLists.shuffle(p0,p1);
}
public static it.unimi.dsi.fastutil.booleans.BooleanList singleton(boolean p0){
return BooleanLists.singleton(p0);
}
public static it.unimi.dsi.fastutil.booleans.BooleanList singleton(java.lang.Object p0){
return BooleanLists.singleton(p0);
}
public static it.unimi.dsi.fastutil.booleans.BooleanList unmodifiable(it.unimi.dsi.fastutil.booleans.BooleanList p0){
return BooleanLists.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.booleans.BooleanList synchronize(it.unimi.dsi.fastutil.booleans.BooleanList p0){
return BooleanLists.synchronize(p0);
}
public static it.unimi.dsi.fastutil.booleans.BooleanList synchronize(it.unimi.dsi.fastutil.booleans.BooleanList p0,java.lang.Object p1){
return BooleanLists.synchronize(p0,p1);
}
}
