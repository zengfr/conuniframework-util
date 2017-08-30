package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class DoubleIteratorUtil{ 
/**
*public static boolean it.unimi.dsi.fastutil.doubles.DoubleIterators.all(it.unimi.dsi.fastutil.doubles.DoubleIterator,java.util.function.DoublePredicate)
*/ 
public static boolean all(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.util.function.DoublePredicate p1){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.all(p0,p1);
}
/**
*public static boolean it.unimi.dsi.fastutil.doubles.DoubleIterators.any(it.unimi.dsi.fastutil.doubles.DoubleIterator,java.util.function.DoublePredicate)
*/ 
public static boolean any(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.util.function.DoublePredicate p1){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.any(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.doubles.DoubleIterator it.unimi.dsi.fastutil.doubles.DoubleIterators.asDoubleIterator(java.util.Iterator)
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleIterator asDoubleIterator(java.util.Iterator p0){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.asDoubleIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.doubles.DoubleIterator it.unimi.dsi.fastutil.io.BinIO.asDoubleIterator(java.lang.CharSequence) throws java.io.IOException
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleIterator asDoubleIterator(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asDoubleIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.doubles.DoubleIterator it.unimi.dsi.fastutil.io.BinIO.asDoubleIterator(java.io.DataInput)
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleIterator asDoubleIterator(java.io.DataInput p0){
	return it.unimi.dsi.fastutil.io.BinIO.asDoubleIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.doubles.DoubleIterator it.unimi.dsi.fastutil.io.BinIO.asDoubleIterator(java.io.File) throws java.io.IOException
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleIterator asDoubleIterator(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asDoubleIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.doubles.DoubleIterator it.unimi.dsi.fastutil.io.TextIO.asDoubleIterator(java.io.BufferedReader)
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleIterator asDoubleIterator(java.io.BufferedReader p0){
	return it.unimi.dsi.fastutil.io.TextIO.asDoubleIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.doubles.DoubleIterator it.unimi.dsi.fastutil.doubles.DoubleIterators.concat(it.unimi.dsi.fastutil.doubles.DoubleIterator[],int,int)
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleIterator concat(it.unimi.dsi.fastutil.doubles.DoubleIterator[] p0,int p1,int p2){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.concat(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.doubles.DoubleIterator it.unimi.dsi.fastutil.doubles.DoubleIterators.concat(it.unimi.dsi.fastutil.doubles.DoubleIterator[])
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleIterator concat(it.unimi.dsi.fastutil.doubles.DoubleIterator... p0){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.concat(p0);
}
/**
*public static org.apache.commons.collections.primitives.DoubleIterator org.apache.commons.collections.primitives.DoubleCollections.getEmptyDoubleIterator()
*/ 
public static org.apache.commons.collections.primitives.DoubleIterator getEmptyDoubleIterator(){
	return org.apache.commons.collections.primitives.DoubleCollections.getEmptyDoubleIterator();
}
/**
*public static int it.unimi.dsi.fastutil.doubles.DoubleIterators.indexOf(it.unimi.dsi.fastutil.doubles.DoubleIterator,java.util.function.DoublePredicate)
*/ 
public static int indexOf(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.util.function.DoublePredicate p1){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.indexOf(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.doubles.DoubleList it.unimi.dsi.fastutil.doubles.DoubleIterators.pour(it.unimi.dsi.fastutil.doubles.DoubleIterator,int)
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleList pour(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,int p1){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.pour(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.doubles.DoubleIterators.pour(it.unimi.dsi.fastutil.doubles.DoubleIterator,it.unimi.dsi.fastutil.doubles.DoubleCollection)
*/ 
public static int pour(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,it.unimi.dsi.fastutil.doubles.DoubleCollection p1){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.pour(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.doubles.DoubleIterators.pour(it.unimi.dsi.fastutil.doubles.DoubleIterator,it.unimi.dsi.fastutil.doubles.DoubleCollection,int)
*/ 
public static int pour(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,it.unimi.dsi.fastutil.doubles.DoubleCollection p1,int p2){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.pour(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.doubles.DoubleList it.unimi.dsi.fastutil.doubles.DoubleIterators.pour(it.unimi.dsi.fastutil.doubles.DoubleIterator)
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleList pour(it.unimi.dsi.fastutil.doubles.DoubleIterator p0){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.pour(p0);
}
/**
*public static org.apache.commons.collections.primitives.DoubleIterator org.apache.commons.collections.primitives.DoubleCollections.singletonDoubleIterator(double)
*/ 
public static org.apache.commons.collections.primitives.DoubleIterator singletonDoubleIterator(double p0){
	return org.apache.commons.collections.primitives.DoubleCollections.singletonDoubleIterator(p0);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator,java.io.File) throws java.io.IOException
*/ 
public static void storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeDoubles(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator,java.io.DataOutput) throws java.io.IOException
*/ 
public static void storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.io.DataOutput p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeDoubles(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator,java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeDoubles(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.TextIO.storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator,java.io.PrintStream)
*/ 
public static void storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.io.PrintStream p1){
	 it.unimi.dsi.fastutil.io.TextIO.storeDoubles(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.doubles.DoubleIterator it.unimi.dsi.fastutil.doubles.DoubleIterators.unmodifiable(it.unimi.dsi.fastutil.doubles.DoubleIterator)
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleIterator unmodifiable(it.unimi.dsi.fastutil.doubles.DoubleIterator p0){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.unmodifiable(p0);
}
/**
*public static org.apache.commons.collections.primitives.DoubleIterator org.apache.commons.collections.primitives.DoubleCollections.unmodifiableDoubleIterator(org.apache.commons.collections.primitives.DoubleIterator)
*/ 
public static org.apache.commons.collections.primitives.DoubleIterator unmodifiableDoubleIterator(org.apache.commons.collections.primitives.DoubleIterator p0){
	return org.apache.commons.collections.primitives.DoubleCollections.unmodifiableDoubleIterator(p0);
}
/**
*public static double[] it.unimi.dsi.fastutil.doubles.DoubleIterators.unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator,int)
*/ 
public static double[] unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,int p1){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.unwrap(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.doubles.DoubleIterators.unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator,double[])
*/ 
public static int unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,double... p1){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.unwrap(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.doubles.DoubleIterators.unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator,double[],int,int)
*/ 
public static int unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,double[] p1,int p2,int p3){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.unwrap(p0,p1,p2,p3);
}
/**
*public static long it.unimi.dsi.fastutil.doubles.DoubleIterators.unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator,it.unimi.dsi.fastutil.doubles.DoubleCollection)
*/ 
public static long unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,it.unimi.dsi.fastutil.doubles.DoubleCollection p1){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.unwrap(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.doubles.DoubleIterators.unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator,it.unimi.dsi.fastutil.doubles.DoubleCollection,int)
*/ 
public static int unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,it.unimi.dsi.fastutil.doubles.DoubleCollection p1,int p2){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.unwrap(p0,p1,p2);
}
/**
*public static double[] it.unimi.dsi.fastutil.doubles.DoubleIterators.unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator)
*/ 
public static double[] unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator p0){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.unwrap(p0);
}
/**
*public static java.util.Iterator org.apache.commons.collections.primitives.adapters.DoubleIteratorIterator.wrap(org.apache.commons.collections.primitives.DoubleIterator)
*/ 
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.DoubleIterator p0){
	return org.apache.commons.collections.primitives.adapters.DoubleIteratorIterator.wrap(p0);
}
/**
*public static org.apache.commons.collections.primitives.DoubleIterator org.apache.commons.collections.primitives.adapters.IteratorDoubleIterator.wrap(java.util.Iterator)
*/ 
public static org.apache.commons.collections.primitives.DoubleIterator wrap(java.util.Iterator p0){
	return org.apache.commons.collections.primitives.adapters.IteratorDoubleIterator.wrap(p0);
}
/**
*public static it.unimi.dsi.fastutil.doubles.DoubleIterator it.unimi.dsi.fastutil.doubles.DoubleIterators.wrap(it.unimi.dsi.fastutil.ints.IntIterator)
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleIterator wrap(it.unimi.dsi.fastutil.ints.IntIterator p0){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.wrap(p0);
}
/**
*public static it.unimi.dsi.fastutil.doubles.DoubleIterator it.unimi.dsi.fastutil.doubles.DoubleIterators.wrap(it.unimi.dsi.fastutil.shorts.ShortIterator)
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleIterator wrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.wrap(p0);
}
/**
*public static it.unimi.dsi.fastutil.doubles.DoubleIterator it.unimi.dsi.fastutil.doubles.DoubleIterators.wrap(it.unimi.dsi.fastutil.bytes.ByteIterator)
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleIterator wrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.wrap(p0);
}
/**
*public static it.unimi.dsi.fastutil.doubles.DoubleIterator it.unimi.dsi.fastutil.doubles.DoubleIterators.wrap(it.unimi.dsi.fastutil.floats.FloatIterator)
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleIterator wrap(it.unimi.dsi.fastutil.floats.FloatIterator p0){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.wrap(p0);
}
}
