package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IntIteratorUtil{ 
/**
*public static boolean it.unimi.dsi.fastutil.ints.IntIterators.all(it.unimi.dsi.fastutil.ints.IntIterator,java.util.function.IntPredicate)
*/ 
public static boolean all(it.unimi.dsi.fastutil.ints.IntIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.ints.IntIterators.all(p0,p1);
}
/**
*public static boolean it.unimi.dsi.fastutil.ints.IntIterators.any(it.unimi.dsi.fastutil.ints.IntIterator,java.util.function.IntPredicate)
*/ 
public static boolean any(it.unimi.dsi.fastutil.ints.IntIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.ints.IntIterators.any(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.ints.IntIterator it.unimi.dsi.fastutil.ints.IntIterators.asIntIterator(java.util.Iterator)
*/ 
public static it.unimi.dsi.fastutil.ints.IntIterator asIntIterator(java.util.Iterator p0){
	return it.unimi.dsi.fastutil.ints.IntIterators.asIntIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.ints.IntIterator it.unimi.dsi.fastutil.io.BinIO.asIntIterator(java.io.File) throws java.io.IOException
*/ 
public static it.unimi.dsi.fastutil.ints.IntIterator asIntIterator(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asIntIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.ints.IntIterator it.unimi.dsi.fastutil.io.BinIO.asIntIterator(java.lang.CharSequence) throws java.io.IOException
*/ 
public static it.unimi.dsi.fastutil.ints.IntIterator asIntIterator(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asIntIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.ints.IntIterator it.unimi.dsi.fastutil.io.BinIO.asIntIterator(java.io.DataInput)
*/ 
public static it.unimi.dsi.fastutil.ints.IntIterator asIntIterator(java.io.DataInput p0){
	return it.unimi.dsi.fastutil.io.BinIO.asIntIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.ints.IntIterator it.unimi.dsi.fastutil.io.TextIO.asIntIterator(java.io.BufferedReader)
*/ 
public static it.unimi.dsi.fastutil.ints.IntIterator asIntIterator(java.io.BufferedReader p0){
	return it.unimi.dsi.fastutil.io.TextIO.asIntIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.ints.IntIterator it.unimi.dsi.fastutil.ints.IntIterators.concat(it.unimi.dsi.fastutil.ints.IntIterator[])
*/ 
public static it.unimi.dsi.fastutil.ints.IntIterator concat(it.unimi.dsi.fastutil.ints.IntIterator... p0){
	return it.unimi.dsi.fastutil.ints.IntIterators.concat(p0);
}
/**
*public static it.unimi.dsi.fastutil.ints.IntIterator it.unimi.dsi.fastutil.ints.IntIterators.concat(it.unimi.dsi.fastutil.ints.IntIterator[],int,int)
*/ 
public static it.unimi.dsi.fastutil.ints.IntIterator concat(it.unimi.dsi.fastutil.ints.IntIterator[] p0,int p1,int p2){
	return it.unimi.dsi.fastutil.ints.IntIterators.concat(p0,p1,p2);
}
/**
*public static org.apache.commons.collections.primitives.IntIterator org.apache.commons.collections.primitives.IntCollections.getEmptyIntIterator()
*/ 
public static org.apache.commons.collections.primitives.IntIterator getEmptyIntIterator(){
	return org.apache.commons.collections.primitives.IntCollections.getEmptyIntIterator();
}
/**
*public static int it.unimi.dsi.fastutil.ints.IntIterators.indexOf(it.unimi.dsi.fastutil.ints.IntIterator,java.util.function.IntPredicate)
*/ 
public static int indexOf(it.unimi.dsi.fastutil.ints.IntIterator p0,java.util.function.IntPredicate p1){
	return it.unimi.dsi.fastutil.ints.IntIterators.indexOf(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.ints.IntIterators.pour(it.unimi.dsi.fastutil.ints.IntIterator,it.unimi.dsi.fastutil.ints.IntCollection,int)
*/ 
public static int pour(it.unimi.dsi.fastutil.ints.IntIterator p0,it.unimi.dsi.fastutil.ints.IntCollection p1,int p2){
	return it.unimi.dsi.fastutil.ints.IntIterators.pour(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.ints.IntList it.unimi.dsi.fastutil.ints.IntIterators.pour(it.unimi.dsi.fastutil.ints.IntIterator)
*/ 
public static it.unimi.dsi.fastutil.ints.IntList pour(it.unimi.dsi.fastutil.ints.IntIterator p0){
	return it.unimi.dsi.fastutil.ints.IntIterators.pour(p0);
}
/**
*public static it.unimi.dsi.fastutil.ints.IntList it.unimi.dsi.fastutil.ints.IntIterators.pour(it.unimi.dsi.fastutil.ints.IntIterator,int)
*/ 
public static it.unimi.dsi.fastutil.ints.IntList pour(it.unimi.dsi.fastutil.ints.IntIterator p0,int p1){
	return it.unimi.dsi.fastutil.ints.IntIterators.pour(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.ints.IntIterators.pour(it.unimi.dsi.fastutil.ints.IntIterator,it.unimi.dsi.fastutil.ints.IntCollection)
*/ 
public static int pour(it.unimi.dsi.fastutil.ints.IntIterator p0,it.unimi.dsi.fastutil.ints.IntCollection p1){
	return it.unimi.dsi.fastutil.ints.IntIterators.pour(p0,p1);
}
/**
*public static org.apache.commons.collections.primitives.IntIterator org.apache.commons.collections.primitives.IntCollections.singletonIntIterator(int)
*/ 
public static org.apache.commons.collections.primitives.IntIterator singletonIntIterator(int p0){
	return org.apache.commons.collections.primitives.IntCollections.singletonIntIterator(p0);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeInts(it.unimi.dsi.fastutil.ints.IntIterator,java.io.File) throws java.io.IOException
*/ 
public static void storeInts(it.unimi.dsi.fastutil.ints.IntIterator p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeInts(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeInts(it.unimi.dsi.fastutil.ints.IntIterator,java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeInts(it.unimi.dsi.fastutil.ints.IntIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeInts(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeInts(it.unimi.dsi.fastutil.ints.IntIterator,java.io.DataOutput) throws java.io.IOException
*/ 
public static void storeInts(it.unimi.dsi.fastutil.ints.IntIterator p0,java.io.DataOutput p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeInts(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.TextIO.storeInts(it.unimi.dsi.fastutil.ints.IntIterator,java.io.PrintStream)
*/ 
public static void storeInts(it.unimi.dsi.fastutil.ints.IntIterator p0,java.io.PrintStream p1){
	 it.unimi.dsi.fastutil.io.TextIO.storeInts(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.ints.IntIterator it.unimi.dsi.fastutil.ints.IntIterators.unmodifiable(it.unimi.dsi.fastutil.ints.IntIterator)
*/ 
public static it.unimi.dsi.fastutil.ints.IntIterator unmodifiable(it.unimi.dsi.fastutil.ints.IntIterator p0){
	return it.unimi.dsi.fastutil.ints.IntIterators.unmodifiable(p0);
}
/**
*public static org.apache.commons.collections.primitives.IntIterator org.apache.commons.collections.primitives.IntCollections.unmodifiableIntIterator(org.apache.commons.collections.primitives.IntIterator)
*/ 
public static org.apache.commons.collections.primitives.IntIterator unmodifiableIntIterator(org.apache.commons.collections.primitives.IntIterator p0){
	return org.apache.commons.collections.primitives.IntCollections.unmodifiableIntIterator(p0);
}
/**
*public static int[] it.unimi.dsi.fastutil.ints.IntIterators.unwrap(it.unimi.dsi.fastutil.ints.IntIterator,int)
*/ 
public static int[] unwrap(it.unimi.dsi.fastutil.ints.IntIterator p0,int p1){
	return it.unimi.dsi.fastutil.ints.IntIterators.unwrap(p0,p1);
}
/**
*public static int[] it.unimi.dsi.fastutil.ints.IntIterators.unwrap(it.unimi.dsi.fastutil.ints.IntIterator)
*/ 
public static int[] unwrap(it.unimi.dsi.fastutil.ints.IntIterator p0){
	return it.unimi.dsi.fastutil.ints.IntIterators.unwrap(p0);
}
/**
*public static int it.unimi.dsi.fastutil.ints.IntIterators.unwrap(it.unimi.dsi.fastutil.ints.IntIterator,it.unimi.dsi.fastutil.ints.IntCollection,int)
*/ 
public static int unwrap(it.unimi.dsi.fastutil.ints.IntIterator p0,it.unimi.dsi.fastutil.ints.IntCollection p1,int p2){
	return it.unimi.dsi.fastutil.ints.IntIterators.unwrap(p0,p1,p2);
}
/**
*public static int it.unimi.dsi.fastutil.ints.IntIterators.unwrap(it.unimi.dsi.fastutil.ints.IntIterator,int[])
*/ 
public static int unwrap(it.unimi.dsi.fastutil.ints.IntIterator p0,int... p1){
	return it.unimi.dsi.fastutil.ints.IntIterators.unwrap(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.ints.IntIterators.unwrap(it.unimi.dsi.fastutil.ints.IntIterator,int[],int,int)
*/ 
public static int unwrap(it.unimi.dsi.fastutil.ints.IntIterator p0,int[] p1,int p2,int p3){
	return it.unimi.dsi.fastutil.ints.IntIterators.unwrap(p0,p1,p2,p3);
}
/**
*public static long it.unimi.dsi.fastutil.ints.IntIterators.unwrap(it.unimi.dsi.fastutil.ints.IntIterator,it.unimi.dsi.fastutil.ints.IntCollection)
*/ 
public static long unwrap(it.unimi.dsi.fastutil.ints.IntIterator p0,it.unimi.dsi.fastutil.ints.IntCollection p1){
	return it.unimi.dsi.fastutil.ints.IntIterators.unwrap(p0,p1);
}
/**
*public static java.util.Iterator org.apache.commons.collections.primitives.adapters.IntIteratorIterator.wrap(org.apache.commons.collections.primitives.IntIterator)
*/ 
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.IntIterator p0){
	return org.apache.commons.collections.primitives.adapters.IntIteratorIterator.wrap(p0);
}
/**
*public static org.apache.commons.collections.primitives.IntIterator org.apache.commons.collections.primitives.adapters.IteratorIntIterator.wrap(java.util.Iterator)
*/ 
public static org.apache.commons.collections.primitives.IntIterator wrap(java.util.Iterator p0){
	return org.apache.commons.collections.primitives.adapters.IteratorIntIterator.wrap(p0);
}
/**
*public static it.unimi.dsi.fastutil.doubles.DoubleIterator it.unimi.dsi.fastutil.doubles.DoubleIterators.wrap(it.unimi.dsi.fastutil.ints.IntIterator)
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleIterator wrap(it.unimi.dsi.fastutil.ints.IntIterator p0){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.wrap(p0);
}
/**
*public static it.unimi.dsi.fastutil.ints.IntIterator it.unimi.dsi.fastutil.ints.IntIterators.wrap(it.unimi.dsi.fastutil.shorts.ShortIterator)
*/ 
public static it.unimi.dsi.fastutil.ints.IntIterator wrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0){
	return it.unimi.dsi.fastutil.ints.IntIterators.wrap(p0);
}
/**
*public static it.unimi.dsi.fastutil.ints.IntIterator it.unimi.dsi.fastutil.ints.IntIterators.wrap(it.unimi.dsi.fastutil.bytes.ByteIterator)
*/ 
public static it.unimi.dsi.fastutil.ints.IntIterator wrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0){
	return it.unimi.dsi.fastutil.ints.IntIterators.wrap(p0);
}
}
