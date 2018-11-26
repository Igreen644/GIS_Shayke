package gis;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class GisRep implements GIS_project {
	
	private List<GIS_layer> lst;
	
	@Override
	public int size() {
		return lst.size();
	}

	@Override
	public boolean isEmpty() {
		return lst.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return lst.contains(o);
	}

	@Override
	public Iterator<GIS_layer> iterator() {
		return lst.iterator();
	}

	@Override
	public Object[] toArray() {
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return null;
	}

	@Override
	public boolean add(GIS_layer e) {
		return lst.add(e);
	}

	@Override
	public boolean remove(Object o) {
		return lst.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return lst.containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends GIS_layer> c) {
		return lst.addAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return lst.retainAll(c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return lst.removeAll(c);
	}

	@Override
	public void clear() {
		lst.clear();
	}

	@Override
	public Meta_data get_Meta_data() {
		return null;
	}

}
