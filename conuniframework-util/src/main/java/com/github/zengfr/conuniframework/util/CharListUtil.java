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
public final class CharListUtil{ 
/**
*{@link it.unimi.dsi.fastutil.chars.CharBigLists#asBigList(it.unimi.dsi.fastutil.chars.CharList)}
*@see it.unimi.dsi.fastutil.chars.CharBigLists#asBigList(it.unimi.dsi.fastutil.chars.CharList)
*<code>public static it.unimi.dsi.fastutil.chars.CharBigList it.unimi.dsi.fastutil.chars.CharBigLists.asBigList(it.unimi.dsi.fastutil.chars.CharList)
*asBigList(it.unimi.dsi.fastutil.chars.CharList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharBigList asBigList(it.unimi.dsi.fastutil.chars.CharList p0){
	return it.unimi.dsi.fastutil.chars.CharBigLists.asBigList(p0);
}
/**
*{@link org.apache.commons.collections.primitives.CharCollections#getEmptyCharList()}
*@see org.apache.commons.collections.primitives.CharCollections#getEmptyCharList()
*<code>public static org.apache.commons.collections.primitives.CharList org.apache.commons.collections.primitives.CharCollections.getEmptyCharList()
*getEmptyCharList()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.CharList getEmptyCharList(){
	return org.apache.commons.collections.primitives.CharCollections.getEmptyCharList();
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharIterators#pour(it.unimi.dsi.fastutil.chars.CharIterator,int)}
*@see it.unimi.dsi.fastutil.chars.CharIterators#pour(it.unimi.dsi.fastutil.chars.CharIterator,int)
*<code>public static it.unimi.dsi.fastutil.chars.CharList it.unimi.dsi.fastutil.chars.CharIterators.pour(it.unimi.dsi.fastutil.chars.CharIterator,int)
*pour(it.unimi.dsi.fastutil.chars.CharIterator p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharList pour(it.unimi.dsi.fastutil.chars.CharIterator p0,int p1){
	return it.unimi.dsi.fastutil.chars.CharIterators.pour(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharIterators#pour(it.unimi.dsi.fastutil.chars.CharIterator)}
*@see it.unimi.dsi.fastutil.chars.CharIterators#pour(it.unimi.dsi.fastutil.chars.CharIterator)
*<code>public static it.unimi.dsi.fastutil.chars.CharList it.unimi.dsi.fastutil.chars.CharIterators.pour(it.unimi.dsi.fastutil.chars.CharIterator)
*pour(it.unimi.dsi.fastutil.chars.CharIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharList pour(it.unimi.dsi.fastutil.chars.CharIterator p0){
	return it.unimi.dsi.fastutil.chars.CharIterators.pour(p0);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharLists#shuffle(it.unimi.dsi.fastutil.chars.CharList,java.util.Random)}
*@see it.unimi.dsi.fastutil.chars.CharLists#shuffle(it.unimi.dsi.fastutil.chars.CharList,java.util.Random)
*<code>public static it.unimi.dsi.fastutil.chars.CharList it.unimi.dsi.fastutil.chars.CharLists.shuffle(it.unimi.dsi.fastutil.chars.CharList,java.util.Random)
*shuffle(it.unimi.dsi.fastutil.chars.CharList p0,java.util.Random p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharList shuffle(it.unimi.dsi.fastutil.chars.CharList p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.chars.CharLists.shuffle(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharLists#singleton(char)}
*@see it.unimi.dsi.fastutil.chars.CharLists#singleton(char)
*<code>public static it.unimi.dsi.fastutil.chars.CharList it.unimi.dsi.fastutil.chars.CharLists.singleton(char)
*singleton(char p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharList singleton(char p0){
	return it.unimi.dsi.fastutil.chars.CharLists.singleton(p0);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharLists#singleton(java.lang.Object)}
*@see it.unimi.dsi.fastutil.chars.CharLists#singleton(java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.chars.CharList it.unimi.dsi.fastutil.chars.CharLists.singleton(java.lang.Object)
*singleton(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharList singleton(java.lang.Object p0){
	return it.unimi.dsi.fastutil.chars.CharLists.singleton(p0);
}
/**
*{@link org.apache.commons.collections.primitives.CharCollections#singletonCharList(char)}
*@see org.apache.commons.collections.primitives.CharCollections#singletonCharList(char)
*<code>public static org.apache.commons.collections.primitives.CharList org.apache.commons.collections.primitives.CharCollections.singletonCharList(char)
*singletonCharList(char p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.CharList singletonCharList(char p0){
	return org.apache.commons.collections.primitives.CharCollections.singletonCharList(p0);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharLists#synchronize(it.unimi.dsi.fastutil.chars.CharList)}
*@see it.unimi.dsi.fastutil.chars.CharLists#synchronize(it.unimi.dsi.fastutil.chars.CharList)
*<code>public static it.unimi.dsi.fastutil.chars.CharList it.unimi.dsi.fastutil.chars.CharLists.synchronize(it.unimi.dsi.fastutil.chars.CharList)
*synchronize(it.unimi.dsi.fastutil.chars.CharList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharList synchronize(it.unimi.dsi.fastutil.chars.CharList p0){
	return it.unimi.dsi.fastutil.chars.CharLists.synchronize(p0);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharLists#synchronize(it.unimi.dsi.fastutil.chars.CharList,java.lang.Object)}
*@see it.unimi.dsi.fastutil.chars.CharLists#synchronize(it.unimi.dsi.fastutil.chars.CharList,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.chars.CharList it.unimi.dsi.fastutil.chars.CharLists.synchronize(it.unimi.dsi.fastutil.chars.CharList,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.chars.CharList p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharList synchronize(it.unimi.dsi.fastutil.chars.CharList p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.chars.CharLists.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharLists#unmodifiable(it.unimi.dsi.fastutil.chars.CharList)}
*@see it.unimi.dsi.fastutil.chars.CharLists#unmodifiable(it.unimi.dsi.fastutil.chars.CharList)
*<code>public static it.unimi.dsi.fastutil.chars.CharList it.unimi.dsi.fastutil.chars.CharLists.unmodifiable(it.unimi.dsi.fastutil.chars.CharList)
*unmodifiable(it.unimi.dsi.fastutil.chars.CharList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharList unmodifiable(it.unimi.dsi.fastutil.chars.CharList p0){
	return it.unimi.dsi.fastutil.chars.CharLists.unmodifiable(p0);
}
/**
*{@link org.apache.commons.collections.primitives.CharCollections#unmodifiableCharList(org.apache.commons.collections.primitives.CharList)}
*@see org.apache.commons.collections.primitives.CharCollections#unmodifiableCharList(org.apache.commons.collections.primitives.CharList)
*<code>public static org.apache.commons.collections.primitives.CharList org.apache.commons.collections.primitives.CharCollections.unmodifiableCharList(org.apache.commons.collections.primitives.CharList) throws java.lang.NullPointerException
*unmodifiableCharList(org.apache.commons.collections.primitives.CharList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.CharList unmodifiableCharList(org.apache.commons.collections.primitives.CharList p0) throws java.lang.NullPointerException{
	return org.apache.commons.collections.primitives.CharCollections.unmodifiableCharList(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.CharListList#wrap(org.apache.commons.collections.primitives.CharList)}
*@see org.apache.commons.collections.primitives.adapters.CharListList#wrap(org.apache.commons.collections.primitives.CharList)
*<code>public static java.util.List org.apache.commons.collections.primitives.adapters.CharListList.wrap(org.apache.commons.collections.primitives.CharList)
*wrap(org.apache.commons.collections.primitives.CharList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List wrap(org.apache.commons.collections.primitives.CharList p0){
	return org.apache.commons.collections.primitives.adapters.CharListList.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.ListCharList#wrap(java.util.List)}
*@see org.apache.commons.collections.primitives.adapters.ListCharList#wrap(java.util.List)
*<code>public static org.apache.commons.collections.primitives.CharList org.apache.commons.collections.primitives.adapters.ListCharList.wrap(java.util.List)
*wrap(java.util.List p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.CharList wrap(java.util.List p0){
	return org.apache.commons.collections.primitives.adapters.ListCharList.wrap(p0);
}
}
