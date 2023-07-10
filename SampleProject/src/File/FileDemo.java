package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		FileDemo obj = new FileDemo();
		obj.file();
	}

	public void file() throws IOException {
		File f = new File("/home/rathiga/Desktop/check.text");
		System.out.println(f.getName());
		System.out.println(f.getPath());
		System.out.println(f.length());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.isFile());
		f.createNewFile();
		System.out.println(f.isFile());

		String s = "Welcome to my home , Thank you";

		FileOutputStream fos = new FileOutputStream(f);
		byte[] a = s.getBytes();
		fos.write(a);

		fos.close();

		FileInputStream fis = new FileInputStream(f);

		int c;
		while ((c = fis.read()) != -1) {

			System.out.print((char) c);
		}

	}
}
