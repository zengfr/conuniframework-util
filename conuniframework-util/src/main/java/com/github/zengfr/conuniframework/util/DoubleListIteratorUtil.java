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
public final class DoubleListIteratorUtil{ 
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleBigListIterators#asBigListIterator(it.unimi.dsi.fastutil.doubles.DoubleListIterator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleBigListIterators#asBigListIterator(it.unimi.dsi.fastutil.doubles.DoubleListIterator)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleBigListIterator it.unimi.dsi.fastutil.doubles.DoubleBigListIterators.asBigListIterator(it.unimi.dsi.fastutil.doubles.DoubleListIterator)
*asBigListIterator(it.unimi.dsi.fastutil.doubles.DoubleListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleBigListIterator asBigListIterator(it.unimi.dsi.fastutil.doubles.DoubleListIterator p0){
	return it.unimi.dsi.fastutil.doubles.DoubleBigListIterators.asBigListIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleIterators#asDoubleIterator(java.util.ListIterator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIterators#asDoubleIterator(java.util.ListIterator)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleListIterator it.unimi.dsi.fastutil.doubles.DoubleIterators.asDoubleIterator(java.util.ListIterator)
*asDoubleIterator(java.util.ListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleListIterator asDoubleIterator(java.util.ListIterator p0){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.asDoubleIterator(p0);
}
/**
*{@link org.apache.commons.collections.primitives.DoubleCollections#getEmptyDoubleListIterator()}
*@see org.apache.commons.collections.primitives.DoubleCollections#getEmptyDoubleListIterator()
*<code>public static org.apache.commons.collections.primitives.DoubleListIterator org.apache.commons.collections.primitives.DoubleCollections.getEmptyDoubleListIterator()
*getEmptyDoubleListIterator()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.DoubleListIterator getEmptyDoubleListIterator(){
	return org.apache.commons.collections.primitives.DoubleCollections.getEmptyDoubleListIterator();
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleIterators#singleton(double)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIterators#singleton(double)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleListIterator it.unimi.dsi.fastutil.doubles.DoubleIterators.singleton(double)
*singleton(double p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleListIterator singleton(double p0){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.singleton(p0);
}
/**
*{@link org.apache.commons.collections.primitives.DoubleCollections#singletonDoubleListIterator(double)}
*@see org.apache.commons.collections.primitives.DoubleCollections#singletonDoubleListIterator(double)
*<code>public static org.apache.commons.collections.primitives.DoubleListIterator org.apache.commons.collections.primitives.DoubleCollections.singletonDoubleListIterator(double)
*singletonDoubleListIterator(double p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.DoubleListIterator singletonDoubleListIterator(double p0){
	return org.apache.commons.collections.primitives.DoubleCollections.singletonDoubleListIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleIterators#unmodifiable(it.unimi.dsi.fastutil.doubles.DoubleListIterator)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIterators#unmodifiable(it.unimi.dsi.fastutil.doubles.DoubleListIterator)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleListIterator it.unimi.dsi.fastutil.doubles.DoubleIterators.unmodifiable(it.unimi.dsi.fastutil.doubles.DoubleListIterator)
*unmodifiable(it.unimi.dsi.fastutil.doubles.DoubleListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleListIterator unmodifiable(it.unimi.dsi.fastutil.doubles.DoubleListIterator p0){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.unmodifiable(p0);
}
/**
*{@link org.apache.commons.collections.primitives.DoubleCollections#unmodifiableDoubleListIterator(org.apache.commons.collections.primitives.DoubleListIterator)}
*@see org.apache.commons.collections.primitives.DoubleCollections#unmodifiableDoubleListIterator(org.apache.commons.collections.primitives.DoubleListIterator)
*<code>public static org.apache.commons.collections.primitives.DoubleListIterator org.apache.commons.collections.primitives.DoubleCollections.unmodifiableDoubleListIterator(org.apache.commons.collections.primitives.DoubleListIterator)
*unmodifiableDoubleListIterator(org.apache.commons.collections.primitives.DoubleListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.DoubleListIterator unmodifiableDoubleListIterator(org.apache.commons.collections.primitives.DoubleListIterator p0){
	return org.apache.commons.collections.primitives.DoubleCollections.unmodifiableDoubleListIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleIterators#wrap(double[],int,int)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIterators#wrap(double[],int,int)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleListIterator it.unimi.dsi.fastutil.doubles.DoubleIterators.wrap(double[],int,int)
*wrap(double[] p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleListIterator wrap(double[] p0,int p1,int p2){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.wrap(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleIterators#wrap(double...)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIterators#wrap(double...)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleListIterator it.unimi.dsi.fastutil.doubles.DoubleIterators.wrap(double[])
*wrap(double... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleListIterator wrap(double... p0){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.DoubleListIteratorListIterator#wrap(org.apache.commons.collections.primitives.DoubleListIterator)}
*@see org.apache.commons.collections.primitives.adapters.DoubleListIteratorListIterator#wrap(org.apache.commons.collections.primitives.DoubleListIterator)
*<code>public static java.util.ListIterator org.apache.commons.collections.primitives.adapters.DoubleListIteratorListIterator.wrap(org.apache.commons.collections.primitives.DoubleListIterator)
*wrap(org.apache.commons.collections.primitives.DoubleListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.ListIterator wrap(org.apache.commons.collections.primitives.DoubleListIterator p0){
	return org.apache.commons.collections.primitives.adapters.DoubleListIteratorListIterator.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.ListIteratorDoubleListIterator#wrap(java.util.ListIterator)}
*@see org.apache.commons.collections.primitives.adapters.ListIteratorDoubleListIterator#wrap(java.util.ListIterator)
*<code>public static org.apache.commons.collections.primitives.DoubleListIterator org.apache.commons.collections.primitives.adapters.ListIteratorDoubleListIterator.wrap(java.util.ListIterator)
*wrap(java.util.ListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.DoubleListIterator wrap(java.util.ListIterator p0){
	return org.apache.commons.collections.primitives.adapters.ListIteratorDoubleListIterator.wrap(p0);
}
}
