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
public final class LongCollectionUtil{ 
/**
*{@link it.unimi.dsi.fastutil.longs.LongCollections#asCollection(it.unimi.dsi.fastutil.longs.LongIterable)}
*@see it.unimi.dsi.fastutil.longs.LongCollections#asCollection(it.unimi.dsi.fastutil.longs.LongIterable)
*<code>public static it.unimi.dsi.fastutil.longs.LongCollection it.unimi.dsi.fastutil.longs.LongCollections.asCollection(it.unimi.dsi.fastutil.longs.LongIterable)
*asCollection(it.unimi.dsi.fastutil.longs.LongIterable p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongCollection asCollection(it.unimi.dsi.fastutil.longs.LongIterable p0){
	return it.unimi.dsi.fastutil.longs.LongCollections.asCollection(p0);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIterators#pour(it.unimi.dsi.fastutil.longs.LongIterator,it.unimi.dsi.fastutil.longs.LongCollection,int)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#pour(it.unimi.dsi.fastutil.longs.LongIterator,it.unimi.dsi.fastutil.longs.LongCollection,int)
*<code>public static int it.unimi.dsi.fastutil.longs.LongIterators.pour(it.unimi.dsi.fastutil.longs.LongIterator,it.unimi.dsi.fastutil.longs.LongCollection,int)
*pour(it.unimi.dsi.fastutil.longs.LongIterator p0,it.unimi.dsi.fastutil.longs.LongCollection p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int pour(it.unimi.dsi.fastutil.longs.LongIterator p0,it.unimi.dsi.fastutil.longs.LongCollection p1,int p2){
	return it.unimi.dsi.fastutil.longs.LongIterators.pour(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIterators#pour(it.unimi.dsi.fastutil.longs.LongIterator,it.unimi.dsi.fastutil.longs.LongCollection)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#pour(it.unimi.dsi.fastutil.longs.LongIterator,it.unimi.dsi.fastutil.longs.LongCollection)
*<code>public static int it.unimi.dsi.fastutil.longs.LongIterators.pour(it.unimi.dsi.fastutil.longs.LongIterator,it.unimi.dsi.fastutil.longs.LongCollection)
*pour(it.unimi.dsi.fastutil.longs.LongIterator p0,it.unimi.dsi.fastutil.longs.LongCollection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int pour(it.unimi.dsi.fastutil.longs.LongIterator p0,it.unimi.dsi.fastutil.longs.LongCollection p1){
	return it.unimi.dsi.fastutil.longs.LongIterators.pour(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongCollections#synchronize(it.unimi.dsi.fastutil.longs.LongCollection,java.lang.Object)}
*@see it.unimi.dsi.fastutil.longs.LongCollections#synchronize(it.unimi.dsi.fastutil.longs.LongCollection,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.longs.LongCollection it.unimi.dsi.fastutil.longs.LongCollections.synchronize(it.unimi.dsi.fastutil.longs.LongCollection,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.longs.LongCollection p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongCollection synchronize(it.unimi.dsi.fastutil.longs.LongCollection p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.longs.LongCollections.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongCollections#synchronize(it.unimi.dsi.fastutil.longs.LongCollection)}
*@see it.unimi.dsi.fastutil.longs.LongCollections#synchronize(it.unimi.dsi.fastutil.longs.LongCollection)
*<code>public static it.unimi.dsi.fastutil.longs.LongCollection it.unimi.dsi.fastutil.longs.LongCollections.synchronize(it.unimi.dsi.fastutil.longs.LongCollection)
*synchronize(it.unimi.dsi.fastutil.longs.LongCollection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongCollection synchronize(it.unimi.dsi.fastutil.longs.LongCollection p0){
	return it.unimi.dsi.fastutil.longs.LongCollections.synchronize(p0);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongCollections#unmodifiable(it.unimi.dsi.fastutil.longs.LongCollection)}
*@see it.unimi.dsi.fastutil.longs.LongCollections#unmodifiable(it.unimi.dsi.fastutil.longs.LongCollection)
*<code>public static it.unimi.dsi.fastutil.longs.LongCollection it.unimi.dsi.fastutil.longs.LongCollections.unmodifiable(it.unimi.dsi.fastutil.longs.LongCollection)
*unmodifiable(it.unimi.dsi.fastutil.longs.LongCollection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.longs.LongCollection unmodifiable(it.unimi.dsi.fastutil.longs.LongCollection p0){
	return it.unimi.dsi.fastutil.longs.LongCollections.unmodifiable(p0);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIterators#unwrap(it.unimi.dsi.fastutil.longs.LongIterator,it.unimi.dsi.fastutil.longs.LongCollection)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#unwrap(it.unimi.dsi.fastutil.longs.LongIterator,it.unimi.dsi.fastutil.longs.LongCollection)
*<code>public static long it.unimi.dsi.fastutil.longs.LongIterators.unwrap(it.unimi.dsi.fastutil.longs.LongIterator,it.unimi.dsi.fastutil.longs.LongCollection)
*unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0,it.unimi.dsi.fastutil.longs.LongCollection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0,it.unimi.dsi.fastutil.longs.LongCollection p1){
	return it.unimi.dsi.fastutil.longs.LongIterators.unwrap(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.longs.LongIterators#unwrap(it.unimi.dsi.fastutil.longs.LongIterator,it.unimi.dsi.fastutil.longs.LongCollection,int)}
*@see it.unimi.dsi.fastutil.longs.LongIterators#unwrap(it.unimi.dsi.fastutil.longs.LongIterator,it.unimi.dsi.fastutil.longs.LongCollection,int)
*<code>public static int it.unimi.dsi.fastutil.longs.LongIterators.unwrap(it.unimi.dsi.fastutil.longs.LongIterator,it.unimi.dsi.fastutil.longs.LongCollection,int)
*unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0,it.unimi.dsi.fastutil.longs.LongCollection p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int unwrap(it.unimi.dsi.fastutil.longs.LongIterator p0,it.unimi.dsi.fastutil.longs.LongCollection p1,int p2){
	return it.unimi.dsi.fastutil.longs.LongIterators.unwrap(p0,p1,p2);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.CollectionLongCollection#wrap(java.util.Collection)}
*@see org.apache.commons.collections.primitives.adapters.CollectionLongCollection#wrap(java.util.Collection)
*<code>public static org.apache.commons.collections.primitives.LongCollection org.apache.commons.collections.primitives.adapters.CollectionLongCollection.wrap(java.util.Collection)
*wrap(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.LongCollection wrap(java.util.Collection p0){
	return org.apache.commons.collections.primitives.adapters.CollectionLongCollection.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.LongCollectionCollection#wrap(org.apache.commons.collections.primitives.LongCollection)}
*@see org.apache.commons.collections.primitives.adapters.LongCollectionCollection#wrap(org.apache.commons.collections.primitives.LongCollection)
*<code>public static java.util.Collection org.apache.commons.collections.primitives.adapters.LongCollectionCollection.wrap(org.apache.commons.collections.primitives.LongCollection)
*wrap(org.apache.commons.collections.primitives.LongCollection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection wrap(org.apache.commons.collections.primitives.LongCollection p0){
	return org.apache.commons.collections.primitives.adapters.LongCollectionCollection.wrap(p0);
}
}
