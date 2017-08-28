package com.zengfr.supercommons;
import com.google.common.io.Files;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class TreeTraverserUtil{ 
public static com.google.common.collect.TreeTraverser<java.io.File> fileTreeTraverser(){
return Files.fileTreeTraverser();
}
}
