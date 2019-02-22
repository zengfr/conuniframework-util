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
public final class CharCollectionUtil{ 
/**
*{@link it.unimi.dsi.fastutil.chars.CharCollections#asCollection(it.unimi.dsi.fastutil.chars.CharIterable)}
*@see it.unimi.dsi.fastutil.chars.CharCollections#asCollection(it.unimi.dsi.fastutil.chars.CharIterable)
*<code>public static it.unimi.dsi.fastutil.chars.CharCollection it.unimi.dsi.fastutil.chars.CharCollections.asCollection(it.unimi.dsi.fastutil.chars.CharIterable)
*asCollection(it.unimi.dsi.fastutil.chars.CharIterable p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharCollection asCollection(it.unimi.dsi.fastutil.chars.CharIterable p0){
	return it.unimi.dsi.fastutil.chars.CharCollections.asCollection(p0);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharIterators#pour(it.unimi.dsi.fastutil.chars.CharIterator,it.unimi.dsi.fastutil.chars.CharCollection)}
*@see it.unimi.dsi.fastutil.chars.CharIterators#pour(it.unimi.dsi.fastutil.chars.CharIterator,it.unimi.dsi.fastutil.chars.CharCollection)
*<code>public static int it.unimi.dsi.fastutil.chars.CharIterators.pour(it.unimi.dsi.fastutil.chars.CharIterator,it.unimi.dsi.fastutil.chars.CharCollection)
*pour(it.unimi.dsi.fastutil.chars.CharIterator p0,it.unimi.dsi.fastutil.chars.CharCollection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int pour(it.unimi.dsi.fastutil.chars.CharIterator p0,it.unimi.dsi.fastutil.chars.CharCollection p1){
	return it.unimi.dsi.fastutil.chars.CharIterators.pour(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharIterators#pour(it.unimi.dsi.fastutil.chars.CharIterator,it.unimi.dsi.fastutil.chars.CharCollection,int)}
*@see it.unimi.dsi.fastutil.chars.CharIterators#pour(it.unimi.dsi.fastutil.chars.CharIterator,it.unimi.dsi.fastutil.chars.CharCollection,int)
*<code>public static int it.unimi.dsi.fastutil.chars.CharIterators.pour(it.unimi.dsi.fastutil.chars.CharIterator,it.unimi.dsi.fastutil.chars.CharCollection,int)
*pour(it.unimi.dsi.fastutil.chars.CharIterator p0,it.unimi.dsi.fastutil.chars.CharCollection p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int pour(it.unimi.dsi.fastutil.chars.CharIterator p0,it.unimi.dsi.fastutil.chars.CharCollection p1,int p2){
	return it.unimi.dsi.fastutil.chars.CharIterators.pour(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharCollections#synchronize(it.unimi.dsi.fastutil.chars.CharCollection,java.lang.Object)}
*@see it.unimi.dsi.fastutil.chars.CharCollections#synchronize(it.unimi.dsi.fastutil.chars.CharCollection,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.chars.CharCollection it.unimi.dsi.fastutil.chars.CharCollections.synchronize(it.unimi.dsi.fastutil.chars.CharCollection,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.chars.CharCollection p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharCollection synchronize(it.unimi.dsi.fastutil.chars.CharCollection p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.chars.CharCollections.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharCollections#synchronize(it.unimi.dsi.fastutil.chars.CharCollection)}
*@see it.unimi.dsi.fastutil.chars.CharCollections#synchronize(it.unimi.dsi.fastutil.chars.CharCollection)
*<code>public static it.unimi.dsi.fastutil.chars.CharCollection it.unimi.dsi.fastutil.chars.CharCollections.synchronize(it.unimi.dsi.fastutil.chars.CharCollection)
*synchronize(it.unimi.dsi.fastutil.chars.CharCollection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharCollection synchronize(it.unimi.dsi.fastutil.chars.CharCollection p0){
	return it.unimi.dsi.fastutil.chars.CharCollections.synchronize(p0);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharCollections#unmodifiable(it.unimi.dsi.fastutil.chars.CharCollection)}
*@see it.unimi.dsi.fastutil.chars.CharCollections#unmodifiable(it.unimi.dsi.fastutil.chars.CharCollection)
*<code>public static it.unimi.dsi.fastutil.chars.CharCollection it.unimi.dsi.fastutil.chars.CharCollections.unmodifiable(it.unimi.dsi.fastutil.chars.CharCollection)
*unmodifiable(it.unimi.dsi.fastutil.chars.CharCollection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.chars.CharCollection unmodifiable(it.unimi.dsi.fastutil.chars.CharCollection p0){
	return it.unimi.dsi.fastutil.chars.CharCollections.unmodifiable(p0);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharIterators#unwrap(it.unimi.dsi.fastutil.chars.CharIterator,it.unimi.dsi.fastutil.chars.CharCollection,int)}
*@see it.unimi.dsi.fastutil.chars.CharIterators#unwrap(it.unimi.dsi.fastutil.chars.CharIterator,it.unimi.dsi.fastutil.chars.CharCollection,int)
*<code>public static int it.unimi.dsi.fastutil.chars.CharIterators.unwrap(it.unimi.dsi.fastutil.chars.CharIterator,it.unimi.dsi.fastutil.chars.CharCollection,int)
*unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0,it.unimi.dsi.fastutil.chars.CharCollection p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0,it.unimi.dsi.fastutil.chars.CharCollection p1,int p2){
	return it.unimi.dsi.fastutil.chars.CharIterators.unwrap(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.chars.CharIterators#unwrap(it.unimi.dsi.fastutil.chars.CharIterator,it.unimi.dsi.fastutil.chars.CharCollection)}
*@see it.unimi.dsi.fastutil.chars.CharIterators#unwrap(it.unimi.dsi.fastutil.chars.CharIterator,it.unimi.dsi.fastutil.chars.CharCollection)
*<code>public static long it.unimi.dsi.fastutil.chars.CharIterators.unwrap(it.unimi.dsi.fastutil.chars.CharIterator,it.unimi.dsi.fastutil.chars.CharCollection)
*unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0,it.unimi.dsi.fastutil.chars.CharCollection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long unwrap(it.unimi.dsi.fastutil.chars.CharIterator p0,it.unimi.dsi.fastutil.chars.CharCollection p1){
	return it.unimi.dsi.fastutil.chars.CharIterators.unwrap(p0,p1);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.CharCollectionCollection#wrap(org.apache.commons.collections.primitives.CharCollection)}
*@see org.apache.commons.collections.primitives.adapters.CharCollectionCollection#wrap(org.apache.commons.collections.primitives.CharCollection)
*<code>public static java.util.Collection org.apache.commons.collections.primitives.adapters.CharCollectionCollection.wrap(org.apache.commons.collections.primitives.CharCollection)
*wrap(org.apache.commons.collections.primitives.CharCollection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection wrap(org.apache.commons.collections.primitives.CharCollection p0){
	return org.apache.commons.collections.primitives.adapters.CharCollectionCollection.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.CollectionCharCollection#wrap(java.util.Collection)}
*@see org.apache.commons.collections.primitives.adapters.CollectionCharCollection#wrap(java.util.Collection)
*<code>public static org.apache.commons.collections.primitives.CharCollection org.apache.commons.collections.primitives.adapters.CollectionCharCollection.wrap(java.util.Collection)
*wrap(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.CharCollection wrap(java.util.Collection p0){
	return org.apache.commons.collections.primitives.adapters.CollectionCharCollection.wrap(p0);
}
}
