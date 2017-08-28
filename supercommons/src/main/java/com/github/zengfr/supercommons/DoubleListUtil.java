package com.zengfr.supercommons;
import org.apache.commons.collections.primitives.adapters.DoubleListList;
import org.apache.commons.collections.primitives.adapters.ListDoubleList;
import org.apache.commons.collections.primitives.decorators.UnmodifiableDoubleList;
import org.apache.commons.collections.primitives.DoubleCollections;
import it.unimi.dsi.fastutil.doubles.DoubleBigLists;
import it.unimi.dsi.fastutil.doubles.DoubleIterators;
import it.unimi.dsi.fastutil.doubles.DoubleLists;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class DoubleListUtil{ 
public static java.util.List wrap(org.apache.commons.collections.primitives.DoubleList p0){
return DoubleListList.wrap(p0);
}
public static org.apache.commons.collections.primitives.DoubleList wrap(java.util.List p0){
return ListDoubleList.wrap(p0);
}
public static org.apache.commons.collections.primitives.DoubleList singletonDoubleList(double p0){
return DoubleCollections.singletonDoubleList(p0);
}
public static org.apache.commons.collections.primitives.DoubleList unmodifiableDoubleList(org.apache.commons.collections.primitives.DoubleList p0) throws java.lang.NullPointerException{
return DoubleCollections.unmodifiableDoubleList(p0);
}
public static org.apache.commons.collections.primitives.DoubleList getEmptyDoubleList(){
return DoubleCollections.getEmptyDoubleList();
}
public static it.unimi.dsi.fastutil.doubles.DoubleBigList asBigList(it.unimi.dsi.fastutil.doubles.DoubleList p0){
return DoubleBigLists.asBigList(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleList pour(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,int p1){
return DoubleIterators.pour(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.DoubleList pour(it.unimi.dsi.fastutil.doubles.DoubleIterator p0){
return DoubleIterators.pour(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleList shuffle(it.unimi.dsi.fastutil.doubles.DoubleList p0,java.util.Random p1){
return DoubleLists.shuffle(p0,p1);
}
public static it.unimi.dsi.fastutil.doubles.DoubleList singleton(double p0){
return DoubleLists.singleton(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleList singleton(java.lang.Object p0){
return DoubleLists.singleton(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleList unmodifiable(it.unimi.dsi.fastutil.doubles.DoubleList p0){
return DoubleLists.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleList synchronize(it.unimi.dsi.fastutil.doubles.DoubleList p0){
return DoubleLists.synchronize(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleList synchronize(it.unimi.dsi.fastutil.doubles.DoubleList p0,java.lang.Object p1){
return DoubleLists.synchronize(p0,p1);
}
}
