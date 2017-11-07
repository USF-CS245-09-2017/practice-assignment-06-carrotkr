/**
 * BinaryHeap
 */
public class BinaryHeap {
	private int n = 0;
	
	private boolean less(int i, int j) {
		if (i < j) {
			return true;
		} else {
			return false;
		}
	}
	
	private void exch(int i, int j) {
		int temp = i;
		i = j;
		j = temp;
	}
	
	public int size() {
		return n;
	}	
	
	public void add(int k) {
		while ((k > 1) && less(k/2, k)) {
			exch(k/2, k);
			k = k/2;
		}
	}

	public int remove() {
		int k = n;
		
		while (2*k <= n) {
			int j = 2*k;
			
			if ((j < n) && less(j, j+1)) {
				j++;
			}
			
			if (!less(k, j)) {
				break;
			}
			
			exch(k, j);
		}
		
		return k;
	}
}