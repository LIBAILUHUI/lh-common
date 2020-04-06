package com.lh.common.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.commons.fileupload.MultipartStream;

public class FileUtil {
	
	/**
	 * 
	 * @Title: getFileSuffixName 
	 * @Description: 获取文件的扩展名
	 * @return
	 * @return: String
	 */
	public static String getFileSuffixName(File file){
		if(null!=file && file.exists()) {
			String fileName = file.getName();
			return fileName.substring(fileName.lastIndexOf("."));
		}
		return null;
	}
	
	/**
	 * 
	 * @Title: getUUIDFileName 
	 * @Description: 获取用UUID生成的文件名
	 * @return
	 * @return: String
	 */
	public static String getUUIDFileName(File file) {
		if(null!=file&&file.exists()) {
			return UUID.randomUUID().toString()+getFileSuffixName(file);
		}
		return null;
	}
	
	/**
	 * 
	 * @Title: deleteFile 
	 * @Description: TODO
	 * @param file
	 * @return
	 * @return: boolean
	 */
	public static boolean deleteFile(File file) {
		if(null!=file&&file.exists()) {
			if(file.isDirectory()) {
				File[] subFiles = file.listFiles();
				for (File subFile : subFiles) {
					deleteFile(new File(file, subFile.getName()));
				}
			}
			file.delete();
			return true;
		}
		return false;
	}
	
	
	
	
	/**
	 * 
	 * @Title: ReadFileByLine 
	 * @Description: 根据路径按行读取文本文件
	 * @param filename
	 * @return: void
	 */
	public static List<String> ReadFileByLine(String filename) {
		List<String> content = new ArrayList<String>();
		File file = new File(filename);
		InputStream is = null;
		Reader reader = null;
		BufferedReader bufferedReader = null;
			try {
				is = new FileInputStream(file);
				reader = new InputStreamReader(is);
				bufferedReader = new BufferedReader(reader);
				String line = null;
				
				while((line=bufferedReader.readLine())!=null) {
					System.out.println(line);
					content.add(line);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					if(null!=bufferedReader) {
						bufferedReader.close();
					}
					if(null!=reader) {
						reader.close();
					}
					if(null!=is) {
						is.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return content;
			
	}
	
	/**
	 * 
	 * @Title: read 
	 * @Description: 读取InputStream放入集合
	 * @param inputStream
	 * @return
	 * @return: List<String>
	 */
	public static List<String> read(InputStream inputStream){
		List<String> list = new ArrayList<String>();
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
			String line = null;
			while((line=reader.readLine())!=null) {
				list.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/**
	 * 
	 * @Title: read 
	 * @Description: 根据文件的地址读取文件放入集合中
	 * @param filePath
	 * @return
	 * @return: List<String>
	 */
	public static List<String> read(String filePath){
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return read(inputStream);
	}
	
	/**
	 * 
	 * @Title: read 
	 * @Description: 读取文件内容放入集合
	 * @param file
	 * @return
	 * @return: List<String>
	 */
	public static List<String> read(File file){
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return read(inputStream);
	}
	
	/**
	 * 
	 * @Title: closeAll 
	 * @Description: 关闭流
	 * @param autoCloseables
	 * @return: void
	 */
	public static void closeAll(AutoCloseable...autoCloseables) {
		if(null!=autoCloseables&&autoCloseables.length>0) {
			for (AutoCloseable autoCloseable : autoCloseables) {
				try {
					autoCloseable.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * 
	 * @Title: copyFile 
	 * @Description: 拷贝文件
	 * @param fromFile
	 * @param toFile
	 * @return
	 * @return: boolean
	 */
	public static boolean copyFile(File fromFile,File toFile) {
		return copyFile(fromFile, toFile,false);
	}
	
	
	
	/**
	 * 
	 * @Title: copyFile 
	 * @Description: 拷贝文件
	 * @param fromFile
	 * @param toFile
	 * @param append  是否追加到目标文件后
	 * @return
	 * @return: boolean
	 */
	public static boolean copyFile(File fromFile,File toFile,boolean append) {
		InputStream in = null;
		OutputStream out = null;
		
		try {
			in = new FileInputStream(fromFile);
			out = new FileOutputStream(toFile,append);
			byte[] bytes = new byte[1024];
			int length = 0;
			while((length = in.read(bytes))>0) {
				out.write(bytes, 0, length);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			closeAll(in);
			closeAll(out);
		}
		return true;
	}
	
	
}
