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
public final class DoubleCollectionUtil{ 
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleCollections#asCollection(it.unimi.dsi.fastutil.doubles.DoubleIterable)}
*@see it.unimi.dsi.fastutil.doubles.DoubleCollections#asCollection(it.unimi.dsi.fastutil.doubles.DoubleIterable)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleCollection it.unimi.dsi.fastutil.doubles.DoubleCollections.asCollection(it.unimi.dsi.fastutil.doubles.DoubleIterable)
*asCollection(it.unimi.dsi.fastutil.doubles.DoubleIterable p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleCollection asCollection(it.unimi.dsi.fastutil.doubles.DoubleIterable p0){
	return it.unimi.dsi.fastutil.doubles.DoubleCollections.asCollection(p0);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleIterators#pour(it.unimi.dsi.fastutil.doubles.DoubleIterator,it.unimi.dsi.fastutil.doubles.DoubleCollection)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIterators#pour(it.unimi.dsi.fastutil.doubles.DoubleIterator,it.unimi.dsi.fastutil.doubles.DoubleCollection)
*<code>public static int it.unimi.dsi.fastutil.doubles.DoubleIterators.pour(it.unimi.dsi.fastutil.doubles.DoubleIterator,it.unimi.dsi.fastutil.doubles.DoubleCollection)
*pour(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,it.unimi.dsi.fastutil.doubles.DoubleCollection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int pour(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,it.unimi.dsi.fastutil.doubles.DoubleCollection p1){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.pour(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleIterators#pour(it.unimi.dsi.fastutil.doubles.DoubleIterator,it.unimi.dsi.fastutil.doubles.DoubleCollection,int)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIterators#pour(it.unimi.dsi.fastutil.doubles.DoubleIterator,it.unimi.dsi.fastutil.doubles.DoubleCollection,int)
*<code>public static int it.unimi.dsi.fastutil.doubles.DoubleIterators.pour(it.unimi.dsi.fastutil.doubles.DoubleIterator,it.unimi.dsi.fastutil.doubles.DoubleCollection,int)
*pour(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,it.unimi.dsi.fastutil.doubles.DoubleCollection p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int pour(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,it.unimi.dsi.fastutil.doubles.DoubleCollection p1,int p2){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.pour(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleCollections#synchronize(it.unimi.dsi.fastutil.doubles.DoubleCollection,java.lang.Object)}
*@see it.unimi.dsi.fastutil.doubles.DoubleCollections#synchronize(it.unimi.dsi.fastutil.doubles.DoubleCollection,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleCollection it.unimi.dsi.fastutil.doubles.DoubleCollections.synchronize(it.unimi.dsi.fastutil.doubles.DoubleCollection,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.doubles.DoubleCollection p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleCollection synchronize(it.unimi.dsi.fastutil.doubles.DoubleCollection p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.doubles.DoubleCollections.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleCollections#synchronize(it.unimi.dsi.fastutil.doubles.DoubleCollection)}
*@see it.unimi.dsi.fastutil.doubles.DoubleCollections#synchronize(it.unimi.dsi.fastutil.doubles.DoubleCollection)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleCollection it.unimi.dsi.fastutil.doubles.DoubleCollections.synchronize(it.unimi.dsi.fastutil.doubles.DoubleCollection)
*synchronize(it.unimi.dsi.fastutil.doubles.DoubleCollection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleCollection synchronize(it.unimi.dsi.fastutil.doubles.DoubleCollection p0){
	return it.unimi.dsi.fastutil.doubles.DoubleCollections.synchronize(p0);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleCollections#unmodifiable(it.unimi.dsi.fastutil.doubles.DoubleCollection)}
*@see it.unimi.dsi.fastutil.doubles.DoubleCollections#unmodifiable(it.unimi.dsi.fastutil.doubles.DoubleCollection)
*<code>public static it.unimi.dsi.fastutil.doubles.DoubleCollection it.unimi.dsi.fastutil.doubles.DoubleCollections.unmodifiable(it.unimi.dsi.fastutil.doubles.DoubleCollection)
*unmodifiable(it.unimi.dsi.fastutil.doubles.DoubleCollection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.doubles.DoubleCollection unmodifiable(it.unimi.dsi.fastutil.doubles.DoubleCollection p0){
	return it.unimi.dsi.fastutil.doubles.DoubleCollections.unmodifiable(p0);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleIterators#unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator,it.unimi.dsi.fastutil.doubles.DoubleCollection,int)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIterators#unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator,it.unimi.dsi.fastutil.doubles.DoubleCollection,int)
*<code>public static int it.unimi.dsi.fastutil.doubles.DoubleIterators.unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator,it.unimi.dsi.fastutil.doubles.DoubleCollection,int)
*unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,it.unimi.dsi.fastutil.doubles.DoubleCollection p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,it.unimi.dsi.fastutil.doubles.DoubleCollection p1,int p2){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.unwrap(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.doubles.DoubleIterators#unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator,it.unimi.dsi.fastutil.doubles.DoubleCollection)}
*@see it.unimi.dsi.fastutil.doubles.DoubleIterators#unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator,it.unimi.dsi.fastutil.doubles.DoubleCollection)
*<code>public static long it.unimi.dsi.fastutil.doubles.DoubleIterators.unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator,it.unimi.dsi.fastutil.doubles.DoubleCollection)
*unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,it.unimi.dsi.fastutil.doubles.DoubleCollection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long unwrap(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,it.unimi.dsi.fastutil.doubles.DoubleCollection p1){
	return it.unimi.dsi.fastutil.doubles.DoubleIterators.unwrap(p0,p1);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.CollectionDoubleCollection#wrap(java.util.Collection)}
*@see org.apache.commons.collections.primitives.adapters.CollectionDoubleCollection#wrap(java.util.Collection)
*<code>public static org.apache.commons.collections.primitives.DoubleCollection org.apache.commons.collections.primitives.adapters.CollectionDoubleCollection.wrap(java.util.Collection)
*wrap(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.DoubleCollection wrap(java.util.Collection p0){
	return org.apache.commons.collections.primitives.adapters.CollectionDoubleCollection.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.DoubleCollectionCollection#wrap(org.apache.commons.collections.primitives.DoubleCollection)}
*@see org.apache.commons.collections.primitives.adapters.DoubleCollectionCollection#wrap(org.apache.commons.collections.primitives.DoubleCollection)
*<code>public static java.util.Collection org.apache.commons.collections.primitives.adapters.DoubleCollectionCollection.wrap(org.apache.commons.collections.primitives.DoubleCollection)
*wrap(org.apache.commons.collections.primitives.DoubleCollection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection wrap(org.apache.commons.collections.primitives.DoubleCollection p0){
	return org.apache.commons.collections.primitives.adapters.DoubleCollectionCollection.wrap(p0);
}
}
