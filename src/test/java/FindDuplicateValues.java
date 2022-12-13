import java.util.ArrayList;
import java.util.List;

public class FindDuplicateValues {

	public static void main(String[] args) {
		findDuplicate();
	}
	static void findDuplicate() {
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
		
		String s = "";
		for(int i=0;i<oList.size();i++) {
			if(!s.contains(oList.get(i))) {
				for(int j=i+1;j<oList.size();j++) {
					if(oList.get(i).equals(oList.get(j))) {
						System.out.println("Duplicate: "+oList.get(i));
						s+=oList.get(i);
						break;
					}
				}
			}
		}
	}

}
