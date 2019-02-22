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
public final class IntListUtil{ 
/**
*{@link it.unimi.dsi.fastutil.ints.IntBigLists#asBigList(it.unimi.dsi.fastutil.ints.IntList)}
*@see it.unimi.dsi.fastutil.ints.IntBigLists#asBigList(it.unimi.dsi.fastutil.ints.IntList)
*<code>public static it.unimi.dsi.fastutil.ints.IntBigList it.unimi.dsi.fastutil.ints.IntBigLists.asBigList(it.unimi.dsi.fastutil.ints.IntList)
*asBigList(it.unimi.dsi.fastutil.ints.IntList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntBigList asBigList(it.unimi.dsi.fastutil.ints.IntList p0){
	return it.unimi.dsi.fastutil.ints.IntBigLists.asBigList(p0);
}
/**
*{@link org.apache.commons.collections.primitives.IntCollections#getEmptyIntList()}
*@see org.apache.commons.collections.primitives.IntCollections#getEmptyIntList()
*<code>public static org.apache.commons.collections.primitives.IntList org.apache.commons.collections.primitives.IntCollections.getEmptyIntList()
*getEmptyIntList()</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.IntList getEmptyIntList(){
	return org.apache.commons.collections.primitives.IntCollections.getEmptyIntList();
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntIterators#pour(it.unimi.dsi.fastutil.ints.IntIterator,int)}
*@see it.unimi.dsi.fastutil.ints.IntIterators#pour(it.unimi.dsi.fastutil.ints.IntIterator,int)
*<code>public static it.unimi.dsi.fastutil.ints.IntList it.unimi.dsi.fastutil.ints.IntIterators.pour(it.unimi.dsi.fastutil.ints.IntIterator,int)
*pour(it.unimi.dsi.fastutil.ints.IntIterator p0,int p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntList pour(it.unimi.dsi.fastutil.ints.IntIterator p0,int p1){
	return it.unimi.dsi.fastutil.ints.IntIterators.pour(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntIterators#pour(it.unimi.dsi.fastutil.ints.IntIterator)}
*@see it.unimi.dsi.fastutil.ints.IntIterators#pour(it.unimi.dsi.fastutil.ints.IntIterator)
*<code>public static it.unimi.dsi.fastutil.ints.IntList it.unimi.dsi.fastutil.ints.IntIterators.pour(it.unimi.dsi.fastutil.ints.IntIterator)
*pour(it.unimi.dsi.fastutil.ints.IntIterator p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntList pour(it.unimi.dsi.fastutil.ints.IntIterator p0){
	return it.unimi.dsi.fastutil.ints.IntIterators.pour(p0);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntLists#shuffle(it.unimi.dsi.fastutil.ints.IntList,java.util.Random)}
*@see it.unimi.dsi.fastutil.ints.IntLists#shuffle(it.unimi.dsi.fastutil.ints.IntList,java.util.Random)
*<code>public static it.unimi.dsi.fastutil.ints.IntList it.unimi.dsi.fastutil.ints.IntLists.shuffle(it.unimi.dsi.fastutil.ints.IntList,java.util.Random)
*shuffle(it.unimi.dsi.fastutil.ints.IntList p0,java.util.Random p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntList shuffle(it.unimi.dsi.fastutil.ints.IntList p0,java.util.Random p1){
	return it.unimi.dsi.fastutil.ints.IntLists.shuffle(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntLists#singleton(int)}
*@see it.unimi.dsi.fastutil.ints.IntLists#singleton(int)
*<code>public static it.unimi.dsi.fastutil.ints.IntList it.unimi.dsi.fastutil.ints.IntLists.singleton(int)
*singleton(int p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntList singleton(int p0){
	return it.unimi.dsi.fastutil.ints.IntLists.singleton(p0);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntLists#singleton(java.lang.Object)}
*@see it.unimi.dsi.fastutil.ints.IntLists#singleton(java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.ints.IntList it.unimi.dsi.fastutil.ints.IntLists.singleton(java.lang.Object)
*singleton(java.lang.Object p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntList singleton(java.lang.Object p0){
	return it.unimi.dsi.fastutil.ints.IntLists.singleton(p0);
}
/**
*{@link org.apache.commons.collections.primitives.IntCollections#singletonIntList(int)}
*@see org.apache.commons.collections.primitives.IntCollections#singletonIntList(int)
*<code>public static org.apache.commons.collections.primitives.IntList org.apache.commons.collections.primitives.IntCollections.singletonIntList(int)
*singletonIntList(int p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.IntList singletonIntList(int p0){
	return org.apache.commons.collections.primitives.IntCollections.singletonIntList(p0);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntLists#synchronize(it.unimi.dsi.fastutil.ints.IntList)}
*@see it.unimi.dsi.fastutil.ints.IntLists#synchronize(it.unimi.dsi.fastutil.ints.IntList)
*<code>public static it.unimi.dsi.fastutil.ints.IntList it.unimi.dsi.fastutil.ints.IntLists.synchronize(it.unimi.dsi.fastutil.ints.IntList)
*synchronize(it.unimi.dsi.fastutil.ints.IntList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntList synchronize(it.unimi.dsi.fastutil.ints.IntList p0){
	return it.unimi.dsi.fastutil.ints.IntLists.synchronize(p0);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntLists#synchronize(it.unimi.dsi.fastutil.ints.IntList,java.lang.Object)}
*@see it.unimi.dsi.fastutil.ints.IntLists#synchronize(it.unimi.dsi.fastutil.ints.IntList,java.lang.Object)
*<code>public static it.unimi.dsi.fastutil.ints.IntList it.unimi.dsi.fastutil.ints.IntLists.synchronize(it.unimi.dsi.fastutil.ints.IntList,java.lang.Object)
*synchronize(it.unimi.dsi.fastutil.ints.IntList p0,java.lang.Object p1)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntList synchronize(it.unimi.dsi.fastutil.ints.IntList p0,java.lang.Object p1){
	return it.unimi.dsi.fastutil.ints.IntLists.synchronize(p0,p1);
}
/**
*{@link it.unimi.dsi.fastutil.ints.IntLists#unmodifiable(it.unimi.dsi.fastutil.ints.IntList)}
*@see it.unimi.dsi.fastutil.ints.IntLists#unmodifiable(it.unimi.dsi.fastutil.ints.IntList)
*<code>public static it.unimi.dsi.fastutil.ints.IntList it.unimi.dsi.fastutil.ints.IntLists.unmodifiable(it.unimi.dsi.fastutil.ints.IntList)
*unmodifiable(it.unimi.dsi.fastutil.ints.IntList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static it.unimi.dsi.fastutil.ints.IntList unmodifiable(it.unimi.dsi.fastutil.ints.IntList p0){
	return it.unimi.dsi.fastutil.ints.IntLists.unmodifiable(p0);
}
/**
*{@link org.apache.commons.collections.primitives.IntCollections#unmodifiableIntList(org.apache.commons.collections.primitives.IntList)}
*@see org.apache.commons.collections.primitives.IntCollections#unmodifiableIntList(org.apache.commons.collections.primitives.IntList)
*<code>public static org.apache.commons.collections.primitives.IntList org.apache.commons.collections.primitives.IntCollections.unmodifiableIntList(org.apache.commons.collections.primitives.IntList) throws java.lang.NullPointerException
*unmodifiableIntList(org.apache.commons.collections.primitives.IntList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.IntList unmodifiableIntList(org.apache.commons.collections.primitives.IntList p0) throws java.lang.NullPointerException{
	return org.apache.commons.collections.primitives.IntCollections.unmodifiableIntList(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.IntListList#wrap(org.apache.commons.collections.primitives.IntList)}
*@see org.apache.commons.collections.primitives.adapters.IntListList#wrap(org.apache.commons.collections.primitives.IntList)
*<code>public static java.util.List org.apache.commons.collections.primitives.adapters.IntListList.wrap(org.apache.commons.collections.primitives.IntList)
*wrap(org.apache.commons.collections.primitives.IntList p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static java.util.List wrap(org.apache.commons.collections.primitives.IntList p0){
	return org.apache.commons.collections.primitives.adapters.IntListList.wrap(p0);
}
/**
*{@link org.apache.commons.collections.primitives.adapters.ListIntList#wrap(java.util.List)}
*@see org.apache.commons.collections.primitives.adapters.ListIntList#wrap(java.util.List)
*<code>public static org.apache.commons.collections.primitives.IntList org.apache.commons.collections.primitives.adapters.ListIntList.wrap(java.util.List)
*wrap(java.util.List p0)</code>
*@author zengfr
*@author https://github.com/zengfr/conuniframework-util
*@author https://gitee.com/zengfr/conuniframework-util
*@author http://blog.csdn.net/zfrong/
*/ 
public static org.apache.commons.collections.primitives.IntList wrap(java.util.List p0){
	return org.apache.commons.collections.primitives.adapters.ListIntList.wrap(p0);
}
}
