
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterEx { //�ѱ� �ؽ�Ʈ ���� ����

	public static void main(String[] args) {
		FileOutputStream fout = null;
		OutputStreamWriter out = null;
		try {
			fout = new FileOutputStream("c:\\Temp\\hangul.txt");
			out = new OutputStreamWriter(fout, "MS949");
			out.write("�ؽ�Ʈ���Ͽ� �ѱ��� ���ϴ�.");
			out.close();
			fout.close();
		} catch (IOException e) {
			System.out.println("����� ����");
		}
	}

}
