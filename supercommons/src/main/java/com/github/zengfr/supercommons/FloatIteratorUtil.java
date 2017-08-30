package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FloatIteratorUtil{ 
/**
*public static boolean it.unimi.dsi.fastutil.floats.FloatIterators.all(it.unimi.dsi.fastutil.floats.FloatIterator,java.util.function.DoublePredicate)
*/ 
public static boolean all(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.util.function.DoublePredicate p1){
	return it.unimi.dsi.fastutil.floats.FloatIterators.all(p0,p1);
}
/**
*public static boolean it.unimi.dsi.fastutil.floats.FloatIterators.any(it.unimi.dsi.fastutil.floats.FloatIterator,java.util.function.DoublePredicate)
*/ 
public static boolean any(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.util.function.DoublePredicate p1){
	return it.unimi.dsi.fastutil.floats.FloatIterators.any(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.floats.FloatIterator it.unimi.dsi.fastutil.floats.FloatIterators.asFloatIterator(java.util.Iterator)
*/ 
public static it.unimi.dsi.fastutil.floats.FloatIterator asFloatIterator(java.util.Iterator p0){
	return it.unimi.dsi.fastutil.floats.FloatIterators.asFloatIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.floats.FloatIterator it.unimi.dsi.fastutil.io.BinIO.asFloatIterator(java.io.DataInput)
*/ 
public static it.unimi.dsi.fastutil.floats.FloatIterator asFloatIterator(java.io.DataInput p0){
	return it.unimi.dsi.fastutil.io.BinIO.asFloatIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.floats.FloatIterator it.unimi.dsi.fastutil.io.BinIO.asFloatIterator(java.lang.CharSequence) throws java.io.IOException
*/ 
public static it.unimi.dsi.fastutil.floats.FloatIterator asFloatIterator(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asFloatIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.floats.FloatIterator it.unimi.dsi.fastutil.io.BinIO.asFloatIterator(java.io.File) throws java.io.IOException
*/ 
public static it.unimi.dsi.fastutil.floats.FloatIterator asFloatIterator(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asFloatIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.floats.FloatIterator it.unimi.dsi.fastutil.io.TextIO.asFloatIterator(java.io.BufferedReader)
*/ 
public static it.unimi.dsi.fastutil.floats.FloatIterator asFloatIterator(java.io.BufferedReader p0){
	return it.unimi.dsi.fastutil.io.TextIO.asFloatIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.floats.FloatIterator it.unimi.dsi.fastutil.floats.FloatIterators.concat(it.unimi.dsi.fastutil.floats.FloatIterator[],int,int)
*/ 
public static it.unimi.dsi.fastutil.floats.FloatIterator concat(it.unimi.dsi.fastutil.floats.FloatIterator[] p0,int p1,int p2){
	return it.unimi.dsi.fastutil.floats.FloatIterators.concat(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.floats.FloatIterator it.unimi.dsi.fastutil.floats.FloatIterators.concat(it.unimi.dsi.fastutil.floats.FloatIterator[])
*/ 
public static it.unimi.dsi.fastutil.floats.FloatIterator concat(it.unimi.dsi.fastutil.floats.FloatIterator... p0){
	return it.unimi.dsi.fastutil.floats.FloatIterators.concat(p0);
}
/**
*public static org.apache.commons.collections.primitives.FloatIterator org.apache.commons.collections.primitives.FloatCollections.getEmptyFloatIterator()
*/ 
public static org.apache.commons.collections.primitives.FloatIterator getEmptyFloatIterator(){
	return org.apache.commons.collections.primitives.FloatCollections.getEmptyFloatIterator();
}
/**
*public static int it.unimi.dsi.fastutil.floats.FloatIterators.indexOf(it.unimi.dsi.fastutil.floats.FloatIterator,java.util.function.DoublePredicate)
*/ 
public static int indexOf(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.util.function.DoublePredicate p1){
	return it.unimi.dsi.fastutil.floats.FloatIterators.indexOf(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.floats.FloatIterators.pour(it.unimi.dsi.fastutil.floats.FloatIterator,it.unimi.dsi.fastutil.floats.FloatCollection,int)
*/ 
public static int pour(it.unimi.dsi.fastutil.floats.FloatIterator p0,it.unimi.dsi.fastutil.floats.FloatCollection p1,int p2){
	return it.unimi.dsi.fastutil.floats.FloatIterators.pour(p0,p1,p2);
}
/**
*public static int it.unimi.dsi.fastutil.floats.FloatIterators.pour(it.unimi.dsi.fastutil.floats.FloatIterator,it.unimi.dsi.fastutil.floats.FloatCollection)
*/ 
public static int pour(it.unimi.dsi.fastutil.floats.FloatIterator p0,it.unimi.dsi.fastutil.floats.FloatCollection p1){
	return it.unimi.dsi.fastutil.floats.FloatIterators.pour(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.floats.FloatList it.unimi.dsi.fastutil.floats.FloatIterators.pour(it.unimi.dsi.fastutil.floats.FloatIterator,int)
*/ 
public static it.unimi.dsi.fastutil.floats.FloatList pour(it.unimi.dsi.fastutil.floats.FloatIterator p0,int p1){
	return it.unimi.dsi.fastutil.floats.FloatIterators.pour(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.floats.FloatList it.unimi.dsi.fastutil.floats.FloatIterators.pour(it.unimi.dsi.fastutil.floats.FloatIterator)
*/ 
public static it.unimi.dsi.fastutil.floats.FloatList pour(it.unimi.dsi.fastutil.floats.FloatIterator p0){
	return it.unimi.dsi.fastutil.floats.FloatIterators.pour(p0);
}
/**
*public static org.apache.commons.collections.primitives.FloatIterator org.apache.commons.collections.primitives.FloatCollections.singletonFloatIterator(float)
*/ 
public static org.apache.commons.collections.primitives.FloatIterator singletonFloatIterator(float p0){
	return org.apache.commons.collections.primitives.FloatCollections.singletonFloatIterator(p0);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator,java.io.DataOutput) throws java.io.IOException
*/ 
public static void storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.io.DataOutput p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeFloats(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator,java.io.File) throws java.io.IOException
*/ 
public static void storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeFloats(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator,java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeFloats(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.TextIO.storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator,java.io.PrintStream)
*/ 
public static void storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.io.PrintStream p1){
	 it.unimi.dsi.fastutil.io.TextIO.storeFloats(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.floats.FloatIterator it.unimi.dsi.fastutil.floats.FloatIterators.unmodifiable(it.unimi.dsi.fastutil.floats.FloatIterator)
*/ 
public static it.unimi.dsi.fastutil.floats.FloatIterator unmodifiable(it.unimi.dsi.fastutil.floats.FloatIterator p0){
	return it.unimi.dsi.fastutil.floats.FloatIterators.unmodifiable(p0);
}
/**
*public static org.apache.commons.collections.primitives.FloatIterator org.apache.commons.collections.primitives.FloatCollections.unmodifiableFloatIterator(org.apache.commons.collections.primitives.FloatIterator)
*/ 
public static org.apache.commons.collections.primitives.FloatIterator unmodifiableFloatIterator(org.apache.commons.collections.primitives.FloatIterator p0){
	return org.apache.commons.collections.primitives.FloatCollections.unmodifiableFloatIterator(p0);
}
/**
*public static int it.unimi.dsi.fastutil.floats.FloatIterators.unwrap(it.unimi.dsi.fastutil.floats.FloatIterator,float[],int,int)
*/ 
public static int unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,float[] p1,int p2,int p3){
	return it.unimi.dsi.fastutil.floats.FloatIterators.unwrap(p0,p1,p2,p3);
}
/**
*public static int it.unimi.dsi.fastutil.floats.FloatIterators.unwrap(it.unimi.dsi.fastutil.floats.FloatIterator,float[])
*/ 
public static int unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,float... p1){
	return it.unimi.dsi.fastutil.floats.FloatIterators.unwrap(p0,p1);
}
/**
*public static float[] it.unimi.dsi.fastutil.floats.FloatIterators.unwrap(it.unimi.dsi.fastutil.floats.FloatIterator,int)
*/ 
public static float[] unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,int p1){
	return it.unimi.dsi.fastutil.floats.FloatIterators.unwrap(p0,p1);
}
/**
*public static long it.unimi.dsi.fastutil.floats.FloatIterators.unwrap(it.unimi.dsi.fastutil.floats.FloatIterator,it.unimi.dsi.fastutil.floats.FloatCollection)
*/ 
public static long unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,it.unimi.dsi.fastutil.floats.FloatCollection p1){
	return it.unimi.dsi.fastutil.floats.FloatIterators.unwrap(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.floats.FloatIterators.unwrap(it.unimi.dsi.fastutil.floats.FloatIterator,it.unimi.dsi.fastutil.floats.FloatCollection,int)
*/ 
public static int unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,it.unimi.dsi.fastutil.floats.FloatCollection p1,int p2){
	return it.unimi.dsi.fastutil.floats.FloatIterators.unwrap(p0,p1,p2);
}
/**
*public static float[] it.unimi.dsi.fastutil.floats.FloatIterators.unwrap(it.unimi.dsi.fastutil.floats.FloatIterator)
*/ 
public static float[] unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0){
	return it.unimi.dsi.fastutil.floats.FloatIterators.unwrap(p0);
}
/**
*public static java.util.Iterator org.apache.commons.collections.primitives.adapters.FloatIteratorIterator.wrap(org.apache.commons.collections.primitives.FloatIterator)
*/ 
public static java.util.Iterator wrap(org.apache.commons.collections.primitives.FloatIterator p0){
	return org.apache.commons.collections.primitives.adapters.FloatIteratorIterator.wrap(p0);
}
/**
*public static org.apache.commons.collections.primitives.FloatIterator org.apache.commons.collections.primitives.adapters.IteratorFloatIterator.wrap(java.util.Iterator)
*/ 
public static org.apache.commons.collections.primitives.FloatIterator wrap(java.util.Iterator p0){
	return org.apache.commons.collections.primitives.adapters.IteratorFloatIterator.wrap(p0);
}
/**
*public static it.unimi.dsi.fastutil.doubles.DoubleIterator it.unimi.dsi.fastutil.doubles.DoubleIterators.wrap(it.unimi.dsi.fastutil.floats.FloatIterator)
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleIterator wrap(it.unimi.dsi.fastutil.floats.FloatIterator p0){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.wrap(p0);
}
/**
*public static it.unimi.dsi.fastutil.floats.FloatIterator it.unimi.dsi.fastutil.floats.FloatIterators.wrap(it.unimi.dsi.fastutil.shorts.ShortIterator)
*/ 
public static it.unimi.dsi.fastutil.floats.FloatIterator wrap(it.unimi.dsi.fastutil.shorts.ShortIterator p0){
	return it.unimi.dsi.fastutil.floats.FloatIterators.wrap(p0);
}
/**
*public static it.unimi.dsi.fastutil.floats.FloatIterator it.unimi.dsi.fastutil.floats.FloatIterators.wrap(it.unimi.dsi.fastutil.bytes.ByteIterator)
*/ 
public static it.unimi.dsi.fastutil.floats.FloatIterator wrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0){
	return it.unimi.dsi.fastutil.floats.FloatIterators.wrap(p0);
}
}
