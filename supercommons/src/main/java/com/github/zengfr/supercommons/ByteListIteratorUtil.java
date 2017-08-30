package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ByteListIteratorUtil{ 
/**
*public static it.unimi.dsi.fastutil.bytes.ByteBigListIterator it.unimi.dsi.fastutil.bytes.ByteBigListIterators.asBigListIterator(it.unimi.dsi.fastutil.bytes.ByteListIterator)
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteBigListIterator asBigListIterator(it.unimi.dsi.fastutil.bytes.ByteListIterator p0){
	return it.unimi.dsi.fastutil.bytes.ByteBigListIterators.asBigListIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.bytes.ByteListIterator it.unimi.dsi.fastutil.bytes.ByteIterators.asByteIterator(java.util.ListIterator)
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteListIterator asByteIterator(java.util.ListIterator p0){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.asByteIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.bytes.ByteListIterator it.unimi.dsi.fastutil.bytes.ByteIterators.fromTo(byte,byte)
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteListIterator fromTo(byte p0,byte p1){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.fromTo(p0,p1);
}
/**
*public static org.apache.commons.collections.primitives.ByteListIterator org.apache.commons.collections.primitives.ByteCollections.getEmptyByteListIterator()
*/ 
public static org.apache.commons.collections.primitives.ByteListIterator getEmptyByteListIterator(){
	return org.apache.commons.collections.primitives.ByteCollections.getEmptyByteListIterator();
}
/**
*public static it.unimi.dsi.fastutil.bytes.ByteListIterator it.unimi.dsi.fastutil.bytes.ByteIterators.singleton(byte)
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteListIterator singleton(byte p0){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.singleton(p0);
}
/**
*public static org.apache.commons.collections.primitives.ByteListIterator org.apache.commons.collections.primitives.ByteCollections.singletonByteListIterator(byte)
*/ 
public static org.apache.commons.collections.primitives.ByteListIterator singletonByteListIterator(byte p0){
	return org.apache.commons.collections.primitives.ByteCollections.singletonByteListIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.bytes.ByteListIterator it.unimi.dsi.fastutil.bytes.ByteIterators.unmodifiable(it.unimi.dsi.fastutil.bytes.ByteListIterator)
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteListIterator unmodifiable(it.unimi.dsi.fastutil.bytes.ByteListIterator p0){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.unmodifiable(p0);
}
/**
*public static org.apache.commons.collections.primitives.ByteListIterator org.apache.commons.collections.primitives.ByteCollections.unmodifiableByteListIterator(org.apache.commons.collections.primitives.ByteListIterator)
*/ 
public static org.apache.commons.collections.primitives.ByteListIterator unmodifiableByteListIterator(org.apache.commons.collections.primitives.ByteListIterator p0){
	return org.apache.commons.collections.primitives.ByteCollections.unmodifiableByteListIterator(p0);
}
/**
*public static java.util.ListIterator org.apache.commons.collections.primitives.adapters.ByteListIteratorListIterator.wrap(org.apache.commons.collections.primitives.ByteListIterator)
*/ 
public static java.util.ListIterator wrap(org.apache.commons.collections.primitives.ByteListIterator p0){
	return org.apache.commons.collections.primitives.adapters.ByteListIteratorListIterator.wrap(p0);
}
/**
*public static org.apache.commons.collections.primitives.ByteListIterator org.apache.commons.collections.primitives.adapters.ListIteratorByteListIterator.wrap(java.util.ListIterator)
*/ 
public static org.apache.commons.collections.primitives.ByteListIterator wrap(java.util.ListIterator p0){
	return org.apache.commons.collections.primitives.adapters.ListIteratorByteListIterator.wrap(p0);
}
/**
*public static it.unimi.dsi.fastutil.bytes.ByteListIterator it.unimi.dsi.fastutil.bytes.ByteIterators.wrap(byte[],int,int)
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteListIterator wrap(byte[] p0,int p1,int p2){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.wrap(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.bytes.ByteListIterator it.unimi.dsi.fastutil.bytes.ByteIterators.wrap(byte[])
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteListIterator wrap(byte... p0){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.wrap(p0);
}
}
