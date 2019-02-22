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
public final class FloatListIteratorUtil{ 
/**
*{@link it.unimi.dsi.fastutil.floats.FloatBigListIterators#asBigListIterator(it.unimi.dsi.fastutil.floats.FloatListIterator)}
*@see it.unimi.dsi.fastutil.floats.FloatBigListIterators#asBigListIterator(it.unimi.dsi.fastutil.floats.FloatListIterator)
*<code>public static it.unimi.dsi.fastutil.floats.FloatBigListIterator it.unimi.dsi.fastutil.floats.FloatBigListIterators.asBigListIterator(it.unimi.dsi.fastutil.floats.FloatListIterator)
*asBigListIterator(it.unimi.dsi.fastutil.floats.FloatListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatBigListIterator asBigListIterator(it.unimi.dsi.fastutil.floats.FloatListIterator p0){
	return it.unimi.dsi.fastutil.floats.FloatBigListIterators.asBigListIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIterators#asFloatIterator(java.util.ListIterator)}
*@see it.unimi.dsi.fastutil.floats.FloatIterators#asFloatIterator(java.util.ListIterator)
*<code>public static it.unimi.dsi.fastutil.floats.FloatListIterator it.unimi.dsi.fastutil.floats.FloatIterators.asFloatIterator(java.util.ListIterator)
*asFloatIterator(java.util.ListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatListIterator asFloatIterator(java.util.ListIterator p0){
	return it.unimi.dsi.fastutil.floats.FloatIterators.asFloatIterator(p0);
}
/**
*{@link org.apache.commons.collections.primitives.FloatCollections#getEmptyFloatListIterator()}
*@see org.apache.commons.collections.primitives.FloatCollections#getEmptyFloatListIterator()
*<code>public static org.apache.commons.collections.primitives.FloatListIterator org.apache.commons.collections.primitives.FloatCollections.getEmptyFloatListIterator()
*getEmptyFloatListIterator()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.FloatListIterator getEmptyFloatListIterator(){
	return org.apache.commons.collections.primitives.FloatCollections.getEmptyFloatListIterator();
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIterators#singleton(float)}
*@see it.unimi.dsi.fastutil.floats.FloatIterators#singleton(float)
*<code>public static it.unimi.dsi.fastutil.floats.FloatListIterator it.unimi.dsi.fastutil.floats.FloatIterators.singleton(float)
*singleton(float p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatListIterator singleton(float p0){
	return it.unimi.dsi.fastutil.floats.FloatIterators.singleton(p0);
}
/**
*{@link org.apache.commons.collections.primitives.FloatCollections#singletonFloatListIterator(float)}
*@see org.apache.commons.collections.primitives.FloatCollections#singletonFloatListIterator(float)
*<code>public static org.apache.commons.collections.primitives.FloatListIterator org.apache.commons.collections.primitives.FloatCollections.singletonFloatListIterator(float)
*singletonFloatListIterator(float p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.FloatListIterator singletonFloatListIterator(float p0){
	return org.apache.commons.collections.primitives.FloatCollections.singletonFloatListIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIterators#unmodifiable(it.unimi.dsi.fastutil.floats.FloatListIterator)}
*@see it.unimi.dsi.fastutil.floats.FloatIterators#unmodifiable(it.unimi.dsi.fastutil.floats.FloatListIterator)
*<code>public static it.unimi.dsi.fastutil.floats.FloatListIterator it.unimi.dsi.fastutil.floats.FloatIterators.unmodifiable(it.unimi.dsi.fastutil.floats.FloatListIterator)
*unmodifiable(it.unimi.dsi.fastutil.floats.FloatListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatListIterator unmodifiable(it.unimi.dsi.fastutil.floats.FloatListIterator p0){
	return it.unimi.dsi.fastutil.floats.FloatIterators.unmodifiable(p0);
}
/**
*{@link org.apache.commons.collections.primitives.FloatCollections#unmodifiableFloatListIterator(org.apache.commons.collections.primitives.FloatListIterator)}
*@see org.apache.commons.collections.primitives.FloatCollections#unmodifiableFloatListIterator(org.apache.commons.collections.primitives.FloatListIterator)
*<code>public static org.apache.commons.collections.primitives.FloatListIterator org.apache.commons.collections.primitives.FloatCollections.unmodifiableFloatListIterator(org.apache.commons.collections.primitives.FloatListIterator)
*unmodifiableFloatListIterator(org.apache.commons.collections.primitives.FloatListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.FloatListIterator unmodifiableFloatListIterator(org.apache.commons.collections.primitives.FloatListIterator p0){
	return org.apache.commons.collections.primitives.FloatCollections.unmodifiableFloatListIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIterators#wrap(float[],int,int)}
*@see it.unimi.dsi.fastutil.floats.FloatIterators#wrap(float[],int,int)
*<code>public static it.unimi.dsi.fastutil.floats.FloatListIterator it.unimi.dsi.fastutil.floats.FloatIterators.wrap(float[],int,int)
*wrap(float[] p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatListIterator wrap(float[] p0,int p1,int p2){
	return it.unimi.dsi.fastutil.floats.FloatIterators.wrap(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIterators#wrap(float...)}
*@see it.unimi.dsi.fastutil.floats.FloatIterators#wrap(float...)
*<code>public static it.unimi.dsi.fastutil.floats.FloatListIterator it.unimi.dsi.fastutil.floats.FloatIterators.wrap(float[])
*wrap(float... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatListIterator wrap(float... p0){
	return it.unimi.dsi.fastutil.floats.FloatIterators.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.FloatListIteratorListIterator#wrap(org.apache.commons.collections.primitives.FloatListIterator)}
*@see org.apache.commons.collections.primitives.adapters.FloatListIteratorListIterator#wrap(org.apache.commons.collections.primitives.FloatListIterator)
*<code>public static java.util.ListIterator org.apache.commons.collections.primitives.adapters.FloatListIteratorListIterator.wrap(org.apache.commons.collections.primitives.FloatListIterator)
*wrap(org.apache.commons.collections.primitives.FloatListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.ListIterator wrap(org.apache.commons.collections.primitives.FloatListIterator p0){
	return org.apache.commons.collections.primitives.adapters.FloatListIteratorListIterator.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.ListIteratorFloatListIterator#wrap(java.util.ListIterator)}
*@see org.apache.commons.collections.primitives.adapters.ListIteratorFloatListIterator#wrap(java.util.ListIterator)
*<code>public static org.apache.commons.collections.primitives.FloatListIterator org.apache.commons.collections.primitives.adapters.ListIteratorFloatListIterator.wrap(java.util.ListIterator)
*wrap(java.util.ListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.FloatListIterator wrap(java.util.ListIterator p0){
	return org.apache.commons.collections.primitives.adapters.ListIteratorFloatListIterator.wrap(p0);
}
}
