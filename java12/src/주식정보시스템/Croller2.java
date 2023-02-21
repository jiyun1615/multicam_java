package 주식정보시스템;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Croller2 {
	String stock;
	Connection con;

	public Croller2(String stock) {
		this.stock = stock;
		con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + stock);
	}

	public String CrollName() {
		String str = "";
		try {
			Document doc = con.get();
			Elements listName = doc.select(".wrap_company a");
			Element tagName = listName.get(0);
			str += ("이름 : " + tagName.text());
		} catch (IOException e) {
		}
		return str;

	}

	public String CrollCode() {
		String str = "";
		try {

			Document doc = con.get();
			Elements list1 = doc.select(".code");
			Element tag1 = list1.get(0);
			str += ("code : " + tag1.text() + "\n");
		} catch (IOException e) {
		}
		return str;
	}

	public String CrollPrice() {
		String str = "";
		try {
			Document doc = con.get();
			Elements list = doc.select(".rate_info > div.today");
			Element tag = list.get(0);
			String[] price = tag.text().split(" ");
			str += ("현재가 : " + price[0]);
		} catch (IOException e) {
		}
		return str;
	}

	public String CrollSell() {
		String str = "";
		try {
			Document doc = con.get();
			Elements listSell = doc.select(".rate_info > .no_info");
			Element tagSell = listSell.get(0);
			String[] sell = tagSell.text().split(" ");
			str += ("거래량 : " + sell[11]);
		} catch (IOException e) {
		}
		return str;
	}

	public String CrollHigh() {
		String str = "";
		try {
			Document doc = con.get();
			Elements listSell = doc.select(".rate_info > .no_info");
			Element tagSell = listSell.get(0);
			String[] sell = tagSell.text().split(" ");
			int h = sell[6].length() / 2;
			String high = sell[6].substring(0, h);
			str += ("고가 : " + high + "원");
		} catch (IOException e) {
		}
		return str;
	}

	public String CrollLow() {
		String str = "";
		try {
			Document doc = con.get();
			Elements listSell = doc.select(".rate_info > .no_info");
			Element tagSell = listSell.get(0);
			String[] sell = tagSell.text().split(" ");
			int l = sell[16].length() / 2;
			String low = sell[16].substring(0, l);
			str += ("저가 : " + low + "원");
		} catch (IOException e) {
		}
		return str;
	}
}
