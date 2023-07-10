package File;

import java.io.File;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamFile {

	public static void main(String[] args) throws IOException {
File f=new File("/home/rathiga/Desktop/stream.file");
f.createNewFile();
DataInputStream dis=new DataInputStream(System.in);
FileOutputStream fos=new FileOutputStream(f);
BufferedOutputStream bos=new BufferedOutputStream(fos);
System.out.println("enter the value");
int c ;

while( (c=dis.read())!='#') {
	
	fos.write(c);
}
	
	bos.close();
	}
}
