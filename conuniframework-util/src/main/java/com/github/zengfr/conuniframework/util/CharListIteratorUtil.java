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
public final class CharListIteratorUtil{ 
/**
*{@link it.unimi.dsi.fastutil.chars.CharBigListIterators#asBigListIterator(it.unimi.dsi.fastutil.chars.CharListIterator)}
*@see it.unimi.dsi.fastutil.chars.CharBigListIterators#asBigListIterator(it.unimi.dsi.fastutil.chars.CharListIterator)
*<code>public static it.unimi.dsi.fastutil.chars.CharBigListIterator it.unimi.dsi.fastutil.chars.CharBigListIterators.asBigListIterator(it.unimi.dsi.fastutil.chars.CharListIterator)
*asBigListIterator(it.unimi.dsi.fastutil.chars.CharListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharBigListIterator asBigListIterator(it.unimi.dsi.fastutil.chars.CharListIterator p0){
	return it.unimi.dsi.fastutil.chars.CharBigListIterators.asBigListIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharIterators#asCharIterator(java.util.ListIterator)}
*@see it.unimi.dsi.fastutil.chars.CharIterators#asCharIterator(java.util.ListIterator)
*<code>public static it.unimi.dsi.fastutil.chars.CharListIterator it.unimi.dsi.fastutil.chars.CharIterators.asCharIterator(java.util.ListIterator)
*asCharIterator(java.util.ListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharListIterator asCharIterator(java.util.ListIterator p0){
	return it.unimi.dsi.fastutil.chars.CharIterators.asCharIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharIterators#fromTo(char,char)}
*@see it.unimi.dsi.fastutil.chars.CharIterators#fromTo(char,char)
*<code>public static it.unimi.dsi.fastutil.chars.CharListIterator it.unimi.dsi.fastutil.chars.CharIterators.fromTo(char,char)
*fromTo(char p0,char p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharListIterator fromTo(char p0,char p1){
	return it.unimi.dsi.fastutil.chars.CharIterators.fromTo(p0,p1);
}
/**
*{@link org.apache.commons.collections.primitives.CharCollections#getEmptyCharListIterator()}
*@see org.apache.commons.collections.primitives.CharCollections#getEmptyCharListIterator()
*<code>public static org.apache.commons.collections.primitives.CharListIterator org.apache.commons.collections.primitives.CharCollections.getEmptyCharListIterator()
*getEmptyCharListIterator()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.CharListIterator getEmptyCharListIterator(){
	return org.apache.commons.collections.primitives.CharCollections.getEmptyCharListIterator();
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharIterators#singleton(char)}
*@see it.unimi.dsi.fastutil.chars.CharIterators#singleton(char)
*<code>public static it.unimi.dsi.fastutil.chars.CharListIterator it.unimi.dsi.fastutil.chars.CharIterators.singleton(char)
*singleton(char p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharListIterator singleton(char p0){
	return it.unimi.dsi.fastutil.chars.CharIterators.singleton(p0);
}
/**
*{@link org.apache.commons.collections.primitives.CharCollections#singletonCharListIterator(char)}
*@see org.apache.commons.collections.primitives.CharCollections#singletonCharListIterator(char)
*<code>public static org.apache.commons.collections.primitives.CharListIterator org.apache.commons.collections.primitives.CharCollections.singletonCharListIterator(char)
*singletonCharListIterator(char p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.CharListIterator singletonCharListIterator(char p0){
	return org.apache.commons.collections.primitives.CharCollections.singletonCharListIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharIterators#unmodifiable(it.unimi.dsi.fastutil.chars.CharListIterator)}
*@see it.unimi.dsi.fastutil.chars.CharIterators#unmodifiable(it.unimi.dsi.fastutil.chars.CharListIterator)
*<code>public static it.unimi.dsi.fastutil.chars.CharListIterator it.unimi.dsi.fastutil.chars.CharIterators.unmodifiable(it.unimi.dsi.fastutil.chars.CharListIterator)
*unmodifiable(it.unimi.dsi.fastutil.chars.CharListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharListIterator unmodifiable(it.unimi.dsi.fastutil.chars.CharListIterator p0){
	return it.unimi.dsi.fastutil.chars.CharIterators.unmodifiable(p0);
}
/**
*{@link org.apache.commons.collections.primitives.CharCollections#unmodifiableCharListIterator(org.apache.commons.collections.primitives.CharListIterator)}
*@see org.apache.commons.collections.primitives.CharCollections#unmodifiableCharListIterator(org.apache.commons.collections.primitives.CharListIterator)
*<code>public static org.apache.commons.collections.primitives.CharListIterator org.apache.commons.collections.primitives.CharCollections.unmodifiableCharListIterator(org.apache.commons.collections.primitives.CharListIterator)
*unmodifiableCharListIterator(org.apache.commons.collections.primitives.CharListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.CharListIterator unmodifiableCharListIterator(org.apache.commons.collections.primitives.CharListIterator p0){
	return org.apache.commons.collections.primitives.CharCollections.unmodifiableCharListIterator(p0);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharIterators#wrap(char[],int,int)}
*@see it.unimi.dsi.fastutil.chars.CharIterators#wrap(char[],int,int)
*<code>public static it.unimi.dsi.fastutil.chars.CharListIterator it.unimi.dsi.fastutil.chars.CharIterators.wrap(char[],int,int)
*wrap(char[] p0,int p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharListIterator wrap(char[] p0,int p1,int p2){
	return it.unimi.dsi.fastutil.chars.CharIterators.wrap(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharIterators#wrap(char...)}
*@see it.unimi.dsi.fastutil.chars.CharIterators#wrap(char...)
*<code>public static it.unimi.dsi.fastutil.chars.CharListIterator it.unimi.dsi.fastutil.chars.CharIterators.wrap(char[])
*wrap(char... p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharListIterator wrap(char... p0){
	return it.unimi.dsi.fastutil.chars.CharIterators.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.CharListIteratorListIterator#wrap(org.apache.commons.collections.primitives.CharListIterator)}
*@see org.apache.commons.collections.primitives.adapters.CharListIteratorListIterator#wrap(org.apache.commons.collections.primitives.CharListIterator)
*<code>public static java.util.ListIterator org.apache.commons.collections.primitives.adapters.CharListIteratorListIterator.wrap(org.apache.commons.collections.primitives.CharListIterator)
*wrap(org.apache.commons.collections.primitives.CharListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.ListIterator wrap(org.apache.commons.collections.primitives.CharListIterator p0){
	return org.apache.commons.collections.primitives.adapters.CharListIteratorListIterator.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.ListIteratorCharListIterator#wrap(java.util.ListIterator)}
*@see org.apache.commons.collections.primitives.adapters.ListIteratorCharListIterator#wrap(java.util.ListIterator)
*<code>public static org.apache.commons.collections.primitives.CharListIterator org.apache.commons.collections.primitives.adapters.ListIteratorCharListIterator.wrap(java.util.ListIterator)
*wrap(java.util.ListIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.CharListIterator wrap(java.util.ListIterator p0){
	return org.apache.commons.collections.primitives.adapters.ListIteratorCharListIterator.wrap(p0);
}
}
