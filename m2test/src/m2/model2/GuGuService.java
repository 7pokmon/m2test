package m2.model2;
import java.util.*;
// M model
public class GuGuService {
	public ArrayList<String> getGugudanList(int dan){
		ArrayList<String> list = new ArrayList<>();
		for(int i=1; i<10; i++) {
			list.add(dan+"X"+i+"="+(dan*i));
		}
		
		return list;
	}
}
