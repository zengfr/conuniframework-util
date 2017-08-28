package com.zengfr.supercommons;
import org.apache.commons.collections.primitives.adapters.ByteListIteratorListIterator;
import org.apache.commons.collections.primitives.adapters.ListIteratorByteListIterator;
import org.apache.commons.collections.primitives.decorators.UnmodifiableByteListIterator;
import org.apache.commons.collections.primitives.ByteCollections;
import it.unimi.dsi.fastutil.bytes.ByteBigListIterators;
import it.unimi.dsi.fastutil.bytes.ByteIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ByteListIteratorUtil{ 
public static java.util.ListIterator wrap(org.apache.commons.collections.primitives.ByteListIterator p0){
return ByteListIteratorListIterator.wrap(p0);
}
public static org.apache.commons.collections.primitives.ByteListIterator wrap(java.util.ListIterator p0){
return ListIteratorByteListIterator.wrap(p0);
}
public static org.apache.commons.collections.primitives.ByteListIterator singletonByteListIterator(byte p0){
return ByteCollections.singletonByteListIterator(p0);
}
public static org.apache.commons.collections.primitives.ByteListIterator getEmptyByteListIterator(){
return ByteCollections.getEmptyByteListIterator();
}
public static org.apache.commons.collections.primitives.ByteListIterator unmodifiableByteListIterator(org.apache.commons.collections.primitives.ByteListIterator p0){
return ByteCollections.unmodifiableByteListIterator(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteBigListIterator asBigListIterator(it.unimi.dsi.fastutil.bytes.ByteListIterator p0){
return ByteBigListIterators.asBigListIterator(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteListIterator wrap(byte[] p0,int p1,int p2){
return ByteIterators.wrap(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.bytes.ByteListIterator wrap(byte[] p0){
return ByteIterators.wrap(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteListIterator singleton(byte p0){
return ByteIterators.singleton(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteListIterator unmodifiable(it.unimi.dsi.fastutil.bytes.ByteListIterator p0){
return ByteIterators.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteListIterator asByteIterator(java.util.ListIterator p0){
return ByteIterators.asByteIterator(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteListIterator fromTo(byte p0,byte p1){
return ByteIterators.fromTo(p0,p1);
}
}
