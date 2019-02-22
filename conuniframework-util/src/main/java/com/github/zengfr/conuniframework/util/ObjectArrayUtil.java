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
public final class ObjectArrayUtil{ 
/**
*{@link org.apache.commons.math3.util.MathArrays#buildArray(org.apache.commons.math3.Field<T>,int,int)}
*@see org.apache.commons.math3.util.MathArrays#buildArray(org.apache.commons.math3.Field<T>,int,int)
*<code>public static <T> T[][] org.apache.commons.math3.util.MathArrays.buildArray(org.apache.commons.math3.Field<T>,int,int)
*buildArray(org.apache.commons.math3.Field<T> p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <T> T[][] buildArray(org.apache.commons.math3.Field<T> p0,int p1,int p2){
	return org.apache.commons.math3.util.MathArrays.buildArray(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#copy(K[][],long,long)}
*@see it.unimi.dsi.fastutil.BigArrays#copy(K[][],long,long)
*<code>public static <K> K[][] it.unimi.dsi.fastutil.BigArrays.copy(K[][],long,long)
*copy(K[][] p0,long p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> K[][] copy(K[][] p0,long p1,long p2){
	return it.unimi.dsi.fastutil.BigArrays.copy(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#copy(K[]...)}
*@see it.unimi.dsi.fastutil.BigArrays#copy(K[]...)
*<code>public static <K> K[][] it.unimi.dsi.fastutil.BigArrays.copy(K[][])
*copy(K[]... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> K[][] copy(K[]... p0){
	return it.unimi.dsi.fastutil.BigArrays.copy(p0);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#ensureCapacity(K[][],long)}
*@see it.unimi.dsi.fastutil.BigArrays#ensureCapacity(K[][],long)
*<code>public static <K> K[][] it.unimi.dsi.fastutil.BigArrays.ensureCapacity(K[][],long)
*ensureCapacity(K[][] p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> K[][] ensureCapacity(K[][] p0,long p1){
	return it.unimi.dsi.fastutil.BigArrays.ensureCapacity(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#ensureCapacity(K[][],long,long)}
*@see it.unimi.dsi.fastutil.BigArrays#ensureCapacity(K[][],long,long)
*<code>public static <K> K[][] it.unimi.dsi.fastutil.BigArrays.ensureCapacity(K[][],long,long)
*ensureCapacity(K[][] p0,long p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> K[][] ensureCapacity(K[][] p0,long p1,long p2){
	return it.unimi.dsi.fastutil.BigArrays.ensureCapacity(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#forceCapacity(K[][],long,long)}
*@see it.unimi.dsi.fastutil.BigArrays#forceCapacity(K[][],long,long)
*<code>public static <K> K[][] it.unimi.dsi.fastutil.BigArrays.forceCapacity(K[][],long,long)
*forceCapacity(K[][] p0,long p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> K[][] forceCapacity(K[][] p0,long p1,long p2){
	return it.unimi.dsi.fastutil.BigArrays.forceCapacity(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#grow(K[][],long)}
*@see it.unimi.dsi.fastutil.BigArrays#grow(K[][],long)
*<code>public static <K> K[][] it.unimi.dsi.fastutil.BigArrays.grow(K[][],long)
*grow(K[][] p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> K[][] grow(K[][] p0,long p1){
	return it.unimi.dsi.fastutil.BigArrays.grow(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#grow(K[][],long,long)}
*@see it.unimi.dsi.fastutil.BigArrays#grow(K[][],long,long)
*<code>public static <K> K[][] it.unimi.dsi.fastutil.BigArrays.grow(K[][],long,long)
*grow(K[][] p0,long p1,long p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> K[][] grow(K[][] p0,long p1,long p2){
	return it.unimi.dsi.fastutil.BigArrays.grow(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.objects.ObjectBigArrays#newBigArray(java.lang.Class<?>,long)}
*@see it.unimi.dsi.fastutil.objects.ObjectBigArrays#newBigArray(java.lang.Class<?>,long)
*<code>public static java.lang.Object[][] it.unimi.dsi.fastutil.objects.ObjectBigArrays.newBigArray(java.lang.Class<?>,long)
*newBigArray(java.lang.Class<?> p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object[][] newBigArray(java.lang.Class<?> p0,long p1){
	return it.unimi.dsi.fastutil.objects.ObjectBigArrays.newBigArray(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.ObjectBigArrays#newBigArray(long)}
*@see it.unimi.dsi.fastutil.objects.ObjectBigArrays#newBigArray(long)
*<code>public static java.lang.Object[][] it.unimi.dsi.fastutil.objects.ObjectBigArrays.newBigArray(long)
*newBigArray(long p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.lang.Object[][] newBigArray(long p0){
	return it.unimi.dsi.fastutil.objects.ObjectBigArrays.newBigArray(p0);
}
/**
*{@link it.unimi.dsi.fastutil.objects.ObjectBigArrays#newBigArray(K[][],long)}
*@see it.unimi.dsi.fastutil.objects.ObjectBigArrays#newBigArray(K[][],long)
*<code>public static <K> K[][] it.unimi.dsi.fastutil.objects.ObjectBigArrays.newBigArray(K[][],long)
*newBigArray(K[][] p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> K[][] newBigArray(K[][] p0,long p1){
	return it.unimi.dsi.fastutil.objects.ObjectBigArrays.newBigArray(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#setLength(K[][],long)}
*@see it.unimi.dsi.fastutil.BigArrays#setLength(K[][],long)
*<code>public static <K> K[][] it.unimi.dsi.fastutil.BigArrays.setLength(K[][],long)
*setLength(K[][] p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> K[][] setLength(K[][] p0,long p1){
	return it.unimi.dsi.fastutil.BigArrays.setLength(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.ObjectBigArrays#shuffle(K[][],java.util.Random)}
*@see it.unimi.dsi.fastutil.objects.ObjectBigArrays#shuffle(K[][],java.util.Random)
*<code>public static <K> K[][] it.unimi.dsi.fastutil.objects.ObjectBigArrays.shuffle(K[][],java.util.Random)
*shuffle(K[][] p0,java.util.Random p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> K[][] shuffle(K[][] p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.objects.ObjectBigArrays.shuffle(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.ObjectBigArrays#shuffle(K[][],long,long,java.util.Random)}
*@see it.unimi.dsi.fastutil.objects.ObjectBigArrays#shuffle(K[][],long,long,java.util.Random)
*<code>public static <K> K[][] it.unimi.dsi.fastutil.objects.ObjectBigArrays.shuffle(K[][],long,long,java.util.Random)
*shuffle(K[][] p0,long p1,long p2,java.util.Random p3)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> K[][] shuffle(K[][] p0,long p1,long p2,java.util.Random p3){
	return it.unimi.dsi.fastutil.objects.ObjectBigArrays.shuffle(p0,p1,p2,p3);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#trim(K[][],long)}
*@see it.unimi.dsi.fastutil.BigArrays#trim(K[][],long)
*<code>public static <K> K[][] it.unimi.dsi.fastutil.BigArrays.trim(K[][],long)
*trim(K[][] p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> K[][] trim(K[][] p0,long p1){
	return it.unimi.dsi.fastutil.BigArrays.trim(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.ObjectIterators#unwrapBig(java.util.Iterator<? extends K>,long)}
*@see it.unimi.dsi.fastutil.objects.ObjectIterators#unwrapBig(java.util.Iterator<? extends K>,long)
*<code>public static <K> K[][] it.unimi.dsi.fastutil.objects.ObjectIterators.unwrapBig(java.util.Iterator<? extends K>,long)
*unwrapBig(java.util.Iterator<? extends K> p0,long p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> K[][] unwrapBig(java.util.Iterator<? extends K> p0,long p1){
	return it.unimi.dsi.fastutil.objects.ObjectIterators.unwrapBig(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.objects.ObjectIterators#unwrapBig(java.util.Iterator<? extends K>)}
*@see it.unimi.dsi.fastutil.objects.ObjectIterators#unwrapBig(java.util.Iterator<? extends K>)
*<code>public static <K> K[][] it.unimi.dsi.fastutil.objects.ObjectIterators.unwrapBig(java.util.Iterator<? extends K>)
*unwrapBig(java.util.Iterator<? extends K> p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> K[][] unwrapBig(java.util.Iterator<? extends K> p0){
	return it.unimi.dsi.fastutil.objects.ObjectIterators.unwrapBig(p0);
}
/**
*{@link it.unimi.dsi.fastutil.BigArrays#wrap(K...)}
*@see it.unimi.dsi.fastutil.BigArrays#wrap(K...)
*<code>public static <K> K[][] it.unimi.dsi.fastutil.BigArrays.wrap(K[])
*wrap(K... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static <K> K[][] wrap(K... p0){
	return it.unimi.dsi.fastutil.BigArrays.wrap(p0);
}
}
