
import dataStructures.ArrayLinearList;

public class MyArrayLinearList extends ArrayLinearList{
	
	public MyArrayLinearList(int initialCapacity) {
		super(initialCapacity);
	}
	
	public MyArrayLinearList() {
		super(10);
	}
	
	public MyArrayLinearList(MyArrayLinearList mylist) {
		super(mylist.size);
		for (int i = 0; i < mylist.size(); i++) {
			this.add(i, mylist.element[i]);
		}
	}
	
	public MyArrayLinearList reverse() {
		MyArrayLinearList temp = new MyArrayLinearList(this.size());
		int j = 0;
		for (int i = this.size - 1; i >= 0; i--) {
			temp.add(j++, this.element[i]);
		}
		return temp;
	}
	
	public void set(int index, Object item) {
		this.element[index] = item;
	}
	
	public int max() {
		int m = (int)this.get(0);
		
		for (int i = 0; i < this.size(); i++) {
			if ((int)this.get(i) > m) {
				m = (int)this.get(i);
			}
		}
		return m;
	}
	
	public int min() {
		int m = (int)this.get(0);
		
		for (int i = 0; i < this.size(); i++) {
			if ((int)this.get(i) < m) {
				m = (int)this.get(i);
			}
		}
		return m;
	}
	
	public int sum() {
		int sum = 0;
		for (int i = 0; i < this.size(); i++) {
			sum += (int)this.get(i);
		}
		return sum;
	}
	
	public float average() {
		return (float)this.sum() / (float)this.size();
	}
	
	public void removeOdd() {
		int i = 0;
		while (i < this.size()) {
			if ((int)this.get(i) % 2 == 1) {
				this.remove(i);
			} else {
				i++;
			}
		}
	}
	
	public void sort() {
		int n = this.size();
		boolean swapped;
		
		do {
			swapped = false;
			for (int i = 1; i < n; i++) {
				if ((int)this.get(i - 1) > (int)this.get(i)) {
					int temp = (int)this.get(i - 1);
					this.set(i - 1, (int)this.get(i));
					this.set(i, (Object)temp);
					swapped = true;
				}
			}
		} while (swapped);
	}
	
	
	public MyArrayLinearList unique() {
		MyArrayLinearList tmp = new MyArrayLinearList(this);
		
		for (int i = 0; i < tmp.size() - 1; i++) {
			if (tmp.get(i).equals(null)) {
				break;
			}
			int j = i + 1;
			while (j < tmp.size()) {
				if (tmp.get(i).equals(tmp.get(j))) {
					tmp.remove(j);
				} else {
					j++;
				}
			}
			
		}
		
		return tmp;
		
	}
	
	public MyArrayLinearList rand() {
		MyArrayLinearList tmp = new MyArrayLinearList(this);
		
		for (int i = 0; i < tmp.size(); i++) {
			double randomValue = Math.random();
			
			int mi = 0;
			int ma = tmp.size() - 1;
			
			int randomNum = (int) (randomValue * (ma - mi + 1)) + mi;
			
			Object tempo = tmp.get(i);
			tmp.set(i, tmp.get(randomNum));
			tmp.set(randomNum, tempo);
			
		}
		
		
		return tmp;
	}
	
	public MyArrayLinearList merge(MyArrayLinearList arrayList) {
		for (int i = 0; i < this.size(); i++) {
			arrayList.add(arrayList.size(), this.get(i));
		}
		return arrayList;
	}
	
	

}
