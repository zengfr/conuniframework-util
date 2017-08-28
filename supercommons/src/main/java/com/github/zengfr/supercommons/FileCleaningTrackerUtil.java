package com.github.zengfr.supercommons;
import org.apache.commons.io.FileCleaner;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FileCleaningTrackerUtil{ 
public static org.apache.commons.io.FileCleaningTracker getInstance(){
return FileCleaner.getInstance();
}
}
