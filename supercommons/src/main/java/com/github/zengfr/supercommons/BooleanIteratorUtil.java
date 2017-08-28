package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.booleans.BooleanIterators;
import it.unimi.dsi.fastutil.io.BinIO;
import it.unimi.dsi.fastutil.io.TextIO;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BooleanIteratorUtil{ 
public static boolean all(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.util.function.Predicate<? super java.lang.Boolean> p1){
return BooleanIterators.all(p0,p1);
}
public static int indexOf(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.util.function.Predicate<? super java.lang.Boolean> p1){
return BooleanIterators.indexOf(p0,p1);
}
public static it.unimi.dsi.fastutil.booleans.BooleanIterator concat(it.unimi.dsi.fastutil.booleans.BooleanIterator[] p0,int p1,int p2){
return BooleanIterators.concat(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.booleans.BooleanIterator concat(it.unimi.dsi.fastutil.booleans.BooleanIterator[] p0){
return BooleanIterators.concat(p0);
}
public static boolean[] unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator p0){
return BooleanIterators.unwrap(p0);
}
public static boolean[] unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,int p1){
return BooleanIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,boolean[] p1){
return BooleanIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,boolean[] p1,int p2,int p3){
return BooleanIterators.unwrap(p0,p1,p2,p3);
}
public static long unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,it.unimi.dsi.fastutil.booleans.BooleanCollection p1){
return BooleanIterators.unwrap(p0,p1);
}
public static int unwrap(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,it.unimi.dsi.fastutil.booleans.BooleanCollection p1,int p2){
return BooleanIterators.unwrap(p0,p1,p2);
}
public static boolean any(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.util.function.Predicate<? super java.lang.Boolean> p1){
return BooleanIterators.any(p0,p1);
}
public static it.unimi.dsi.fastutil.booleans.BooleanIterator unmodifiable(it.unimi.dsi.fastutil.booleans.BooleanIterator p0){
return BooleanIterators.unmodifiable(p0);
}
public static int pour(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,it.unimi.dsi.fastutil.booleans.BooleanCollection p1,int p2){
return BooleanIterators.pour(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.booleans.BooleanList pour(it.unimi.dsi.fastutil.booleans.BooleanIterator p0){
return BooleanIterators.pour(p0);
}
public static it.unimi.dsi.fastutil.booleans.BooleanList pour(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,int p1){
return BooleanIterators.pour(p0,p1);
}
public static int pour(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,it.unimi.dsi.fastutil.booleans.BooleanCollection p1){
return BooleanIterators.pour(p0,p1);
}
public static it.unimi.dsi.fastutil.booleans.BooleanIterator asBooleanIterator(java.util.Iterator p0){
return BooleanIterators.asBooleanIterator(p0);
}
public static void storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.io.DataOutput p1) throws java.io.IOException{
 BinIO.storeBooleans(p0,p1);
}
public static void storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.lang.CharSequence p1) throws java.io.IOException{
 BinIO.storeBooleans(p0,p1);
}
public static void storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeBooleans(p0,p1);
}
public static it.unimi.dsi.fastutil.booleans.BooleanIterator asBooleanIterator(java.io.File p0) throws java.io.IOException{
return BinIO.asBooleanIterator(p0);
}
public static it.unimi.dsi.fastutil.booleans.BooleanIterator asBooleanIterator(java.lang.CharSequence p0) throws java.io.IOException{
return BinIO.asBooleanIterator(p0);
}
public static it.unimi.dsi.fastutil.booleans.BooleanIterator asBooleanIterator(java.io.DataInput p0){
return BinIO.asBooleanIterator(p0);
}
public static void storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.io.PrintStream p1){
 TextIO.storeBooleans(p0,p1);
}
public static it.unimi.dsi.fastutil.booleans.BooleanIterator asBooleanIterator(java.io.BufferedReader p0){
return TextIO.asBooleanIterator(p0);
}
}
