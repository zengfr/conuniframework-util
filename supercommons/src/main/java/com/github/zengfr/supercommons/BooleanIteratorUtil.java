package com.github.zengfr.supercommons;
import java.util.*;
import java.util.Map.Entry;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BooleanIteratorUtil{ 
/**
*public static boolean it.unimi.dsi.fastutil.booleans.BooleanIterators.all(it.unimi.dsi.fastutil.booleans.BooleanIterator,java.util.function.Predicate<? super java.lang.Boolean>)
*/ 
public static boolean all(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.util.function.Predicate<? super java.lang.Boolean> p1){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.all(p0,p1);
}
/**
*public static boolean it.unimi.dsi.fastutil.booleans.BooleanIterators.any(it.unimi.dsi.fastutil.booleans.BooleanIterator,java.util.function.Predicate<? super java.lang.Boolean>)
*/ 
public static boolean any(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.util.function.Predicate<? super java.lang.Boolean> p1){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.any(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.booleans.BooleanIterator it.unimi.dsi.fastutil.booleans.BooleanIterators.asBooleanIterator(java.util.Iterator)
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanIterator asBooleanIterator(java.util.Iterator p0){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.asBooleanIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.booleans.BooleanIterator it.unimi.dsi.fastutil.io.BinIO.asBooleanIterator(java.io.DataInput)
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanIterator asBooleanIterator(java.io.DataInput p0){
	return it.unimi.dsi.fastutil.io.BinIO.asBooleanIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.booleans.BooleanIterator it.unimi.dsi.fastutil.io.BinIO.asBooleanIterator(java.lang.CharSequence) throws java.io.IOException
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanIterator asBooleanIterator(java.lang.CharSequence p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asBooleanIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.booleans.BooleanIterator it.unimi.dsi.fastutil.io.BinIO.asBooleanIterator(java.io.File) throws java.io.IOException
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanIterator asBooleanIterator(java.io.File p0) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.BinIO.asBooleanIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.booleans.BooleanIterator it.unimi.dsi.fastutil.io.TextIO.asBooleanIterator(java.io.BufferedReader)
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanIterator asBooleanIterator(java.io.BufferedReader p0){
	return it.unimi.dsi.fastutil.io.TextIO.asBooleanIterator(p0);
}
/**
*public static it.unimi.dsi.fastutil.booleans.BooleanIterator it.unimi.dsi.fastutil.booleans.BooleanIterators.concat(it.unimi.dsi.fastutil.booleans.BooleanIterator[],int,int)
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanIterator concat(it.unimi.dsi.fastutil.booleans.BooleanIterator[] p0,int p1,int p2){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.concat(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.booleans.BooleanIterator it.unimi.dsi.fastutil.booleans.BooleanIterators.concat(it.unimi.dsi.fastutil.booleans.BooleanIterator[])
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanIterator concat(it.unimi.dsi.fastutil.booleans.BooleanIterator... p0){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.concat(p0);
}
/**
*public static int it.unimi.dsi.fastutil.booleans.BooleanIterators.indexOf(it.unimi.dsi.fastutil.booleans.BooleanIterator,java.util.function.Predicate<? super java.lang.Boolean>)
*/ 
public static int indexOf(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.util.function.Predicate<? super java.lang.Boolean> p1){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.indexOf(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.booleans.BooleanIterators.pour(it.unimi.dsi.fastutil.booleans.BooleanIterator,it.unimi.dsi.fastutil.booleans.BooleanCollection,int)
*/ 
public static int pour(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,it.unimi.dsi.fastutil.booleans.BooleanCollection p1,int p2){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.pour(p0,p1,p2);
}
/**
*public static it.unimi.dsi.fastutil.booleans.BooleanList it.unimi.dsi.fastutil.booleans.BooleanIterators.pour(it.unimi.dsi.fastutil.booleans.BooleanIterator,int)
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanList pour(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,int p1){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.pour(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.booleans.BooleanIterators.pour(it.unimi.dsi.fastutil.booleans.BooleanIterator,it.unimi.dsi.fastutil.booleans.BooleanCollection)
*/ 
public static int pour(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,it.unimi.dsi.fastutil.booleans.BooleanCollection p1){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.pour(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.booleans.BooleanList it.unimi.dsi.fastutil.booleans.BooleanIterators.pour(it.unimi.dsi.fastutil.booleans.BooleanIterator)
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanList pour(it.unimi.dsi.fastutil.booleans.BooleanIterator p0){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.pour(p0);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator,java.lang.CharSequence) throws java.io.IOException
*/ 
public static void storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBooleans(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator,java.io.File) throws java.io.IOException
*/ 
public static void storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.io.File p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBooleans(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.BinIO.storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator,java.io.DataOutput) throws java.io.IOException
*/ 
public static void storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.io.DataOutput p1) throws java.io.IOException{
	 it.unimi.dsi.fastutil.io.BinIO.storeBooleans(p0,p1);
}
/**
*public static void it.unimi.dsi.fastutil.io.TextIO.storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator,java.io.PrintStream)
*/ 
public static void storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.io.PrintStream p1){
	 it.unimi.dsi.fastutil.io.TextIO.storeBooleans(p0,p1);
}
/**
*public static it.unimi.dsi.fastutil.booleans.BooleanIterator it.unimi.dsi.fastutil.booleans.BooleanIterators.unmodifiable(it.unimi.dsi.fastutil.booleans.BooleanIterator)
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanIterator unmodifiable(it.unimi.dsi.fastutil.booleans.BooleanIterator p0){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.unmodifiable(p0);
}
/**
*public static boolean[] it.unimi.dsi.fastutil.booleans.BooleanIterators.unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator)
*/ 
public static boolean[] unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator p0){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.unwrap(p0);
}
/**
*public static boolean[] it.unimi.dsi.fastutil.booleans.BooleanIterators.unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator,int)
*/ 
public static boolean[] unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,int p1){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.unwrap(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.booleans.BooleanIterators.unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator,boolean[])
*/ 
public static int unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,boolean... p1){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.unwrap(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.booleans.BooleanIterators.unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator,boolean[],int,int)
*/ 
public static int unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,boolean[] p1,int p2,int p3){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.unwrap(p0,p1,p2,p3);
}
/**
*public static long it.unimi.dsi.fastutil.booleans.BooleanIterators.unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator,it.unimi.dsi.fastutil.booleans.BooleanCollection)
*/ 
public static long unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,it.unimi.dsi.fastutil.booleans.BooleanCollection p1){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.unwrap(p0,p1);
}
/**
*public static int it.unimi.dsi.fastutil.booleans.BooleanIterators.unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator,it.unimi.dsi.fastutil.booleans.BooleanCollection,int)
*/ 
public static int unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,it.unimi.dsi.fastutil.booleans.BooleanCollection p1,int p2){
	return it.unimi.dsi.fastutil.booleans.BooleanIterators.unwrap(p0,p1,p2);
}
}
