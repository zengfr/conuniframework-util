package com.zengfr.supercommons;
import org.apache.commons.collections4.IteratorUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class NodeListUtil{ 
public static org.apache.commons.collections4.iterators.NodeListIterator nodeListIterator(org.w3c.dom.NodeList p0){
return IteratorUtils.nodeListIterator(p0);
}
}
