import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Utility {
	
	public static List<Integer> listOf() {
		return Collections.emptyList();
	}
	
	public static List<Integer> listOf(int n) {
		List<Integer> list = new ArrayList<>();
		list.add(n);
		return list;
	}
	
	public static List<Integer> listOf(int n, int m) {
		List<Integer> list = new ArrayList<>();
		list.add(n);
		list.add(m);
		return list;
	}
	
	public static List<Integer> listOf(int n, int m, int o) {
		List<Integer> list = new ArrayList<>();
		list.add(n);
		list.add(m);
		list.add(o);
		return list;
	}
}
