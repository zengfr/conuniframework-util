package com.github.zengfr.supercommons;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class ShortIteratorUtil{ 
/**
*public static org.apache.commons.collections.primitives.ShortIterator org.apache.commons.collections.primitives.adapters.IteratorShortIterator.wrap(java.util.Iterator)
*/ 
public static org.apache.commons.collections.primitives.ShortIterator wrap(java.util.Iterator p0){
	return org.apache.commons.collections.primitives.adapters.IteratorShortIterator.wrap(p0);
}
/**
*public static java.util.Iterator org.apache.commons.collections.primitives.adapters.ShortIteratorIterator.wrap(org.apache.commons.collections.primitives.ShortIterator)
*/ 
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.ShortIterator p0){
	return org.apache.commons.collections.primitives.adapters.ShortIteratorIterator.wrap(p0);
}
/**
*public static org.apache.commons.collections.primitives.ShortIterator org.apache.commons.collections.primitives.ShortCollections.getEmptyShortIterator()
*/ 
public static org.apache.commons.collections.primitives.ShortIterator getEmptyShortIterator(){
	return org.apache.commons.collections.primitives.ShortCollections.getEmptyShortIterator();
}
/**
*public static org.apache.commons.collections.primitives.ShortIterator org.apache.commons.collections.primitives.ShortCollections.unmodifiableShortIterator(org.apache.commons.collections.primitives.ShortIterator)
*/ 
public static org.apache.commons.collections.primitives.ShortIterator unmodifiableShortIterator(org.apache.commons.collections.primitives.ShortIterator p0){
	return org.apache.commons.collections.primitives.ShortCollections.unmodifiableShortIterator(p0);
}
/**
*public static org.apache.commons.collections.primitives.ShortIterator org.apache.commons.collections.primitives.ShortCollections.singletonShortIterator(short)
*/ 
public static org.apache.commons.collections.primitives.ShortIterator singletonShortIterator(short p0){
	return org.apache.commons.collections.primitives.ShortCollections.singletonShortIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.doubles.DoubleIterator it.unimi.dsi.fastutil.doubles.DoubleIterators.wrap(it.unimi.dsi.fastutil.shorts.ShortIterator)
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleIterator wrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.wrap(p0);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator,java.io.DataOutput) throws java.io.IOException
*/ 
public static void storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.io.DataOutput p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeShorts(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator,java.io.File) throws java.io.IOException
*/ 
public static void storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeShorts(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator,java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeShorts(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.shorts.ShortIterator it.unimi.dsi.fastutil.io.BinIO.asShortIterator(java.io.DataInput)
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortIterator asShortIterator(java.io.DataInput p0){
	return it.unimi.dsi.fastutil.io.BinIO.asShortIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.shorts.ShortIterator it.unimi.dsi.fastutil.io.BinIO.asShortIterator(java.io.File) throws java.io.IOException
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortIterator asShortIterator(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asShortIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.shorts.ShortIterator it.unimi.dsi.fastutil.io.BinIO.asShortIterator(java.lang.CharSequence) throws java.io.IOException
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortIterator asShortIterator(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asShortIterator(p0);
}
/**
*public static void it.unimi.dsi.fastutil.io.TextIO.storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator,java.io.PrintStream)
*/ 
public static void storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.io.PrintStream p1){
	 it.unimi.dsi.fastutil.io.TextIO.storeShorts(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.shorts.ShortIterator it.unimi.dsi.fastutil.io.TextIO.asShortIterator(java.io.BufferedReader)
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortIterator asShortIterator(java.io.BufferedReader p0){
	return it.unimi.dsi.fastutil.io.TextIO.asShortIterator(p0);
}
/**
*public static boolean it.unimi.dsi.fastutil.shorts.ShortIterators.all(it.unimi.dsi.fastutil.shorts.ShortIterator,java.util.function.IntPredicate)
*/ 
public static boolean all(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.all(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.shorts.ShortIterators.indexOf(it.unimi.dsi.fastutil.shorts.ShortIterator,java.util.function.IntPredicate)
*/ 
public static int indexOf(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.indexOf(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.shorts.ShortIterator it.unimi.dsi.fastutil.shorts.ShortIterators.concat(it.unimi.dsi.fastutil.shorts.ShortIterator[],int,int)
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortIterator concat(it.unimi.dsi.fastutil.shorts.ShortIterator[] p0,int p1,int p2){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.concat(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.shorts.ShortIterator it.unimi.dsi.fastutil.shorts.ShortIterators.concat(it.unimi.dsi.fastutil.shorts.ShortIterator[])
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortIterator concat(it.unimi.dsi.fastutil.shorts.ShortIterator[] p0){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.concat(p0);
}
/**
*public static it.unimi.dsi.fastutil.shorts.ShortIterator it.unimi.dsi.fastutil.shorts.ShortIterators.wrap(it.unimi.dsi.fastutil.bytes.ByteIterator)
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortIterator wrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.wrap(p0);
}
/**
*public static short[] it.unimi.dsi.fastutil.shorts.ShortIterators.unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator,int)
*/ 
public static short[] unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0,int p1){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.unwrap(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.shorts.ShortIterators.unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator,short[])
*/ 
public static int unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0,short[] p1){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.unwrap(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.shorts.ShortIterators.unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator,short[],int,int)
*/ 
public static int unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0,short[] p1,int p2,int p3){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.unwrap(p0,p1,p2,p3);
}
/**
*public static int it.unimi.dsi.fastutil.shorts.ShortIterators.unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator,it.unimi.dsi.fastutil.shorts.ShortCollection,int)
*/ 
public static int unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0,it.unimi.dsi.fastutil.shorts.ShortCollection p1,int p2){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.unwrap(p0,p1,p2);
}
/**
*public static long it.unimi.dsi.fastutil.shorts.ShortIterators.unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator,it.unimi.dsi.fastutil.shorts.ShortCollection)
*/ 
public static long unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0,it.unimi.dsi.fastutil.shorts.ShortCollection p1){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.unwrap(p0,p1);
}
/**
*public static short[] it.unimi.dsi.fastutil.shorts.ShortIterators.unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator)
*/ 
public static short[] unwrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.unwrap(p0);
}
/**
*public static boolean it.unimi.dsi.fastutil.shorts.ShortIterators.any(it.unimi.dsi.fastutil.shorts.ShortIterator,java.util.function.IntPredicate)
*/ 
public static boolean any(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.any(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.shorts.ShortIterators.pour(it.unimi.dsi.fastutil.shorts.ShortIterator,it.unimi.dsi.fastutil.shorts.ShortCollection)
*/ 
public static int pour(it.unimi.dsi.fastutil.shorts.ShortIterator p0,it.unimi.dsi.fastutil.shorts.ShortCollection p1){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.pour(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.shorts.ShortList it.unimi.dsi.fastutil.shorts.ShortIterators.pour(it.unimi.dsi.fastutil.shorts.ShortIterator,int)
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortList pour(it.unimi.dsi.fastutil.shorts.ShortIterator p0,int p1){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.pour(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.shorts.ShortList it.unimi.dsi.fastutil.shorts.ShortIterators.pour(it.unimi.dsi.fastutil.shorts.ShortIterator)
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortList pour(it.unimi.dsi.fastutil.shorts.ShortIterator p0){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.pour(p0);
}
/**
*public static int it.unimi.dsi.fastutil.shorts.ShortIterators.pour(it.unimi.dsi.fastutil.shorts.ShortIterator,it.unimi.dsi.fastutil.shorts.ShortCollection,int)
*/ 
public static int pour(it.unimi.dsi.fastutil.shorts.ShortIterator p0,it.unimi.dsi.fastutil.shorts.ShortCollection p1,int p2){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.pour(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.shorts.ShortIterator it.unimi.dsi.fastutil.shorts.ShortIterators.unmodifiable(it.unimi.dsi.fastutil.shorts.ShortIterator)
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortIterator unmodifiable(it.unimi.dsi.fastutil.shorts.ShortIterator p0){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.unmodifiable(p0);
}
/**
*public static it.unimi.dsi.fastutil.shorts.ShortIterator it.unimi.dsi.fastutil.shorts.ShortIterators.asShortIterator(java.util.Iterator)
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortIterator asShortIterator(java.util.Iterator p0){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.asShortIterator(p0);
}
}
