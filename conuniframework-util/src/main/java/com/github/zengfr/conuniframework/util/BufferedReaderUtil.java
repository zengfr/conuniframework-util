package com.github.zengfr.conuniframework.util;
import java.util.*;
import java.util.Map.Entry;
import com.google.common.collect.Table;
import com.google.common.collect.Table.Cell;
/**
* @author zengfr
* @author https://github.com/zengfr/conuniframework-util
* @author https://gitee.com/zengfr/conuniframework-util
* @author  http://blog.csdn.net/zfrong/
* @author zengfr3000@qq.com
*/
public final class BufferedReaderUtil{ 
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#asBooleanIterator(java.io.BufferedReader)}
*@see it.unimi.dsi.fastutil.io.TextIO#asBooleanIterator(java.io.BufferedReader)
*<code>public static it.unimi.dsi.fastutil.booleans.BooleanIterator it.unimi.dsi.fastutil.io.TextIO.asBooleanIterator(java.io.BufferedReader)
*asBooleanIterator(java.io.BufferedReader p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.booleans.BooleanIterator asBooleanIterator(java.io.BufferedReader p0){
	return it.unimi.dsi.fastutil.io.TextIO.asBooleanIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#asByteIterator(java.io.BufferedReader)}
*@see it.unimi.dsi.fastutil.io.TextIO#asByteIterator(java.io.BufferedReader)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteIterator it.unimi.dsi.fastutil.io.TextIO.asByteIterator(java.io.BufferedReader)
*asByteIterator(java.io.BufferedReader p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteIterator asByteIterator(java.io.BufferedReader p0){
	return it.unimi.dsi.fastutil.io.TextIO.asByteIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#asDoubleIterator(java.io.BufferedReader)}
*@see it.unimi.dsi.fastutil.io.TextIO#asDoubleIterator(java.io.BufferedReader)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleIterator it.unimi.dsi.fastutil.io.TextIO.asDoubleIterator(java.io.BufferedReader)
*asDoubleIterator(java.io.BufferedReader p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleIterator asDoubleIterator(java.io.BufferedReader p0){
	return it.unimi.dsi.fastutil.io.TextIO.asDoubleIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#asFloatIterator(java.io.BufferedReader)}
*@see it.unimi.dsi.fastutil.io.TextIO#asFloatIterator(java.io.BufferedReader)
*<code>public static it.unimi.dsi.fastutil.floats.FloatIterator it.unimi.dsi.fastutil.io.TextIO.asFloatIterator(java.io.BufferedReader)
*asFloatIterator(java.io.BufferedReader p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatIterator asFloatIterator(java.io.BufferedReader p0){
	return it.unimi.dsi.fastutil.io.TextIO.asFloatIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#asIntIterator(java.io.BufferedReader)}
*@see it.unimi.dsi.fastutil.io.TextIO#asIntIterator(java.io.BufferedReader)
*<code>public static it.unimi.dsi.fastutil.ints.IntIterator it.unimi.dsi.fastutil.io.TextIO.asIntIterator(java.io.BufferedReader)
*asIntIterator(java.io.BufferedReader p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntIterator asIntIterator(java.io.BufferedReader p0){
	return it.unimi.dsi.fastutil.io.TextIO.asIntIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#asLongIterator(java.io.BufferedReader)}
*@see it.unimi.dsi.fastutil.io.TextIO#asLongIterator(java.io.BufferedReader)
*<code>public static it.unimi.dsi.fastutil.longs.LongIterator it.unimi.dsi.fastutil.io.TextIO.asLongIterator(java.io.BufferedReader)
*asLongIterator(java.io.BufferedReader p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongIterator asLongIterator(java.io.BufferedReader p0){
	return it.unimi.dsi.fastutil.io.TextIO.asLongIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#asShortIterator(java.io.BufferedReader)}
*@see it.unimi.dsi.fastutil.io.TextIO#asShortIterator(java.io.BufferedReader)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortIterator it.unimi.dsi.fastutil.io.TextIO.asShortIterator(java.io.BufferedReader)
*asShortIterator(java.io.BufferedReader p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortIterator asShortIterator(java.io.BufferedReader p0){
	return it.unimi.dsi.fastutil.io.TextIO.asShortIterator(p0);
}
/**
*{@link org.apache.commons.io.IOUtils#buffer(java.io.Reader)}
*@see org.apache.commons.io.IOUtils#buffer(java.io.Reader)
*<code>public static java.io.BufferedReader org.apache.commons.io.IOUtils.buffer(java.io.Reader)
*buffer(java.io.Reader p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.BufferedReader buffer(java.io.Reader p0){
	return org.apache.commons.io.IOUtils.buffer(p0);
}
/**
*{@link org.apache.commons.io.IOUtils#buffer(java.io.Reader,int)}
*@see org.apache.commons.io.IOUtils#buffer(java.io.Reader,int)
*<code>public static java.io.BufferedReader org.apache.commons.io.IOUtils.buffer(java.io.Reader,int)
*buffer(java.io.Reader p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.BufferedReader buffer(java.io.Reader p0,int p1){
	return org.apache.commons.io.IOUtils.buffer(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#loadBooleans(java.io.BufferedReader,boolean[][],long,long)}
*@see it.unimi.dsi.fastutil.io.TextIO#loadBooleans(java.io.BufferedReader,boolean[][],long,long)
*<code>public static long it.unimi.dsi.fastutil.io.TextIO.loadBooleans(java.io.BufferedReader,boolean[][],long,long) throws java.io.IOException
*loadBooleans(java.io.BufferedReader p0,boolean[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadBooleans(java.io.BufferedReader p0,boolean[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.TextIO.loadBooleans(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#loadBooleans(java.io.BufferedReader,boolean[]...)}
*@see it.unimi.dsi.fastutil.io.TextIO#loadBooleans(java.io.BufferedReader,boolean[]...)
*<code>public static long it.unimi.dsi.fastutil.io.TextIO.loadBooleans(java.io.BufferedReader,boolean[][]) throws java.io.IOException
*loadBooleans(java.io.BufferedReader p0,boolean[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadBooleans(java.io.BufferedReader p0,boolean[]... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.TextIO.loadBooleans(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#loadBooleans(java.io.BufferedReader,boolean...)}
*@see it.unimi.dsi.fastutil.io.TextIO#loadBooleans(java.io.BufferedReader,boolean...)
*<code>public static int it.unimi.dsi.fastutil.io.TextIO.loadBooleans(java.io.BufferedReader,boolean[]) throws java.io.IOException
*loadBooleans(java.io.BufferedReader p0,boolean... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadBooleans(java.io.BufferedReader p0,boolean... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.TextIO.loadBooleans(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#loadBooleans(java.io.BufferedReader,boolean[],int,int)}
*@see it.unimi.dsi.fastutil.io.TextIO#loadBooleans(java.io.BufferedReader,boolean[],int,int)
*<code>public static int it.unimi.dsi.fastutil.io.TextIO.loadBooleans(java.io.BufferedReader,boolean[],int,int) throws java.io.IOException
*loadBooleans(java.io.BufferedReader p0,boolean[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadBooleans(java.io.BufferedReader p0,boolean[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.TextIO.loadBooleans(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#loadBytes(java.io.BufferedReader,byte[][],long,long)}
*@see it.unimi.dsi.fastutil.io.TextIO#loadBytes(java.io.BufferedReader,byte[][],long,long)
*<code>public static long it.unimi.dsi.fastutil.io.TextIO.loadBytes(java.io.BufferedReader,byte[][],long,long) throws java.io.IOException
*loadBytes(java.io.BufferedReader p0,byte[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadBytes(java.io.BufferedReader p0,byte[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.TextIO.loadBytes(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#loadBytes(java.io.BufferedReader,byte...)}
*@see it.unimi.dsi.fastutil.io.TextIO#loadBytes(java.io.BufferedReader,byte...)
*<code>public static int it.unimi.dsi.fastutil.io.TextIO.loadBytes(java.io.BufferedReader,byte[]) throws java.io.IOException
*loadBytes(java.io.BufferedReader p0,byte... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadBytes(java.io.BufferedReader p0,byte... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.TextIO.loadBytes(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#loadBytes(java.io.BufferedReader,byte[],int,int)}
*@see it.unimi.dsi.fastutil.io.TextIO#loadBytes(java.io.BufferedReader,byte[],int,int)
*<code>public static int it.unimi.dsi.fastutil.io.TextIO.loadBytes(java.io.BufferedReader,byte[],int,int) throws java.io.IOException
*loadBytes(java.io.BufferedReader p0,byte[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadBytes(java.io.BufferedReader p0,byte[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.TextIO.loadBytes(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#loadBytes(java.io.BufferedReader,byte[]...)}
*@see it.unimi.dsi.fastutil.io.TextIO#loadBytes(java.io.BufferedReader,byte[]...)
*<code>public static long it.unimi.dsi.fastutil.io.TextIO.loadBytes(java.io.BufferedReader,byte[][]) throws java.io.IOException
*loadBytes(java.io.BufferedReader p0,byte[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadBytes(java.io.BufferedReader p0,byte[]... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.TextIO.loadBytes(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#loadDoubles(java.io.BufferedReader,double[]...)}
*@see it.unimi.dsi.fastutil.io.TextIO#loadDoubles(java.io.BufferedReader,double[]...)
*<code>public static long it.unimi.dsi.fastutil.io.TextIO.loadDoubles(java.io.BufferedReader,double[][]) throws java.io.IOException
*loadDoubles(java.io.BufferedReader p0,double[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadDoubles(java.io.BufferedReader p0,double[]... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.TextIO.loadDoubles(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#loadDoubles(java.io.BufferedReader,double[][],long,long)}
*@see it.unimi.dsi.fastutil.io.TextIO#loadDoubles(java.io.BufferedReader,double[][],long,long)
*<code>public static long it.unimi.dsi.fastutil.io.TextIO.loadDoubles(java.io.BufferedReader,double[][],long,long) throws java.io.IOException
*loadDoubles(java.io.BufferedReader p0,double[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadDoubles(java.io.BufferedReader p0,double[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.TextIO.loadDoubles(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#loadDoubles(java.io.BufferedReader,double...)}
*@see it.unimi.dsi.fastutil.io.TextIO#loadDoubles(java.io.BufferedReader,double...)
*<code>public static int it.unimi.dsi.fastutil.io.TextIO.loadDoubles(java.io.BufferedReader,double[]) throws java.io.IOException
*loadDoubles(java.io.BufferedReader p0,double... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadDoubles(java.io.BufferedReader p0,double... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.TextIO.loadDoubles(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#loadDoubles(java.io.BufferedReader,double[],int,int)}
*@see it.unimi.dsi.fastutil.io.TextIO#loadDoubles(java.io.BufferedReader,double[],int,int)
*<code>public static int it.unimi.dsi.fastutil.io.TextIO.loadDoubles(java.io.BufferedReader,double[],int,int) throws java.io.IOException
*loadDoubles(java.io.BufferedReader p0,double[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadDoubles(java.io.BufferedReader p0,double[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.TextIO.loadDoubles(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#loadFloats(java.io.BufferedReader,float[],int,int)}
*@see it.unimi.dsi.fastutil.io.TextIO#loadFloats(java.io.BufferedReader,float[],int,int)
*<code>public static int it.unimi.dsi.fastutil.io.TextIO.loadFloats(java.io.BufferedReader,float[],int,int) throws java.io.IOException
*loadFloats(java.io.BufferedReader p0,float[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadFloats(java.io.BufferedReader p0,float[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.TextIO.loadFloats(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#loadFloats(java.io.BufferedReader,float...)}
*@see it.unimi.dsi.fastutil.io.TextIO#loadFloats(java.io.BufferedReader,float...)
*<code>public static int it.unimi.dsi.fastutil.io.TextIO.loadFloats(java.io.BufferedReader,float[]) throws java.io.IOException
*loadFloats(java.io.BufferedReader p0,float... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadFloats(java.io.BufferedReader p0,float... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.TextIO.loadFloats(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#loadFloats(java.io.BufferedReader,float[]...)}
*@see it.unimi.dsi.fastutil.io.TextIO#loadFloats(java.io.BufferedReader,float[]...)
*<code>public static long it.unimi.dsi.fastutil.io.TextIO.loadFloats(java.io.BufferedReader,float[][]) throws java.io.IOException
*loadFloats(java.io.BufferedReader p0,float[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadFloats(java.io.BufferedReader p0,float[]... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.TextIO.loadFloats(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#loadFloats(java.io.BufferedReader,float[][],long,long)}
*@see it.unimi.dsi.fastutil.io.TextIO#loadFloats(java.io.BufferedReader,float[][],long,long)
*<code>public static long it.unimi.dsi.fastutil.io.TextIO.loadFloats(java.io.BufferedReader,float[][],long,long) throws java.io.IOException
*loadFloats(java.io.BufferedReader p0,float[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadFloats(java.io.BufferedReader p0,float[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.TextIO.loadFloats(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#loadInts(java.io.BufferedReader,int...)}
*@see it.unimi.dsi.fastutil.io.TextIO#loadInts(java.io.BufferedReader,int...)
*<code>public static int it.unimi.dsi.fastutil.io.TextIO.loadInts(java.io.BufferedReader,int[]) throws java.io.IOException
*loadInts(java.io.BufferedReader p0,int... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadInts(java.io.BufferedReader p0,int... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.TextIO.loadInts(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#loadInts(java.io.BufferedReader,int[],int,int)}
*@see it.unimi.dsi.fastutil.io.TextIO#loadInts(java.io.BufferedReader,int[],int,int)
*<code>public static int it.unimi.dsi.fastutil.io.TextIO.loadInts(java.io.BufferedReader,int[],int,int) throws java.io.IOException
*loadInts(java.io.BufferedReader p0,int[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadInts(java.io.BufferedReader p0,int[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.TextIO.loadInts(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#loadInts(java.io.BufferedReader,int[][],long,long)}
*@see it.unimi.dsi.fastutil.io.TextIO#loadInts(java.io.BufferedReader,int[][],long,long)
*<code>public static long it.unimi.dsi.fastutil.io.TextIO.loadInts(java.io.BufferedReader,int[][],long,long) throws java.io.IOException
*loadInts(java.io.BufferedReader p0,int[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadInts(java.io.BufferedReader p0,int[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.TextIO.loadInts(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#loadInts(java.io.BufferedReader,int[]...)}
*@see it.unimi.dsi.fastutil.io.TextIO#loadInts(java.io.BufferedReader,int[]...)
*<code>public static long it.unimi.dsi.fastutil.io.TextIO.loadInts(java.io.BufferedReader,int[][]) throws java.io.IOException
*loadInts(java.io.BufferedReader p0,int[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadInts(java.io.BufferedReader p0,int[]... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.TextIO.loadInts(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#loadLongs(java.io.BufferedReader,long[][],long,long)}
*@see it.unimi.dsi.fastutil.io.TextIO#loadLongs(java.io.BufferedReader,long[][],long,long)
*<code>public static long it.unimi.dsi.fastutil.io.TextIO.loadLongs(java.io.BufferedReader,long[][],long,long) throws java.io.IOException
*loadLongs(java.io.BufferedReader p0,long[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadLongs(java.io.BufferedReader p0,long[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.TextIO.loadLongs(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#loadLongs(java.io.BufferedReader,long[]...)}
*@see it.unimi.dsi.fastutil.io.TextIO#loadLongs(java.io.BufferedReader,long[]...)
*<code>public static long it.unimi.dsi.fastutil.io.TextIO.loadLongs(java.io.BufferedReader,long[][]) throws java.io.IOException
*loadLongs(java.io.BufferedReader p0,long[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadLongs(java.io.BufferedReader p0,long[]... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.TextIO.loadLongs(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#loadLongs(java.io.BufferedReader,long...)}
*@see it.unimi.dsi.fastutil.io.TextIO#loadLongs(java.io.BufferedReader,long...)
*<code>public static int it.unimi.dsi.fastutil.io.TextIO.loadLongs(java.io.BufferedReader,long[]) throws java.io.IOException
*loadLongs(java.io.BufferedReader p0,long... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadLongs(java.io.BufferedReader p0,long... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.TextIO.loadLongs(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#loadLongs(java.io.BufferedReader,long[],int,int)}
*@see it.unimi.dsi.fastutil.io.TextIO#loadLongs(java.io.BufferedReader,long[],int,int)
*<code>public static int it.unimi.dsi.fastutil.io.TextIO.loadLongs(java.io.BufferedReader,long[],int,int) throws java.io.IOException
*loadLongs(java.io.BufferedReader p0,long[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadLongs(java.io.BufferedReader p0,long[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.TextIO.loadLongs(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#loadShorts(java.io.BufferedReader,short[]...)}
*@see it.unimi.dsi.fastutil.io.TextIO#loadShorts(java.io.BufferedReader,short[]...)
*<code>public static long it.unimi.dsi.fastutil.io.TextIO.loadShorts(java.io.BufferedReader,short[][]) throws java.io.IOException
*loadShorts(java.io.BufferedReader p0,short[]... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadShorts(java.io.BufferedReader p0,short[]... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.TextIO.loadShorts(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#loadShorts(java.io.BufferedReader,short[][],long,long)}
*@see it.unimi.dsi.fastutil.io.TextIO#loadShorts(java.io.BufferedReader,short[][],long,long)
*<code>public static long it.unimi.dsi.fastutil.io.TextIO.loadShorts(java.io.BufferedReader,short[][],long,long) throws java.io.IOException
*loadShorts(java.io.BufferedReader p0,short[][] p1,long p2,long p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long loadShorts(java.io.BufferedReader p0,short[][] p1,long p2,long p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.TextIO.loadShorts(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#loadShorts(java.io.BufferedReader,short[],int,int)}
*@see it.unimi.dsi.fastutil.io.TextIO#loadShorts(java.io.BufferedReader,short[],int,int)
*<code>public static int it.unimi.dsi.fastutil.io.TextIO.loadShorts(java.io.BufferedReader,short[],int,int) throws java.io.IOException
*loadShorts(java.io.BufferedReader p0,short[] p1,int p2,int p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadShorts(java.io.BufferedReader p0,short[] p1,int p2,int p3) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.TextIO.loadShorts(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.io.TextIO#loadShorts(java.io.BufferedReader,short...)}
*@see it.unimi.dsi.fastutil.io.TextIO#loadShorts(java.io.BufferedReader,short...)
*<code>public static int it.unimi.dsi.fastutil.io.TextIO.loadShorts(java.io.BufferedReader,short[]) throws java.io.IOException
*loadShorts(java.io.BufferedReader p0,short... p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int loadShorts(java.io.BufferedReader p0,short... p1) throws java.io.IOException{
	return it.unimi.dsi.fastutil.io.TextIO.loadShorts(p0,p1);
}
/**
*{@link com.google.common.io.Files#newReader(java.io.File,java.nio.charset.Charset)}
*@see com.google.common.io.Files#newReader(java.io.File,java.nio.charset.Charset)
*<code>public static java.io.BufferedReader com.google.common.io.Files.newReader(java.io.File,java.nio.charset.Charset) throws java.io.FileNotFoundException
*newReader(java.io.File p0,java.nio.charset.Charset p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.BufferedReader newReader(java.io.File p0,java.nio.charset.Charset p1) throws java.io.FileNotFoundException{
	return com.google.common.io.Files.newReader(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#toBufferedReader(java.io.Reader,int)}
*@see org.apache.commons.io.IOUtils#toBufferedReader(java.io.Reader,int)
*<code>public static java.io.BufferedReader org.apache.commons.io.IOUtils.toBufferedReader(java.io.Reader,int)
*toBufferedReader(java.io.Reader p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.BufferedReader toBufferedReader(java.io.Reader p0,int p1){
	return org.apache.commons.io.IOUtils.toBufferedReader(p0,p1);
}
/**
*{@link org.apache.commons.io.IOUtils#toBufferedReader(java.io.Reader)}
*@see org.apache.commons.io.IOUtils#toBufferedReader(java.io.Reader)
*<code>public static java.io.BufferedReader org.apache.commons.io.IOUtils.toBufferedReader(java.io.Reader)
*toBufferedReader(java.io.Reader p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.io.BufferedReader toBufferedReader(java.io.Reader p0){
	return org.apache.commons.io.IOUtils.toBufferedReader(p0);
}
}
