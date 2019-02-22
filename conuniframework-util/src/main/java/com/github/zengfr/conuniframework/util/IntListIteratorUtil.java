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
public final class IntListIteratorUtil{ 
/**
*{@link it.unimi.dsi.fastutil.ints.IntBigListIterators#asBigListIterator(it.unimi.dsi.fastutil.ints.IntListIterator)}
*@see it.unimi.dsi.fastutil.ints.IntBigListIterators#asBigListIterator(it.unimi.dsi.fastutil.ints.IntListIterator)
*<code>public static it.unimi.dsi.fastutil.ints.IntBigListIterator it.unimi.dsi.fastutil.ints.IntBigListIterators.asBigListIterator(it.unimi.dsi.fastutil.ints.IntListIterator)
*asBigListIterator(it.unimi.dsi.fastutil.ints.IntListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntBigListIterator asBigListIterator(it.unimi.dsi.fastutil.ints.IntListIterator p0){
	return it.unimi.dsi.fastutil.ints.IntBigListIterators.asBigListIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntIterators#asIntIterator(java.util.ListIterator)}
*@see it.unimi.dsi.fastutil.ints.IntIterators#asIntIterator(java.util.ListIterator)
*<code>public static it.unimi.dsi.fastutil.ints.IntListIterator it.unimi.dsi.fastutil.ints.IntIterators.asIntIterator(java.util.ListIterator)
*asIntIterator(java.util.ListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntListIterator asIntIterator(java.util.ListIterator p0){
	return it.unimi.dsi.fastutil.ints.IntIterators.asIntIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntIterators#fromTo(int,int)}
*@see it.unimi.dsi.fastutil.ints.IntIterators#fromTo(int,int)
*<code>public static it.unimi.dsi.fastutil.ints.IntListIterator it.unimi.dsi.fastutil.ints.IntIterators.fromTo(int,int)
*fromTo(int p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntListIterator fromTo(int p0,int p1){
	return it.unimi.dsi.fastutil.ints.IntIterators.fromTo(p0,p1);
}
/**
*{@link org.apache.commons.collections.primitives.IntCollections#getEmptyIntListIterator()}
*@see org.apache.commons.collections.primitives.IntCollections#getEmptyIntListIterator()
*<code>public static org.apache.commons.collections.primitives.IntListIterator org.apache.commons.collections.primitives.IntCollections.getEmptyIntListIterator()
*getEmptyIntListIterator()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.IntListIterator getEmptyIntListIterator(){
	return org.apache.commons.collections.primitives.IntCollections.getEmptyIntListIterator();
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntIterators#singleton(int)}
*@see it.unimi.dsi.fastutil.ints.IntIterators#singleton(int)
*<code>public static it.unimi.dsi.fastutil.ints.IntListIterator it.unimi.dsi.fastutil.ints.IntIterators.singleton(int)
*singleton(int p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntListIterator singleton(int p0){
	return it.unimi.dsi.fastutil.ints.IntIterators.singleton(p0);
}
/**
*{@link org.apache.commons.collections.primitives.IntCollections#singletonIntListIterator(int)}
*@see org.apache.commons.collections.primitives.IntCollections#singletonIntListIterator(int)
*<code>public static org.apache.commons.collections.primitives.IntListIterator org.apache.commons.collections.primitives.IntCollections.singletonIntListIterator(int)
*singletonIntListIterator(int p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.IntListIterator singletonIntListIterator(int p0){
	return org.apache.commons.collections.primitives.IntCollections.singletonIntListIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntIterators#unmodifiable(it.unimi.dsi.fastutil.ints.IntListIterator)}
*@see it.unimi.dsi.fastutil.ints.IntIterators#unmodifiable(it.unimi.dsi.fastutil.ints.IntListIterator)
*<code>public static it.unimi.dsi.fastutil.ints.IntListIterator it.unimi.dsi.fastutil.ints.IntIterators.unmodifiable(it.unimi.dsi.fastutil.ints.IntListIterator)
*unmodifiable(it.unimi.dsi.fastutil.ints.IntListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntListIterator unmodifiable(it.unimi.dsi.fastutil.ints.IntListIterator p0){
	return it.unimi.dsi.fastutil.ints.IntIterators.unmodifiable(p0);
}
/**
*{@link org.apache.commons.collections.primitives.IntCollections#unmodifiableIntListIterator(org.apache.commons.collections.primitives.IntListIterator)}
*@see org.apache.commons.collections.primitives.IntCollections#unmodifiableIntListIterator(org.apache.commons.collections.primitives.IntListIterator)
*<code>public static org.apache.commons.collections.primitives.IntListIterator org.apache.commons.collections.primitives.IntCollections.unmodifiableIntListIterator(org.apache.commons.collections.primitives.IntListIterator)
*unmodifiableIntListIterator(org.apache.commons.collections.primitives.IntListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.IntListIterator unmodifiableIntListIterator(org.apache.commons.collections.primitives.IntListIterator p0){
	return org.apache.commons.collections.primitives.IntCollections.unmodifiableIntListIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntIterators#wrap(int[],int,int)}
*@see it.unimi.dsi.fastutil.ints.IntIterators#wrap(int[],int,int)
*<code>public static it.unimi.dsi.fastutil.ints.IntListIterator it.unimi.dsi.fastutil.ints.IntIterators.wrap(int[],int,int)
*wrap(int[] p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntListIterator wrap(int[] p0,int p1,int p2){
	return it.unimi.dsi.fastutil.ints.IntIterators.wrap(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntIterators#wrap(int...)}
*@see it.unimi.dsi.fastutil.ints.IntIterators#wrap(int...)
*<code>public static it.unimi.dsi.fastutil.ints.IntListIterator it.unimi.dsi.fastutil.ints.IntIterators.wrap(int[])
*wrap(int... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntListIterator wrap(int... p0){
	return it.unimi.dsi.fastutil.ints.IntIterators.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.IntListIteratorListIterator#wrap(org.apache.commons.collections.primitives.IntListIterator)}
*@see org.apache.commons.collections.primitives.adapters.IntListIteratorListIterator#wrap(org.apache.commons.collections.primitives.IntListIterator)
*<code>public static java.util.ListIterator org.apache.commons.collections.primitives.adapters.IntListIteratorListIterator.wrap(org.apache.commons.collections.primitives.IntListIterator)
*wrap(org.apache.commons.collections.primitives.IntListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.ListIterator wrap(org.apache.commons.collections.primitives.IntListIterator p0){
	return org.apache.commons.collections.primitives.adapters.IntListIteratorListIterator.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.ListIteratorIntListIterator#wrap(java.util.ListIterator)}
*@see org.apache.commons.collections.primitives.adapters.ListIteratorIntListIterator#wrap(java.util.ListIterator)
*<code>public static org.apache.commons.collections.primitives.IntListIterator org.apache.commons.collections.primitives.adapters.ListIteratorIntListIterator.wrap(java.util.ListIterator)
*wrap(java.util.ListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.IntListIterator wrap(java.util.ListIterator p0){
	return org.apache.commons.collections.primitives.adapters.ListIteratorIntListIterator.wrap(p0);
}
}
