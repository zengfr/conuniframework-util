package com.github.zengfr.supercommons;
import org.apache.commons.collections4.IteratorUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class NodeListIteratorUtil{ 
public static org.apache.commons.collections4.iterators.NodeListIterator nodeListIterator(org.w3c.dom.NodeList p0){
return IteratorUtils.nodeListIterator(p0);
}
public static org.apache.commons.collections4.iterators.NodeListIterator nodeListIterator(org.w3c.dom.Node p0){
return IteratorUtils.nodeListIterator(p0);
}
}
