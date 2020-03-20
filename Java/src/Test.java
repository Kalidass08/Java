
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Texttojson {
	static BufferedReader br = null;
	static int itr = 0;

	public static void main(String[] args) {
		try {
			String line;
			br = new BufferedReader(new FileReader("C:\\Users\\hp\\Desktop\\sample.txt"));
			while ((line = br.readLine()) != null) {
				System.out.println(line);

				StringTokenizer stringTokenizer = new StringTokenizer(line, " ");

				while (stringTokenizer.hasMoreElements()) {

					int x=0;
					while(x<8) {
						stringTokenizer.nextElement().toString();
						x++;
					}
					

					Double reqCPU = Double.parseDouble(stringTokenizer.nextElement().toString());
					while(x<11) {
						stringTokenizer.nextElement().toString();
						x++;
					}

					StringBuilder sb = new StringBuilder();
					sb.append(itr + "s" + reqCPU);
					itr++;
					System.out.println(sb.toString());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();

			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

}
