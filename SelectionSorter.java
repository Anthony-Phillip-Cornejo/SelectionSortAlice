import java.util.*;

public class SelectionSorter {

	public static void selectionSort(ArrayList<String> wordList) {
		String storeWord = "";
		int storeInt = 0;
		for(int i = wordList.size() - 1; i > 0; i--) {
			storeWord = "";
			for(int j = 0; j < i; j++) {
				if(wordList.get(j).compareTo(storeWord) > 0) {
					storeInt = j;
					storeWord = wordList.get(j);
				}
			}
			Collections.swap(wordList, storeInt, i);	
		}
	}
}
