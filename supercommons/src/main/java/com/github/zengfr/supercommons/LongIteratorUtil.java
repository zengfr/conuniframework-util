package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class LongIteratorUtil{ 
/**
*public static boolean it.unimi.dsi.fastutil.longs.LongIterators.all(it.unimi.dsi.fastutil.longs.LongIterator,java.util.function.LongPredicate)
*/ 
public static boolean all(it.unimi.dsi.fastutil.longs.LongIterator p0,java.util.function.LongPredicate p1){
	return it.unimi.dsi.fastutil.longs.LongIterators.all(p0,p1);
}
/**
*public static boolean it.unimi.dsi.fastutil.longs.LongIterators.any(it.unimi.dsi.fastutil.longs.LongIterator,java.util.function.LongPredicate)
*/ 
public static boolean any(it.unimi.dsi.fastutil.longs.LongIterator p0,java.util.function.LongPredicate p1){
	return it.unimi.dsi.fastutil.longs.LongIterators.any(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.longs.LongIterator it.unimi.dsi.fastutil.io.BinIO.asLongIterator(java.io.File) throws java.io.IOException
*/ 
public static it.unimi.dsi.fastutil.longs.LongIterator asLongIterator(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asLongIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.longs.LongIterator it.unimi.dsi.fastutil.io.BinIO.asLongIterator(java.io.DataInput)
*/ 
public static it.unimi.dsi.fastutil.longs.LongIterator asLongIterator(java.io.DataInput p0){
	return it.unimi.dsi.fastutil.io.BinIO.asLongIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.longs.LongIterator it.unimi.dsi.fastutil.io.BinIO.asLongIterator(java.lang.CharSequence) throws java.io.IOException
*/ 
public static it.unimi.dsi.fastutil.longs.LongIterator asLongIterator(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asLongIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.longs.LongIterator it.unimi.dsi.fastutil.io.TextIO.asLongIterator(java.io.BufferedReader)
*/ 
public static it.unimi.dsi.fastutil.longs.LongIterator asLongIterator(java.io.BufferedReader p0){
	return it.unimi.dsi.fastutil.io.TextIO.asLongIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.longs.LongIterator it.unimi.dsi.fastutil.longs.LongIterators.asLongIterator(java.util.Iterator)
*/ 
public static it.unimi.dsi.fastutil.longs.LongIterator asLongIterator(java.util.Iterator p0){
	return it.unimi.dsi.fastutil.longs.LongIterators.asLongIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.longs.LongIterator it.unimi.dsi.fastutil.longs.LongIterators.concat(it.unimi.dsi.fastutil.longs.LongIterator[],int,int)
*/ 
public static it.unimi.dsi.fastutil.longs.LongIterator concat(it.unimi.dsi.fastutil.longs.LongIterator[] p0,int p1,int p2){
	return it.unimi.dsi.fastutil.longs.LongIterators.concat(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.longs.LongIterator it.unimi.dsi.fastutil.longs.LongIterators.concat(it.unimi.dsi.fastutil.longs.LongIterator[])
*/ 
public static it.unimi.dsi.fastutil.longs.LongIterator concat(it.unimi.dsi.fastutil.longs.LongIterator... p0){
	return it.unimi.dsi.fastutil.longs.LongIterators.concat(p0);
}
/**
*public static org.apache.commons.collections.primitives.LongIterator org.apache.commons.collections.primitives.LongCollections.getEmptyLongIterator()
*/ 
public static org.apache.commons.collections.primitives.LongIterator getEmptyLongIterator(){
	return org.apache.commons.collections.primitives.LongCollections.getEmptyLongIterator();
}
/**
*public static int it.unimi.dsi.fastutil.longs.LongIterators.indexOf(it.unimi.dsi.fastutil.longs.LongIterator,java.util.function.LongPredicate)
*/ 
public static int indexOf(it.unimi.dsi.fastutil.longs.LongIterator p0,java.util.function.LongPredicate p1){
	return it.unimi.dsi.fastutil.longs.LongIterators.indexOf(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.longs.LongIterators.pour(it.unimi.dsi.fastutil.longs.LongIterator,it.unimi.dsi.fastutil.longs.LongCollection,int)
*/ 
public static int pour(it.unimi.dsi.fastutil.longs.LongIterator p0,it.unimi.dsi.fastutil.longs.LongCollection p1,int p2){
	return it.unimi.dsi.fastutil.longs.LongIterators.pour(p0,p1,p2);
}
/**
*public static int it.unimi.dsi.fastutil.longs.LongIterators.pour(it.unimi.dsi.fastutil.longs.LongIterator,it.unimi.dsi.fastutil.longs.LongCollection)
*/ 
public static int pour(it.unimi.dsi.fastutil.longs.LongIterator p0,it.unimi.dsi.fastutil.longs.LongCollection p1){
	return it.unimi.dsi.fastutil.longs.LongIterators.pour(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.longs.LongList it.unimi.dsi.fastutil.longs.LongIterators.pour(it.unimi.dsi.fastutil.longs.LongIterator,int)
*/ 
public static it.unimi.dsi.fastutil.longs.LongList pour(it.unimi.dsi.fastutil.longs.LongIterator p0,int p1){
	return it.unimi.dsi.fastutil.longs.LongIterators.pour(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.longs.LongList it.unimi.dsi.fastutil.longs.LongIterators.pour(it.unimi.dsi.fastutil.longs.LongIterator)
*/ 
public static it.unimi.dsi.fastutil.longs.LongList pour(it.unimi.dsi.fastutil.longs.LongIterator p0){
	return it.unimi.dsi.fastutil.longs.LongIterators.pour(p0);
}
/**
*public static org.apache.commons.collections.primitives.LongIterator org.apache.commons.collections.primitives.LongCollections.singletonLongIterator(long)
*/ 
public static org.apache.commons.collections.primitives.LongIterator singletonLongIterator(long p0){
	return org.apache.commons.collections.primitives.LongCollections.singletonLongIterator(p0);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeLongs(it.unimi.dsi.fastutil.longs.LongIterator,java.io.DataOutput) throws java.io.IOException
*/ 
public static void storeLongs(it.unimi.dsi.fastutil.longs.LongIterator p0,java.io.DataOutput p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeLongs(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeLongs(it.unimi.dsi.fastutil.longs.LongIterator,java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeLongs(it.unimi.dsi.fastutil.longs.LongIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeLongs(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeLongs(it.unimi.dsi.fastutil.longs.LongIterator,java.io.File) throws java.io.IOException
*/ 
public static void storeLongs(it.unimi.dsi.fastutil.longs.LongIterator p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeLongs(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.TextIO.storeLongs(it.unimi.dsi.fastutil.longs.LongIterator,java.io.PrintStream)
*/ 
public static void storeLongs(it.unimi.dsi.fastutil.longs.LongIterator p0,java.io.PrintStream p1){
	 it.unimi.dsi.fastutil.io.TextIO.storeLongs(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.longs.LongIterator it.unimi.dsi.fastutil.longs.LongIterators.unmodifiable(it.unimi.dsi.fastutil.longs.LongIterator)
*/ 
public static it.unimi.dsi.fastutil.longs.LongIterator unmodifiable(it.unimi.dsi.fastutil.longs.LongIterator p0){
	return it.unimi.dsi.fastutil.longs.LongIterators.unmodifiable(p0);
}
/**
*public static org.apache.commons.collections.primitives.LongIterator org.apache.commons.collections.primitives.LongCollections.unmodifiableLongIterator(org.apache.commons.collections.primitives.LongIterator)
*/ 
public static org.apache.commons.collections.primitives.LongIterator unmodifiableLongIterator(org.apache.commons.collections.primitives.LongIterator p0){
	return org.apache.commons.collections.primitives.LongCollections.unmodifiableLongIterator(p0);
}
/**
*public static long[] it.unimi.dsi.fastutil.longs.LongIterators.unwrap(it.unimi.dsi.fastutil.longs.LongIterator,int)
*/ 
public static long[] unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0,int p1){
	return it.unimi.dsi.fastutil.longs.LongIterators.unwrap(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.longs.LongIterators.unwrap(it.unimi.dsi.fastutil.longs.LongIterator,long[])
*/ 
public static int unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0,long... p1){
	return it.unimi.dsi.fastutil.longs.LongIterators.unwrap(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.longs.LongIterators.unwrap(it.unimi.dsi.fastutil.longs.LongIterator,long[],int,int)
*/ 
public static int unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0,long[] p1,int p2,int p3){
	return it.unimi.dsi.fastutil.longs.LongIterators.unwrap(p0,p1,p2,p3);
}
/**
*public static long it.unimi.dsi.fastutil.longs.LongIterators.unwrap(it.unimi.dsi.fastutil.longs.LongIterator,it.unimi.dsi.fastutil.longs.LongCollection)
*/ 
public static long unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0,it.unimi.dsi.fastutil.longs.LongCollection p1){
	return it.unimi.dsi.fastutil.longs.LongIterators.unwrap(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.longs.LongIterators.unwrap(it.unimi.dsi.fastutil.longs.LongIterator,it.unimi.dsi.fastutil.longs.LongCollection,int)
*/ 
public static int unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0,it.unimi.dsi.fastutil.longs.LongCollection p1,int p2){
	return it.unimi.dsi.fastutil.longs.LongIterators.unwrap(p0,p1,p2);
}
/**
*public static long[] it.unimi.dsi.fastutil.longs.LongIterators.unwrap(it.unimi.dsi.fastutil.longs.LongIterator)
*/ 
public static long[] unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0){
	return it.unimi.dsi.fastutil.longs.LongIterators.unwrap(p0);
}
/**
*public static org.apache.commons.collections.primitives.LongIterator org.apache.commons.collections.primitives.adapters.IteratorLongIterator.wrap(java.util.Iterator)
*/ 
public static org.apache.commons.collections.primitives.LongIterator wrap(java.util.Iterator p0){
	return org.apache.commons.collections.primitives.adapters.IteratorLongIterator.wrap(p0);
}
/**
*public static java.util.Iterator org.apache.commons.collections.primitives.adapters.LongIteratorIterator.wrap(org.apache.commons.collections.primitives.LongIterator)
*/ 
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.LongIterator p0){
	return org.apache.commons.collections.primitives.adapters.LongIteratorIterator.wrap(p0);
}
/**
*public static it.unimi.dsi.fastutil.longs.LongIterator it.unimi.dsi.fastutil.longs.LongIterators.wrap(it.unimi.dsi.fastutil.ints.IntIterator)
*/ 
public static it.unimi.dsi.fastutil.longs.LongIterator wrap(it.unimi.dsi.fastutil.ints.IntIterator p0){
	return it.unimi.dsi.fastutil.longs.LongIterators.wrap(p0);
}
/**
*public static it.unimi.dsi.fastutil.longs.LongIterator it.unimi.dsi.fastutil.longs.LongIterators.wrap(it.unimi.dsi.fastutil.shorts.ShortIterator)
*/ 
public static it.unimi.dsi.fastutil.longs.LongIterator wrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0){
	return it.unimi.dsi.fastutil.longs.LongIterators.wrap(p0);
}
/**
*public static it.unimi.dsi.fastutil.longs.LongIterator it.unimi.dsi.fastutil.longs.LongIterators.wrap(it.unimi.dsi.fastutil.bytes.ByteIterator)
*/ 
public static it.unimi.dsi.fastutil.longs.LongIterator wrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0){
	return it.unimi.dsi.fastutil.longs.LongIterators.wrap(p0);
}
}
