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
public final class FloatCollectionUtil{ 
/**
*{@link it.unimi.dsi.fastutil.floats.FloatCollections#asCollection(it.unimi.dsi.fastutil.floats.FloatIterable)}
*@see it.unimi.dsi.fastutil.floats.FloatCollections#asCollection(it.unimi.dsi.fastutil.floats.FloatIterable)
*<code>public static it.unimi.dsi.fastutil.floats.FloatCollection it.unimi.dsi.fastutil.floats.FloatCollections.asCollection(it.unimi.dsi.fastutil.floats.FloatIterable)
*asCollection(it.unimi.dsi.fastutil.floats.FloatIterable p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatCollection asCollection(it.unimi.dsi.fastutil.floats.FloatIterable p0){
	return it.unimi.dsi.fastutil.floats.FloatCollections.asCollection(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIterators#pour(it.unimi.dsi.fastutil.floats.FloatIterator,it.unimi.dsi.fastutil.floats.FloatCollection)}
*@see it.unimi.dsi.fastutil.floats.FloatIterators#pour(it.unimi.dsi.fastutil.floats.FloatIterator,it.unimi.dsi.fastutil.floats.FloatCollection)
*<code>public static int it.unimi.dsi.fastutil.floats.FloatIterators.pour(it.unimi.dsi.fastutil.floats.FloatIterator,it.unimi.dsi.fastutil.floats.FloatCollection)
*pour(it.unimi.dsi.fastutil.floats.FloatIterator p0,it.unimi.dsi.fastutil.floats.FloatCollection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int pour(it.unimi.dsi.fastutil.floats.FloatIterator p0,it.unimi.dsi.fastutil.floats.FloatCollection p1){
	return it.unimi.dsi.fastutil.floats.FloatIterators.pour(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIterators#pour(it.unimi.dsi.fastutil.floats.FloatIterator,it.unimi.dsi.fastutil.floats.FloatCollection,int)}
*@see it.unimi.dsi.fastutil.floats.FloatIterators#pour(it.unimi.dsi.fastutil.floats.FloatIterator,it.unimi.dsi.fastutil.floats.FloatCollection,int)
*<code>public static int it.unimi.dsi.fastutil.floats.FloatIterators.pour(it.unimi.dsi.fastutil.floats.FloatIterator,it.unimi.dsi.fastutil.floats.FloatCollection,int)
*pour(it.unimi.dsi.fastutil.floats.FloatIterator p0,it.unimi.dsi.fastutil.floats.FloatCollection p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int pour(it.unimi.dsi.fastutil.floats.FloatIterator p0,it.unimi.dsi.fastutil.floats.FloatCollection p1,int p2){
	return it.unimi.dsi.fastutil.floats.FloatIterators.pour(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatCollections#synchronize(it.unimi.dsi.fastutil.floats.FloatCollection,java.lang.Object)}
*@see it.unimi.dsi.fastutil.floats.FloatCollections#synchronize(it.unimi.dsi.fastutil.floats.FloatCollection,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.floats.FloatCollection it.unimi.dsi.fastutil.floats.FloatCollections.synchronize(it.unimi.dsi.fastutil.floats.FloatCollection,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.floats.FloatCollection p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatCollection synchronize(it.unimi.dsi.fastutil.floats.FloatCollection p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.floats.FloatCollections.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatCollections#synchronize(it.unimi.dsi.fastutil.floats.FloatCollection)}
*@see it.unimi.dsi.fastutil.floats.FloatCollections#synchronize(it.unimi.dsi.fastutil.floats.FloatCollection)
*<code>public static it.unimi.dsi.fastutil.floats.FloatCollection it.unimi.dsi.fastutil.floats.FloatCollections.synchronize(it.unimi.dsi.fastutil.floats.FloatCollection)
*synchronize(it.unimi.dsi.fastutil.floats.FloatCollection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatCollection synchronize(it.unimi.dsi.fastutil.floats.FloatCollection p0){
	return it.unimi.dsi.fastutil.floats.FloatCollections.synchronize(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatCollections#unmodifiable(it.unimi.dsi.fastutil.floats.FloatCollection)}
*@see it.unimi.dsi.fastutil.floats.FloatCollections#unmodifiable(it.unimi.dsi.fastutil.floats.FloatCollection)
*<code>public static it.unimi.dsi.fastutil.floats.FloatCollection it.unimi.dsi.fastutil.floats.FloatCollections.unmodifiable(it.unimi.dsi.fastutil.floats.FloatCollection)
*unmodifiable(it.unimi.dsi.fastutil.floats.FloatCollection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.floats.FloatCollection unmodifiable(it.unimi.dsi.fastutil.floats.FloatCollection p0){
	return it.unimi.dsi.fastutil.floats.FloatCollections.unmodifiable(p0);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIterators#unwrap(it.unimi.dsi.fastutil.floats.FloatIterator,it.unimi.dsi.fastutil.floats.FloatCollection)}
*@see it.unimi.dsi.fastutil.floats.FloatIterators#unwrap(it.unimi.dsi.fastutil.floats.FloatIterator,it.unimi.dsi.fastutil.floats.FloatCollection)
*<code>public static long it.unimi.dsi.fastutil.floats.FloatIterators.unwrap(it.unimi.dsi.fastutil.floats.FloatIterator,it.unimi.dsi.fastutil.floats.FloatCollection)
*unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,it.unimi.dsi.fastutil.floats.FloatCollection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,it.unimi.dsi.fastutil.floats.FloatCollection p1){
	return it.unimi.dsi.fastutil.floats.FloatIterators.unwrap(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.floats.FloatIterators#unwrap(it.unimi.dsi.fastutil.floats.FloatIterator,it.unimi.dsi.fastutil.floats.FloatCollection,int)}
*@see it.unimi.dsi.fastutil.floats.FloatIterators#unwrap(it.unimi.dsi.fastutil.floats.FloatIterator,it.unimi.dsi.fastutil.floats.FloatCollection,int)
*<code>public static int it.unimi.dsi.fastutil.floats.FloatIterators.unwrap(it.unimi.dsi.fastutil.floats.FloatIterator,it.unimi.dsi.fastutil.floats.FloatCollection,int)
*unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,it.unimi.dsi.fastutil.floats.FloatCollection p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int unwrap(it.unimi.dsi.fastutil.floats.FloatIterator p0,it.unimi.dsi.fastutil.floats.FloatCollection p1,int p2){
	return it.unimi.dsi.fastutil.floats.FloatIterators.unwrap(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.CollectionFloatCollection#wrap(java.util.Collection)}
*@see org.apache.commons.collections.primitives.adapters.CollectionFloatCollection#wrap(java.util.Collection)
*<code>public static org.apache.commons.collections.primitives.FloatCollection org.apache.commons.collections.primitives.adapters.CollectionFloatCollection.wrap(java.util.Collection)
*wrap(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.FloatCollection wrap(java.util.Collection p0){
	return org.apache.commons.collections.primitives.adapters.CollectionFloatCollection.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.FloatCollectionCollection#wrap(org.apache.commons.collections.primitives.FloatCollection)}
*@see org.apache.commons.collections.primitives.adapters.FloatCollectionCollection#wrap(org.apache.commons.collections.primitives.FloatCollection)
*<code>public static java.util.Collection org.apache.commons.collections.primitives.adapters.FloatCollectionCollection.wrap(org.apache.commons.collections.primitives.FloatCollection)
*wrap(org.apache.commons.collections.primitives.FloatCollection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection wrap(org.apache.commons.collections.primitives.FloatCollection p0){
	return org.apache.commons.collections.primitives.adapters.FloatCollectionCollection.wrap(p0);
}
}
