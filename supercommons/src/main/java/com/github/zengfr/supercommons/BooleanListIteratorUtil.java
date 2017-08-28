package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.booleans.BooleanBigListIterators;
import it.unimi.dsi.fastutil.booleans.BooleanIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BooleanListIteratorUtil{ 
public static it.unimi.dsi.fastutil.booleans.BooleanBigListIterator asBigListIterator(it.unimi.dsi.fastutil.booleans.BooleanListIterator p0){
return BooleanBigListIterators.asBigListIterator(p0);
}
public static it.unimi.dsi.fastutil.booleans.BooleanListIterator wrap(boolean[] p0,int p1,int p2){
return BooleanIterators.wrap(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.booleans.BooleanListIterator wrap(boolean[] p0){
return BooleanIterators.wrap(p0);
}
public static it.unimi.dsi.fastutil.booleans.BooleanListIterator singleton(boolean p0){
return BooleanIterators.singleton(p0);
}
public static it.unimi.dsi.fastutil.booleans.BooleanListIterator unmodifiable(it.unimi.dsi.fastutil.booleans.BooleanListIterator p0){
return BooleanIterators.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.booleans.BooleanListIterator asBooleanIterator(java.util.ListIterator p0){
return BooleanIterators.asBooleanIterator(p0);
}
}
