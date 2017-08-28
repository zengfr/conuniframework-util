package com.zengfr.supercommons;
import com.google.common.io.Files;
import org.apache.commons.io.FileCleaner;
import org.apache.commons.io.input.Tailer;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.SystemUtils;
import it.unimi.dsi.fastutil.io.BinIO;
import it.unimi.dsi.fastutil.io.TextIO;
import org.apache.commons.lang.SystemUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class FileUtil{ 
public static java.nio.MappedByteBuffer map(java.io.File p0) throws java.io.IOException{
return Files.map(p0);
}
public static java.nio.MappedByteBuffer map(java.io.File p0,java.nio.channels.FileChannel.MapMode p1,long p2) throws java.io.FileNotFoundException,java.io.IOException{
return Files.map(p0,p1,p2);
}
public static java.nio.MappedByteBuffer map(java.io.File p0,java.nio.channels.FileChannel.MapMode p1) throws java.io.IOException{
return Files.map(p0,p1);
}
public static void append(java.lang.CharSequence p0,java.io.File p1,java.nio.charset.Charset p2) throws java.io.IOException{
 Files.append(p0,p1,p2);
}
public static void write(byte[] p0,java.io.File p1) throws java.io.IOException{
 Files.write(p0,p1);
}
public static void write(java.lang.CharSequence p0,java.io.File p1,java.nio.charset.Charset p2) throws java.io.IOException{
 Files.write(p0,p1,p2);
}
public static void copy(java.io.File p0,java.io.File p1) throws java.io.IOException{
 Files.copy(p0,p1);
}
public static void copy(java.io.File p0,java.nio.charset.Charset p1,java.lang.Appendable p2) throws java.io.IOException{
 Files.copy(p0,p1,p2);
}
public static void copy(java.io.File p0,java.io.OutputStream p1) throws java.io.IOException{
 Files.copy(p0,p1);
}
public static <T> T readBytes(java.io.File p0,com.google.common.io.ByteProcessor<T> p1) throws java.io.IOException{
return Files.readBytes(p0,p1);
}
public static byte[] toByteArray(java.io.File p0) throws java.io.IOException{
return Files.toByteArray(p0);
}
public static com.google.common.io.CharSink asCharSink(java.io.File p0,java.nio.charset.Charset p1,com.google.common.io.FileWriteMode... p2){
return Files.asCharSink(p0,p1,p2);
}
public static com.google.common.io.CharSource asCharSource(java.io.File p0,java.nio.charset.Charset p1){
return Files.asCharSource(p0,p1);
}
public static java.lang.String readFirstLine(java.io.File p0,java.nio.charset.Charset p1) throws java.io.IOException{
return Files.readFirstLine(p0,p1);
}
public static <T> T readLines(java.io.File p0,java.nio.charset.Charset p1,com.google.common.io.LineProcessor<T> p2) throws java.io.IOException{
return Files.readLines(p0,p1,p2);
}
public static java.util.List<java.lang.String> readLines(java.io.File p0,java.nio.charset.Charset p1) throws java.io.IOException{
return Files.readLines(p0,p1);
}
public static com.google.common.io.ByteSource asByteSource(java.io.File p0){
return Files.asByteSource(p0);
}
public static java.io.BufferedReader newReader(java.io.File p0,java.nio.charset.Charset p1) throws java.io.FileNotFoundException{
return Files.newReader(p0,p1);
}
public static java.io.BufferedWriter newWriter(java.io.File p0,java.nio.charset.Charset p1) throws java.io.FileNotFoundException{
return Files.newWriter(p0,p1);
}
public static com.google.common.io.ByteSink asByteSink(java.io.File p0,com.google.common.io.FileWriteMode... p1){
return Files.asByteSink(p0,p1);
}
public static void createParentDirs(java.io.File p0) throws java.io.IOException{
 Files.createParentDirs(p0);
}
public static java.io.File createTempDir(){
return Files.createTempDir();
}
public static void touch(java.io.File p0) throws java.io.IOException{
 Files.touch(p0);
}
public static void move(java.io.File p0,java.io.File p1) throws java.io.IOException{
 Files.move(p0,p1);
}
public static void track(java.io.File p0,java.lang.Object p1){
 FileCleaner.track(p0,p1);
}
public static void track(java.io.File p0,java.lang.Object p1,org.apache.commons.io.FileDeleteStrategy p2){
 FileCleaner.track(p0,p1,p2);
}
public static org.apache.commons.io.input.Tailer create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2){
return Tailer.create(p0,p1,p2);
}
public static org.apache.commons.io.input.Tailer create(java.io.File p0,org.apache.commons.io.input.TailerListener p1){
return Tailer.create(p0,p1);
}
public static org.apache.commons.io.input.Tailer create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2,boolean p3,boolean p4){
return Tailer.create(p0,p1,p2,p3,p4);
}
public static org.apache.commons.io.input.Tailer create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2,boolean p3,boolean p4,int p5){
return Tailer.create(p0,p1,p2,p3,p4,p5);
}
public static org.apache.commons.io.input.Tailer create(java.io.File p0,java.nio.charset.Charset p1,org.apache.commons.io.input.TailerListener p2,long p3,boolean p4,boolean p5,int p6){
return Tailer.create(p0,p1,p2,p3,p4,p5,p6);
}
public static org.apache.commons.io.input.Tailer create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2,boolean p3,int p4){
return Tailer.create(p0,p1,p2,p3,p4);
}
public static org.apache.commons.io.input.Tailer create(java.io.File p0,org.apache.commons.io.input.TailerListener p1,long p2,boolean p3){
return Tailer.create(p0,p1,p2,p3);
}
public static org.apache.commons.io.filefilter.IOFileFilter ageFileFilter(java.io.File p0,boolean p1){
return FileFilterUtils.ageFileFilter(p0,p1);
}
public static org.apache.commons.io.filefilter.IOFileFilter ageFileFilter(java.io.File p0){
return FileFilterUtils.ageFileFilter(p0);
}
public static java.io.File toFile(java.net.URL p0){
return FileUtils.toFile(p0);
}
public static boolean contentEquals(java.io.File p0,java.io.File p1) throws java.io.IOException{
return FileUtils.contentEquals(p0,p1);
}
public static void write(java.io.File p0,java.lang.CharSequence p1,java.lang.String p2) throws java.io.IOException{
 FileUtils.write(p0,p1,p2);
}
public static void write(java.io.File p0,java.lang.CharSequence p1,java.nio.charset.Charset p2,boolean p3) throws java.io.IOException{
 FileUtils.write(p0,p1,p2,p3);
}
public static void write(java.io.File p0,java.lang.CharSequence p1,java.lang.String p2,boolean p3) throws java.io.IOException{
 FileUtils.write(p0,p1,p2,p3);
}
public static void write(java.io.File p0,java.lang.CharSequence p1,java.nio.charset.Charset p2) throws java.io.IOException{
 FileUtils.write(p0,p1,p2);
}
public static void write(java.io.File p0,java.lang.CharSequence p1,boolean p2) throws java.io.IOException{
 FileUtils.write(p0,p1,p2);
}
public static void write(java.io.File p0,java.lang.CharSequence p1) throws java.io.IOException{
 FileUtils.write(p0,p1);
}
public static java.util.Collection<java.io.File> listFiles(java.io.File p0,org.apache.commons.io.filefilter.IOFileFilter p1,org.apache.commons.io.filefilter.IOFileFilter p2){
return FileUtils.listFiles(p0,p1,p2);
}
public static java.util.Collection<java.io.File> listFiles(java.io.File p0,java.lang.String[] p1,boolean p2){
return FileUtils.listFiles(p0,p1,p2);
}
public static java.io.File getFile(java.lang.String... p0){
return FileUtils.getFile(p0);
}
public static java.io.File getFile(java.io.File p0,java.lang.String... p1){
return FileUtils.getFile(p0,p1);
}
public static java.util.zip.Checksum checksum(java.io.File p0,java.util.zip.Checksum p1) throws java.io.IOException{
return FileUtils.checksum(p0,p1);
}
public static boolean waitFor(java.io.File p0,int p1){
return FileUtils.waitFor(p0,p1);
}
public static void writeLines(java.io.File p0,java.lang.String p1,java.util.Collection<?> p2,boolean p3) throws java.io.IOException{
 FileUtils.writeLines(p0,p1,p2,p3);
}
public static void writeLines(java.io.File p0,java.util.Collection<?> p1,java.lang.String p2,boolean p3) throws java.io.IOException{
 FileUtils.writeLines(p0,p1,p2,p3);
}
public static void writeLines(java.io.File p0,java.lang.String p1,java.util.Collection<?> p2,java.lang.String p3) throws java.io.IOException{
 FileUtils.writeLines(p0,p1,p2,p3);
}
public static void writeLines(java.io.File p0,java.util.Collection<?> p1,boolean p2) throws java.io.IOException{
 FileUtils.writeLines(p0,p1,p2);
}
public static void writeLines(java.io.File p0,java.util.Collection<?> p1) throws java.io.IOException{
 FileUtils.writeLines(p0,p1);
}
public static void writeLines(java.io.File p0,java.lang.String p1,java.util.Collection<?> p2) throws java.io.IOException{
 FileUtils.writeLines(p0,p1,p2);
}
public static void writeLines(java.io.File p0,java.util.Collection<?> p1,java.lang.String p2) throws java.io.IOException{
 FileUtils.writeLines(p0,p1,p2);
}
public static void writeLines(java.io.File p0,java.lang.String p1,java.util.Collection<?> p2,java.lang.String p3,boolean p4) throws java.io.IOException{
 FileUtils.writeLines(p0,p1,p2,p3,p4);
}
public static java.util.List<java.lang.String> readLines(java.io.File p0,java.lang.String p1) throws java.io.IOException{
return FileUtils.readLines(p0,p1);
}
public static java.util.List<java.lang.String> readLines(java.io.File p0) throws java.io.IOException{
return FileUtils.readLines(p0);
}
public static java.io.FileInputStream openInputStream(java.io.File p0) throws java.io.IOException{
return FileUtils.openInputStream(p0);
}
public static boolean contentEqualsIgnoreEOL(java.io.File p0,java.io.File p1,java.lang.String p2) throws java.io.IOException{
return FileUtils.contentEqualsIgnoreEOL(p0,p1,p2);
}
public static void forceMkdir(java.io.File p0) throws java.io.IOException{
 FileUtils.forceMkdir(p0);
}
public static void deleteDirectory(java.io.File p0) throws java.io.IOException{
 FileUtils.deleteDirectory(p0);
}
public static java.io.FileOutputStream openOutputStream(java.io.File p0,boolean p1) throws java.io.IOException{
return FileUtils.openOutputStream(p0,p1);
}
public static java.io.FileOutputStream openOutputStream(java.io.File p0) throws java.io.IOException{
return FileUtils.openOutputStream(p0);
}
public static void copyFile(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
 FileUtils.copyFile(p0,p1,p2);
}
public static long copyFile(java.io.File p0,java.io.OutputStream p1) throws java.io.IOException{
return FileUtils.copyFile(p0,p1);
}
public static void copyFile(java.io.File p0,java.io.File p1) throws java.io.IOException{
 FileUtils.copyFile(p0,p1);
}
public static void copyDirectory(java.io.File p0,java.io.File p1) throws java.io.IOException{
 FileUtils.copyDirectory(p0,p1);
}
public static void copyDirectory(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
 FileUtils.copyDirectory(p0,p1,p2);
}
public static void copyDirectory(java.io.File p0,java.io.File p1,java.io.FileFilter p2) throws java.io.IOException{
 FileUtils.copyDirectory(p0,p1,p2);
}
public static void copyDirectory(java.io.File p0,java.io.File p1,java.io.FileFilter p2,boolean p3) throws java.io.IOException{
 FileUtils.copyDirectory(p0,p1,p2,p3);
}
public static java.io.File getTempDirectory(){
return FileUtils.getTempDirectory();
}
public static void copyURLToFile(java.net.URL p0,java.io.File p1) throws java.io.IOException{
 FileUtils.copyURLToFile(p0,p1);
}
public static void copyURLToFile(java.net.URL p0,java.io.File p1,int p2,int p3) throws java.io.IOException{
 FileUtils.copyURLToFile(p0,p1,p2,p3);
}
public static java.util.Collection<java.io.File> listFilesAndDirs(java.io.File p0,org.apache.commons.io.filefilter.IOFileFilter p1,org.apache.commons.io.filefilter.IOFileFilter p2){
return FileUtils.listFilesAndDirs(p0,p1,p2);
}
public static void copyToFile(java.io.InputStream p0,java.io.File p1) throws java.io.IOException{
 FileUtils.copyToFile(p0,p1);
}
public static void cleanDirectory(java.io.File p0) throws java.io.IOException{
 FileUtils.cleanDirectory(p0);
}
public static java.lang.String readFileToString(java.io.File p0,java.nio.charset.Charset p1) throws java.io.IOException{
return FileUtils.readFileToString(p0,p1);
}
public static java.lang.String readFileToString(java.io.File p0,java.lang.String p1) throws java.io.IOException{
return FileUtils.readFileToString(p0,p1);
}
public static java.lang.String readFileToString(java.io.File p0) throws java.io.IOException{
return FileUtils.readFileToString(p0);
}
public static void forceMkdirParent(java.io.File p0) throws java.io.IOException{
 FileUtils.forceMkdirParent(p0);
}
public static long sizeOf(java.io.File p0){
return FileUtils.sizeOf(p0);
}
public static java.io.File getUserDirectory(){
return FileUtils.getUserDirectory();
}
public static java.util.Iterator<java.io.File> iterateFiles(java.io.File p0,java.lang.String[] p1,boolean p2){
return FileUtils.iterateFiles(p0,p1,p2);
}
public static java.util.Iterator<java.io.File> iterateFiles(java.io.File p0,org.apache.commons.io.filefilter.IOFileFilter p1,org.apache.commons.io.filefilter.IOFileFilter p2){
return FileUtils.iterateFiles(p0,p1,p2);
}
public static void moveDirectory(java.io.File p0,java.io.File p1) throws java.io.IOException{
 FileUtils.moveDirectory(p0,p1);
}
public static boolean isSymlink(java.io.File p0) throws java.io.IOException{
return FileUtils.isSymlink(p0);
}
public static boolean isFileOlder(java.io.File p0,java.io.File p1){
return FileUtils.isFileOlder(p0,p1);
}
public static boolean isFileOlder(java.io.File p0,java.util.Date p1){
return FileUtils.isFileOlder(p0,p1);
}
public static boolean isFileOlder(java.io.File p0,long p1){
return FileUtils.isFileOlder(p0,p1);
}
public static void moveFile(java.io.File p0,java.io.File p1) throws java.io.IOException{
 FileUtils.moveFile(p0,p1);
}
public static long checksumCRC32(java.io.File p0) throws java.io.IOException{
return FileUtils.checksumCRC32(p0);
}
public static void moveToDirectory(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
 FileUtils.moveToDirectory(p0,p1,p2);
}
public static org.apache.commons.io.LineIterator lineIterator(java.io.File p0) throws java.io.IOException{
return FileUtils.lineIterator(p0);
}
public static org.apache.commons.io.LineIterator lineIterator(java.io.File p0,java.lang.String p1) throws java.io.IOException{
return FileUtils.lineIterator(p0,p1);
}
public static boolean deleteQuietly(java.io.File p0){
return FileUtils.deleteQuietly(p0);
}
public static long sizeOfDirectory(java.io.File p0){
return FileUtils.sizeOfDirectory(p0);
}
public static void forceDelete(java.io.File p0) throws java.io.IOException{
 FileUtils.forceDelete(p0);
}
public static boolean isFileNewer(java.io.File p0,java.util.Date p1){
return FileUtils.isFileNewer(p0,p1);
}
public static boolean isFileNewer(java.io.File p0,long p1){
return FileUtils.isFileNewer(p0,p1);
}
public static boolean isFileNewer(java.io.File p0,java.io.File p1){
return FileUtils.isFileNewer(p0,p1);
}
public static void moveFileToDirectory(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
 FileUtils.moveFileToDirectory(p0,p1,p2);
}
public static void forceDeleteOnExit(java.io.File p0) throws java.io.IOException{
 FileUtils.forceDeleteOnExit(p0);
}
public static java.math.BigInteger sizeOfDirectoryAsBigInteger(java.io.File p0){
return FileUtils.sizeOfDirectoryAsBigInteger(p0);
}
public static void moveDirectoryToDirectory(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
 FileUtils.moveDirectoryToDirectory(p0,p1,p2);
}
public static java.math.BigInteger sizeOfAsBigInteger(java.io.File p0){
return FileUtils.sizeOfAsBigInteger(p0);
}
public static boolean directoryContains(java.io.File p0,java.io.File p1) throws java.io.IOException{
return FileUtils.directoryContains(p0,p1);
}
public static void copyInputStreamToFile(java.io.InputStream p0,java.io.File p1) throws java.io.IOException{
 FileUtils.copyInputStreamToFile(p0,p1);
}
public static java.util.Iterator<java.io.File> iterateFilesAndDirs(java.io.File p0,org.apache.commons.io.filefilter.IOFileFilter p1,org.apache.commons.io.filefilter.IOFileFilter p2){
return FileUtils.iterateFilesAndDirs(p0,p1,p2);
}
public static byte[] readFileToByteArray(java.io.File p0) throws java.io.IOException{
return FileUtils.readFileToByteArray(p0);
}
public static void writeStringToFile(java.io.File p0,java.lang.String p1,java.lang.String p2) throws java.io.IOException{
 FileUtils.writeStringToFile(p0,p1,p2);
}
public static void writeStringToFile(java.io.File p0,java.lang.String p1,java.nio.charset.Charset p2,boolean p3) throws java.io.IOException{
 FileUtils.writeStringToFile(p0,p1,p2,p3);
}
public static void writeStringToFile(java.io.File p0,java.lang.String p1,boolean p2) throws java.io.IOException{
 FileUtils.writeStringToFile(p0,p1,p2);
}
public static void writeStringToFile(java.io.File p0,java.lang.String p1,java.lang.String p2,boolean p3) throws java.io.IOException{
 FileUtils.writeStringToFile(p0,p1,p2,p3);
}
public static void writeStringToFile(java.io.File p0,java.lang.String p1) throws java.io.IOException{
 FileUtils.writeStringToFile(p0,p1);
}
public static void writeStringToFile(java.io.File p0,java.lang.String p1,java.nio.charset.Charset p2) throws java.io.IOException{
 FileUtils.writeStringToFile(p0,p1,p2);
}
public static void copyDirectoryToDirectory(java.io.File p0,java.io.File p1) throws java.io.IOException{
 FileUtils.copyDirectoryToDirectory(p0,p1);
}
public static void writeByteArrayToFile(java.io.File p0,byte[] p1) throws java.io.IOException{
 FileUtils.writeByteArrayToFile(p0,p1);
}
public static void writeByteArrayToFile(java.io.File p0,byte[] p1,boolean p2) throws java.io.IOException{
 FileUtils.writeByteArrayToFile(p0,p1,p2);
}
public static void writeByteArrayToFile(java.io.File p0,byte[] p1,int p2,int p3,boolean p4) throws java.io.IOException{
 FileUtils.writeByteArrayToFile(p0,p1,p2,p3,p4);
}
public static void writeByteArrayToFile(java.io.File p0,byte[] p1,int p2,int p3) throws java.io.IOException{
 FileUtils.writeByteArrayToFile(p0,p1,p2,p3);
}
public static void copyFileToDirectory(java.io.File p0,java.io.File p1,boolean p2) throws java.io.IOException{
 FileUtils.copyFileToDirectory(p0,p1,p2);
}
public static void copyFileToDirectory(java.io.File p0,java.io.File p1) throws java.io.IOException{
 FileUtils.copyFileToDirectory(p0,p1);
}
public static java.io.File getJavaIoTmpDir(){
return SystemUtils.getJavaIoTmpDir();
}
public static java.io.File getUserHome(){
return SystemUtils.getUserHome();
}
public static java.io.File getUserDir(){
return SystemUtils.getUserDir();
}
public static java.io.File getJavaHome(){
return SystemUtils.getJavaHome();
}
public static it.unimi.dsi.fastutil.booleans.BooleanIterator asBooleanIterator(java.io.File p0) throws java.io.IOException{
return BinIO.asBooleanIterator(p0);
}
public static it.unimi.dsi.fastutil.ints.IntIterator asIntIterator(java.io.File p0) throws java.io.IOException{
return BinIO.asIntIterator(p0);
}
public static int loadBytes(java.io.File p0,byte[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadBytes(p0,p1,p2,p3);
}
public static int loadBytes(java.io.File p0,byte[] p1) throws java.io.IOException{
return BinIO.loadBytes(p0,p1);
}
public static byte[] loadBytes(java.io.File p0) throws java.io.IOException{
return BinIO.loadBytes(p0);
}
public static long loadBytes(java.io.File p0,byte[][] p1) throws java.io.IOException{
return BinIO.loadBytes(p0,p1);
}
public static long loadBytes(java.io.File p0,byte[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadBytes(p0,p1,p2,p3);
}
public static void storeShorts(short[][] p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeShorts(p0,p1);
}
public static void storeShorts(short[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeShorts(p0,p1,p2,p3);
}
public static void storeShorts(it.unimi.dsi.fastutil.shorts.ShortIterator p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeShorts(p0,p1);
}
public static void storeShorts(short[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeShorts(p0,p1,p2,p3);
}
public static void storeShorts(short[] p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeShorts(p0,p1);
}
public static java.lang.Object loadObject(java.io.File p0) throws java.io.IOException,java.lang.ClassNotFoundException{
return BinIO.loadObject(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortIterable asShortIterable(java.io.File p0){
return BinIO.asShortIterable(p0);
}
public static void storeObject(java.lang.Object p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeObject(p0,p1);
}
public static boolean[][] loadBooleansBig(java.io.File p0) throws java.io.IOException{
return BinIO.loadBooleansBig(p0);
}
public static long loadChars(java.io.File p0,char[][] p1) throws java.io.IOException{
return BinIO.loadChars(p0,p1);
}
public static int loadChars(java.io.File p0,char[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadChars(p0,p1,p2,p3);
}
public static char[] loadChars(java.io.File p0) throws java.io.IOException{
return BinIO.loadChars(p0);
}
public static int loadChars(java.io.File p0,char[] p1) throws java.io.IOException{
return BinIO.loadChars(p0,p1);
}
public static long loadChars(java.io.File p0,char[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadChars(p0,p1,p2,p3);
}
public static int loadShorts(java.io.File p0,short[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadShorts(p0,p1,p2,p3);
}
public static int loadShorts(java.io.File p0,short[] p1) throws java.io.IOException{
return BinIO.loadShorts(p0,p1);
}
public static long loadShorts(java.io.File p0,short[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadShorts(p0,p1,p2,p3);
}
public static short[] loadShorts(java.io.File p0) throws java.io.IOException{
return BinIO.loadShorts(p0);
}
public static long loadShorts(java.io.File p0,short[][] p1) throws java.io.IOException{
return BinIO.loadShorts(p0,p1);
}
public static it.unimi.dsi.fastutil.ints.IntIterable asIntIterable(java.io.File p0){
return BinIO.asIntIterable(p0);
}
public static short[][] loadShortsBig(java.io.File p0) throws java.io.IOException{
return BinIO.loadShortsBig(p0);
}
public static long[][] loadLongsBig(java.io.File p0) throws java.io.IOException{
return BinIO.loadLongsBig(p0);
}
public static it.unimi.dsi.fastutil.longs.LongIterable asLongIterable(java.io.File p0){
return BinIO.asLongIterable(p0);
}
public static long loadFloats(java.io.File p0,float[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadFloats(p0,p1,p2,p3);
}
public static long loadFloats(java.io.File p0,float[][] p1) throws java.io.IOException{
return BinIO.loadFloats(p0,p1);
}
public static float[] loadFloats(java.io.File p0) throws java.io.IOException{
return BinIO.loadFloats(p0);
}
public static int loadFloats(java.io.File p0,float[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadFloats(p0,p1,p2,p3);
}
public static int loadFloats(java.io.File p0,float[] p1) throws java.io.IOException{
return BinIO.loadFloats(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.FloatIterable asFloatIterable(java.io.File p0){
return BinIO.asFloatIterable(p0);
}
public static void storeBooleans(boolean[][] p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeBooleans(p0,p1);
}
public static void storeBooleans(it.unimi.dsi.fastutil.booleans.BooleanIterator p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeBooleans(p0,p1);
}
public static void storeBooleans(boolean[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeBooleans(p0,p1,p2,p3);
}
public static void storeBooleans(boolean[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeBooleans(p0,p1,p2,p3);
}
public static void storeBooleans(boolean[] p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeBooleans(p0,p1);
}
public static long loadBooleans(java.io.File p0,boolean[][] p1) throws java.io.IOException{
return BinIO.loadBooleans(p0,p1);
}
public static long loadBooleans(java.io.File p0,boolean[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadBooleans(p0,p1,p2,p3);
}
public static int loadBooleans(java.io.File p0,boolean[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadBooleans(p0,p1,p2,p3);
}
public static int loadBooleans(java.io.File p0,boolean[] p1) throws java.io.IOException{
return BinIO.loadBooleans(p0,p1);
}
public static boolean[] loadBooleans(java.io.File p0) throws java.io.IOException{
return BinIO.loadBooleans(p0);
}
public static void storeBytes(byte[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeBytes(p0,p1,p2,p3);
}
public static void storeBytes(byte[][] p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeBytes(p0,p1);
}
public static void storeBytes(it.unimi.dsi.fastutil.bytes.ByteIterator p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeBytes(p0,p1);
}
public static void storeBytes(byte[] p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeBytes(p0,p1);
}
public static void storeBytes(byte[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeBytes(p0,p1,p2,p3);
}
public static byte[][] loadBytesBig(java.io.File p0) throws java.io.IOException{
return BinIO.loadBytesBig(p0);
}
public static int[] loadInts(java.io.File p0) throws java.io.IOException{
return BinIO.loadInts(p0);
}
public static int loadInts(java.io.File p0,int[] p1) throws java.io.IOException{
return BinIO.loadInts(p0,p1);
}
public static int loadInts(java.io.File p0,int[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadInts(p0,p1,p2,p3);
}
public static long loadInts(java.io.File p0,int[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadInts(p0,p1,p2,p3);
}
public static long loadInts(java.io.File p0,int[][] p1) throws java.io.IOException{
return BinIO.loadInts(p0,p1);
}
public static void storeLongs(long[][] p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeLongs(p0,p1);
}
public static void storeLongs(long[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeLongs(p0,p1,p2,p3);
}
public static void storeLongs(it.unimi.dsi.fastutil.longs.LongIterator p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeLongs(p0,p1);
}
public static void storeLongs(long[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeLongs(p0,p1,p2,p3);
}
public static void storeLongs(long[] p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeLongs(p0,p1);
}
public static float[][] loadFloatsBig(java.io.File p0) throws java.io.IOException{
return BinIO.loadFloatsBig(p0);
}
public static void storeInts(it.unimi.dsi.fastutil.ints.IntIterator p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeInts(p0,p1);
}
public static void storeInts(int[] p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeInts(p0,p1);
}
public static void storeInts(int[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeInts(p0,p1,p2,p3);
}
public static void storeInts(int[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeInts(p0,p1,p2,p3);
}
public static void storeInts(int[][] p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeInts(p0,p1);
}
public static it.unimi.dsi.fastutil.longs.LongIterator asLongIterator(java.io.File p0) throws java.io.IOException{
return BinIO.asLongIterator(p0);
}
public static void storeFloats(float[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeFloats(p0,p1,p2,p3);
}
public static void storeFloats(float[] p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeFloats(p0,p1);
}
public static void storeFloats(it.unimi.dsi.fastutil.floats.FloatIterator p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeFloats(p0,p1);
}
public static void storeFloats(float[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeFloats(p0,p1,p2,p3);
}
public static void storeFloats(float[][] p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeFloats(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.CharIterable asCharIterable(java.io.File p0){
return BinIO.asCharIterable(p0);
}
public static long loadDoubles(java.io.File p0,double[][] p1) throws java.io.IOException{
return BinIO.loadDoubles(p0,p1);
}
public static long loadDoubles(java.io.File p0,double[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadDoubles(p0,p1,p2,p3);
}
public static int loadDoubles(java.io.File p0,double[] p1) throws java.io.IOException{
return BinIO.loadDoubles(p0,p1);
}
public static int loadDoubles(java.io.File p0,double[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadDoubles(p0,p1,p2,p3);
}
public static double[] loadDoubles(java.io.File p0) throws java.io.IOException{
return BinIO.loadDoubles(p0);
}
public static int[][] loadIntsBig(java.io.File p0) throws java.io.IOException{
return BinIO.loadIntsBig(p0);
}
public static it.unimi.dsi.fastutil.shorts.ShortIterator asShortIterator(java.io.File p0) throws java.io.IOException{
return BinIO.asShortIterator(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteIterable asByteIterable(java.io.File p0){
return BinIO.asByteIterable(p0);
}
public static void storeChars(char[][] p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeChars(p0,p1);
}
public static void storeChars(char[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeChars(p0,p1,p2,p3);
}
public static void storeChars(it.unimi.dsi.fastutil.chars.CharIterator p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeChars(p0,p1);
}
public static void storeChars(char[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeChars(p0,p1,p2,p3);
}
public static void storeChars(char[] p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeChars(p0,p1);
}
public static int loadLongs(java.io.File p0,long[] p1) throws java.io.IOException{
return BinIO.loadLongs(p0,p1);
}
public static long loadLongs(java.io.File p0,long[][] p1) throws java.io.IOException{
return BinIO.loadLongs(p0,p1);
}
public static long loadLongs(java.io.File p0,long[][] p1,long p2,long p3) throws java.io.IOException{
return BinIO.loadLongs(p0,p1,p2,p3);
}
public static int loadLongs(java.io.File p0,long[] p1,int p2,int p3) throws java.io.IOException{
return BinIO.loadLongs(p0,p1,p2,p3);
}
public static long[] loadLongs(java.io.File p0) throws java.io.IOException{
return BinIO.loadLongs(p0);
}
public static char[][] loadCharsBig(java.io.File p0) throws java.io.IOException{
return BinIO.loadCharsBig(p0);
}
public static void storeDoubles(double[] p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeDoubles(p0,p1);
}
public static void storeDoubles(double[][] p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeDoubles(p0,p1);
}
public static void storeDoubles(double[][] p0,long p1,long p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeDoubles(p0,p1,p2,p3);
}
public static void storeDoubles(it.unimi.dsi.fastutil.doubles.DoubleIterator p0,java.io.File p1) throws java.io.IOException{
 BinIO.storeDoubles(p0,p1);
}
public static void storeDoubles(double[] p0,int p1,int p2,java.io.File p3) throws java.io.IOException{
 BinIO.storeDoubles(p0,p1,p2,p3);
}
public static it.unimi.dsi.fastutil.doubles.DoubleIterable asDoubleIterable(java.io.File p0){
return BinIO.asDoubleIterable(p0);
}
public static double[][] loadDoublesBig(java.io.File p0) throws java.io.IOException{
return BinIO.loadDoublesBig(p0);
}
public static it.unimi.dsi.fastutil.booleans.BooleanIterable asBooleanIterable(java.io.File p0){
return BinIO.asBooleanIterable(p0);
}
public static it.unimi.dsi.fastutil.bytes.ByteIterator asByteIterator(java.io.File p0) throws java.io.IOException{
return BinIO.asByteIterator(p0);
}
public static it.unimi.dsi.fastutil.chars.CharIterator asCharIterator(java.io.File p0) throws java.io.IOException{
return BinIO.asCharIterator(p0);
}
public static it.unimi.dsi.fastutil.doubles.DoubleIterator asDoubleIterator(java.io.File p0) throws java.io.IOException{
return BinIO.asDoubleIterator(p0);
}
public static it.unimi.dsi.fastutil.floats.FloatIterator asFloatIterator(java.io.File p0) throws java.io.IOException{
return BinIO.asFloatIterator(p0);
}
}
