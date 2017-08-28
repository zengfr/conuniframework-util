package com.zengfr.supercommons;
import org.apache.commons.collections.primitives.adapters.ByteListList;
import org.apache.commons.collections.primitives.adapters.ListByteList;
import org.apache.commons.collections.primitives.decorators.UnmodifiableByteList;
import org.apache.commons.collections.primitives.ByteCollections;
import it.unimi.dsi.fastutil.bytes.ByteBigLists;
import it.unimi.dsi.fastutil.bytes.ByteIterators;
import it.unimi.dsi.fastutil.bytes.ByteLists;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ByteListUtil{ 
public static java.util.List wrap(org.apache.commons.collections.primitives.ByteList p0){
return ByteListList.wrap(p0);
}
public static org.apache.commons.collections.primitives.ByteList wrap(java.util.List p0){
return ListByteList.wrap(p0);
}
public static org.apache.commons.collections.primitives.ByteList getEmptyByteList(){
return ByteCollections.getEmptyByteList();
}
public static org.apache.commons.collections.primitives.ByteList singletonByteList(byte p0){
return ByteCollections.singletonByteList(p0);
}
public static org.apache.commons.collections.primitives.ByteList unmodifiableByteList(org.apache.commons.collections.primitives.ByteList p0) throws java.lang.NullPointerException{
return ByteCollections.unmodifiableByteList(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteBigList asBigList(it.unimi.dsi.fastutil.bytes.ByteList p0){
return ByteBigLists.asBigList(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteList pour(it.unimi.dsi.fastutil.bytes.ByteIterator p0){
return ByteIterators.pour(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteList pour(it.unimi.dsi.fastutil.bytes.ByteIterator p0,int p1){
return ByteIterators.pour(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.ByteList shuffle(it.unimi.dsi.fastutil.bytes.ByteList p0,java.util.Random p1){
return ByteLists.shuffle(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.ByteList singleton(byte p0){
return ByteLists.singleton(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteList singleton(java.lang.Object p0){
return ByteLists.singleton(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteList unmodifiable(it.unimi.dsi.fastutil.bytes.ByteList p0){
return ByteLists.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteList synchronize(it.unimi.dsi.fastutil.bytes.ByteList p0){
return ByteLists.synchronize(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteList synchronize(it.unimi.dsi.fastutil.bytes.ByteList p0,java.lang.Object p1){
return ByteLists.synchronize(p0,p1);
}
}
