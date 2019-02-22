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
public final class IntCollectionUtil{ 
/**
*{@link it.unimi.dsi.fastutil.ints.IntCollections#asCollection(it.unimi.dsi.fastutil.ints.IntIterable)}
*@see it.unimi.dsi.fastutil.ints.IntCollections#asCollection(it.unimi.dsi.fastutil.ints.IntIterable)
*<code>public static it.unimi.dsi.fastutil.ints.IntCollection it.unimi.dsi.fastutil.ints.IntCollections.asCollection(it.unimi.dsi.fastutil.ints.IntIterable)
*asCollection(it.unimi.dsi.fastutil.ints.IntIterable p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntCollection asCollection(it.unimi.dsi.fastutil.ints.IntIterable p0){
	return it.unimi.dsi.fastutil.ints.IntCollections.asCollection(p0);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntIterators#pour(it.unimi.dsi.fastutil.ints.IntIterator,it.unimi.dsi.fastutil.ints.IntCollection)}
*@see it.unimi.dsi.fastutil.ints.IntIterators#pour(it.unimi.dsi.fastutil.ints.IntIterator,it.unimi.dsi.fastutil.ints.IntCollection)
*<code>public static int it.unimi.dsi.fastutil.ints.IntIterators.pour(it.unimi.dsi.fastutil.ints.IntIterator,it.unimi.dsi.fastutil.ints.IntCollection)
*pour(it.unimi.dsi.fastutil.ints.IntIterator p0,it.unimi.dsi.fastutil.ints.IntCollection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int pour(it.unimi.dsi.fastutil.ints.IntIterator p0,it.unimi.dsi.fastutil.ints.IntCollection p1){
	return it.unimi.dsi.fastutil.ints.IntIterators.pour(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntIterators#pour(it.unimi.dsi.fastutil.ints.IntIterator,it.unimi.dsi.fastutil.ints.IntCollection,int)}
*@see it.unimi.dsi.fastutil.ints.IntIterators#pour(it.unimi.dsi.fastutil.ints.IntIterator,it.unimi.dsi.fastutil.ints.IntCollection,int)
*<code>public static int it.unimi.dsi.fastutil.ints.IntIterators.pour(it.unimi.dsi.fastutil.ints.IntIterator,it.unimi.dsi.fastutil.ints.IntCollection,int)
*pour(it.unimi.dsi.fastutil.ints.IntIterator p0,it.unimi.dsi.fastutil.ints.IntCollection p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int pour(it.unimi.dsi.fastutil.ints.IntIterator p0,it.unimi.dsi.fastutil.ints.IntCollection p1,int p2){
	return it.unimi.dsi.fastutil.ints.IntIterators.pour(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntCollections#synchronize(it.unimi.dsi.fastutil.ints.IntCollection,java.lang.Object)}
*@see it.unimi.dsi.fastutil.ints.IntCollections#synchronize(it.unimi.dsi.fastutil.ints.IntCollection,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.ints.IntCollection it.unimi.dsi.fastutil.ints.IntCollections.synchronize(it.unimi.dsi.fastutil.ints.IntCollection,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.ints.IntCollection p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntCollection synchronize(it.unimi.dsi.fastutil.ints.IntCollection p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.IntCollections.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntCollections#synchronize(it.unimi.dsi.fastutil.ints.IntCollection)}
*@see it.unimi.dsi.fastutil.ints.IntCollections#synchronize(it.unimi.dsi.fastutil.ints.IntCollection)
*<code>public static it.unimi.dsi.fastutil.ints.IntCollection it.unimi.dsi.fastutil.ints.IntCollections.synchronize(it.unimi.dsi.fastutil.ints.IntCollection)
*synchronize(it.unimi.dsi.fastutil.ints.IntCollection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntCollection synchronize(it.unimi.dsi.fastutil.ints.IntCollection p0){
	return it.unimi.dsi.fastutil.ints.IntCollections.synchronize(p0);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntCollections#unmodifiable(it.unimi.dsi.fastutil.ints.IntCollection)}
*@see it.unimi.dsi.fastutil.ints.IntCollections#unmodifiable(it.unimi.dsi.fastutil.ints.IntCollection)
*<code>public static it.unimi.dsi.fastutil.ints.IntCollection it.unimi.dsi.fastutil.ints.IntCollections.unmodifiable(it.unimi.dsi.fastutil.ints.IntCollection)
*unmodifiable(it.unimi.dsi.fastutil.ints.IntCollection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntCollection unmodifiable(it.unimi.dsi.fastutil.ints.IntCollection p0){
	return it.unimi.dsi.fastutil.ints.IntCollections.unmodifiable(p0);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntIterators#unwrap(it.unimi.dsi.fastutil.ints.IntIterator,it.unimi.dsi.fastutil.ints.IntCollection)}
*@see it.unimi.dsi.fastutil.ints.IntIterators#unwrap(it.unimi.dsi.fastutil.ints.IntIterator,it.unimi.dsi.fastutil.ints.IntCollection)
*<code>public static long it.unimi.dsi.fastutil.ints.IntIterators.unwrap(it.unimi.dsi.fastutil.ints.IntIterator,it.unimi.dsi.fastutil.ints.IntCollection)
*unwrap(it.unimi.dsi.fastutil.ints.IntIterator p0,it.unimi.dsi.fastutil.ints.IntCollection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long unwrap(it.unimi.dsi.fastutil.ints.IntIterator p0,it.unimi.dsi.fastutil.ints.IntCollection p1){
	return it.unimi.dsi.fastutil.ints.IntIterators.unwrap(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntIterators#unwrap(it.unimi.dsi.fastutil.ints.IntIterator,it.unimi.dsi.fastutil.ints.IntCollection,int)}
*@see it.unimi.dsi.fastutil.ints.IntIterators#unwrap(it.unimi.dsi.fastutil.ints.IntIterator,it.unimi.dsi.fastutil.ints.IntCollection,int)
*<code>public static int it.unimi.dsi.fastutil.ints.IntIterators.unwrap(it.unimi.dsi.fastutil.ints.IntIterator,it.unimi.dsi.fastutil.ints.IntCollection,int)
*unwrap(it.unimi.dsi.fastutil.ints.IntIterator p0,it.unimi.dsi.fastutil.ints.IntCollection p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int unwrap(it.unimi.dsi.fastutil.ints.IntIterator p0,it.unimi.dsi.fastutil.ints.IntCollection p1,int p2){
	return it.unimi.dsi.fastutil.ints.IntIterators.unwrap(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.CollectionIntCollection#wrap(java.util.Collection)}
*@see org.apache.commons.collections.primitives.adapters.CollectionIntCollection#wrap(java.util.Collection)
*<code>public static org.apache.commons.collections.primitives.IntCollection org.apache.commons.collections.primitives.adapters.CollectionIntCollection.wrap(java.util.Collection)
*wrap(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.IntCollection wrap(java.util.Collection p0){
	return org.apache.commons.collections.primitives.adapters.CollectionIntCollection.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.IntCollectionCollection#wrap(org.apache.commons.collections.primitives.IntCollection)}
*@see org.apache.commons.collections.primitives.adapters.IntCollectionCollection#wrap(org.apache.commons.collections.primitives.IntCollection)
*<code>public static java.util.Collection org.apache.commons.collections.primitives.adapters.IntCollectionCollection.wrap(org.apache.commons.collections.primitives.IntCollection)
*wrap(org.apache.commons.collections.primitives.IntCollection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection wrap(org.apache.commons.collections.primitives.IntCollection p0){
	return org.apache.commons.collections.primitives.adapters.IntCollectionCollection.wrap(p0);
}
}
