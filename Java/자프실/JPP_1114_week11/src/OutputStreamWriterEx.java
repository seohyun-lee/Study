
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterEx { //한글 텍스트 파일 쓰기

	public static void main(String[] args) {
		FileOutputStream fout = null;
		OutputStreamWriter out = null;
		try {
			fout = new FileOutputStream("c:\\Temp\\hangul.txt");
			out = new OutputStreamWriter(fout, "MS949");
			out.write("텍스트파일에 한글을 씁니다.");
			out.close();
			fout.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
