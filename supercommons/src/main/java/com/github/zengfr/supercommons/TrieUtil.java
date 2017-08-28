package com.zengfr.supercommons;
import org.apache.commons.collections4.TrieUtils;
import org.apache.commons.collections4.trie.UnmodifiableTrie;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TrieUtil{ 
public static <K,V> org.apache.commons.collections4.Trie<K, V> unmodifiableTrie(org.apache.commons.collections4.Trie<K, ? extends V> p0){
return TrieUtils.unmodifiableTrie(p0);
}
}
