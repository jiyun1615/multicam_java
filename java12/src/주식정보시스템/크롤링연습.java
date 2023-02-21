package 주식정보시스템;


import java.io.FileWriter;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링연습 {

	public static void main(String[] args) throws Exception {
		Connection con = Jsoup.connect("https://www.naver.com");
		System.out.println("1.네트워크 연결 성공." + con);
		
		Document doc = Jsoup.connect("https://www.naver.com").get();
		
//		System.out.println(doc);
		
		Elements list = doc.select(".theme_cont > div.group_theme div.theme_title");
		
		System.out.println(list.size());
//		Element tag1 = list.get(0);
//		System.out.println(tag1);
		
		FileWriter file = new FileWriter("naver.txt");
		for(Element e : list) {
			System.out.println(e.text());
			file.write(e.text() + "\n");
		}
		file.close();
	}

}
