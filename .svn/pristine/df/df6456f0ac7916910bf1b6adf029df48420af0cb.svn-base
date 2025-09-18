package Helpers;

import java.util.ArrayList;

public class LRUList<T> extends ArrayList<T> {
	
	private static final long serialVersionUID = 1L;
	private int capacity = 5;

	@Override
	public boolean add(T e) {
		remove(e);

		if(size() >= capacity)
		{
			remove(0);
		}
		return super.add(e);
	}
	
	public T getDataModel() {
		return getLast();
	}
	
}
