package com.zengfr.supercommons;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOCase;
import org.apache.commons.io.filefilter.FileFilterUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class IOCaseUtil{ 
public static boolean wildcardMatch(java.lang.String p0,java.lang.String p1,org.apache.commons.io.IOCase p2){
return FilenameUtils.wildcardMatch(p0,p1,p2);
}
public static org.apache.commons.io.IOCase forName(java.lang.String p0){
return IOCase.forName(p0);
}
public static org.apache.commons.io.IOCase valueOf(java.lang.String p0){
return IOCase.valueOf(p0);
}
public static org.apache.commons.io.filefilter.IOFileFilter prefixFileFilter(java.lang.String p0,org.apache.commons.io.IOCase p1){
return FileFilterUtils.prefixFileFilter(p0,p1);
}
public static org.apache.commons.io.filefilter.IOFileFilter suffixFileFilter(java.lang.String p0,org.apache.commons.io.IOCase p1){
return FileFilterUtils.suffixFileFilter(p0,p1);
}
public static org.apache.commons.io.filefilter.IOFileFilter nameFileFilter(java.lang.String p0,org.apache.commons.io.IOCase p1){
return FileFilterUtils.nameFileFilter(p0,p1);
}
}
