import java.util.HashMap;
import java.util.Iterator;

public class PhoneListCount {
	
	public static String[] phoneList = {"469-688-3456", 
			"489-789-6754",
			"489-781-6754",
			"489-782-6754",
			"489-739-6754",
			"489-389-6754",
			"489-729-6754",
			"469-688-3456", 
			"489-289-6754",
			"489-719-6754",
			"489-889-6754",
			"469-688-3456", 
			"489-689-6754",
			"489-889-6754",
			"214-775-7980"};

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();	
		
		for(int i = 0 ; i < phoneList.length ; i++) {
			
			if(hm.containsKey(phoneList[i])) {
				hm.replace(phoneList[i], 
					(new Integer(((int)hm.get(phoneList[i])+1))));
			} else {
				hm.put(phoneList[i], new Integer(1));
			}	
		}
		
		Iterator<String> it = hm.keySet().iterator();
		
		while(it.hasNext()) {
			
			String key = (String)it.next();
			int val = hm.get(key);
			
			if(val > 1)
				System.out.println(key + " count " + val);
		}

	}

}
