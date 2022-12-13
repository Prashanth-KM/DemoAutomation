import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateValues {

	public static void main(String[] args) {
		removeDuplicate();
	}
	static void removeDuplicate() {
		List<String> oList = new ArrayList<>();
		oList.add("Apple");
		oList.add("Zebra");
		oList.add("Lion");
		oList.add("Cat");
		oList.add("Dog");
		oList.add("Zebra");
		oList.add("Cat");
		oList.add("Zebra");
		oList.add("Cat");
		oList.add("Dog");
		oList.add("Dog");
		System.out.println(oList);
		
		for(int i=0;i<oList.size();i++) {
			for(int j=i+1;j<oList.size();j++) {
				if(oList.get(i).equals(oList.get(j))) {
					oList.remove(j);
					j--;
				}
			}
		}
		System.out.println(oList);
	}
}


