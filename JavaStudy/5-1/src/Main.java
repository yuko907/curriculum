import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		{
//      問① 下記の配列はString型しか格納できないように修正してください。
//		   現状は全てのクラスの継承元であるObject型を指定しているので、Integerもintも格納可能になっています。
	       List<String> array = new ArrayList<>();

//      問② 前から二つ目の要素を"bar"にしましょう。
	       array.add("hoge");
	       array.add("bar");
	       array.add("foo");

//      問③ fooが格納されているインデックスを出力してください。
	       System.out.println("fooのインデックス:"+array.indexOf("foo"));
		}

		{
//      問④ キーがString型、バリューがObject型の要素を三つ格納しましょう。
		Map<String, Object> map = new HashMap<>();
		map.put("address","/////");
		map.put("name","Kosuke");
		map.put("age","29");

//      問⑤上記で格納したキーを繰り返し文で出力しましょう。
			for (String key : map.keySet()) {
				System.out.println("key:"+key);
			}

//      問⑥上記で格納したバリューを繰り返し文で出力しましょう。
			for (java.util.Map.Entry<java.lang.String, Object> value : map.entrySet()) {
				System.out.println("value:"+ value.getValue());
			}
		}
		
		{
//      問⑦ 配列arrayDateに今の年・月・日を入れてください。
           Calendar cal = Calendar.getInstance();
           Date arrayDate = new Date();
           
//      問⑧ 配列arrayDateをList型に変更しましょう。
           List<Date> ListarrayDate = Arrays.asList(arrayDate);

//      問⑨ 上記で格納した要素を繰り返しで出力しましょう。
           for(int i = 0; i< ListarrayDate.size(); i++) {
        	   System.out.println(ListarrayDate.get(i));
           }
		}
	}

}