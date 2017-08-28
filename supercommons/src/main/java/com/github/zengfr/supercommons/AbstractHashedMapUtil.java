package com.github.zengfr.supercommons;
import org.apache.commons.collections.map.MultiKeyMap;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class AbstractHashedMapUtil{ 
public static org.apache.commons.collections.map.MultiKeyMap decorate(org.apache.commons.collections.map.AbstractHashedMap p0){
return MultiKeyMap.decorate(p0);
}
}
