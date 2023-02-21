package 주식정보시스템;


import java.io.FileWriter;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링연습3 {

	public static void main(String[] args) throws Exception {

			Connection con = Jsoup.connect("https://vibe.naver.com/chart");
//			System.out.println("1.네트워크 연결 성공." + con);
			
			Document doc = con.get();
			Elements listName = doc.select(".wrap_company a");
//			System.out.println(list.size());
			Element tagName = listName.get(0);
			System.out.println("이름 : " + tagName.text());
			
			Elements list1 = doc.select(".code");
//			System.out.println(list1.size());
			Element tag1 = list1.get(0);
			System.out.println("code : " + tag1.text());
			
			Elements list = doc.select(".rate_info > div.today");
//			System.out.println(list.size());
			Element tag = list.get(0);
			String[] price = tag.text().split(" ");
			System.out.println("현재가 : " + price[0]);
			
			Elements listSell = doc.select(".rate_info > .no_info");
			Element tagSell = listSell.get(0);
			String[] sell = tagSell.text().split(" ");
			System.out.println("거래량 : " + sell[11]);
			int h = sell[6].length()/2;
			int l = sell[16].length()/2;
			String high = sell[6].substring(0, h);
			String low = sell[16].substring(0, l);
			System.out.println("저가 : " + low + "원");
			System.out.println("고가 : " + high + "원");
			
			System.out.println("===========================");
		
	}

}
