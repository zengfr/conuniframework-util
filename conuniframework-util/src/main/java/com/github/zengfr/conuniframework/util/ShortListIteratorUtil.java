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
public final class ShortListIteratorUtil{ 
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortBigListIterators#asBigListIterator(it.unimi.dsi.fastutil.shorts.ShortListIterator)}
*@see it.unimi.dsi.fastutil.shorts.ShortBigListIterators#asBigListIterator(it.unimi.dsi.fastutil.shorts.ShortListIterator)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortBigListIterator it.unimi.dsi.fastutil.shorts.ShortBigListIterators.asBigListIterator(it.unimi.dsi.fastutil.shorts.ShortListIterator)
*asBigListIterator(it.unimi.dsi.fastutil.shorts.ShortListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortBigListIterator asBigListIterator(it.unimi.dsi.fastutil.shorts.ShortListIterator p0){
	return it.unimi.dsi.fastutil.shorts.ShortBigListIterators.asBigListIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortIterators#asShortIterator(java.util.ListIterator)}
*@see it.unimi.dsi.fastutil.shorts.ShortIterators#asShortIterator(java.util.ListIterator)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortListIterator it.unimi.dsi.fastutil.shorts.ShortIterators.asShortIterator(java.util.ListIterator)
*asShortIterator(java.util.ListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortListIterator asShortIterator(java.util.ListIterator p0){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.asShortIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortIterators#fromTo(short,short)}
*@see it.unimi.dsi.fastutil.shorts.ShortIterators#fromTo(short,short)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortListIterator it.unimi.dsi.fastutil.shorts.ShortIterators.fromTo(short,short)
*fromTo(short p0,short p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortListIterator fromTo(short p0,short p1){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.fromTo(p0,p1);
}
/**
*{@link org.apache.commons.collections.primitives.ShortCollections#getEmptyShortListIterator()}
*@see org.apache.commons.collections.primitives.ShortCollections#getEmptyShortListIterator()
*<code>public static org.apache.commons.collections.primitives.ShortListIterator org.apache.commons.collections.primitives.ShortCollections.getEmptyShortListIterator()
*getEmptyShortListIterator()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.ShortListIterator getEmptyShortListIterator(){
	return org.apache.commons.collections.primitives.ShortCollections.getEmptyShortListIterator();
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortIterators#singleton(short)}
*@see it.unimi.dsi.fastutil.shorts.ShortIterators#singleton(short)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortListIterator it.unimi.dsi.fastutil.shorts.ShortIterators.singleton(short)
*singleton(short p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortListIterator singleton(short p0){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.singleton(p0);
}
/**
*{@link org.apache.commons.collections.primitives.ShortCollections#singletonShortListIterator(short)}
*@see org.apache.commons.collections.primitives.ShortCollections#singletonShortListIterator(short)
*<code>public static org.apache.commons.collections.primitives.ShortListIterator org.apache.commons.collections.primitives.ShortCollections.singletonShortListIterator(short)
*singletonShortListIterator(short p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.ShortListIterator singletonShortListIterator(short p0){
	return org.apache.commons.collections.primitives.ShortCollections.singletonShortListIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortIterators#unmodifiable(it.unimi.dsi.fastutil.shorts.ShortListIterator)}
*@see it.unimi.dsi.fastutil.shorts.ShortIterators#unmodifiable(it.unimi.dsi.fastutil.shorts.ShortListIterator)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortListIterator it.unimi.dsi.fastutil.shorts.ShortIterators.unmodifiable(it.unimi.dsi.fastutil.shorts.ShortListIterator)
*unmodifiable(it.unimi.dsi.fastutil.shorts.ShortListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortListIterator unmodifiable(it.unimi.dsi.fastutil.shorts.ShortListIterator p0){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.unmodifiable(p0);
}
/**
*{@link org.apache.commons.collections.primitives.ShortCollections#unmodifiableShortListIterator(org.apache.commons.collections.primitives.ShortListIterator)}
*@see org.apache.commons.collections.primitives.ShortCollections#unmodifiableShortListIterator(org.apache.commons.collections.primitives.ShortListIterator)
*<code>public static org.apache.commons.collections.primitives.ShortListIterator org.apache.commons.collections.primitives.ShortCollections.unmodifiableShortListIterator(org.apache.commons.collections.primitives.ShortListIterator)
*unmodifiableShortListIterator(org.apache.commons.collections.primitives.ShortListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.ShortListIterator unmodifiableShortListIterator(org.apache.commons.collections.primitives.ShortListIterator p0){
	return org.apache.commons.collections.primitives.ShortCollections.unmodifiableShortListIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortIterators#wrap(short[],int,int)}
*@see it.unimi.dsi.fastutil.shorts.ShortIterators#wrap(short[],int,int)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortListIterator it.unimi.dsi.fastutil.shorts.ShortIterators.wrap(short[],int,int)
*wrap(short[] p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortListIterator wrap(short[] p0,int p1,int p2){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.wrap(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.shorts.ShortIterators#wrap(short...)}
*@see it.unimi.dsi.fastutil.shorts.ShortIterators#wrap(short...)
*<code>public static it.unimi.dsi.fastutil.shorts.ShortListIterator it.unimi.dsi.fastutil.shorts.ShortIterators.wrap(short[])
*wrap(short... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.shorts.ShortListIterator wrap(short... p0){
	return it.unimi.dsi.fastutil.shorts.ShortIterators.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.ListIteratorShortListIterator#wrap(java.util.ListIterator)}
*@see org.apache.commons.collections.primitives.adapters.ListIteratorShortListIterator#wrap(java.util.ListIterator)
*<code>public static org.apache.commons.collections.primitives.ShortListIterator org.apache.commons.collections.primitives.adapters.ListIteratorShortListIterator.wrap(java.util.ListIterator)
*wrap(java.util.ListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.ShortListIterator wrap(java.util.ListIterator p0){
	return org.apache.commons.collections.primitives.adapters.ListIteratorShortListIterator.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.ShortListIteratorListIterator#wrap(org.apache.commons.collections.primitives.ShortListIterator)}
*@see org.apache.commons.collections.primitives.adapters.ShortListIteratorListIterator#wrap(org.apache.commons.collections.primitives.ShortListIterator)
*<code>public static java.util.ListIterator org.apache.commons.collections.primitives.adapters.ShortListIteratorListIterator.wrap(org.apache.commons.collections.primitives.ShortListIterator)
*wrap(org.apache.commons.collections.primitives.ShortListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.ListIterator wrap(org.apache.commons.collections.primitives.ShortListIterator p0){
	return org.apache.commons.collections.primitives.adapters.ShortListIteratorListIterator.wrap(p0);
}
}
