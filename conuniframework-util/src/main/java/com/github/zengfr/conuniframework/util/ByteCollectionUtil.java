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
public final class ByteCollectionUtil{ 
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteCollections#asCollection(it.unimi.dsi.fastutil.bytes.ByteIterable)}
*@see it.unimi.dsi.fastutil.bytes.ByteCollections#asCollection(it.unimi.dsi.fastutil.bytes.ByteIterable)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteCollection it.unimi.dsi.fastutil.bytes.ByteCollections.asCollection(it.unimi.dsi.fastutil.bytes.ByteIterable)
*asCollection(it.unimi.dsi.fastutil.bytes.ByteIterable p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteCollection asCollection(it.unimi.dsi.fastutil.bytes.ByteIterable p0){
	return it.unimi.dsi.fastutil.bytes.ByteCollections.asCollection(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#pour(it.unimi.dsi.fastutil.bytes.ByteIterator,it.unimi.dsi.fastutil.bytes.ByteCollection)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#pour(it.unimi.dsi.fastutil.bytes.ByteIterator,it.unimi.dsi.fastutil.bytes.ByteCollection)
*<code>public static int it.unimi.dsi.fastutil.bytes.ByteIterators.pour(it.unimi.dsi.fastutil.bytes.ByteIterator,it.unimi.dsi.fastutil.bytes.ByteCollection)
*pour(it.unimi.dsi.fastutil.bytes.ByteIterator p0,it.unimi.dsi.fastutil.bytes.ByteCollection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int pour(it.unimi.dsi.fastutil.bytes.ByteIterator p0,it.unimi.dsi.fastutil.bytes.ByteCollection p1){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.pour(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#pour(it.unimi.dsi.fastutil.bytes.ByteIterator,it.unimi.dsi.fastutil.bytes.ByteCollection,int)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#pour(it.unimi.dsi.fastutil.bytes.ByteIterator,it.unimi.dsi.fastutil.bytes.ByteCollection,int)
*<code>public static int it.unimi.dsi.fastutil.bytes.ByteIterators.pour(it.unimi.dsi.fastutil.bytes.ByteIterator,it.unimi.dsi.fastutil.bytes.ByteCollection,int)
*pour(it.unimi.dsi.fastutil.bytes.ByteIterator p0,it.unimi.dsi.fastutil.bytes.ByteCollection p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int pour(it.unimi.dsi.fastutil.bytes.ByteIterator p0,it.unimi.dsi.fastutil.bytes.ByteCollection p1,int p2){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.pour(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteCollections#synchronize(it.unimi.dsi.fastutil.bytes.ByteCollection,java.lang.Object)}
*@see it.unimi.dsi.fastutil.bytes.ByteCollections#synchronize(it.unimi.dsi.fastutil.bytes.ByteCollection,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteCollection it.unimi.dsi.fastutil.bytes.ByteCollections.synchronize(it.unimi.dsi.fastutil.bytes.ByteCollection,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.bytes.ByteCollection p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteCollection synchronize(it.unimi.dsi.fastutil.bytes.ByteCollection p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.bytes.ByteCollections.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteCollections#synchronize(it.unimi.dsi.fastutil.bytes.ByteCollection)}
*@see it.unimi.dsi.fastutil.bytes.ByteCollections#synchronize(it.unimi.dsi.fastutil.bytes.ByteCollection)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteCollection it.unimi.dsi.fastutil.bytes.ByteCollections.synchronize(it.unimi.dsi.fastutil.bytes.ByteCollection)
*synchronize(it.unimi.dsi.fastutil.bytes.ByteCollection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteCollection synchronize(it.unimi.dsi.fastutil.bytes.ByteCollection p0){
	return it.unimi.dsi.fastutil.bytes.ByteCollections.synchronize(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteCollections#unmodifiable(it.unimi.dsi.fastutil.bytes.ByteCollection)}
*@see it.unimi.dsi.fastutil.bytes.ByteCollections#unmodifiable(it.unimi.dsi.fastutil.bytes.ByteCollection)
*<code>public static it.unimi.dsi.fastutil.bytes.ByteCollection it.unimi.dsi.fastutil.bytes.ByteCollections.unmodifiable(it.unimi.dsi.fastutil.bytes.ByteCollection)
*unmodifiable(it.unimi.dsi.fastutil.bytes.ByteCollection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.bytes.ByteCollection unmodifiable(it.unimi.dsi.fastutil.bytes.ByteCollection p0){
	return it.unimi.dsi.fastutil.bytes.ByteCollections.unmodifiable(p0);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator,it.unimi.dsi.fastutil.bytes.ByteCollection,int)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator,it.unimi.dsi.fastutil.bytes.ByteCollection,int)
*<code>public static int it.unimi.dsi.fastutil.bytes.ByteIterators.unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator,it.unimi.dsi.fastutil.bytes.ByteCollection,int)
*unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0,it.unimi.dsi.fastutil.bytes.ByteCollection p1,int p2)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static int unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0,it.unimi.dsi.fastutil.bytes.ByteCollection p1,int p2){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.unwrap(p0,p1,p2);
}
/**
*{@link it.unimi.dsi.fastutil.bytes.ByteIterators#unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator,it.unimi.dsi.fastutil.bytes.ByteCollection)}
*@see it.unimi.dsi.fastutil.bytes.ByteIterators#unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator,it.unimi.dsi.fastutil.bytes.ByteCollection)
*<code>public static long it.unimi.dsi.fastutil.bytes.ByteIterators.unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator,it.unimi.dsi.fastutil.bytes.ByteCollection)
*unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0,it.unimi.dsi.fastutil.bytes.ByteCollection p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static long unwrap(it.unimi.dsi.fastutil.bytes.ByteIterator p0,it.unimi.dsi.fastutil.bytes.ByteCollection p1){
	return it.unimi.dsi.fastutil.bytes.ByteIterators.unwrap(p0,p1);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.ByteCollectionCollection#wrap(org.apache.commons.collections.primitives.ByteCollection)}
*@see org.apache.commons.collections.primitives.adapters.ByteCollectionCollection#wrap(org.apache.commons.collections.primitives.ByteCollection)
*<code>public static java.util.Collection org.apache.commons.collections.primitives.adapters.ByteCollectionCollection.wrap(org.apache.commons.collections.primitives.ByteCollection)
*wrap(org.apache.commons.collections.primitives.ByteCollection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.Collection wrap(org.apache.commons.collections.primitives.ByteCollection p0){
	return org.apache.commons.collections.primitives.adapters.ByteCollectionCollection.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.CollectionByteCollection#wrap(java.util.Collection)}
*@see org.apache.commons.collections.primitives.adapters.CollectionByteCollection#wrap(java.util.Collection)
*<code>public static org.apache.commons.collections.primitives.ByteCollection org.apache.commons.collections.primitives.adapters.CollectionByteCollection.wrap(java.util.Collection)
*wrap(java.util.Collection p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.ByteCollection wrap(java.util.Collection p0){
	return org.apache.commons.collections.primitives.adapters.CollectionByteCollection.wrap(p0);
}
}
